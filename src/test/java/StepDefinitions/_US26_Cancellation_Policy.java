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

    @When("the customer clicks on the widerrufsbelehrung button")
    public void theCustomerClicksOnTheWiderrufsbelehrungButton() {

        pp.scrolltoElement(dc.WiderrufsbelehrungBtn);
        pp.myClick(dc.WiderrufsbelehrungBtn);

    }



    @Then("the customer verifies that the widerrufsbelehrung page opens")
    public void theCustomerVerifiesThatTheWiderrufsbelehrungPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/widerrufsbelehrung/", currentUrl);

    }
}
