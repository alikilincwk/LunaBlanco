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

    @When("Click on the Philosophy button")
    public void clickOnThePhilosophyButton() {

        pp.myClick(headers.philosophyBtn);

    }



    @Then("Verify that the Philosophy page opens")
    public void verifyThatThePhilosophyPageOpens() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/philosophy/", currentUrl);


    }

}
