package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenApplication {
    public static AndroidDriver driver;
    @Test
    public void invokeApp() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("deviceName" , "One Plus Nord CE2 5G");
        dc.setCapability("platformName" , "Android");
        dc.setCapability("platformVersion" , "14");
        dc.setCapability("automationName" , "UiAutomator2");
        dc.setCapability("appPackage" , "com.mventus.selfcare.activity");
        dc.setCapability("appActivity" , "com.mventus.selfcare.activity.MainActivity");

       // URL path = new URL("http://127.0.0.1:4723/");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), dc);
    }
}
