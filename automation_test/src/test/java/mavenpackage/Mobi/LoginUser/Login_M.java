package mavenpackage.Mobi.LoginUser;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import mavenpackage.Mobi.initial_Mobi;
import mavenpackage.Mobi.Napas.payNapas_Info;
import mavenpackage.Mobi.Payment_Method.payment_method;
import mavenpackage.Mobi.Services.services_m;

public class Login_M extends initial_Mobi {
    
    @Test
    public static void Login_m() throws InterruptedException, MalformedURLException{
        driver = openApp();
        LoginUser_M.Login(driver); 
        services_m.TienDien(driver);
        payment_method.payment_ATM(driver);
        payNapas_Info.formInput_info_Napas(driver);
        payNapas_Info.formSubmit_Opt(driver);   
    }        
}