package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US09_StoreSweater {
    DialogContent dc = new DialogContent();
    static String colour, size, priceMin, priceMax= "";
    static int rndNum = 0;

    @Then("the user should be redirected to the sweater page")
    public void theUserShouldBeRedirectedToTheSweaterPage() {
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWTitle));
        Assert.
                assertEquals(dc.sSWTitle.
                        getText().
                                toLowerCase(),
                        "Sweaters".
                                toLowerCase());
    }

    @When("the user hover over the product")
    public void theUserHoverOverTheProduct() {
        rndNum = dc.randomGenerator(dc.sSWProducts.
                        size() - 1);
        dc.wait.
                until(ExpectedConditions.
                        elementToBeClickable(dc.sSWProducts.
                                get(rndNum)));
        dc.scrolltoElement(dc.sSWProducts.
                get(rndNum));
        Assert.
                assertTrue(Double.
                        parseDouble(dc.sSWAltImage.
                                get(rndNum).
                                getCssValue("opacity")) == 0);
    }

    @Then("hovering over a product should change its picture")
    public void hoveringOverAProductShouldChangeItsPicture() {
        dc.hoverOver(dc.sSWProducts.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                        attributeToBe(dc.sSWAltImage.
                                get(rndNum),
                                ("opacity"),
                                ("1")));
        Assert.
                assertTrue(
                        Double.
                                parseDouble(dc.sSWAltImage.
                                        get(rndNum).
                                        getCssValue("opacity")) == 1);

    }

    @And("the user filters products by colour")
    public void theUserFiltersProductsByColour() {
        rndNum = dc.randomGenerator(dc.sSWFilterColourList.
                size() - 1);
        dc.myClick(dc.sSWFilterColourList.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                        elementToBeClickable(dc.sSWFiltered));
        rndNum = dc.randomGenerator(dc.sSWFilterColourList.
                size() - 1);
        Assert.
                assertEquals(dc.sSWFiltered.
                        getText().
                        toLowerCase(),
                        dc.sSWFilterColourList.
                                get(rndNum).
                                getText().
                                toLowerCase());
        colour = dc.sSWFiltered.
                getText();
    }

    @Then("the displayed products should match the selected colour filter")
    public void theDisplayedProductsShouldMatchTheSelectedColourFilter() {
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        rndNum = dc.randomGenerator(dc.sSWProducts.
                size() - 1);
        dc.myClick(dc.sSWProducts.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                        elementToBeClickable(dc.sSWProductAddInfo));
        dc.myClick(dc.sSWProductAddInfo);
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWProductColour));
        Assert.
                assertTrue(dc.sSWProductColour.
                        getText().
                        toLowerCase().
                        contains(colour.
                                toLowerCase()));
        GWD.
                getDriver().
                navigate().
                back();
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWFilterReset));
        dc.myClick(dc.sSWFilterReset);
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWFilterReset));
    }

    @And("the user filters products by size")
    public void theUserFiltersProductsBySize() {
        rndNum = dc.randomGenerator(dc.sSWFilterSizeList.
                size() - 1);
        dc.myClick(dc.sSWFilterSizeList.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                elementToBeClickable(dc.sSWFiltered));
        Assert.
                assertEquals(dc.sSWFiltered.
                        getText().
                        toLowerCase(),
                        dc.sSWFilterSizeList.
                                get(rndNum).
                                getText().
                                toLowerCase());
        size = dc.sSWFiltered.
                getText();
    }

    @Then("the displayed products should match the selected size filter")
    public void theDisplayedProductsShouldMatchTheSelectedSizeFilter() {
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        rndNum = dc.randomGenerator(dc.sSWProducts.
                size() - 1);
        dc.myClick(dc.sSWProducts.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                elementToBeClickable(dc.sSWProductAddInfo));
        dc.myClick(dc.sSWProductAddInfo);
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWProductSize));
        Assert.
                assertTrue(dc.sSWProductSize.
                        getText().
                        toLowerCase().
                        contains(size.
                                toLowerCase()));
        GWD.
                getDriver().
                navigate().
                back();
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWFilterReset));
        dc.myClick(dc.sSWFilterReset);
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWFilterReset));
    }

    @And("the user filters products by price range")
    public void theUserFiltersProductsByPriceRange() {
        Actions actions = new Actions(GWD.getDriver());
        actions.
                clickAndHold(dc.sSWFilterSliderLeft)
                .moveByOffset(30, 0)
                .release()
                .perform();
        actions.
                clickAndHold(dc.sSWFilterSliderRight)
                .moveByOffset(-30, 0)
                .release()
                .perform();
        priceMin = dc.sSWPriceFilterMin.
                getText();
        priceMax = dc.sSWPriceFilterMax.
                getText();
        dc.myClick(dc.sSWPriceFilterButton);
        dc.wait.
                until(ExpectedConditions.
                        elementToBeClickable((dc.sSWFilterReset)));
        Assert.
                assertTrue(
                Integer.
                                parseInt(priceMin.
                                        replaceAll("[^0-9]", ""))
                        ==
                        Integer.
                                parseInt(dc.sSWComparePriceMin.
                                        getText().
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", "")));
        Assert.
                assertTrue(
                Integer.
                                parseInt(priceMax.
                                        replaceAll("[^0-9]", ""))
                        ==
                        Integer.
                                parseInt(dc.sSWComparePriceMax.
                                        getText().
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", "")));
    }

    @Then("the displayed products should match the selected price range filter")
    public void theDisplayedProductsShouldMatchTheSelectedPriceRangeFilter() {
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        rndNum = dc.randomGenerator(dc.sSWProducts.
                size() - 1);
        dc.myClick(dc.sSWProducts.
                get(rndNum));
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWProductPrice));
        Assert.
                assertTrue(
                (Integer.
                                parseInt(priceMin.
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", ""))
                                <=
                        Integer.
                                parseInt(dc.sSWProductPrice.
                                        getText().
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", "")))
                        &&
                        (Integer.
                                parseInt(dc.sSWProductPrice.
                                        getText().
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", ""))
                                <=
                        Integer.
                                parseInt(priceMax.
                                        replaceAll(",00", "").
                                        replaceAll("[^0-9]", "")))
        );
        GWD.
                getDriver().
                navigate().
                back();
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWFilterReset));
        dc.myClick(dc.sSWFilterReset);
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWFilterReset));
        dc.myClick(dc.sSWFilter);
    }

    @And("the user selects a column layout")
    public void theUserSelectsAColumnLayout() {
        dc.myClick(dc.sSWFilterColumn2);
        Assert.
                assertEquals(dc.sSWFilterColumn2.
                        getAttribute("class"),
                        "active");
        dc.myClick(dc.sSWFilterColumn3);
        Assert.
                assertEquals(dc.sSWFilterColumn3.
                        getAttribute("class"),
                        "active");
        dc.myClick(dc.sSWFilterColumn4);
        Assert.
                assertEquals(dc.sSWFilterColumn4.
                        getAttribute("class"),
                        "active");
    }

    @And("the user sorts products by category")
    public void theUserSortsProductsByCategory() {
        dc.selectByValue(dc.sSWSortSelect,
                "popularity");
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        Assert.
                assertEquals(dc.sSWSortPopularity.
                        getAttribute("selected"),
                        "true");
        dc.selectByValue(dc.sSWSortSelect,
                "date");
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        Assert.
                assertEquals(dc.sSWSortDate.
                        getAttribute("selected"),
                        "true");
        dc.selectByValue(dc.sSWSortSelect,
                "price");
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        Assert.
                assertEquals(dc.sSWSortPrice.
                        getAttribute("selected"),
                        "true");
        dc.selectByValue(dc.sSWSortSelect,
                "price-desc");
        dc.wait.
                until(ExpectedConditions.
                        invisibilityOf(dc.sSWLoading));
        Assert.
                assertEquals(dc.sSWSortPriceDesc.
                        getAttribute("selected"),
                        "true");
    }


}
