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

    @When("Click on the Datenschutzerklärung button")
    public void clickOnTheDatenschutzerklärungButton() {

        pp.scrolltoElement(dc.DatenschutzerklärungBtn);
        pp.myClick(dc.DatenschutzerklärungBtn);

    }



    @Then("Verify that the Datenschutzerklärung page opens")
    public void verifyThatTheDatenschutzerklärungPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/datenschutzerklaerung/", currentUrl);

    }
}

