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

    @When("Click on the Shipping and Returns button")
    public void clickOnTheAgbButton() {
        pp.scrolltoElement(dc.shippingAndReturnsBtn);
        pp.myClick(dc.shippingAndReturnsBtn);
    }

    @Then("Verify that the Shipping and Returns page opens")
    public void verifyThatTheAgbPageOpens() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/versand-rueckversand/", currentUrl);
    }

    @And("Verify that return period and shipping areas on the Shipping and Returns Page")
    public void verifyThatReturnPeriodAndShippingAreas(){
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
