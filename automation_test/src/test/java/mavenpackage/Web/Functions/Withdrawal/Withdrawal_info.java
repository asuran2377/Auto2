package mavenpackage.Web.Functions.Withdrawal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

public class Withdrawal_info {

    static String _Ammount = "1000000";    

    public static void InfoWithDrawal(WebDriver driver){
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "Amount");        
        WebElement txtAmout = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "Amount");
        txtAmout.sendKeys(_Ammount);
        WebElement chkBank = driver.findElement(By.xpath("//input[@id='22566565']/parent::label"));
        chkBank.click();
        
        //Hàm scroll xuống web cho tới khi hiển thị element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement btnSubmit = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");
        js.executeScript("arguments[0].scrollIntoView();", btnSubmit);
        btnSubmit.click();        
    }

    public static void VeryinfoWithDrawal(WebDriver driver){
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");        
        WebElement btnSubmit = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");
        btnSubmit.click();        
    }

    public static void formSuccess(WebDriver driver){
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "back");
        
        WebElement txtResult = CommonMethods_Web.findElement(driver, "//div[contains(text(),'THÀNH CÔNG')]");
        Assert.assertEquals(txtResult.getText(), "THÀNH CÔNG");
        
        WebElement back = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "back");
        back.click();
    }
}
