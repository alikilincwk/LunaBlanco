package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class _US11_StoreArchiv {

    Headers headers = new Headers();
    ParentPage parent = new ParentPage();
    DialogContent dc = new DialogContent();

    @Then("Confirm that user is in the Archiv page")
    public void confirmThatUserIsInTheArchivPage() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/category/archiv/", currentUrl);
    }

    @Then("Product page should be seen")
    public void productPageShouldBeSeen() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/store/luna-blanco-vvg-1889-navyblue/", currentUrl);

    }

    @Then("Confirm that the product is marked as out-of-stock")
    public void confirmThatTheProductIsMarkedAsOutOfStock() {

        parent.verifyContainsText(dc.ausverkauftInfo,"DIESES PRODUKT IST AUSVERKAUFT UND NICHT VERFÜGBAR.");
    }

}
