package mavenpackage.Web.Functions.Transfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

public class TransferBank_info {

    static String _phoneTrans = "0936000073";
    static String _Amount = "100000";
    static String _note = "test noi dung chuyen tien";

    public static void infoChuyenTien(WebDriver driver) throws InterruptedException {
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "phonenumber");        
        WebElement txtPhone = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "phonenumber");
        txtPhone.sendKeys(_phoneTrans);        
        WebElement txtAmout = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "Amount");        
        txtAmout.sendKeys(_Amount);            
        WebElement txtDesc  = CommonMethods_Web.findElement(driver, "//textarea[@id='%s']", "note");
        txtDesc.sendKeys(_note);
        WebElement btnTiepTuc = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");        
        btnTiepTuc.click();       
    }

    public static void verifyChuyentien(WebDriver driver) throws InterruptedException{      
        WebElement btnXacNhan = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");        
        btnXacNhan.click();        
    }

    public static void formSuccess(WebDriver driver){        

        WebElement txtResult = CommonMethods_Web.findElement(driver, "//div[contains(text(),'GIAO DỊCH THÀNH CÔNG')]");
        Assert.assertEquals(txtResult.getText(), "GIAO DỊCH THÀNH CÔNG");        

        WebElement btnHome = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "back");
        btnHome.click();
    }
}
