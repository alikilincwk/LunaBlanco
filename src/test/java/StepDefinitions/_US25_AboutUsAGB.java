package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _US25_AboutUsAGB {

    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("Click on the AGB button")
    public void clickOnTheAgbButton() {

        pp.scrolltoElement(dc.agbBtn);
        pp.myClick(dc.agbBtn);

    }



    @Then("Verify that the AGB page opens")
    public void verifyThatTheAgbPageOpens() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/agb/", currentUrl);


    }
}
