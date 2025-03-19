package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US30_Newsletter {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("Scroll down to the bottom of the page")
    public void scrollDownToTheBottomOfThePage()
    {
        pp.scrolltoElement(dc.emailInput);
    }

    @Then("Enter email adress")
    public void enterEmailAdress()
    {
        dc.mySendKeys(dc.emailInput,"kadriyealsancak@gmail.com");
    }

    @And("Click on the button")
    public void clickOnTheButton()
    {
        dc.myClick(dc.submitButton);
    }
}
