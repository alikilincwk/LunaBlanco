package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US29_InstagramLogo {

    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();




    @When("Click on the Instagram button")
    public void clickOnTheInstagramButton()
    {
        pp.scrollTOElementSmooth(dc.InstagramLogo);
        dc.myClick(dc.InstagramLogo);
    }


    @Then("Verify Instagram page is opened")
    public void verifyInstagramPageIsOpened()
    {
        pp.switchToWindow(1);
        pp.wait.until(ExpectedConditions.urlToBe("https://www.instagram.com/lunablanco.de/"));
        Assert.assertEquals(pp.getCurrentURL(),"https://www.instagram.com/lunablanco.de/");
        pp.waitUntilVisibilityOf(dc.closeButton);
        dc.myClick(dc.closeButton);

    }


}
