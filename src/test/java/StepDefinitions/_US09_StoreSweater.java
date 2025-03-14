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
    Headers h = new Headers();
    DialogContent dc = new DialogContent();


    @Then("Confirm that user is in the correct page")
    public void confirmThatUserIsInTheCorrectPage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.sSweaterTitle));
        Assert.assertEquals(dc.sSweaterTitle.getText().toLowerCase(), "Sweaters".toLowerCase());
    }

    @Then("Confirm that hovering over a product changes its picture")
    public void confirmThatHoveringOverAProductChangesItsPicture() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSweaterFirstProduct));
        dc.scrolltoElement(dc.sSweaterFirstProduct);
        Assert.assertTrue(Double.parseDouble(dc.sSweaterAltImage.getCssValue("opacity")) == 0);
        dc.hoverOver(dc.sSweaterFirstProduct);
        dc.wait.until( driver -> dc.sSweaterAltImage.getCssValue("opacity").equals("1"));
        Assert.assertTrue(Double.parseDouble(dc.sSweaterAltImage.getCssValue("opacity")) == 1);
    }

    @And("Filter products by its colours")
    public void filterProductsByItsColours() {
        dc.myClick(dc.sSweaterFilterColour);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSweaterFiltered));
        Assert.assertEquals(dc.sSweaterFiltered.getText(),dc.sSweaterFilterColour.getText());
        dc.myClick(dc.sSweaterFilterReset);
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterFilterReset));
    }

    @And("Filter products by its size")
    public void filterProductsByItsSize() {
        dc.myClick(dc.sSweaterFilterSize);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.sSweaterFiltered));
        Assert.assertEquals(dc.sSweaterFiltered.getText(),dc.sSweaterFilterSize.getText());
        dc.myClick(dc.sSweaterFilterReset);
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterFilterReset));
    }

    @And("Filter products by its price range")
    public void filterProductsByItsPriceRange() {
        Actions actions = new Actions(GWD.getDriver());
        actions.clickAndHold(dc.sSweaterFilterSliderLeft)
                .moveByOffset(30, 0)
                .release()
                .perform();
        actions.clickAndHold(dc.sSweaterFilterSliderRight)
                .moveByOffset(-30, 0)
                .release()
                .perform();
        String minPrice=dc.sSweaterPriceFilterMin.getText();
        String maxPrice=dc.sSweaterPriceFilterMax.getText();
        dc.myClick(dc.sSweaterPriceFilterButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable((dc.sSweaterFilterReset)));
        Assert.assertTrue(
                Integer.parseInt(minPrice.replaceAll("[^0-9]",""))
                        ==Integer.parseInt(dc.sSweaterComparePriceMin.getText().replaceAll(",00","").replaceAll("[^0-9]","")));
        Assert.assertTrue(
                Integer.parseInt(maxPrice.replaceAll("[^0-9]",""))
                        ==Integer.parseInt(dc.sSweaterComparePriceMax.getText().replaceAll(",00","").replaceAll("[^0-9]","")));
        dc.myClick(dc.sSweaterFilterReset);
        dc.myClick(dc.sSweaterFilter);
    }

    @And("Make a Column Selection")
    public void makeAColumnSelection() {
        dc.myClick(dc.sSweaterFilterColumn2);
        Assert.assertEquals(dc.sSweaterFilterColumn2.getAttribute("class"), "active");
        dc.myClick(dc.sSweaterFilterColumn3);
        Assert.assertEquals(dc.sSweaterFilterColumn3.getAttribute("class"), "active");
        dc.myClick(dc.sSweaterFilterColumn4);
        Assert.assertEquals(dc.sSweaterFilterColumn4.getAttribute("class"), "active");
    }

    @And("Sort by categories")
    public void sortByCategories() {
        dc.selectByValue(dc.sSweaterFilterSelect,"popularity");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterLoading));
        Assert.assertEquals(dc.sSweaterFilterPopularity.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSweaterFilterSelect,"date");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterLoading));
        Assert.assertEquals(dc.sSweaterFilterDate.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSweaterFilterSelect,"price");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterLoading));
        Assert.assertEquals(dc.sSweaterFilterPrice.getAttribute("selected"), "true");
        dc.selectByValue(dc.sSweaterFilterSelect,"price-desc");
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.sSweaterLoading));
        Assert.assertEquals(dc.sSweaterFilterPriceDesc.getAttribute("selected"), "true");
    }



}
