package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreHoverOver {
    Headers headers=new Headers();
    ParentPage pp=new ParentPage();;

    @Given("Navigate to LunaBlanco")
    public void navigateToLunaBlanco() {
        GWD.getDriver().get("https://lunablanco.com/");
        pp.acceptAllCookies();

    }

    @When("Hover over to Store")
    public void hoverOverToStore() {
        pp.hoverOver(headers.store);

    }

    @Then("Sub-Categories should be seen")
    public void subCategoriesShouldBeSeen() {
        pp.verifyContainsText(headers.allPieces, "ALLE PIECES");
        pp.verifyContainsText(headers.tShirts, "T-SHIRTS");
        pp.verifyContainsText(headers.hoodies, "HOODIES");
        pp.verifyContainsText(headers.sweater, "SWEATER");
        pp.verifyContainsText(headers.headwear, "HEADWEAR");
        pp.verifyContainsText(headers.archiv,"ARCHIV");
    }
}
