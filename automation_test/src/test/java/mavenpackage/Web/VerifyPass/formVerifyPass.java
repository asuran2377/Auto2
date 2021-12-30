package mavenpackage.Web.VerifyPass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;

public class formVerifyPass {

    public static void formverifypass(WebDriver driver){
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "password");        
        WebElement txtPass = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "password");
        txtPass.sendKeys(Constants_Web._password);        
        WebElement btnPass = CommonMethods_Web.findElement(driver, Constants_Web.DYNAMIC_XPATH_ID_BUTTON, "btn_submit");
        btnPass.click();     
    }
}
