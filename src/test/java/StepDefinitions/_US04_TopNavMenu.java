package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _US04_TopNavMenu {

    Headers header = new Headers();
    WebDriver driver = GWD.getDriver();
    DialogContent dc = new DialogContent();
    ParentPage pp = new ParentPage();

    @Given("I am on the LunaBlanco homepage")
    public void iAmOnTheLunaBlancoHomepage() {
        driver.get("https://lunablanco.com/");
        pp.acceptAllCookies();
    }

    @Then("the {string} should be visible")
    public void theElementShouldBeVisible(String elementName) {
        WebElement element = header.getWebElement(elementName);
        Assert.assertNotNull("Element not found: " + elementName, element);
        if (elementName.equalsIgnoreCase("Shopping Cart")) {
            pp.hoverOver(element);
        }
        pp.waitUntilVisibilityOf(element);
        Assert.assertTrue(elementName + " is not visible.", element.isDisplayed());
    }

    @When("I click on the {string}")
    public void iClickOnThe(String elementName) {
        WebElement element = header.getWebElement(elementName);
        Assert.assertNotNull("Element not found: " + elementName, element);
        pp.myClick(element);
    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String expectedKeywordInUrl) {
        String url = GWD.getDriver().getCurrentUrl().toLowerCase();
        System.out.println("Current URL: " + url);

        switch (expectedKeywordInUrl.toLowerCase()) {
            case "lunablanco.com":
            case "home":
            case "homepage":
                expectedKeywordInUrl = "lunablanco.com";
                break;
            case "store":
                expectedKeywordInUrl = "store";
                break;
            case "philosophy":
                expectedKeywordInUrl = "philosophy";
                break;
            case "profile":
                expectedKeywordInUrl = "mein-konto";
                break;
            case "cart":
            case "shopping cart":
                expectedKeywordInUrl = "cart";
                break;
        }

        Assert.assertTrue("URL is incorrect: " + url,
                url.contains(expectedKeywordInUrl.toLowerCase()));
    }

    @When("I hover over the {string}")
    public void iHoverOverThe(String elementName) {
        WebElement element = header.getWebElement(elementName);
        Assert.assertNotNull("Element not found for hover: " + elementName, element);
        pp.hoverOver(element);
    }

    @Then("I should see the shopping cart submenu")
    public void iShouldSeeTheShoppingCartSubmenu() {
        pp.waitUntilVisibilityOf(header.emptyCartText);
        String actualText = header.emptyCartText.getText().trim();
        System.out.println("Shopping cart submenu item: " + actualText);
        Assert.assertEquals("Keine Produkte im Warenkorb", actualText);
    }

    @Then("I should see the store submenu")
    public void iShouldSeeTheStoreSubmenu() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOf(header.allPieces));
        Assert.assertTrue("ALL PIECES not displayed", header.allPieces.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(header.tShirts));
        Assert.assertTrue("T-SHIRTS not displayed", header.tShirts.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(header.hoodies));
        Assert.assertTrue("HOODIES not displayed", header.hoodies.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(header.sweater));
        Assert.assertTrue("SWEATER not displayed", header.sweater.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(header.headwear));
        Assert.assertTrue("HEADWEAR not displayed", header.headwear.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(header.archiv));
        Assert.assertTrue("ARCHIV not displayed", header.archiv.isDisplayed());
    }

    @Then("I should see the profile submenu")
    public void iShouldSeeTheProfileSubmenu() {

        for (WebElement item : header.profileSubmenu) {
            Assert.assertTrue("Submenu item is not visible: " + item.getText(), item.isDisplayed());
        }

    }
}
