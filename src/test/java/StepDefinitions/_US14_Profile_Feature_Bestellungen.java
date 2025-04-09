package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _US14_Profile_Feature_Bestellungen {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("the customer hovers over to profile")
    public void theCustomerHoversOverToProfile() {

        pp.hoverOver(headers.userProfile);

    }


    @And("the customer clicks on the bestellungen button")
    public void theCustomerClicksOnTheBestellungenButton() {

        pp.myClick(headers.bestellungenBtn);

    }


}
