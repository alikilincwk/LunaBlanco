package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _US03_HomepageLogo {


    WebDriver driver = GWD.getDriver();
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @Given("a customer on the LunaBlanco website")
    public void aCustomerOnTheLunaBlancoWebsite() {
        driver.get("https://lunablanco.com/");
        pp.acceptAllCookies();
        pp.waitUntilVisibilityOf(dc.homepageLogo);
    }

    @When("the customer clicks on the company logo")
    public void theCustomerClicksOnTheCompanyLogo() {

        dc.homepageLogo.click();
    }

    @Then("the customer should be redirected to the homepage")
    public void theCustomerShouldBeRedirectedToTheHomepage() {
        Assert.assertEquals("https://lunablanco.com/", driver.getCurrentUrl());
    }
}
