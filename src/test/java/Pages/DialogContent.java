package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }






    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "":
        }
        return null;
    }
}
