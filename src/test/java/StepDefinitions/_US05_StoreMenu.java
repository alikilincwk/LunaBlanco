package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US05_StoreMenu {
    Headers headers=new Headers();
    ParentPage pp=new ParentPage();;

    @Given("a customer navigates to LunaBlanco")
    public void aCustomerNavigatesToLunaBlanco() {
        GWD.getDriver().get("https://lunablanco.com/");
        pp.acceptAllCookies();

    }

    @When("the customer hovers over to store")
    public void theCustomerHoversOverToStore() {
        pp.hoverOver(headers.store);

    }

    @Then("sub-categories should be seen")
    public void subCategoriesShouldBeSeen() {
        pp.verifyContainsText(headers.allPieces, "ALLE PIECES");
        pp.verifyContainsText(headers.tShirts, "T-SHIRTS");
        pp.verifyContainsText(headers.hoodies, "HOODIES");
        pp.verifyContainsText(headers.sweater, "SWEATER");
        pp.verifyContainsText(headers.headwear, "HEADWEAR");
        pp.verifyContainsText(headers.archiv,"ARCHIV");
    }
}
