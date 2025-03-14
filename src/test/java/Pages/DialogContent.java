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

    //US_09_StoreSweater
    @FindBy(xpath = "//h1[contains(text(),title)]")
    public WebElement sSweaterTitle;
    @FindBy(xpath = "//span[@class='ti-plus']/..")
    public WebElement sSweaterFilter;
    @FindBy(xpath = "((//div[@class='product-thumb-wrap'])[1]//a)[1]")
    public WebElement sSweaterFirstProduct;
    @FindBy(xpath = "//img[contains(@class, 'hongo-alternate-image')]")
    public WebElement sSweaterAltImage;
    @FindBy(xpath = "//a[@class='attribute-round-link']")
    public WebElement sSweaterFilterColour;
    @FindBy(xpath = "(//a[@class='attribute-square-link'])[1]")
    public WebElement sSweaterFilterSize;
    @FindBy(xpath = "(//span[@tabindex='0' and contains(@class,'slider')])[1]")
    public WebElement sSweaterFilterSliderLeft;
    @FindBy(xpath = "(//span[@tabindex='0' and contains(@class,'slider')])[2]")
    public WebElement sSweaterFilterSliderRight;
    @FindBy(xpath = "//div[@class='price_slider_amount']//button")
    public WebElement sSweaterPriceFilterButton;
    @FindBy(xpath = "//span[@class='from']")
    public WebElement sSweaterPriceFilterMin;
    @FindBy(xpath = "//span[@class='to']")
    public WebElement sSweaterPriceFilterMax;
    @FindBy(xpath = "(//a//bdi)[1]")
    public WebElement sSweaterComparePriceMin;
    @FindBy(xpath = "(//a//bdi)[2]")
    public WebElement sSweaterComparePriceMax;
    @FindBy(xpath = "//a[@aria-label='Filter entfernen']")
    public WebElement sSweaterFiltered;
    @FindBy(xpath = "//a[@aria-label='Zurücksetzen']")
    public WebElement sSweaterFilterReset;
    @FindBy(xpath = "//a[@data-col='2']")
    public WebElement sSweaterFilterColumn2;
    @FindBy(xpath = "//a[@data-col='3']")
    public WebElement sSweaterFilterColumn3;
    @FindBy(xpath = "//a[@data-col='4']")
    public WebElement sSweaterFilterColumn4;
    @FindBy(xpath = "//select[@name='orderby']")
    public WebElement sSweaterFilterSelect;
    @FindBy(xpath = "//option[@value='popularity']")
    public WebElement sSweaterFilterPopularity;
    @FindBy(xpath = "//option[@value='date']")
    public WebElement sSweaterFilterDate;
    @FindBy(xpath = "//option[@value='price']")
    public WebElement sSweaterFilterPrice;
    @FindBy(xpath = "//option[@value='price-desc']")
    public WebElement sSweaterFilterPriceDesc;
    @FindBy(xpath = "//div[@class='blockUI blockOverlay']")
    public WebElement sSweaterLoading;


    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "agbBtn": return this.agbBtn;
            case "WiderrufsbelehrungBtn":return this.WiderrufsbelehrungBtn;
            case "DatenschutzerklärungBtn":return this.DatenschutzerklärungBtn;
            case "sSweaterFilter":return this.sSweaterFilter;
            case "sSweaterFirstProduct":return this.sSweaterFirstProduct;
            case "sSweaterAltImage":return this.sSweaterAltImage;
            case "sSweaterFilterColour":return this.sSweaterFilterColour;
            case "sSweaterFilterSize":return this.sSweaterFilterSize;
            case "sSweaterFilterSliderLeft":return this.sSweaterFilterSliderLeft;
            case "sSweaterFilterSliderRight":return this.sSweaterFilterSliderRight;
            case "sSweaterPriceFilterButton":return this.sSweaterPriceFilterButton;
            case "sSweaterFiltered":return this.sSweaterFiltered;
            case "sSweaterFilterReset":return this.sSweaterFilterReset;
            case "sSweaterFilterColumn2":return this.sSweaterFilterColumn2;
            case "sSweaterFilterColumn3":return this.sSweaterFilterColumn3;
            case "sSweaterFilterColumn4":return this.sSweaterFilterColumn4;
            case "sSweaterFilterSelect":return this.sSweaterFilterSelect;
            case "sSweaterFilterPopularity":return this.sSweaterFilterPopularity;
            case "sSweaterFilterDate":return this.sSweaterFilterDate;
            case "sSweaterFilterPrice":return this.sSweaterFilterPrice;
            case "sSweaterFilterPriceDesc":return this.sSweaterFilterPriceDesc;

        }
        return null;
    }



    //US_07_Store Feature/T-Shirts method
    public List<WebElement> getTsirtsProducts() {
        return this.tShirtsProducts;
    }
}
