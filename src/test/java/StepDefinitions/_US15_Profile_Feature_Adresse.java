package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.When;

public class _US15_Profile_Feature_Adresse {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("the customer clicks on the adresse button")
    public void theCustomerClicksOnTheAdresseButton() {

        pp.myClick(headers.adresseBtn);

    }
}
