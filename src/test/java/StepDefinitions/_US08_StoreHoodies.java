package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class _US08_StoreHoodies {
    DialogContent dc = new DialogContent();

    @Then("the customer confirms that they are in the hoodies page")
    public void theCustomerConfirmsThatTheyAreInTheHoodiesPage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.hoodiesTitle));
        Assert.assertEquals(dc.hoodiesTitle.getText().toLowerCase(), "Hoodies".toLowerCase());
    }


    @Then("the customer verifies that hovering over a product changes its picture")
    public void theCustomerVerifiesThatHoveringOverAProductChangesItsPicture() {
        for (int i = 0; i < dc.allhoodies.size(); i++) {
            dc.scrolltoElement(dc.allhoodies.get(i));
            dc.hoverOver(dc.allhoodies.get(i));
            Assert.assertEquals(Integer.parseInt(dc.allhoodies.get(i).getCssValue("opacity")), 1);
        }
    }


    @And("the customer filters the products by price")
    public void theCustomerFiltersTheProductsByPrice() {
        Actions actions = new Actions(GWD.getDriver());

        actions.clickAndHold(dc.sSWFilterSliderLeft)
                .moveByOffset(90, 0)
                .release()
                .build().perform();

        actions.clickAndHold(dc.sSWFilterSliderLeft)
                .moveByOffset(-90, 0)
                .release()
                .build().perform();

        String minPrice = dc.sSWPriceFilterMin.getText();
        String maxPrice = dc.sSWPriceFilterMax.getText();

        dc.myClick(dc.sSWPriceFilterButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable((dc.sSWFilterReset)));
        Assert.assertTrue(
                Integer.parseInt(minPrice.replaceAll("[^0-9]", "")) == 60);
        Assert.assertTrue(
                Integer.parseInt(maxPrice.replaceAll("[^0-9]", "")) == 70);
        dc.myClick(dc.sSWFilterReset);
        dc.myClick(dc.sSWFilter);

    }
}
