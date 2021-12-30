package mavenpackage.Mobi.LuckyDraw;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;

public class Draw_info {

    public static final String DYNAMIC_XPATH_DRAW = "//android.widget.TextView[@text='Yschool ưu đãi']/following-sibling::android.view.ViewGroup[@index='5']";
    
    //public static final String DYNAMIC_XPATH_SPIN = "//android.view.ViewGroup[@index='8']/android.view.ViewGroup[@index='2']";

    public static final String DYNAMIC_XPATH_POUP_TEXT_RESULT = "//android.widget.TextView[@index='2']";
    public static final String DYNAMIC_XPATH_POUPRESULT = "//android.view.ViewGroup[@index='4']/android.widget.ImageView[@index='0']";

    public static final String DYNAMIC_XPATH_SPIN = "//android.view.ViewGroup[@index='8']/android.view.ViewGroup[@index='2']/android.widget.ImageView[@index='0']";

    public static void open_draw_spin(AndroidDriver<WebElement> driver){
        //CommonMethods_Mobi.waitForElementClickable(driver, DYNAMIC_XPATH_DRAW);
        WebElement openDraw = CommonMethods_Mobi.findElement(driver, DYNAMIC_XPATH_DRAW); 
        openDraw.click();
    }

    public static void draw_spin(AndroidDriver<WebElement> driver){
        //CommonMethods_Mobi.waitForElementClickable(driver, DYNAMIC_XPATH_SPIN); 
        WebElement spin = CommonMethods_Mobi.findElement(driver, DYNAMIC_XPATH_SPIN); //cái nút click quay là chỗ này nè > mở cái hàm findElement lên thử
        spin.click();

        CommonMethods_Mobi.waitForElementClickable(driver, DYNAMIC_XPATH_POUP_TEXT_RESULT);
        String textResult = driver.findElementByXPath(DYNAMIC_XPATH_POUP_TEXT_RESULT).getText();       
        System.out.println("Kết quả: " + textResult);


        CommonMethods_Mobi.waitForElementClickable(driver, DYNAMIC_XPATH_POUPRESULT);
        WebElement submitResult = CommonMethods_Mobi.findElement(driver, DYNAMIC_XPATH_POUPRESULT);
        submitResult.click();

    }
}
