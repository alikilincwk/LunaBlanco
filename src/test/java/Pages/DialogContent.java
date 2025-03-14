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

        }
        return null;
    }



    //US_07_Store Feature/T-Shirts method
    public List<WebElement> getTsirtsProducts() {
        return this.tShirtsProducts;
    }
}
