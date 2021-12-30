package mavenpackage.Web.Napas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

public class formNapas {

    public static void Napas_info(WebDriver driver) throws InterruptedException{
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT,"napasCardNo");
        WebElement txtSothe = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "napasCardNo");
        txtSothe.sendKeys(Constants_Web._sothe_napas);
        WebElement txtChuThe = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "napasNameOnCard");
        txtChuThe.sendKeys(Constants_Web._chuthe_napas);
        WebElement txtHieuluc = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "napasIssueDate");
        txtHieuluc.sendKeys(Constants_Web._hieuluc_napas);
        WebElement btnTiepTuc = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "napasProcessBtn1");
        btnTiepTuc.click();
    }

    public static void Napas_Otp(WebDriver driver) throws InterruptedException {   
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "napasOtpCode");
        WebElement txtOtp = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "napasOtpCode");
        txtOtp.sendKeys(Constants_Web._otp_napas);
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "napasProcessBtn1");                
        WebElement btnTiepTuc = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "napasProcessBtn1");
        btnTiepTuc.click();
    }
}
