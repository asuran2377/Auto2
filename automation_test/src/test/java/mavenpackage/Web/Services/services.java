package mavenpackage.Web.Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavenpackage.Web.CommonMethods_Web;

public class services {
    
    public static void NapTien(WebDriver driver) {        
        Actions actions = new Actions(driver);
        CommonMethods_Web.waitForElementClickable(driver, "//*[text()='%s']", "DỊCH VỤ");
        WebElement mainmenu = driver.findElement(By.xpath("//*[text()='DỊCH VỤ']"));
        actions.moveToElement(mainmenu).perform();
        WebElement menu1 = driver.findElement(By.xpath("//img[@src='/Assets/images/icon/yo-service-nap.svg']/parent::li"));
        actions.moveToElement(menu1).perform();
        WebElement menu2 = driver.findElement(By.xpath("//a[contains(text(),'Nạp tiền ví từ thẻ')]/parent::li"));
        actions.moveToElement(menu2);
        menu2.click();
        }
    
    public static void RutTien(WebDriver driver) {
        Actions actions = new Actions(driver);
        CommonMethods_Web.waitForElementClickable(driver, "//*[text()='%s']", "DỊCH VỤ");
        WebElement mainmenu = driver.findElement(By.xpath("//*[text()='DỊCH VỤ']"));
        actions.moveToElement(mainmenu).perform();
        WebElement menu1 = driver.findElement(By.xpath("//img[@src='/Assets/images/icon/yo-service-rut.svg']/parent::li"));
        actions.moveToElement(menu1).build().perform();
        WebElement menu2 = driver.findElement(By.xpath("//a[contains(text(),'Rút tiền về tài khoản')]/parent::li"));    
        actions.moveToElement(menu2);
        menu2.click();
        }
    
    public static void ChuyenTien(WebDriver driver) {
        Actions actions = new Actions(driver);
        CommonMethods_Web.waitForElementClickable(driver, "//*[text()='%s']", "DỊCH VỤ");
        WebElement mainmenu = driver.findElement(By.xpath("//*[text()='DỊCH VỤ']"));
        actions.moveToElement(mainmenu);
        WebElement menu1 = driver.findElement(By.xpath("//img[@src='/Assets/images/icon/yo-service-chuyen.svg']/parent::li"));
        actions.moveToElement(menu1).perform();
        menu1.click();
        }
    
    public static void NapTienMobile(WebDriver driver){
        Actions actions = new Actions(driver);
        WebElement mainmenu = driver.findElement(By.xpath("//*[text()='DỊCH VỤ']"));
        WebElement menu1 = driver.findElement(By.xpath("//a[contains(text(),'ch v')]"));
        WebElement menu2 = driver.findElement(By.xpath("//body[@class='nemo-123']/header/div[@class='navbar navbar-default navbar-fixed-top']/div[@class='header-bottom']/nav[@id='nav_menu']/div[@class='container nemo-container contailer-yopay']/div[@class='col-md-12']/div[@id='navbar']/div[@id='bs-example-navbar-collapse-animations']/ul[@class='nav navbar-nav nemo-hd-navbar bg-yopay']/li[@class='dropdown dropdown-inline nemo-navbar-inside']/div[@class='item-nemo']/div[@class='item-text']/ul[@class='dropdown-menu dropdownhover-bottom bg-yopay nemo-yopay-toggle-dropdown']/li[@class='dropdown nemo-navbar-inside yopay-dr-inside']/ul[@class='dropdown-menu bg-yopay yopay-dr-inside dropdownhover-right']/li[1]"));
        //WebElement menu3 = driver.findElement(By.xpath("//a[(text()='Nạp tiền điện thoại')]"));
        actions.moveToElement(mainmenu).perform();
        actions.moveToElement(menu1).build().perform();
        actions.moveToElement(menu2).build().perform();
        //menu3.click();
        }
}
