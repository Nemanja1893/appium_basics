import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PreferencePage extends BasePage{

    public PreferencePage(AndroidDriver driver, AppiumDriverLocalService service, WebDriverWait wait) {
        super(driver, service, wait);
    }
    public WebElement getPreferenceButton(){
        return driver.findElement(AppiumBy.accessibilityId("Preference"));
    }
    public WebElement getPreferenceDepButton(){
       return driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies"));
    }
    public WebElement getWifiCheckBox(){
        return driver.findElement(By.id("android:id/checkbox"));
    }
    public WebElement getWifiPrefButton(){
       return driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"));
    }
    public WebElement getWifiInput(){
        return driver.findElement(By.id("android:id/edit"));
    }
    public WebElement getWifiPopUpOkButton(){
        return driver.findElement(By.id("android:id/button1"));
    }
    public WebElement getWifiPopUpText(){
        return driver.findElement(By.id("android:id/alertTitle"));
    }

}
