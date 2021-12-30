package mavenpackage.Web.Functions.Deposit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

 public class Deposit_info extends Thread {   
    
    static String sotien = "99000000";

    public static void infoNapTien(WebDriver driver){
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "usertopuptransaction-amount");
        WebElement txtsotien = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "usertopuptransaction-amount");
        txtsotien.sendKeys(sotien);
        txtsotien.sendKeys(Keys.TAB);
        WebElement chkBank = driver.findElement(By.xpath("//input[@type='checkbox']"));
        chkBank.click();
        WebElement btnSubmit = driver.findElement(By.xpath("//button[contains(text(),'Nạp tiền')]"));
        btnSubmit.click();
    }

    public static void verifyNaptien(WebDriver driver) throws InterruptedException{
        WebElement btnXacNhan = driver.findElement(By.xpath("//button[contains(text(),'Xác nhận')]"));
        btnXacNhan.click();        
    }

    public static void formSuccess(WebDriver driver){                     
        WebElement txtResult = CommonMethods_Web.findElement(driver, "//div[contains(text(),'GIAO DỊCH THÀNH CÔNG')]");
        Assert.assertEquals(txtResult.getText(), "GIAO DỊCH THÀNH CÔNG");
        
        WebElement back = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_A, "/napas/top-up");
        back.click();
    }
}
