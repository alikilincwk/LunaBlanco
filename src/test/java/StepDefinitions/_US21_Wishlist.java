package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _US21_Wishlist {
    DialogContent dc = new DialogContent();

    @And("Hover over to first product")
    public void hoverOverToFirstProduct() {
        dc.hoverOver(dc.sSWFirstProduct);
    }

    @And("Check wishlist to confirm guest users cannot save products")
    public void checkWishlistToConfirmGuestUsersCannotSaveProducts() {
        GWD.getDriver().navigate().to("https://lunablanco.com/wunschliste/");
    }
}
