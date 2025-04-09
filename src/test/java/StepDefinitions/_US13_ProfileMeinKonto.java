package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _US13_ProfileMeinKonto {

    ParentPage pp = new ParentPage();
    DialogContent dc = new DialogContent();

    @And("user profile page should be seen")
    public void userProfilePageShouldBeSeen() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        assert currentUrl != null;
        Assert.assertTrue(currentUrl.contains("/mein-konto/"));
    }

    @Then("field names should be displayed")
    public void fieldNamesShouldBeDisplayed() {
        Assert.assertTrue(dc.anmeldenText.isDisplayed());
        Assert.assertTrue(dc.registrierenText.isDisplayed());
        Assert.assertTrue(dc.benutzernameOdereMail.isDisplayed());
        Assert.assertTrue(dc.passwort.isDisplayed());
        Assert.assertTrue(dc.eMailAdresse.isDisplayed());
    }

    @Then("fields should be clickable and writable")
    public void fieldsShouldBeClickableAndWritable() {
        Assert.assertTrue(dc.usernameField.isEnabled(), "Field is not clickable!");
        Assert.assertTrue(dc.passwordField.isEnabled(), "Field is not clickable!");
        Assert.assertTrue(dc.regEmailField.isEnabled(), "Field is not clickable!");

        pp.mySendKeys(dc.usernameField, "Testing");
        pp.mySendKeys(dc.passwordField, "Testing");
        pp.mySendKeys(dc.regEmailField, "Testing");
    }
}
