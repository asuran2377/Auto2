package mavenpackage.Mobi.LoginUser;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class LoginUser_M {

    public static void Login(AndroidDriver<WebElement> driver) throws InterruptedException {

        // Nhập phone        
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập số điện thoại");
        WebElement txtphone = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập số điện thoại");
        txtphone.click();
        txtphone.sendKeys(Constants_Mobi._phonelogin);

        // Click tiếp tục
        WebElement btnTiepTuc = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TIẾP TỤC");
        btnTiepTuc.click();

        // Nhập mật khẩu
        Thread.sleep(2000);
        WebElement txtpass = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Vui lòng nhập mật khẩu");
        txtpass.click();
        txtpass.sendKeys(Constants_Mobi._passlogin);

        // Click Xác nhận
        WebElement btnXacNhan = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "ĐĂNG NHẬP");
        btnXacNhan.click();
        
        //Tắt banner quảng cáo khi vào màn hình Home
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@index='1'");
        WebElement btnDisale = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@index='1'");
        btnDisale.click();
    }
    
}
