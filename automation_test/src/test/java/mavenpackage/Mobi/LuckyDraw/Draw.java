package mavenpackage.Mobi.LuckyDraw;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import mavenpackage.Mobi.initial_Mobi;
import mavenpackage.Mobi.LoginUser.LoginUser_M;

public class Draw extends initial_Mobi {
 
    @Test
    public static void Lucky_Draw() throws MalformedURLException, InterruptedException{
        driver = openApp();
        LoginUser_M.Login(driver); 
        Draw_info.open_draw_spin(driver);    
        for(int i = 1; i < 3; i++){
            System.out.print("Test vòng quay lần:  " + i + ".\n");
            Draw_info.draw_spin(driver);
            System.out.println("------\n");                  
            if(i == 2){
                driver.quit();
            }
        }
    }
}
