package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _28_AboutUsImpressum {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();



    @Then("Click on the Impressum")
    public void clickOnTheImpressum()
    {
        dc.myClick(dc.ImpressumBtn);
    }
}
