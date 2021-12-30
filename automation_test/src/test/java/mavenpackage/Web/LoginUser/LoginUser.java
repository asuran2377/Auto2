package mavenpackage.Web.LoginUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

public class LoginUser {

    public static WebDriver Login(WebDriver driver) throws InterruptedException {
		
		// Click Nút Đăng nhập
        CommonMethods_Web.waitForElementClickable(driver, "//li/a[@href='/%s']", "SignIn");
        WebElement button = driver.findElement(By.xpath("//li/a[@href='/SignIn']"));
		button.click();

		// Nhập số đt        
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "PhoneNumber");
		WebElement reg = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "PhoneNumber");        	
		reg.sendKeys(Constants_Web._phonelogin);		
		WebElement btnOk = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btnOk");        	
		btnOk.click();

		// Nhập mật khẩu
		CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "Password");
		WebElement pass = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "Password");
		pass.sendKeys(Constants_Web._password);		
		pass.findElement(By.xpath("//button[@id='keepgoing']")).click();
        
		// // Nhập mã OTP
		WebElement OPTCode1 = driver.findElement(By.xpath("//input[@oninput=\"otpCall('inp-otp-1','inp-otp-2',event);\"]"));
		OPTCode1.sendKeys(Constants_Web._otp_login);
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "next");
		WebElement btnLogin = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "next");		
		btnLogin.click();

		return driver;
	}
}
