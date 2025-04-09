package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.Then;

public class _US28_AboutUsImpressum {
    DialogContent dc = new DialogContent();
    ParentPage pp=new ParentPage();



    @Then("the customer clicks on the impressum")
    public void theCustomerClicksOnTheImpressum()
    {
        dc.myClick(dc.ImpressumBtn);
    }
}
