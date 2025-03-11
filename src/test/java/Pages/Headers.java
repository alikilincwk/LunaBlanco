package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Headers extends ParentPage{
    public Headers() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    //US_05_StoreMenu
    @FindBy(linkText = "Store")
    public WebElement store;
    @FindBy(xpath="//*[text()='ALLE PIECES']")
    public WebElement allPieces;
    @FindBy(xpath="//*[text()='T-SHIRTS']")
    public WebElement tShirts;
    @FindBy(xpath="//*[text()='HOODIES']")
    public WebElement hoodies;
    @FindBy(xpath="//*[text()='SWEATER']")
    public WebElement sweater;
    @FindBy(xpath="//*[text()='HEADWEAR']")
    public WebElement headwear;
    @FindBy(xpath="//*[text()='ARCHIV']")
    public WebElement archiv;







    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "":
        }
        return null;
    }
}
