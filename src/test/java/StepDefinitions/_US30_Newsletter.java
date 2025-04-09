package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US30_Newsletter {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();

    @When("the customer scrolls down to the bottom of the page")
    public void theCustomerScrollsDownToTheBottomOfThePage()
    {
        pp.scrolltoElement(dc.emailInput);
    }

    @Then("the customer enters an email adress")
    public void theCustomerEntersEmailAdress()
    {
        dc.mySendKeys(dc.emailInput,"kadriyealsancak@gmail.com");
    }

    @And("the customer clicks on the button")
    public void theCustomerClicksOnTheButton()
    {
        dc.myClick(dc.submitButton);
    }
}
