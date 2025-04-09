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

    @And("the customer clicks on the element in header")
    public void theCustomerClicksOnTheElementInHeader(DataTable dtLinks) {
        List<String> listLinks = dtLinks.asList(String.class);
        for (int i = 0; i < listLinks.size(); i++) {
            h.myClick(h.getWebElement(listLinks.get(i)));
        }
    }

    @And("the customer clicks on the element in dialog")
    public void theCustomerClicksOnTheElementInDialog(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList(String.class);
        for (int i = 0; i < listButton.size(); i++) {
            dc.myClick(dc.getWebElement(listButton.get(i)));
        }
    }

    @And("the customer sends keys in dialog")
    public void theCustomerSendsKeysInDialog(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (dc.getWebElement(listBoxAndTexts.get(i).get(0)));
            dc.mySendKeys(box, listBoxAndTexts.get(i).get(1));
        }
    }

    @And("the customer sends keys in header")
    public void theCustomerSendsKeysInHeader(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (h.getWebElement(listBoxAndTexts.get(i).get(0)));
            h.mySendKeys(box, listBoxAndTexts.get(i).get(1));
        }
    }

    @And("the customer confirms the text message")
    public void theCustomerConfirmsTheTextMessage(DataTable dtBoxAndTexts) {
        List<List<String>> listBoxAndTexts = dtBoxAndTexts.asLists(String.class);
        for (int i = 0; i < listBoxAndTexts.size(); i++) {
            WebElement box = (dc.getWebElement(listBoxAndTexts.get(i).get(0)));
            dc.verifyContainsText(box, listBoxAndTexts.get(i).get(1));
        }
    }

}
