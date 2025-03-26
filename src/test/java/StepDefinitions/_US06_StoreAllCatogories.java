package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import Utilities.GWD;
import Utilities.HelperMethods;
import Utilities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US06_StoreAllCatogories {

    Headers headers = new Headers();
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    @Then("Hover over to each catogory")
    public void hoverOverToEachCatogory(DataTable dataTable) {

        List<String> linkler = dataTable.asList();
        String catagory = "";
        String currentUrl = "";


        for (int i = 0; i < linkler.size(); i++) {

            headers.hoverOver(headers.getWebElement(linkler.get(i)));
            catagory = headers.getWebElement(linkler.get(i)).getText();
            headers.myClick(headers.getWebElement(linkler.get(i)));
            wait.until(ExpectedConditions.urlContains("https://"));
            currentUrl = GWD.getDriver().getCurrentUrl();

            switch (catagory) {
                case "ALLE PIECES":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/store/");
                    break;
                case "T-SHIRTS":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/category/t-shirts/");
                    break;
                case "HOODIES":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/category/hoodies/");
                    break;
                case "SWEATER":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/category/sweaters/");
                    break;
                case "HEADWEAR":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/category/headwear/");
                    break;
                case "ARCHIV":
                    Assert.assertEquals(currentUrl, "https://lunablanco.com/category/archiv/");
                    break;

            }
            headers.hoverOver(headers.store);
        }

    }

    @Then("Filter products")
    public void filterProducts() {

        headers.myClick(headers.allPieces);
        headers.myClick(headers.filter);

        List<WebElement> catagoryList = headers.listOfcatagories.findElements(By.tagName("li"));
            clickToListElement(catagoryList);
        List<WebElement> colorList = headers.listOfcolors.findElements(By.tagName("li"));
            clickToListElement(colorList);
        List<WebElement> sizeList = headers.listOfsizes.findElements(By.tagName("li"));
            clickToListElement(sizeList);


        //Filtered Items Assertion
        List<WebElement> filteredItemsList=headers.listOffilteredItems.findElements(By.tagName("li"));
        for (int m = 0; m <filteredItemsList.size(); m++) {

            switch (filteredItemsList.get(m).getText())
            {
                case "Black":headers.verifyContainsText(filteredItemsList.get(m),"Black");break;
                case "S":headers.verifyContainsText(filteredItemsList.get(m),"S");break;
                case "T-Shirts": headers.verifyContainsText(filteredItemsList.get(m),"T-Shirts");break;
            }
        }
    }
    public static void clickToListElement(List<WebElement> list) {
        if (list != null && !list.isEmpty()) {
            for (WebElement element : list) {
                element.findElement(By.tagName("span")).click();
                MyFunc.Bekle(2);
                break;
            }
        }
    }
    @Then("view products in choosen form")
    public void viewProductsInChoosenForm() {
        GWD.getDriver().get("https://lunablanco.com/");
        headers.hoverOver(headers.store);
        headers.myClick(headers.allPieces);

        List <WebElement> formViewList=headers.listViewForm.findElements(By.tagName("a"));
        List<WebElement> itemViewList= headers.itemView.findElements(By.tagName("li"));
        for (int y = 0; y < formViewList.size(); y++) {

            headers.myClick(formViewList.get(y));

            for (int z = 1; z < 4; z++) {

                itemViewList = headers.itemView.findElements(By.tagName("li"));
                if(y==0 && itemViewList.get(z).getAttribute("style").contains("49") )
                    Assert.assertTrue(itemViewList.get(z).getAttribute("style").contains("49"),"Sayfa 2'li seçimde değil");
                else if(y==1 && itemViewList.get(z).getAttribute("style").contains("66"))
                    Assert.assertTrue(itemViewList.get(z).getAttribute("style").contains("66"),"Sayfa 3'li seçimde değil");
                else if(y==2 && itemViewList.get(z).getAttribute("style").contains("24"))
                    Assert.assertTrue(itemViewList.get(z).getAttribute("style").contains("24"),"Sayfa 4'li seçimde değil");
                if(z==3)break;
            }
        }
    }

    @Then("sort by each selection")
    public void sortByEachSelection() {
        List <WebElement> sortList=headers.sortSelection.findElements(By.tagName("option"));
        for (int i = 0; i < 4; i++) {
            sortList=headers.sortSelection.findElements(By.tagName("option"));
            headers.selectByIndex(headers.sortSelection,i);
            switch (i) {
                case 0:
                    wait.until(ExpectedConditions.visibilityOf(sortList.get(i)));
                    Assert.assertEquals(sortList.get(i).getAttribute("value"), "popularity");break;
                case 1:
                    wait.until(ExpectedConditions.visibilityOf(sortList.get(i)));
                    Assert.assertEquals(sortList.get(i).getAttribute("value"), "date");break;
                case 2:
                    wait.until(ExpectedConditions.visibilityOf(sortList.get(i)));
                    Assert.assertEquals(sortList.get(i).getAttribute("value"), "price");break;
                case 3:
                    wait.until(ExpectedConditions.visibilityOf(sortList.get(i)));
                    Assert.assertEquals(sortList.get(i).getAttribute("value"), "price-desc");break;
            }
            MyFunc.Bekle(2);
        }


    }
}



