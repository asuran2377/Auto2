package mavenpackage.Mobi.Napas;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class payNapas_Info {

    public static void formInput_info_Napas(AndroidDriver<WebElement> driver) throws InterruptedException{

        MobileElement scroll_find = (MobileElement)
        driver.findElement(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
         scroll_find.getLocation(); Thread.sleep(2000);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasCardNo");
        WebElement txtSothe = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasCardNo");        
        txtSothe.sendKeys(Constants_Mobi._sothe);

        WebElement txtHoTen = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasNameOnCard");
        txtHoTen.sendKeys(Constants_Mobi._hotenThe);

        WebElement txtHieuLuc = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasIssueDate");
        txtHieuLuc.sendKeys(Constants_Mobi._hansd);
        txtHieuLuc.click();
        driver.hideKeyboard();        
         
        WebElement btnTiepTuc = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_BUTTON_RESOURCE, "napasProcessBtn1");
        btnTiepTuc.click();
    }

    public static void formSubmit_Opt(AndroidDriver<WebElement> driver){
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasOtpCode");
        WebElement txtOpt = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT_RESOURCE, "napasOtpCode");
        txtOpt.sendKeys(Constants_Mobi._optNP);

        WebElement btnXacNhan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_BUTTON_RESOURCE, "napasProcessBtn2");
        btnXacNhan.click();
    }
}
