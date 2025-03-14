package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US10_StoreHeadwear {
    Headers h = new Headers();
    DialogContent dc = new DialogContent();

    @Then("Confirm that user is in the head wear page")
    public void confirmThatUserIsInTheHeadWearPage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.sSWTitle));
        Assert.assertEquals(dc.sSWTitle.getText().toLowerCase(), "Headwear".toLowerCase());
    }
}
