package mavenpackage.Mobi.Tuition_Fee;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class tuition_fee_info {

    public static void ListStd(AndroidDriver<WebElement> driver){
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thanh toán Học Phí");
        WebElement tthocphi_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thanh toán Học Phí");
        tthocphi_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Do Thi Bao Nhu");
        WebElement std_name_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Do Thi Bao Nhu");
        std_name_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        WebElement pay_fee_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        pay_fee_.click();
    }
    public static void fee_info(AndroidDriver<WebElement> driver){
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tháng 11/2019");
        WebElement chk_fee_ = driver.findElementByXPath("//android.widget.TextView[@text='Tháng 11/2019']/following-sibling::android.view.ViewGroup[@index='2']/android.widget.ImageView");
        chk_fee_.click();

        WebElement btnTT = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnTT.click();
    }
}