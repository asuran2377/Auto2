package mavenpackage.Web.Functions.Withdrawal;

import org.testng.annotations.Test;

import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.LoginUser.LoginUser;
import mavenpackage.Web.Services.services;
import mavenpackage.Web.VerifyPass.formVerifyPass;

public class Withdrawal extends Initial_Web {

    @Test
    public static void withdrawal() throws InterruptedException{
        driver = openBrowser();
        LoginUser.Login(driver);
        for(int i = 1; i < 2; i++){
            services.RutTien(driver);
            Withdrawal_info.InfoWithDrawal(driver);        
            Withdrawal_info.VeryinfoWithDrawal(driver);
            formVerifyPass.formverifypass(driver);
            Withdrawal_info.formSuccess(driver);
            System.out.print("Test rút tiền lần " + i + ".\n");
            if(i == 1){
                driver.quit();
            }
        }
    }
}
