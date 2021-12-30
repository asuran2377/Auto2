package mavenpackage.Mobi.Tuition_Fee;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import mavenpackage.Mobi.initial_Mobi;
import mavenpackage.Mobi.LoginUser.LoginUser_M;

public class tuition_fee extends initial_Mobi {

    @Test
    public static void pay_tuition_fee() throws InterruptedException, MalformedURLException{
        driver = openApp();
        LoginUser_M.Login(driver);
        tuition_fee_info.ListStd(driver);
        tuition_fee_info.fee_info(driver);
    }
}
