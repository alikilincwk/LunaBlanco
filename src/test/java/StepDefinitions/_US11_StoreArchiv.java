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

    @Then("the customer confirms that they are in the archiv page")
    public void confirmThatUserIsInTheArchivPage() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/category/archiv/", currentUrl);
    }

    @Then("the product page should be seen")
    public void theProductPageShouldBeSeen() {

        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals("https://lunablanco.com/store/luna-blanco-vvg-1889-navyblue/", currentUrl);

    }

    @Then("the customer confirms that the product is marked as out-of-stock")
    public void theCustomerConfirmsThatTheProductIsMarkedAsOutOfStock() {

        parent.verifyContainsText(dc.ausverkauftInfo,"DIESES PRODUKT IST AUSVERKAUFT UND NICHT VERFÜGBAR.");
    }

}
