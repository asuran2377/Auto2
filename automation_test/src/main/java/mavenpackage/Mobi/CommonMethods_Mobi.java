package mavenpackage.Mobi;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CommonMethods_Mobi {
    static WebElement element;
    static WebDriverWait waitExplicit;

    //Tạo class gọi findElement động trên xpath
    public static WebElement findElement(AndroidDriver<WebElement> driver, String locator) {
		return element = driver.findElement(By.xpath(locator));
	}
    public static WebElement findElement(AndroidDriver<WebElement> driver, String locator, String attributeValue){
        locator = String.format(locator, (Object) attributeValue);
        return element = driver.findElement(By.xpath(locator));
    }

    //Tạo class để scroll khi tìm Element trên màn hình
    
    //-----------Wait-------------
    //Chờ cho tới khi element xuất hiện
    public static void waitForElementVisible(AndroidDriver<WebElement> driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	} 
    public static void waitForElementVisible(AndroidDriver<WebElement> driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi element biến mất
    public static void waitForElementInvisible(AndroidDriver<WebElement> driver, String locator) {
		driver.manage().timeouts().implicitlyWait(Constants_Mobi.SHORT_TIMEOUT, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		driver.manage().timeouts().implicitlyWait(Constants_Mobi.LONG_TIMEOUT, TimeUnit.SECONDS);
	}
    public static void waitForElementInvisible(AndroidDriver<WebElement> driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi DOM xuất hiện nhg trên màn hình ko hiển thị - dành cho các element ẩn
    public static void waitForElementPresence(AndroidDriver<WebElement> driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
    public static void waitForElementPresence(AndroidDriver<WebElement> driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    //Chờ cho tới khi element có thể click đc
    public static void waitForElementClickable(AndroidDriver<WebElement> driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
    public static void waitForElementClickable(AndroidDriver<WebElement> driver, String locator, String attributeValue)
    {
        waitExplicit = new WebDriverWait(driver, Constants_Mobi.LONG_TIMEOUT);
        locator = String.format(locator, (Object) attributeValue);
        waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));               
    }
    //-----------Wait-------------
}
