package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.When;

public class _US16_Profile_Feature_Abmelden {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the abmelden button")
    public void theCustomerClicksOnTheAbmeldenButton() {

        pp.myClick(headers.abmeldenBtn);

    }
}
