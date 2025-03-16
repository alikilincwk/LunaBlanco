package StepDefinitions;

import Pages.DialogContent;
import Pages.Headers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _00_DataTable {
    DialogContent dc = new DialogContent();
    Headers h=new Headers();

    @And("Click on the Element in Header")
    public void clickOnTheElementInHeader(DataTable dtLinks) {
        List<String> listLinks = dtLinks.asList(String.class);
        for (int i = 0; i < listLinks.size(); i++) {
            h.myClick(h.getWebElement(listLinks.get(i)));
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

    @And("User send keys in Header")
    public void userSendKeysInHeader(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (h.getWebElement(listBoxAndTexts.get(i).get(0)));
            h.mySendKeys(box, listBoxAndTexts.get(i).get(1));
        }
    }

    @And("Confirm text message")
    public void confirmTextMessage(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (dc.getWebElement(listBoxAndTexts.get(i).get(0)));
            dc.verifyContainsText(box, listBoxAndTexts.get(i).get(1));
        }
    }

}
