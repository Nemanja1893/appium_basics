import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {
    @Test
    public void AppiumTest() throws MalformedURLException, InterruptedException {

        String fullPath = "C:\\Users\\Sejn\\Desktop\\GitHub\\appium_basics\\resources\\ApiDemos-debug.apk";
        File appiumJs = new File("C:\\Users\\Sejn\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
        String driverIp = "127.0.0.1";
        int port = 4723;

        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("C://Users//Sejn//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723).build();

            service.start();

            Thread.sleep(5000);

            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Pixel 2 API 30");
            options.setApp(fullPath);

            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            driver.quit();
            service.stop();
        }
    }

