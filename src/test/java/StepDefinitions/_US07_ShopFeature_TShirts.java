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

    @When("the customer clicks on the t-shirts button")
    public void theCustomerClicksOnTheTShirtsButton() {

        pp.myClick(headers.tShirts);

    }

    @Then("the customer verifies the product visibility on the t-shirts page")
    public void theCustomerVerifiesTheProductVisibilityOnTheTShirtsPage() {

        DialogContent dc = new DialogContent();
        List<WebElement> products = dc.getTsirtsProducts();

        for (WebElement product : products) {

            String name = product.getText();
            System.out.println(name);

            Assert.assertTrue("A product is not visible!", product.isDisplayed());

        }

    }
}
