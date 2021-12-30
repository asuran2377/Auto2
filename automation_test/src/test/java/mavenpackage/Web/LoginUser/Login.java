package mavenpackage.Web.LoginUser;

import org.testng.annotations.Test;

import mavenpackage.Web.Initial_Web;

public class Login extends Initial_Web {
    
    @Test 
    public void RunBrowser() throws InterruptedException{
        driver = openBrowser();
        LoginUser.Login(driver);        
    }
}
