package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class _US24_CustomerServiceShippingAndReturns {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the shipping and returns button")
    public void theCustomerClicksOnTheAgbButton() {
        pp.scrolltoElement(dc.shippingAndReturnsBtn);
        pp.myClick(dc.shippingAndReturnsBtn);
    }

    @Then("the customer verifies that the shipping and returns page opens")
    public void theCustomerVerifiesThatTheAgbPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/versand-rueckversand/", currentUrl);
    }

    @And("the customer verifies that return period and shipping areas on the shipping and returns page")
    public void theCustomerVerifiesThatReturnPeriodAndShippingAreas(){
        pp.scrolltoElement(dc.returnPeriodBox);
        dc.returnPeriodBox.isDisplayed();
        dc.returnPeriodBox.isEnabled();
        for (WebElement we: dc.getShippingAreasBoxes()){
            pp.scrolltoElement(we);
            we.isDisplayed();
            we.isEnabled();
        }
    }
}
