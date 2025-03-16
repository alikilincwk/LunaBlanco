package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US09_StoreSweater {
    DialogContent dc = new DialogContent();


    @Then("Confirm that user is in the sweater page")
    public void confirmThatUserIsInTheSweaterPage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.sSWTitle));
        Assert.assertEquals(dc.sSWTitle.getText().toLowerCase(), "Sweaters".toLowerCase());
    }

    @Then("Confirm that hovering over a product changes its picture")
    public void confirmThatHoveringOverAProductChangesItsPicture() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSWFirstProduct));
        dc.scrolltoElement(dc.sSWFirstProduct);
        Assert.assertTrue(Double.parseDouble(dc.sSWAltImage.getCssValue("opacity")) == 0);
        dc.hoverOver(dc.sSWFirstProduct);
        dc.wait.until(ExpectedConditions.attributeToBe(dc.sSWAltImage,"opacity","1"));
        Assert.assertTrue(Double.parseDouble(dc.sSWAltImage.getCssValue("opacity")) == 1);
    }

    @And("Filter products by its colours")
    public void filterProductsByItsColours() {
        dc.myClick(dc.sSWFilterColour);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSWFiltered));
        Assert.assertEquals(dc.sSWFiltered.getText(),dc.sSWFilterColour.getText());
        dc.myClick(dc.sSWFilterReset);
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWFilterReset));
    }

    @And("Filter products by its size")
    public void filterProductsByItsSize() {
        dc.myClick(dc.sSWFilterSize);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSWFiltered));
        Assert.assertEquals(dc.sSWFiltered.getText(),dc.sSWFilterSize.getText());
        dc.myClick(dc.sSWFilterReset);
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWFilterReset));
    }

    @And("Filter products by its price range")
    public void filterProductsByItsPriceRange() {
        Actions actions = new Actions(GWD.getDriver());
        actions.clickAndHold(dc.sSWFilterSliderLeft)
                .moveByOffset(30, 0)
                .release()
                .perform();
        actions.clickAndHold(dc.sSWFilterSliderRight)
                .moveByOffset(-30, 0)
                .release()
                .perform();
        String minPrice=dc.sSWPriceFilterMin.getText();
        String maxPrice=dc.sSWPriceFilterMax.getText();
        dc.myClick(dc.sSWPriceFilterButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable((dc.sSWFilterReset)));
        Assert.assertTrue(
                Integer.parseInt(minPrice.replaceAll("[^0-9]",""))
                        ==Integer.parseInt(dc.sSWComparePriceMin.getText().replaceAll(",00","").replaceAll("[^0-9]","")));
        Assert.assertTrue(
                Integer.parseInt(maxPrice.replaceAll("[^0-9]",""))
                        ==Integer.parseInt(dc.sSWComparePriceMax.getText().replaceAll(",00","").replaceAll("[^0-9]","")));
        dc.myClick(dc.sSWFilterReset);
        dc.myClick(dc.sSWFilter);
    }

    @And("Make a column selection")
    public void makeAColumnSelection() {
        dc.myClick(dc.sSWFilterColumn2);
        Assert.assertEquals(dc.sSWFilterColumn2.getAttribute("class"), "active");
        dc.myClick(dc.sSWFilterColumn3);
        Assert.assertEquals(dc.sSWFilterColumn3.getAttribute("class"), "active");
        dc.myClick(dc.sSWFilterColumn4);
        Assert.assertEquals(dc.sSWFilterColumn4.getAttribute("class"), "active");
    }

    @And("Sort by categories")
    public void sortByCategories() {
        dc.selectByValue(dc.sSWSortSelect,"popularity");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWLoading));
        Assert.assertEquals(dc.sSWSortPopularity.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSWSortSelect,"date");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWLoading));
        Assert.assertEquals(dc.sSWSortDate.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSWSortSelect,"price");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWLoading));
        Assert.assertEquals(dc.sSWSortPrice.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSWSortSelect,"price-desc");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSWLoading));
        Assert.assertEquals(dc.sSWSortPriceDesc.getAttribute("selected"), "true");
    }



}
