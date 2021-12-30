package mavenpackage.Web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.Assert;

public class CommonActions {
    private static WebElement element;
	private static WebDriverWait waitExplicit;
	private JavascriptExecutor javascriptExecutor;
	private Actions action;
	
	//------------------------------------------------------------ INPUT ------------------------------------------------------------//
	public static WebElement findElement(WebDriver driver, String locator) {
		return element = driver.findElement(By.xpath(locator));
	}
	
	public WebElement findElement(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		return element = driver.findElement(By.xpath(locator));
	}
	
	public void sendkeyToElement(WebDriver driver, String locator, String inputValue) {
		element = findElement(driver, locator);
		element.clear();
		element.sendKeys(inputValue);
	}
	
	public void sendkeyToElement(WebDriver driver, String locator, String inputValue, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		element = findElement(driver, locator);
		element.clear();
		element.sendKeys(inputValue);
	}
	
	public void sendkeyToElement_Slow(WebDriver driver, String locator, String inputValue) throws InterruptedException {
		element = findElement(driver, locator);
		element.clear();
		for(Character ch : inputValue.toCharArray()) {
			Thread.sleep(200);
			element.sendKeys(Character.toString(ch));
		}
	}
	
	public void sendkeyToElement_Slow(WebDriver driver, String locator, String inputValue, String... attributeValue) throws InterruptedException {
		locator = String.format(locator, (Object[]) attributeValue);
		element = findElement(driver, locator);
		element.clear();
		for(Character ch : inputValue.toCharArray()) {
			Thread.sleep(200);
			element.sendKeys(Character.toString(ch));
		}
	}
	
	public void inputValueToElement(WebDriver driver, String locator, String inputValue) {
		waitForElementVisible(driver, locator);
		sendkeyToElement(driver, locator, inputValue);
	}
	
	public void inputValueToElement(WebDriver driver, String locator, String inputValue, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		sendkeyToElement(driver, locator, inputValue, attributeValue);
	}
	
	public void inputKeyboardValueToElement(WebDriver driver, String locator, String inputValue) {
		waitForElementVisible(driver, locator);
		sendKeyboardToElement(driver, locator, inputValue);
	}
	
	public void inputKeyboardValueToElement(WebDriver driver, String locator, String inputValue, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		sendKeyboardToElement(driver, locator, inputValue);
	}
	
	public void inputValueToElement_Slow(WebDriver driver, String locator, String inputValue) throws InterruptedException {
		waitForElementVisible(driver, locator);
		sendkeyToElement_Slow(driver, locator, inputValue);
	}
	
	public void inputValueToElement_Slow(WebDriver driver, String locator, String inputValue, String... attributeValue) throws InterruptedException {
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		sendkeyToElement_Slow(driver, locator, inputValue);
	}
	
	public void clickOnElement(WebDriver driver, String locator) {
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		element.click();
	}
	
	public void clickOnElement(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		System.out.println("Locator: " + locator);
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		element.click();
	}
	//------------------------------------------------------------ END INPUT ------------------------------------------------------------//
	
	public String getTextOfElement(WebDriver driver, String locator) {
		element = findElement(driver, locator);
		return element.getText();
	}
	
	public String getTextOfElement(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		element = findElement(driver, locator);
		return element.getText();
	}
	
	//------------------------------------------------------------ ACTION ------------------------------------------------------------//
	public void sendKeyboardToElement(WebDriver driver, String locator, String inputValue) {
		action = new Actions(driver);
		element = findElement(driver, locator);
		action.sendKeys(element, inputValue).perform();
	}
	
	public void sendKeyboardToElement(WebDriver driver, String locator, String inputValue, String... attributeValue) {
		action = new Actions(driver);
		locator = String.format(locator, (Object[]) attributeValue);
		element = findElement(driver, locator);
		action.sendKeys(element, inputValue).perform();
	}
	
	public void moveToElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		action.moveToElement(element).perform();
	}
	
	public void moveToElement(WebDriver driver, String locator, String... attributeValue) {
		action = new Actions(driver);
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		action.moveToElement(element).perform();
	}
	
	public void doubleClickOnElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		action.doubleClick(element).perform();
	}
	
	public void doubleClickOnElement(WebDriver driver, String locator, String... attributeValue) {
		action = new Actions(driver);
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		action.doubleClick(element).perform();
	}
	
	public void rightClickOnElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		action.contextClick(element).perform();
	}
	
	public void rightClickOnElement(WebDriver driver, String locator, String... attributeValue) {
		action = new Actions(driver);
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementClickable(driver, locator);
		element = findElement(driver, locator);
		action.contextClick(element).perform();
	}
	//------------------------------------------------------------ END ACTION ------------------------------------------------------------//
	
	//------------------------------------------------------------ DROPDOWN ------------------------------------------------------------//
	// public void handle_DefaultDropdown (WebDriver driver, String locator, String value) {
	// 	WebElement parent = driver.findElement(By.xpath(locator));
	// 	Select select = new Select(parent);
	// 	select.selectByVisibleText(value);
	// 	Assert.assertEquals(select.getFirstSelectedOption().getText(), value);
	// }
	
	// public void handle_DefaultDropdown (WebDriver driver, String locator, String value, String... attributeValue) {
	// 	locator = String.format(locator, (Object[]) attributeValue);
	// 	WebElement parent = driver.findElement(By.xpath(locator));
	// 	Select select = new Select(parent);
	// 	select.selectByVisibleText(value);
	// 	Assert.assertEquals(select.getFirstSelectedOption().getText(), value);
	// }
	
	public void handle_CustomDropdown (WebDriver driver, String itemLocators, String expectedItem) {
		javascriptExecutor = (JavascriptExecutor) driver;
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(itemLocators)));
		List<WebElement> allItems = driver.findElements(By.xpath(itemLocators));
		System.out.println("All items: " + allItems.size());
		for(WebElement item : allItems){
			String actualItem = item.getText();
			System.out.println("Actual item: " + actualItem);
			if(actualItem.equals(expectedItem)) {
				javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				waitExplicit.until(ExpectedConditions.elementToBeClickable(item));
				item.click();
				break;
			}
		}
	}
	
	public void handle_CustomDropdown (WebDriver driver, String parentLocator, String itemLocators, String expectedItem) {
		javascriptExecutor = (JavascriptExecutor) driver;
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(parentLocator)));
		WebElement parentItem = driver.findElement(By.xpath(parentLocator));
		parentItem.click();
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(itemLocators)));
		List<WebElement> allItems = driver.findElements(By.xpath(itemLocators));
		System.out.println("All items: " + allItems.size());
		for(WebElement item : allItems){
			String actualItem = item.getText();
			System.out.println("Actual item: " + actualItem);
			if(actualItem.equals(expectedItem)) {
				javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				waitExplicit.until(ExpectedConditions.elementToBeClickable(item));
				item.click();
				break;
			}
		}
	}
	//------------------------------------------------------------ END DROPDOWN ------------------------------------------------------------//
	
	//------------------------------------------------------------ WAIT ------------------------------------------------------------//
	public static void waitForElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void waitForElementInvisible(WebDriver driver, String locator) {
		driver.manage().timeouts().implicitlyWait(Constants_Web.SHORT_TIMEOUT, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		driver.manage().timeouts().implicitlyWait(Constants_Web.LONG_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public void waitForElementPresence(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
	public void waitForElementClickable(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
	//------------------------------------------------------------ END WAIT ------------------------------------------------------------//
	
	//------------------------------------------------------------ VERIFY ------------------------------------------------------------//
	public static boolean isElementDisplayed(WebDriver driver, String locator) {
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		return element.isDisplayed();
	}
	
	public static boolean isElementDisplayed(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		return element.isDisplayed();
	}
	
	public boolean isElementSelected(WebDriver driver, String locator) {
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		return element.isSelected();
	}
	
	public boolean isElementSelected(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		waitForElementVisible(driver, locator);
		element = findElement(driver, locator);
		return element.isSelected();
	}
	
	// public boolean verifyTrue(boolean condition) {
	// 	boolean result = true;
	// 	try {
	// 		Assert.assertTrue(condition);
	// 	} catch (Exception e) {
	// 		result = false;
	// 		System.out.println(e.getMessage());
	// 	}
	// 	return result;
	// }
	
	// public boolean verifyFalse(boolean condition) {
	// 	boolean result = true;
	// 	try {
	// 		Assert.assertFalse(condition);
	// 	} catch (Exception e) {
	// 		result = false;
	// 		System.out.println(e.getMessage());
	// 	}
	// 	return result;
	// }
	/*
	public boolean verifyEquals(Object actual, Object expected) {
		boolean result = true;
		boolean status;
		try {
			if (actual instanceof String && expected instanceof String) {
				actual = actual.toString().trim();
				System.out.println("Actual = " + actual);
				expected = expected.toString().trim();
				System.out.println("Expected = " + expected);
				status = (actual.equals(expected));
			} else {
				status = (actual == expected);
			}

			Assert.assertEquals(actual, expected, "Value is not matching!");
		} catch (Throwable e) {
			result = false;
			System.out.println(e.getMessage());
		}
		System.out.println("Status = " + result);
		return result;
	}*/
	
	// public boolean checkTrue(boolean condition) {
	// 	boolean result = true;
	// 	try {
	// 		if(condition == true)
	// 			System.out.println("----------PASSED----------");
	// 		else
	// 			System.out.println("----------FAILED----------");
	// 		Assert.assertTrue(condition);
	// 	} catch (Exception e) {
	// 		result = false;
	// 		System.out.println(e.getMessage());
	// 	}
	// 	System.out.println("Status: " + result);
	// 	return result;
	// }
	//------------------------------------------------------------ END VERIFY ------------------------------------------------------------//
	
	//------------------------------------------------------------ ALERT ------------------------------------------------------------//
	// public void resolveAlert(WebDriver driver, boolean accept, String expectedAlertMsg) {
	//     if (verifyTrue(isAlertPresent(driver, expectedAlertMsg))) {
	//     	alertDecision(driver, accept);
	//     }
	// }

	public boolean isAlertPresent(WebDriver driver, String expectedAlertMsg) {
		waitExplicit = new WebDriverWait(driver, Constants_Web.LONG_TIMEOUT);
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	    String actualAlertMsg = driver.switchTo().alert().getText();
	    System.out.println("Actual: "+ actualAlertMsg);
		System.out.println("Expected: " + expectedAlertMsg);
		return actualAlertMsg.equals(expectedAlertMsg);
	}
	
	public void alertDecision(WebDriver driver, boolean accept) {
	    if (accept) {
	        driver.switchTo().alert().accept();
	    } else {
	        driver.switchTo().alert().dismiss();
	    }
	}
	//------------------------------------------------------------ END ALERT ------------------------------------------------------------//
	
	//------------------------------------------------------------ IFRAME ------------------------------------------------------------//
	public void switchToIframe(WebDriver driver, String locator) {
		element = findElement(driver, locator);
		driver.switchTo().frame(element);
	}
	
	public void switchToIframe(WebDriver driver, String locator, String... attributeValue) {
		locator = String.format(locator, (Object[]) attributeValue);
		element = findElement(driver, locator);
		driver.switchTo().frame(element);
	}
	
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	//------------------------------------------------------------ END IFRAME ------------------------------------------------------------//
}
