package StepDefinitions;

import Pages.Headers;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import Pages.ParentPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class _US31_NachOben {

    Headers header = new Headers();
    WebDriver driver = GWD.getDriver();
    ParentPage pp = new ParentPage();

    @Given("a customer on the LunaBlanco homepage for nach oben test")
    public void aCustomerOnTheLunaBlancoHomepageForNachObenTest() throws InterruptedException{
        driver.get("https://lunablanco.com/");
        pp.acceptAllCookies();
        Thread.sleep(1000);

    }

    @When("the customer scrolls to the bottom or click the down arrow")
    public void theCustomerScrollsToBottomOrClickDownArrow() throws InterruptedException {
        header.arrowDownBtn.click();
        Thread.sleep(2000);
    }

    @Then("the {string} button should appear at bottom right")
    public void theButtonShouldAppear(String btnName) throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(btnName + " butonu görünmüyor!", header.nachObenBtn.isDisplayed());
    }

    @When("the customer clicks the {string} button")
    public void theCustomerClicksTheButton(String btnName) throws InterruptedException {
        header.nachObenBtn.click();
        Thread.sleep(2000);
    }

    @And("the {string} button should not be visible anymore")
    public void theButtonShouldNotBeVisibleAnymore(String btnName) throws InterruptedException {
        Thread.sleep(2000);
        try {
            boolean visible = header.nachObenBtn.isDisplayed();
            Assert.assertFalse("Nach Oben button hâlâ görünüyor!", visible);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Nach Oben butonu DOM'dan silindi, bu da kabul.");
        }
    }


}
