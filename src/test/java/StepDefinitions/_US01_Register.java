package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;


public class _US01_Register {
    DialogContent dc = new DialogContent();
    JavascriptExecutor js;

    @Then("Confirm a validation message is visible on screen")
    public void confirmAValidationMessageIsVisibleOnScreen() {
        js = (JavascriptExecutor) GWD.getDriver();
        Assert.assertEquals((Boolean) js.executeScript("return arguments[0].validity.typeMismatch;", dc.pRegMail),true);
    }
}
