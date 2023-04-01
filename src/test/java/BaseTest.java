import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public abstract class BaseTest {

    protected AndroidDriver driver;
    protected AppiumDriverLocalService service;
    protected PreferencePage preferencePage;
    protected ViewsPage viewsPage;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        String fullPath = "C:\\Users\\Sejn\\Desktop\\GitHub\\appium_basics\\resources\\ApiDemos-debug.apk";
        File appiumJs = new File("C:\\Users\\Sejn\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SejnDevice");
        cap.setCapability(MobileCapabilityType.APP, fullPath);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        service = new AppiumServiceBuilder()
                .withAppiumJS(appiumJs)
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withTimeout(Duration.ofSeconds(5000))
                .build();

        service.start();

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        preferencePage = new PreferencePage(driver, service);
        viewsPage = new ViewsPage(driver, service);
    }
    @AfterClass
    public void closeAppium(){
        driver.quit();
        service.stop();
    }
}
