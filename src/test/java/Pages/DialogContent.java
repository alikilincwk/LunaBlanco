package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    //US_07_Store Feature/T-Shirts
    @FindBy(xpath = "//ul[contains(@class, 'products')]//h2[@class='woocommerce-loop-product__title']")
    public List<WebElement> tShirtsProducts;


    @FindBy(xpath = "//a[@class='navigation-links' and text()='AGB']")
    public WebElement agbBtn;






    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "agbBtn": return this.agbBtn;
        }
        return null;
    }



    //US_07_Store Feature/T-Shirts method
    public List<WebElement> getTsirtsProducts() {
        return this.tShirtsProducts;
    }
}
