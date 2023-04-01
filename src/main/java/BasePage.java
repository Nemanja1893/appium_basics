import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    protected AppiumDriverLocalService service;

    public BasePage(WebDriver driver, AppiumDriverLocalService service) {
        this.driver = driver;
        this.service = service;
    }
}
