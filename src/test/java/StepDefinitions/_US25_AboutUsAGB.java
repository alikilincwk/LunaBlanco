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

    @When("the customer clicks on the AGB button")
    public void theCustomerClicksOnTheAGBButton() {

        pp.scrolltoElement(dc.agbBtn);
        pp.myClick(dc.agbBtn);

    }



    @Then("the customer verifies that the AGB page opens")
    public void theCustomerVerifiesThatTheAGBPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/agb/", currentUrl);

    }
}
