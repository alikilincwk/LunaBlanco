package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    //US_12_ProfileMenu
    @FindBy(xpath = "//*[@id='menu-luna-blanco-my-account-menu']")
    public List<WebElement> profileSubmenu;

    @FindBy(xpath = "//*[@id='menu-luna-blanco-my-account-menu']/li[4]/a")
    public WebElement anmeldenBtn;

    //US_13_Profile Mein Konto
    @FindBy(xpath = "//*[@id='menu-item-52013']/a")
    public WebElement meinKontoBtn;

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

    //US_09_StoreSweater, _US10_StoreHeadwear
    @FindBy(xpath ="//a[@href='/category/sweaters/']")
    public WebElement sHeaderSWIcon;
    @FindBy(xpath ="//a[@href='/category/headwear/']")
    public WebElement sHeaderHWIcon;

    //_01_Register, _02_Login
    @FindBy(xpath ="//a[@class='account-menu-login']")
    public WebElement headerLogin;

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "userProfile": return this.userProfile;
            case "bestellungenBtn": return this.bestellungenBtn;
            case "adresseBtn": return this.adresseBtn;
            case "abmeldenBtn": return this.abmeldenBtn;
            case "philosophyBtn": return this.philosophyBtn;
            case "sHeaderSweaterIcon": return this.sHeaderSWIcon;
            case "sHeaderHWIcon": return this.sHeaderHWIcon;
            case "archiv": return this.archiv;
            case "headerLogin": return this.headerLogin;
            case "meinKonto": return this.meinKontoBtn;
        }
        return null;
    }
}
