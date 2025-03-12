package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _US14_Profile_Feature_Bestellungen {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("Hover over to Profile")
    public void hoverOverToProfile() {

        pp.hoverOver(headers.userProfile);

    }


    @And("Click on the Bestellungen button")
    public void clickOnTheBestellungenButton() {

        pp.myClick(headers.bestellungenBtn);

    }


}
