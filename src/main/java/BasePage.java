import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    protected AppiumDriverLocalService service;

    public BasePage(AndroidDriver driver, AppiumDriverLocalService service, WebDriverWait wait) {
        this.driver = driver;
        this.service = service;
        this.wait = wait;
    }
}
