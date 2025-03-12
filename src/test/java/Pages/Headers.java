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


    //US_14_Profile Feature/BESTELLUNGEN
    @FindBy(xpath="//i[@class='far fa-user icons']")
    public WebElement userProfile;
    @FindBy(xpath="//a[@href='/mein-konto/bestellungen/']")
    public WebElement bestellungenBtn;

    //US_15_Profile Feature/ADRESSE
    @FindBy(xpath="//a[@href='/mein-konto/adressen-bearbeiten/']")
    public WebElement adresseBtn;

    //US_16_Profile Feature/ADRESSE
    @FindBy(xpath="//a[text()='ABMELDEN']")
    public WebElement abmeldenBtn;

    //  US_17_Profile Feature/ADRESSE
    @FindBy(xpath="//span[@class='menu-hover-line' and text()='Philosophy']")
    public WebElement philosophyBtn;





    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "userProfile": return this.userProfile;
            case "bestellungenBtn": return this.bestellungenBtn;
            case "adresseBtn": return this.adresseBtn;
            case "abmeldenBtn": return this.abmeldenBtn;
            case "philosophyBtn": return this.philosophyBtn;

        }
        return null;
    }
}
