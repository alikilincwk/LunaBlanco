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

    //US_11_Archiv
    @FindBy(xpath = "//*[@id='main']/div/ul/li[2]/div[1]/a")
    public WebElement ausverkauftProduct;
    @FindBy(xpath = "//p[contains(@class, 'stock') and contains(@class, 'out-of-stock')]")
    public WebElement ausverkauftInfo;

    //US_13_Profile Mein Konto
    @FindBy(xpath = "//*[@id='customer_login']/div[1]/h4")
    public WebElement anmeldenText;
    @FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[1]/label")
    public WebElement benutzernameOdereMail;
    @FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[2]/label")
    public WebElement passwort;
    @FindBy(xpath = "//*[@id='customer_login']/div[2]/h4")
    public WebElement registrierenText;
    @FindBy(xpath = "//*[@id='customer_login']/div[2]/form/p[1]/label")
    public WebElement eMailAdresse;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameField;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordField;
    @FindBy(xpath = "//*[@id='reg_email']")
    public WebElement regEmailField;

    //US_07_Store Feature/T-Shirts
    @FindBy(xpath = "//ul[contains(@class, 'products')]//h2[@class='woocommerce-loop-product__title']")
    public List<WebElement> tShirtsProducts;

    //_US08_StoreHoodies
    @FindBy(xpath = "//h1[text()='Hoodies']")
    public WebElement hoodiesTitle;
    @FindBy(xpath = "//ul[contains(@class,'hongo-text-center')]//div[@class='product-thumb-wrap']")
    public List<WebElement> allhoodies;


    //US_22
    @FindBy(xpath = "//a[text()='FAQs']")
    public WebElement faQs;

    @FindBy(xpath = "//h1[text()='FAQs']")
    public WebElement fAQsTitle;

    @FindBy(css = "[class='wpb-content-wrapper'] i")
    public List <WebElement> plusIcon;

    //US_23_Customer Service/Kontakt
    @FindBy(xpath = "//a[@class='navigation-links' and text()='Kontakt']")
    public WebElement kontaktBtn;
    @FindBy(xpath = "(//div[@class='sub-title alt-font'])[2]")
    public WebElement telephoneNumberBox;
    @FindBy(xpath = "(//div[@class='sub-title alt-font'])[3]")
    public WebElement eMailBox;

    //US_24_Customer Service/Shipping and Returns
    @FindBy(xpath = "//a[@class='navigation-links' and text()='Versand & Rückversand']")
    public WebElement shippingAndReturnsBtn;
    @FindBy(xpath = "//a[@class='navigation-links' and text()='Versand & Rückversand']")
    public WebElement returnPeriodBox;
    @FindBy(xpath = "//div[starts-with(@class,'text-block-content hongo-text-block-1')]//h3")
    public List<WebElement> shippingAreasBoxes;

    //US_25_About Us/AGB
    @FindBy(xpath = "//a[@class='navigation-links' and text()='AGB']")
    public WebElement agbBtn;

    //US_26_Cancellation Policy
    @FindBy(xpath = "//a[contains(text(), 'Widerrufsbelehrung')]")
    public WebElement WiderrufsbelehrungBtn;

    //US_27_Privacy Policy
    @FindBy(xpath = "//a[@class='navigation-links' and contains(@href, 'datenschutzerklaerung')]")
    public WebElement DatenschutzerklärungBtn;

    //US_09_StoreSweater, _US10_StoreHeadwear
    @FindBy(xpath = "//h1[contains(text(),title)]")
    public WebElement sSWTitle;
    @FindBy(xpath = "//span[@class='ti-plus']/..")
    public WebElement sSWFilter;
    @FindBy(xpath = "((//div[@class='product-thumb-wrap'])[1]//a)[1]")
    public WebElement sSWFirstProduct;
    @FindBy(xpath = "//img[contains(@class, 'hongo-alternate-image')]")
    public WebElement sSWAltImage;
    @FindBy(xpath = "//a[@class='attribute-round-link']")
    public WebElement sSWFilterColour;
    @FindBy(xpath = "(//a[@class='attribute-square-link'])[1]")
    public WebElement sSWFilterSize;
    @FindBy(xpath = "(//span[@tabindex='0' and contains(@class,'slider')])[1]")
    public WebElement sSWFilterSliderLeft;
    @FindBy(xpath = "(//span[@tabindex='0' and contains(@class,'slider')])[2]")
    public WebElement sSWFilterSliderRight;
    @FindBy(xpath = "//div[@class='price_slider_amount']//button")
    public WebElement sSWPriceFilterButton;
    @FindBy(xpath = "//span[@class='from']")
    public WebElement sSWPriceFilterMin;
    @FindBy(xpath = "//span[@class='to']")
    public WebElement sSWPriceFilterMax;
    @FindBy(xpath = "(//a//bdi)[1]")
    public WebElement sSWComparePriceMin;
    @FindBy(xpath = "(//a//bdi)[2]")
    public WebElement sSWComparePriceMax;
    @FindBy(xpath = "//a[@aria-label='Filter entfernen']")
    public WebElement sSWFiltered;
    @FindBy(xpath = "//a[@aria-label='Zurücksetzen']")
    public WebElement sSWFilterReset;
    @FindBy(xpath = "//a[@data-col='2']")
    public WebElement sSWFilterColumn2;
    @FindBy(xpath = "//a[@data-col='3']")
    public WebElement sSWFilterColumn3;
    @FindBy(xpath = "//a[@data-col='4']")
    public WebElement sSWFilterColumn4;
    @FindBy(xpath = "//select[@name='orderby']")
    public WebElement sSWSortSelect;
    @FindBy(xpath = "//option[@value='popularity']")
    public WebElement sSWSortPopularity;
    @FindBy(xpath = "//option[@value='date']")
    public WebElement sSWSortDate;
    @FindBy(xpath = "//option[@value='price']")
    public WebElement sSWSortPrice;
    @FindBy(xpath = "//option[@value='price-desc']")
    public WebElement sSWSortPriceDesc;
    @FindBy(xpath = "//div[@class='blockUI blockOverlay']")
    public WebElement sSWLoading;

    //_US01_Register, _US02_Login
    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement pRegMail;
    @FindBy(xpath = "//input[@id='reg_data_privacy']")
    public WebElement pRegPrvCheck;
    @FindBy(xpath = "//button[@name='register']")
    public WebElement pRegButton;
    @FindBy(xpath = "//div[@role='alert']//div")
    public WebElement pRegAlert;
    @FindBy(xpath = "//div[@role='alert']//div//span")
    public WebElement pLogAlert;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement pLogUn;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement pLogPw;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement pLogButton;

    //_US21_Wishlist
    @FindBy(xpath = "//div[contains(@class,'wishlist-message')]")
    public WebElement wLAlert;
    @FindBy(xpath = "(//i[contains(@data-original-title,'Wunschliste')])[1]")
    public WebElement wLFirstProduct;
    @FindBy(xpath = "//p[contains(@class,'wishlist')]")
    public WebElement wLNoProduct;


    //_US_20_Checkout
    @FindBy(css = "[class='woocommerce-loop-product__title']")
    public List<WebElement> productList;

    @FindBy(css = "[class='product_title entry-title alt-font']")
    public WebElement productTitle;

    @FindBy(css = "[class='price alt-font'] bdi")
    public WebElement productTitlePrice;

    @FindBy(css = "[class='woocommerce-product-details__short-description']")
    public List<WebElement> productDetails;

    @FindBy(css = "[class*='2-5-werktage']")
    public WebElement shippingDay;

    @FindBy(css = "[class*='size-guide-link']")
    public List<WebElement> sizeGuideButton;

    @FindBy(css = "[class='size-chart-popup-heading']")
    public WebElement sizeChart;

    @FindBy(css = "[title='Close (Esc)']")
    public WebElement xButton;

    @FindBy(css = "[class='stock alt-font in-stock']")
    public List<WebElement> inStockText;

    @FindBy(css = "[class='stock alt-font out-of-stock']")
    public List<WebElement> outOfStockText;

    @FindBy(css = "[class*='single_add_to_cart_button']")
    public WebElement addToCartButton;

    @FindBy(css = "[class='hongo-swatch hongo-attribute-label']")
    public List<WebElement> sizeList;

    @FindBy(css = "[class*='wrap is_stuck'] li img")
    public List<WebElement> imageList;

    @FindBy(xpath = "(//*[text()='Waschhinweise'])[1]")
    public WebElement washingInstructions;

    @FindBy (xpath = "(//*[text()='Zusätzliche Informationen'])[1]")
    public WebElement additionalInfo;

    @FindBy(css = "[id*='tab-hongo'] li")
    public List<WebElement> washingText;

    @FindBy(css = "[class*='attributes-item__value']")
    public List<WebElement> additionalInfoText;

    @FindBy (css = "[class*='woocommerce-message alert']")
    public WebElement addToCartVerify;

    @FindBy(css = "[class='icon-bag hongo-cart-icon']")
    public WebElement shoppingCardIcon;

    @FindBy(css = "[class='button checkout wc-forward']")
    public WebElement checkoutBtn;

    @FindBy(id = "billing_first_name")
    public WebElement firstNamePl;

    @FindBy(id = "billing_last_name")
    public WebElement lastNamePl;

    @FindBy(id = "select2-billing_country-container")
    public WebElement countrySelect;

    @FindBy(css = "[class='select2-results__options'] li")
    public List<WebElement> countryList;

    @FindBy(css = "[id='billing_address_1']")
    public WebElement billingAddressPl;

    @FindBy(css = "[id='billing_city']")
    public WebElement billingCityPl;

    @FindBy(css = "[id='billing_postcode']")
    public WebElement billingPostCodePl;

    @FindBy(css = "[id='billing_phone']")
    public WebElement billingPhonePl;

    @FindBy(css = "[id='billing_email']")
    public WebElement billingEmailPl;

    @FindBy(css = "[class='input-checkbox']")
    public WebElement checkBOx;

    @FindBy(id = "createaccount")
    public WebElement createAccountCheck;

    @FindBy(id="ship-to-different-address-checkbox")
    public WebElement differentAddressCheck;

    @FindBy(css = "[class='product-total'] bdi")
    public List<WebElement> productTotal;

    @FindBy(css = "[class='cart-subtotal'] bdi")
    public WebElement subTotal;

    @FindBy(xpath = "(//td[@data-title='Versand']//span//bdi)[1]")
    public WebElement dhlPrice;

    @FindBy(css = "[class='order-total alt-font'] bdi")
    public WebElement totalPrice;

    @FindBy(css = "[id*='payment_method_']")
    public List<WebElement> paymentRadioButtons;

    @FindBy(xpath = "(//*[@class='__PrivateStripeElement']/iframe)[3]")
    public WebElement iframePayment;

    @FindBy(css = "[class='p-CardNumberInput'] input")
    public WebElement cardNumber;

    @FindBy(css = "[id='Field-expiryInput']")
    public WebElement expirationDate;

    @FindBy(css = "[id='Field-cvcInput']")
    public WebElement securityCode;

    @FindBy (xpath = "(//*[@class='blockUI blockOverlay'])[1]")
    public WebElement ccLoadingBar;

    @FindBy (css = "[id='place_order']")
    public WebElement orderNowButton;

    @FindBy(css="[class='woocommerce-error'] li")
    public WebElement errorMessage;

    @FindBy(css = "[id='wc-stripe-express-checkout-button-separator']")
    public WebElement OderText;

    //_US_18_ShoppingCart
    @FindBy(xpath = "(//*[@class='icon-eye icons'])[1]")
    public WebElement productIconEye;

    @FindBy(css = "[class='hongo-cart-message alt-font']")
    public WebElement successfullyMessage;

    @FindBy(css = "[class='button wc-forward']")
    public WebElement showShoppingCartBtn;

    @FindBy(css = "[name='update_cart']")
    public WebElement updateCartBtn;

    @FindBy(css = "[class='input-text qty text']")
    public WebElement productQuantity;

    @FindBy(css = "[class='product-price'] bdi")
    public WebElement productPrice;

    @FindBy(css = "[class='product-subtotal'] bdi")
    public WebElement productSubTotal;

    @FindBy(css = "[class*='empty-cart']")
    public WebElement cartEmptyBtn;

    @FindBy(css = "[class='cart-empty alt-font']")
    public WebElement cartEmptyMessage;

    @FindBy(xpath = "(//*[@class='blockUI blockOverlay'])[1]")
    public WebElement blockOverlay;

    //_US_19_CouponCode
    @FindBy(id = "coupon_code")
    public WebElement couponCodePlc;

    @FindBy(name = "apply_coupon")
    public WebElement applyCouponBtn;

    @FindBy(css = "[id='coupon-error-notice']")
    public WebElement errorCouponCode;

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "agbBtn": return this.agbBtn;
            case "WiderrufsbelehrungBtn":return this.WiderrufsbelehrungBtn;
            case "DatenschutzerklärungBtn":return this.DatenschutzerklärungBtn;
            case "sSweaterFilter":return this.sSWFilter;
            case "sSweaterFirstProduct":return this.sSWFirstProduct;
            case "sSweaterAltImage":return this.sSWAltImage;
            case "sSweaterFilterColour":return this.sSWFilterColour;
            case "sSweaterFilterSize":return this.sSWFilterSize;
            case "sSweaterFilterSliderLeft":return this.sSWFilterSliderLeft;
            case "sSweaterFilterSliderRight":return this.sSWFilterSliderRight;
            case "sSweaterPriceFilterButton":return this.sSWPriceFilterButton;
            case "sSweaterFiltered":return this.sSWFiltered;
            case "sSweaterFilterReset":return this.sSWFilterReset;
            case "sSweaterFilterColumn2":return this.sSWFilterColumn2;
            case "sSweaterFilterColumn3":return this.sSWFilterColumn3;
            case "sSweaterFilterColumn4":return this.sSWFilterColumn4;
            case "sSweaterFilterSelect":return this.sSWSortSelect;
            case "sSweaterFilterPopularity":return this.sSWSortPopularity;
            case "sSweaterFilterDate":return this.sSWSortDate;
            case "sSweaterFilterPrice":return this.sSWSortPrice;
            case "sSweaterFilterPriceDesc":return this.sSWSortPriceDesc;
            case "ausverkauftProduct": return ausverkauftProduct;
            case "ausverkauftInfo": return this.ausverkauftInfo;
            case "pRegMail": return this.pRegMail;
            case "pRegPrvCheck": return this.pRegPrvCheck;
            case "pRegButton": return this.pRegButton;
            case "pRegAlert": return this.pRegAlert;
            case "pLogUn": return this.pLogUn;
            case "pLogPw": return this.pLogPw;
            case "pLogButton": return this.pLogButton;
            case "pLogAlert": return this.pLogAlert;
            case "wLFirstProduct": return this.wLFirstProduct;
            case "wLAlert": return this.wLAlert;
            case "wLNoProduct": return this.wLNoProduct;
            case "faQs": return this.faQs;
        }
        return null;
    }

    //US_07_Store Feature/T-Shirts method
    public List<WebElement> getTsirtsProducts() {
        return this.tShirtsProducts;
    }

    //US_24_Customer Service/Shipping and Returns method
    public List<WebElement> getShippingAreasBoxes() {
        return this.shippingAreasBoxes;
    }
}
