package mavenpackage.Mobi.Functions.LinkStd;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import mavenpackage.Mobi.initial_Mobi;
import mavenpackage.Mobi.Add_Rm_Std.LinkAddStd_RmStd;
import mavenpackage.Mobi.LoginUser.Login_M;

public class linkStd_otp extends initial_Mobi {

    @Test
    public static void linkStd_Code_M() throws InterruptedException, MalformedURLException{
        Login_M.Login_m();
        LinkAddStd_RmStd.addStd_op_code(driver);
        driver.quit();         
    }
}