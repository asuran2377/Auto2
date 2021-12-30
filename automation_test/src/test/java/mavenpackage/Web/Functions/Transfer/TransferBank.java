package mavenpackage.Web.Functions.Transfer;

import org.testng.annotations.Test;

import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.LoginUser.LoginUser;
import mavenpackage.Web.Services.services;
import mavenpackage.Web.VerifyPass.formVerifyPass;

public class TransferBank extends Initial_Web {
    @Test
    public static void Transfer() throws InterruptedException{
        driver = openBrowser();
        LoginUser.Login(driver);        
        for(int i = 1; i < 2; i++){
            services.ChuyenTien(driver);
            TransferBank_info.infoChuyenTien(driver);
            TransferBank_info.verifyChuyentien(driver);
            formVerifyPass.formverifypass(driver);
            TransferBank_info.formSuccess(driver);
            System.out.print("Test chuyển tiền lần " + i + ".\n");
            if(i == 1){
                driver.quit();
            }
        }
    }
}
