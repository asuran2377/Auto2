package mavenpackage.Mobi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class initial_Mobi {        
        protected static AndroidDriver<WebElement> driver;   
    
        public static AndroidDriver<WebElement> openApp() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants_Mobi._PLATFORM_NAME);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, Constants_Mobi._PLATFORM_VERSION);
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, Constants_Mobi._DEVICE_NAME);
            caps.setCapability(MobileCapabilityType.APPLICATION_NAME, Constants_Mobi._APPLICATION_NAME);
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Constants_Mobi._app_packge);
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Constants_Mobi._app_activity);            
            URL url = new URL(Constants_Mobi._local_appium);
            driver = new AndroidDriver<WebElement>(url,caps);
            driver.manage().timeouts().implicitlyWait(Constants_Mobi.LONG_TIMEOUT, TimeUnit.SECONDS);            
            return driver;
        } 
}