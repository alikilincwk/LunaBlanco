package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US10_StoreHeadwear {
    DialogContent dc = new DialogContent();

    @Then("the user should be redirected to the headwear page")
    public void theUserShouldBeRedirectedToTheHeadwearPage() {
        dc.wait.
                until(ExpectedConditions.
                        visibilityOf(dc.sSWTitle));
        Assert.
                assertEquals(dc.sSWTitle.
                        getText().
                                toLowerCase(),
                        "Headwear".
                                toLowerCase());
    }
}
