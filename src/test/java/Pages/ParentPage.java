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
    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }
    public void selectByIndex(WebElement element, int num) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        Select menu = new Select(element);
        menu.selectByIndex(num);
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
    public int randomGenerator(int range) {
        return (int) (Math.random() * range);
    }
    public void waitUntilVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void iframeSwitchByElement(WebElement iframeElement) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));
    }
    public void switchToDefaultContent() {
        GWD.getDriver().switchTo().defaultContent();
    }
    public void acceptAllCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Akzeptieren')]")));
        List<WebElement> acceptButtons = GWD.getDriver().findElements(By.xpath("//button[contains(text(),'Akzeptieren')]"));
        if (!acceptButtons.isEmpty()) {
            acceptButtons.get(0).click();
        }
    }
    public void wait(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void alertAccept(int timeout) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.alertIsPresent());
        GWD.getDriver().switchTo().alert().accept();
    }
    public String getCurrentURL() {
        return GWD.getDriver().getCurrentUrl();
    }
    public void switchToWindow(int num) {
        List<String> windowHandlesAll = new ArrayList<String>(GWD.getDriver().getWindowHandles());
        GWD.getDriver().switchTo().window(windowHandlesAll.get(num));
    }
}
