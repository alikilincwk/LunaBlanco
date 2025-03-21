package Pages;

import Utilities.ConfigReader;
import Utilities.GWD;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(ConfigReader.getIntProperty("explicit.wait")));


    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        element.click();
    }

    public void jsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    public void scrollTOElementSmooth(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'})", element);
    }

    public void scrollToHome() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    public void scrollToEnd() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }



    public String jsGetText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        return (String) (js.executeScript("arguments[0].textContent;", element));
    }

    public void sendAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    public void clearByJs(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) GWD.getDriver();
        jse.executeScript("arguments[0].value = '';", element);
    }

    public void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        String attributeValue = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: " + attributeValue);
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

    }

    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public void checkTextContains(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(ConfigReader.getIntProperty("explicit.wait")));
        WebElement elementName = wait.until(ExpectedConditions.visibilityOf(element));
        if (elementName.getText().trim().toLowerCase().contains(text.trim().toLowerCase())) {
            Assert.assertTrue(true);
        } else
            Assert.fail(text + " not found! Element text :" + elementName.getText());
    }

    public void selectByIndex(WebElement element, int num) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        Select menu = new Select(element);
        menu.selectByIndex(num);
    }

    public void selectByText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void hoverOver(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        new Actions(GWD.getDriver()).moveToElement(element).build().perform();
    }

    public void uploadFileFunction(String pathFile) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        StringSelection createPathFile = new StringSelection(pathFile);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(createPathFile, null);
        wait(1);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        wait(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait(1);
    }

    public void tabKeyMultiplePress(int quantity) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
    }

    public void enterKeyMultiplePress(int quantity) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }

    public void escKeyMultiplePress(int quantity) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        }
    }

    public void leftClickMultiplePress(int quantity) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(1000);
        }
    }

    public void downKeyMultiplePress(int quantity) {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < quantity; i++) {
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
    }

    public int randomGenerator(int range) {
        return (int) (Math.random() * range);
    }

    public void waitUntilVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForPageTitle(String title) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(ConfigReader.getIntProperty("explicit.wait")));
        wait.until(ExpectedConditions.titleIs(title));
    }

    public String getAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public void switchToParentFrame() {
        GWD.getDriver().switchTo().parentFrame();
    }

    public void iframeSwitchByIndex(int index) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    public void iframeSwitchByNameOrId(String nameOrId) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
    }

    public void iframeSwitchByElement(WebElement iframeElement) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));
    }

    public void switchToDefaultContent() {
        GWD.getDriver().switchTo().defaultContent();
    }

    public void clearCookies() {
        GWD.getDriver().manage().deleteAllCookies();
    }

    public void acceptAllCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Akzeptieren')]")));
        List<WebElement> acceptButtons = GWD.getDriver().findElements(By.xpath("//button[contains(text(),'Akzeptieren')]"));
        if (!acceptButtons.isEmpty()) {
            acceptButtons.get(0).click();
        }
    }

    public boolean listContainsString(List<WebElement> list, String search) {
        boolean isFound = false;
        for (WebElement e : list) {
            if (e.getText().equalsIgnoreCase(search))
                isFound = true;
        }
        return isFound;
    }

    public boolean compareLists(List<WebElement> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).getText().equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void wait(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void captureScreenshot(String fileName) {
        File screenshot = ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectRadioButtonByValue(List<WebElement> radioButtons, String value) {
        for (WebElement radioButton : radioButtons) {
            if (radioButton.getAttribute("value").equalsIgnoreCase(value)) {
                if (!radioButton.isSelected()) {
                    radioButton.click();
                }
                break;
            }
        }
    }

    public void alertAccept(int timeout) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.alertIsPresent());
        GWD.getDriver().switchTo().alert().accept();
    }

    public void alertDismiss() {
        GWD.getDriver().switchTo().alert().dismiss();
    }

    public void alertWait(int timeout) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void alertText() {
        GWD.getDriver().switchTo().alert().getText();
    }

    public void alertPromptBox(String text) {
        GWD.getDriver().switchTo().alert().sendKeys(text);
    }

    public void refreshPage() {
        GWD.getDriver().navigate().refresh();
    }

    public String getCurrentURL() {
        return GWD.getDriver().getCurrentUrl();
    }

    public void switchToWindow(int num) {
        List<String> windowHandlesAll = new ArrayList<String>(GWD.getDriver().getWindowHandles());
        GWD.getDriver().switchTo().window(windowHandlesAll.get(num));
    }

    public void switchToWindow2(int num) {
        GWD.getDriver().switchTo().window(GWD.getDriver().getWindowHandles().toArray()[num].toString());
    }

    public void waitForNumberOfWindowsToEqual(int numberOfWindows) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(ConfigReader.getIntProperty("explicit.wait")));
        wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindows));
    }



}
