package mavenpackage.Mobi.Payment_Method;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class payment_method {

    public static void payment_Token (AndroidDriver<WebElement> driver){        
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "HDBank");
        WebElement chk_token_ = driver.findElementByXPath("//android.widget.TextView[@text='" + Constants_Mobi._token 
        + "']/parent::android.view.ViewGroup[@index='0']/following-sibling::/android.widget.ImageView[@index='0']");        
        chk_token_.click();

        WebElement btnThanhtoan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnThanhtoan.click();
    }
    public static void payment_ATM (AndroidDriver<WebElement> driver) throws InterruptedException{
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thẻ ATM nội địa");
        WebElement chk_ATM_ = driver.findElementByXPath("//android.widget.TextView[@text='" + Constants_Mobi._Atm + "']/parent::android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
        chk_ATM_.click();
        chk_ATM_.click();
        
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW,"Thanh toán");
        WebElement btnThanhtoan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thanh toán");
        btnThanhtoan.click();
    }
    public static void payment_Visa (AndroidDriver<WebElement> driver){
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thẻ ATM nội địa");
        WebElement chk_Visa_ = driver.findElementByXPath("//android.widget.TextView[@text='" + Constants_Mobi._Visa 
        + "']/parent::android.view.ViewGroup[@index='4']/android.widget.ImageView[@index='0']");
        chk_Visa_.click();
 
        WebElement btnThanhtoan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnThanhtoan.click();
    }
    public static void payment_Transfer (AndroidDriver<WebElement> driver){
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thẻ ATM nội địa");
        WebElement chk_Transfer_ = driver.findElementByXPath("//android.widget.TextView[@text='" + Constants_Mobi._transf 
        + "']/parent::android.view.ViewGroup[@index='5']/android.widget.ImageView[@index='0']");
        chk_Transfer_.click();

        WebElement btnThanhtoan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnThanhtoan.click();
    }
    public static void payment_Momo (AndroidDriver<WebElement> driver){
    }
}