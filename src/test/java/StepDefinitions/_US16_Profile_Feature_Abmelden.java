package StepDefinitions;

import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.When;

public class _US16_Profile_Feature_Abmelden {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("Click on the Abmelden button")
    public void clickOnTheAbmeldenButton() {

        pp.myClick(headers.abmeldenBtn);

    }
}
