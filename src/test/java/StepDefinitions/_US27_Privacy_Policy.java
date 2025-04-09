package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _US27_Privacy_Policy {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the datenschutzerklärung button")
    public void theCustomerClicksOnTheDatenschutzerklärungButton() {

        pp.scrolltoElement(dc.DatenschutzerklärungBtn);
        pp.myClick(dc.DatenschutzerklärungBtn);

    }



    @Then("the customer verifies that the datenschutzerklärung page opens")
    public void theCustomerVerifiesThatTheDatenschutzerklärungPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/datenschutzerklaerung/", currentUrl);

    }
}

