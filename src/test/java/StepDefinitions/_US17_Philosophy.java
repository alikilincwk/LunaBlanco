package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _US17_Philosophy {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the philosophy button")
    public void theCustomerClicksOnThePhilosophyButton() {
        pp.myClick(headers.philosophyBtn);
    }



    @Then("the customer redirected to the philosophy page")
    public void theCustomerRedirectedToThePhilosophyPage() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/philosophy/", currentUrl);


    }

}
