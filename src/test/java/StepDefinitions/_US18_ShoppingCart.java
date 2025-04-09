package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Objects;

public class _US18_ShoppingCart {
    DialogContent sc = new DialogContent();

    @And("the customer hovers over the shopping cart and clicks the view shopping cart button")
    public void theCustomerHoversOverTheShoppingCartAndClicksTheViewShoppingCartButton() {
        sc.hoverOver(sc.shoppingCardIcon);
        sc.wait.until(ExpectedConditions.elementToBeClickable(sc.showShoppingCartBtn));
        sc.jsClick(sc.showShoppingCartBtn);
    }

    @Then("the customer verifies that the update cart button has not been clicked without updating")
    public void theCustomerVerifiesThatTheUpdateCartButtonHasNotBeenClickedWithoutUpdating() {
        Assert.assertTrue(sc.updateCartBtn.isDisplayed());
    }

    @When("the customer increases the amount of products in the shopping cart and clicks the update shopping cart button")
    public void theCustomerIncreasesTheAmountOfProductsInTheShoppingCartAndClicksTheUpdateShoppingCartButton() {
        int maxValue = Integer.parseInt(Objects.requireNonNull(sc.productQuantity.getAttribute("max")));
        String stValue = String.valueOf(sc.randomGenerator(maxValue)+1);
        sc.mySendKeys(sc.productQuantity, stValue);
        sc.wait.until(ExpectedConditions.elementToBeClickable(sc.updateCartBtn));
        sc.myClick(sc.updateCartBtn);
        sc.wait.until(ExpectedConditions.invisibilityOf(sc.blockOverlay));
    }

    @Then("the customer verifies the product subtotal price")
    public void theCustomerVerifiesTheProductSubtotalPrice() {
        double productPrice = Double.parseDouble(sc.productPrice.getText().replaceAll("[^0-9,.]", "").replace(",", "."));
        double productQuantity = Double.parseDouble(Objects.requireNonNull(sc.productQuantity.getAttribute("value")));
        double total = (productPrice * productQuantity);
        double subTotal = Double.parseDouble(sc.productSubTotal.getText().replaceAll("[^0-9,.]", "").replace(",", "."));
        System.out.println(total);
        System.out.println(subTotal);
        Assert.assertEquals(subTotal, total);
    }

    @When("the customer clicks the empty cart button")
    public void theCustomerClicksTheEmptyCartButton() {
        sc.myClick(sc.cartEmptyBtn);
        sc.alertAccept(1);
    }

    @Then("the customer confirms that the shopping cart is empty")
    public void theCustomerConfirmsThatTheShoppingCartIsEmpty() {
        sc.waitUntilVisibilityOf(sc.cartEmptyMessage);
        sc.verifyContainsText(sc.cartEmptyMessage, "gegenwärtig leer");
        System.out.println(sc.cartEmptyMessage.getText());
    }
}
