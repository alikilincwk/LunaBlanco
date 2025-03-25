package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class _US22_Customer_Service_SSS {
    DialogContent dc = new DialogContent();

    @When("Click on the FAQs element")
    public void clickOnTheFAQsElement() {
        dc.scrolltoElement(dc.faQs);
        dc.faQs.click();
    }

    @Then("Verify the FAQs page appear")
    public void verifyTheFAQsPageAppear() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.fAQsTitle));
        Assert.assertTrue(dc.fAQsTitle.getText().toLowerCase().contains("FAQs".toLowerCase()));
    }

    @And("click on the plus icon, the solution suggestions for the questions should appear.")
    public void clickOnThePlusIconTheSolutionSuggestionsForTheQuestionsShouldAppear() {
        for (int i = 0; i < dc.plusIcon.size(); i++) {
            dc.scrolltoElement(dc.plusIcon.get(i));
            dc.jsClick(dc.plusIcon.get(i));
            dc.wait.until(ExpectedConditions.visibilityOf(dc.plusIcon.get(i)));
        }
    }
}
