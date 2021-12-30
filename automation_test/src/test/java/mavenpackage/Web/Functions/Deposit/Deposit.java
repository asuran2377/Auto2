package mavenpackage.Web.Functions.Deposit;

import org.testng.annotations.Test;

import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.LoginUser.LoginUser;
import mavenpackage.Web.Napas.formNapas;
import mavenpackage.Web.Services.services;

public class Deposit extends Initial_Web {
    @Test
    public static void deposit() throws InterruptedException{
        driver = openBrowser();
        LoginUser.Login(driver);
        services.NapTien(driver);
        for(int i = 1; i < 11; i++)
        {
            Deposit_info.infoNapTien(driver);        
            Deposit_info.verifyNaptien(driver);
            formNapas.Napas_Otp(driver);
            Deposit_info.formSuccess(driver);
            System.out.print("Test nạp tiền lần " + i + ".\n");            
            if(i == 10){
                driver.quit();
            }
        }
    }
}
