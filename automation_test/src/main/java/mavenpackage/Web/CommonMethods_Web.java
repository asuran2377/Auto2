package mavenpackage.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods_Web {
    static WebElement element;
    static WebDriverWait waitExplicit;
    static Actions action;

    //Tạo class gọi findElement động trên xpath
    public static WebElement findElement(WebDriver driver, String locator) {
		return element = driver.findElement(By.xpath(locator));
	}
    public static WebElement findElement(WebDriver driver, String locator, String attributeValue){
        locator = String.format(locator, (Object) attributeValue);
        return element = driver.findElement(By.xpath(locator));
    }
    
    //-----------Wait-------------//
    //Chờ cho tới khi element xuất hiện
    public static void waitForElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}    
    public static void waitForElementVisible(WebDriver driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi element biến mất
    public static void waitForElementInvisible(WebDriver driver, String locator) {
		driver.manage().timeouts().implicitlyWait(Constants_Web.SHORT_TIMEOUT, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		driver.manage().timeouts().implicitlyWait(Constants_Web.LONG_TIMEOUT, TimeUnit.SECONDS);
	}
    public static void waitForElementInvisible(WebDriver driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi DOM xuất hiện nhg trên màn hình ko hiển thị
    public static void waitForElementPresence(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
    public static void waitForElementPresence(WebDriver driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi element có thể click đc
    public static void waitForElementClickable(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
    public static void waitForElementClickable(WebDriver driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));               
    }
    //-----------Wait-------------//
    
    //-------sendkey Input-------//
    public static void sendKeyboardToElement(WebDriver driver, String locator, String inputValue) {
        action = new Actions(driver);
        element = findElement(driver, locator);
        action.sendKeys(element, inputValue).perform();
    }
    
    public static void inputKeyboardValueToElement(WebDriver driver, String locator, String inputValue) {
        waitForElementVisible(driver, locator);
        sendKeyboardToElement(driver, locator, inputValue);
    }
    //-------sendkey Input-------//

    //-------Khi element hiển thị------//   
    public static boolean isElementDisplayed(WebDriver driver, String locator) {
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		return element.isDisplayed();
	}
}
