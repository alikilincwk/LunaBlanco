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

    //US_06_StoreAllePieces
    @FindBy(xpath="//*[text()='Filter']")
    public WebElement filter;
    @FindBy (xpath ="//*[@class='hongo-product-taxonomy-filter-wrap hongo-product-taxonomy-filter-wrap-ajax']")
    public WebElement listOfcatagories;
    @FindBy(xpath = "//*[@class='farbe clearfix hongo-attribute-filter-ajax hongo-attribute-filter']")
    public WebElement listOfcolors;
    @FindBy(xpath = "//*[@class='groesse clearfix hongo-attribute-filter-ajax hongo-attribute-filter']")
    public WebElement listOfsizes;
    @FindBy(xpath = "//*[@class='hongo-active-filter hongo-active-filter-ajax']")
    public WebElement listOffilteredItems;
    @FindBy(xpath = "//*[@class='hongo-column-switch']")
    public WebElement listViewForm;
    @FindBy(xpath = "(//*[@class='col-md-12 col-xs-12 sidebar hongo-woocommerce-top-sidebar hongo-top-filter-sidebar']/following::ul)[1]")
    public WebElement itemView;
    @FindBy(xpath="//*[text()='Zurücksetzen']")
    public WebElement Zurücksetzen;
    @FindBy(css = "[class='orderby select2-hidden-accessible']")
    public  WebElement sortSelection;


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
            //US06
            case "ALLE PIECES": return this.allPieces;
            case "T-SHIRTS": return this.tShirts;
            case "HOODIES": return this.hoodies;
            case "SWEATER": return this.sweater;
            case "HEADWEAR": return this.headwear;
            case "ARCHIV":return this.archiv;

            //us04
            case "Logo": return this.homepageLogo;
            case "Home": return this.home;
            case "Profile": return this.profile;

            case "Philosophy": return this.philosophyBtn;  //?

            case "Shopping Cart": return this.shoppingCart;
            case "Store": return this.store;


        }
        return null;
    }

    //us04
    @FindBy(xpath = "//i[@class='far fa-user icons']")
    public WebElement profile;

    @FindBy( xpath="//div[@class='hongo-cart-top-counter']//i[@class='icon-bag hongo-cart-icon']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//a[@class=\"logo-light\"]//img[@alt=\"luna blanco°\"]")
    public WebElement homepageLogo;

    @FindBy(xpath = "//span[@class=\"menu-hover-line\"][normalize-space()=\"Home\"]")
    public WebElement home;

    @FindBy(xpath = "//p[@class='woocommerce-mini-cart__empty-message alt-font']")
    public WebElement emptyCartText;

    // US_031_NachOben
    @FindBy(xpath = "//span[normalize-space()='NACH OBEN']")
    public WebElement nachObenBtn;

    @FindBy(xpath = "//i[@class='icon-extra-small fas fa-arrow-down']")
    public WebElement arrowDownBtn;

}
