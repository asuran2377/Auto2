package mavenpackage.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initial_Web {
    protected static WebDriver driver;

    public static WebDriver openBrowser(){
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        final DesiredCapabilities cap_chrome = new DesiredCapabilities();
        cap_chrome.setCapability(ChromeOptions.CAPABILITY, options);
        cap_chrome.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Constants_Web._domain);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
