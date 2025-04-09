package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class _US23_CustomerServiceKontakt {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the kontakt button")
    public void theCustomerClicksOnTheAgbButton() {
        pp.scrolltoElement(dc.kontaktBtn);
        pp.myClick(dc.kontaktBtn);
    }

    @Then("the customer verifies that the kontakt page opens")
    public void theCustomerVerifiesThatTheAgbPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/kontakt/", currentUrl);
    }

    @And("the customer verifies that telephone number and email address on the kontakt page")
    public void theCustomerVerifiesThatTelephoneNumberAndEmailAddress(){
        pp.scrolltoElement(dc.telephoneNumberBox);
        dc.telephoneNumberBox.isDisplayed();
        dc.telephoneNumberBox.isEnabled();
        dc.eMailBox.isDisplayed();
        dc.eMailBox.isEnabled();
    }
}
