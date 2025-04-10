package StepDefinitions;

import Pages.DialogContent;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US20_Checkout {
    DialogContent ch = new DialogContent();
    Faker dataFaker = new Faker();

    @When("the customer clicks on any product")
    public void theCustomerClicksOnAnyProduct() {
        int randomProduct = ch.randomGenerator(ch.productList.size());
        ch.scrollTOElementSmooth(ch.productList.get(randomProduct));
        ch.myClick(ch.productList.get(randomProduct));
    }

    @Then("the customer confirms the existence of information text about the product\\(Fabric information,Delivery time,Price information)")
    public void theCustomerConfirmsTheExistenceOfInformationTextAboutTheProductFabricInformationDeliveryTimePriceInformation() {
        ch.waitUntilVisibilityOf(ch.productTitle);
        Assert.assertTrue(ch.productTitle.isDisplayed());
        ch.waitUntilVisibilityOf(ch.productTitlePrice);
        Assert.assertTrue(ch.productTitle.isDisplayed());
        for (WebElement details : ch.productDetails) {
            System.out.println(details.getText());
        }
        ch.waitUntilVisibilityOf(ch.shippingDay);
        System.out.println(ch.shippingDay.getText());
    }

    @And("the customer clicks on the size chart unit and verifies that the chart opens")
    public void theCustomerClicksOnTheSizeChartUnitAndVerifiesThatTheChartOpens() {
        if (!ch.sizeGuideButton.isEmpty()) {
            ch.myClick(ch.sizeGuideButton.get(0));
            ch.wait.until(ExpectedConditions.textToBePresentInElement(ch.sizeChart,"Größentabelle"));
            System.out.println(ch.sizeChart.getText());
            Assert.assertTrue(ch.sizeChart.isDisplayed(), "Error");
            ch.myClick(ch.xButton);
        } else {
            System.out.println("No size chart");
        }
    }

    @Then("the customer verifies high quality photos of the product taken from different angles")
    public void theCustomerVerifiesHighQualityPhotosOfTheProductTakenFromDifferentAngles() {
        for (WebElement photoList : ch.imageList) {
            Assert.assertTrue(photoList.isDisplayed());
            ch.waitUntilVisibilityOf(photoList);
            System.out.println(photoList.getAttribute("src"));
        }
    }

    @And("the customer clicks on washing instructions and additional information and verifies text")
    public void theCustomerClicksOnWashingInstructionsAndAdditionalInformationAndVerifiesText() {
        ch.jsClick(ch.washingInstructions);
        for (WebElement text : ch.washingText) {
            ch.waitUntilVisibilityOf(text);
            Assert.assertTrue(text.isDisplayed());
            System.out.println(text.getText());
        }
        ch.jsClick(ch.additionalInfo);
        for (WebElement textAdditional : ch.additionalInfoText) {
            ch.waitUntilVisibilityOf(textAdditional);
            Assert.assertTrue(textAdditional.isDisplayed());
            System.out.println(textAdditional.getText());
        }
    }

    @And("the customer selects the product size, checks the stock status, determines the product quantity and clicks the add to cart button")
    public void theCustomerSelectsTheProductSizeChecksTheStockStatusDeterminesTheProductQuantityAndClicksTheAddToCartButton() {
        if (!ch.sizeGuideButton.isEmpty()) {
            do {

                ch.myClick(ch.sizeList.get(ch.randomGenerator(ch.sizeList.size())));
                ch.wait.until(ExpectedConditions.attributeToBe(ch.resetSize,"style","visibility: visible;"));

                if (!ch.inStockText.isEmpty() && ch.inStockText.get(0).getText().equals("VORRÄTIG")) {
                    ch.myClick(ch.addToCartButton);
                    break;  // Break the cycle if in stock

                } else if (!ch.outOfStockText.isEmpty() && ch.outOfStockText.get(0).getText().equals("NICHT VORRÄTIG")) {
                    ch.myClick(ch.addToCartButton);
                    ch.alertAccept(1);
                }
            } while (!ch.outOfStockText.isEmpty());  // If out of stock, the cycle continues
        } else {

            ch.myClick(ch.addToCartButton);
        }
    }

    @Then("the customer verifies the text product successfully added to cart")
    public void theCustomerVerifiesTheTextProductSuccessfullyAddedToCart() {
        ch.waitUntilVisibilityOf(ch.addToCartVerify);
        ch.verifyContainsText(ch.addToCartVerify, "hinzugefügt.");
    }

    @And("the customer hovers over the shopping cart and clicks the checkout button")
    public void theCustomerHoversOverTheShoppingCartAndClicksTheCheckoutButton() {
        ch.hoverOver(ch.shoppingCardIcon);
        ch.myClick(ch.checkoutBtn);
    }

    @And("the customer enters personal information")
    public void theCustomerEntersPersonalInformation() {
        ch.mySendKeys(ch.firstNamePl, dataFaker.name().firstName());
        ch.mySendKeys(ch.lastNamePl, dataFaker.name().lastName());
        ch.myClick(ch.countrySelect);
        ch.myClick(ch.countryList.get(ch.randomGenerator(ch.countryList.size())));
        ch.mySendKeys(ch.billingAddressPl, dataFaker.address().fullAddress());
        ch.mySendKeys(ch.billingCityPl, dataFaker.address().city());
        ch.mySendKeys(ch.billingPostCodePl, dataFaker.address().zipCode());
        ch.mySendKeys(ch.billingPhonePl, dataFaker.phoneNumber().cellPhone());
        ch.mySendKeys(ch.billingEmailPl, dataFaker.internet().emailAddress());
        Assert.assertTrue(ch.checkBOx.isEnabled());
        Assert.assertTrue(ch.createAccountCheck.isEnabled());
        Assert.assertTrue(ch.differentAddressCheck.isEnabled());
    }

    @Then("the customer calculates and verifies the total price of the product")
    public void theCustomerCalculatesAndVerifiesTheTotalPriceOfTheProduct() {
        double total = 0;
        for (int i = 0; i < ch.productTotal.size(); i++) {

            double productTotal = Double.parseDouble(ch.productTotal.get(i).getText().replaceAll("[^0-9,.]", "").replace(",", "."));
            total += total + productTotal;
        }
        double subTotal = Double.parseDouble(ch.subTotal.getText().replaceAll("[^0-9,.]", "").replace(",", ".").replace(",", "."));
        Assert.assertEquals(subTotal, total);
        double dhlPrice = Double.parseDouble(ch.dhlPrice.getText().replaceAll("[^0-9,.]", "").replace(",", "."));
        double totalPrice = Double.parseDouble(ch.totalPrice.getText().replaceAll("[^0-9,.]", "").replace(",", "."));
        Assert.assertEquals(totalPrice, (subTotal + dhlPrice));
    }

    @When("the customer clicks on payment options and enters incorrect credit card details")
    public void theCustomerClicksOnPaymentOptionsAndEntersIncorrectCreditCardDetails() {
        ch.wait.until(ExpectedConditions.textToBePresentInElement(ch.OderText,"ODER"));
        System.out.println(ch.OderText.getText());
        for (WebElement radioButtons : ch.paymentRadioButtons) {
            Assert.assertTrue(radioButtons.isEnabled());
        }

        ch.wait.until(ExpectedConditions.invisibilityOf(ch.ccLoadingBar));
        ch.wait.until(ExpectedConditions.attributeToBe(ch.iframePayment, "title", "Sicherer Eingaberahmen für Zahlungen"));
        ch.iframeSwitchByElement(ch.iframePayment);
        ch.mySendKeys(ch.cardNumber, "1234123412341234");
        ch.mySendKeys(ch.expirationDate, "1230");
        ch.mySendKeys(ch.securityCode, "505");
        ch.switchToDefaultContent();
    }

    @Then("the customer verifies the error message on the message display")
    public void theCustomerVerifiesTheErrorMessageOnTheMessageDisplay() {
        ch.myClick(ch.orderNowButton);
        ch.verifyContainsText(ch.errorMessage, "ungültig");
    }
}
