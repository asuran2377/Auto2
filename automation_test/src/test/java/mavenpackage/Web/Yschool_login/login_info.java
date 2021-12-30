package mavenpackage.Web.Yschool_login;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavenpackage.Web.CommonActions;
import mavenpackage.Web.CommonMethods_Web;
import mavenpackage.Web.Constants_Web;
import mavenpackage.Web.ExcelUtil;

public class login_info extends CommonActions {

    final static String dynamic_username = "//input[@id='tbUserName_I']";
    final static String dynamic_pass = "//input[@id='tbPassword_I']";
    final static String dynamic_buton = "//div[@id='LoginButton_CD']";


    public static void TC_Login(WebDriver driver, ExcelUtil exelUtil, XSSFSheet data_Sheet, int i_row, int column1,
            int column2) throws InterruptedException {

        // Click nhập user name
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "tbUserName_I");
        CommonMethods_Web.sendKeyboardToElement(driver, dynamic_username,exelUtil.getCellData(data_Sheet, i_row, column1));

        // Click nhập pass
        CommonMethods_Web.waitForElementClickable(driver, Constants_Web.DYNAMIC_XPATH_ID_INPUT, "tbPassword_I");
        CommonMethods_Web.sendKeyboardToElement(driver, dynamic_pass, exelUtil.getCellData(data_Sheet, i_row, column2));

        // Click btn Đăng nhập
        WebElement btnOk = CommonMethods_Web.findElement(driver, dynamic_buton);
        btnOk.click();

        CommonMethods_Web.waitForElementClickable(driver, "//div[@class='helpInfo']");
        WebElement textIdSchool = driver.findElement(By.xpath("//div[@class='helpInfo']"));        
        String getTextSchool = textIdSchool.getText().split("\n")[1];
        System.out.println("Tên trường: " + getTextSchool);
    }

    public static void checkFillHS_Class(WebDriver driver){
        Actions actions = new Actions(driver);

        CommonMethods_Web.waitForElementClickable(driver, "//span[text()='Dữ liệu']");
        WebElement mainmenu2 = driver.findElement(By.xpath("//span[text()='Dữ liệu']"));
        actions.moveToElement(mainmenu2).perform();
        CommonMethods_Web.waitForElementClickable(driver, "//span[text()='Danh sách lớp học']");
        WebElement mainmenu3 = driver.findElement(By.xpath("//span[text()='Danh sách lớp học']"));
        mainmenu3.click();

        //CommonMethods_Web.waitForElementClickable(driver, "//b[@class='dxp-lead dxp-summary']");        
        // WebElement textClass = driver.findElement(By.xpath("//b[@class='dxp-lead dxp-summary']"));                
        // if(textClass != null){
        //     System.out.println("Chưa có dữ liệu danh sách lớp: ");
        // }else{
        //     String getTextClass = textClass.getText();
        //     System.out.println("Danh sách lớp học có: " + getTextClass.substring(11,20));
        // }

        CommonMethods_Web.waitForElementClickable(driver, "//b[@class='dxp-lead dxp-summary']"); 
        WebElement textClass = driver.findElement(By.xpath("//b[@class='dxp-lead dxp-summary']"));
        String getTextClass = textClass.getText();
        System.out.println("Danh sách lớp học có: " + getTextClass.substring(11,20));
	    
        CommonMethods_Web.waitForElementClickable(driver, "//span[text()='Dữ liệu']");
        WebElement mainmenu4 = driver.findElement(By.xpath("//span[text()='Dữ liệu']"));
        actions.moveToElement(mainmenu4).perform();
        CommonMethods_Web.waitForElementClickable(driver, "//span[text()='Danh sách học sinh']");
        WebElement mainmenu5 = driver.findElement(By.xpath("//span[text()='Danh sách học sinh']"));
        mainmenu5.click();

        CommonMethods_Web.waitForElementClickable(driver, "//b[@class='dxp-lead dxp-summary']");
        WebElement textStd = driver.findElement(By.xpath("//b[@class='dxp-lead dxp-summary']"));
        String getTextStd = textStd.getText();        
        System.out.println("Danh sách học sinh có: " + getTextStd.substring(11,21));     
    }

    public static WebDriver logout(WebDriver driver) throws InterruptedException {        
        Actions actions = new Actions(driver);

        CommonMethods_Web.waitForElementClickable(driver, "//div[@class='helpInfo']");
        WebElement textIdSchool = driver.findElement(By.xpath("//div[@class='helpInfo']"));        
        String getTextSchool = textIdSchool.getText();
        String[] x = getTextSchool.split("\n");

        CommonMethods_Web.waitForElementClickable(driver, "//img[@class='dxm-image dx-vam']");
        WebElement mainmenu1 = driver.findElement(By.xpath("//img[@class='dxm-image dx-vam']"));
        CommonMethods_Web.waitForElementClickable(driver, "//img[@class='dxm-image dx-vam']");
        actions.moveToElement(mainmenu1).perform();

        WebElement menu1 = driver.findElement(By.xpath("//span[text()='Đăng xuất']"));
        menu1.click();
        System.out.println("---Xong trường: " + x[1] + "---" + "\n");
        return driver;
    }
}
