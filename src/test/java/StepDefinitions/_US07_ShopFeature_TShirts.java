package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Pages.ParentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _US07_ShopFeature_TShirts {

    Headers headers=new Headers();
    ParentPage pp=new ParentPage();

    @When("Click on the T_Shirts button")
    public void clickOnTheT_ShirtsButton() {

        pp.myClick(headers.tShirts);

    }

    @Then("Verify product visibility on T_Shirts page")
    public void verifyProductVisibilityOnT_ShirtsPage() {

        DialogContent dc = new DialogContent();
        List<WebElement> products = dc.getTsirtsProducts();

        for (WebElement product : products) {

            String name = product.getText();
            System.out.println(name);

            Assert.assertTrue("A product is not visible!", product.isDisplayed());

        }

    }
}
