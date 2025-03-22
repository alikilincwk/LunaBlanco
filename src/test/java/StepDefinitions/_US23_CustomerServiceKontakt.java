package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class _US23_CustomerServiceKontakt {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("Click on the Kontakt button")
    public void clickOnTheAgbButton() {
        pp.scrolltoElement(dc.kontaktBtn);
        pp.myClick(dc.kontaktBtn);
    }

    @Then("Verify that the Kontakt page opens")
    public void verifyThatTheAgbPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/kontakt/", currentUrl);
    }

    @And("Verify that telephone number and email address on the Kontakt Page")
    public void verifyThatTelephoneNumberAndEmailAddress(){
        pp.scrolltoElement(dc.telephoneNumberBox);
        dc.telephoneNumberBox.isDisplayed();
        dc.telephoneNumberBox.isEnabled();
        dc.eMailBox.isDisplayed();
        dc.eMailBox.isEnabled();
    }
}
