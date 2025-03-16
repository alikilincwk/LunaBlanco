package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _US12_ProfileMenu {
    Headers headers = new Headers();

    @Then("Submenu should be seen")
    public void submenuShouldBeSeen() {

        for (WebElement item : headers.profileSubmenu) {
            Assert.assertTrue("Submenu item is not visible: " + item.getText(), item.isDisplayed());
        }
    }

    @Then("If the user is not logged in, the {string} option should be visible")
    public void ifTheUserIsNotLoggedInTheOptionShouldBeVisible(String arg0) {

        Assert.assertTrue(headers.anmeldenBtn.isDisplayed());
    }

    @And("Click elsewhere on the page")
    public void clickElsewhereOnThePage() {

        Actions action = new Actions(GWD.getDriver());
        action.moveByOffset(40, 50).click().perform();
    }

    @Then("Submenu should be closed")
    public void submenuShouldBeClosed() {

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfAllElements(headers.profileSubmenu));

        for (WebElement item : headers.profileSubmenu) {
            try {
                Assert.assertFalse("Submenu item is still visible: " + item.getText(), item.isDisplayed());
            } catch (NoSuchElementException e) {
                System.out.println("Submenu item is not in the DOM, so it's considered closed.");
            }
        }
    }
}
