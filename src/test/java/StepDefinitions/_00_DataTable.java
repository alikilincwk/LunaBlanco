package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _00_DataTable {
    DialogContent dc = new DialogContent();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinks) {
        List<String> listLinks = dtLinks.asList(String.class);
        for (int i = 0; i < listLinks.size(); i++) {
            dc.myClick(dc.getWebElement(listLinks.get(i)));
        }
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList(String.class);
        for (int i = 0; i < listButton.size(); i++) {
            dc.myClick(dc.getWebElement(listButton.get(i)));
        }
    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (dc.getWebElement(listBoxAndTexts.get(i).get(0)));
            dc.mySendKeys(box, listBoxAndTexts.get(i).get(1));
        }
    }

    @And("User send keys in LeftNav")
    public void userSendKeysInLeftNav(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (dc.getWebElement(listBoxAndTexts.get(i).get(0)));
            dc.mySendKeys(box, listBoxAndTexts.get(i).get(1));
        }
    }

}
