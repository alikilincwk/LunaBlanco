package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _US26_Cancellation_Policy {

    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("Click on the Widerrufsbelehrung button")
    public void clickOnTheWiderrufsbelehrungButton() {

        pp.scrolltoElement(dc.WiderrufsbelehrungBtn);
        pp.myClick(dc.WiderrufsbelehrungBtn);

    }



    @Then("Verify that the Widerrufsbelehrung page opens")
    public void verifyThatTheWiderrufsbelehrungPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/widerrufsbelehrung/", currentUrl);

    }
}
