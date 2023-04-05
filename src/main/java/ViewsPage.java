import io.appium.java_client.AppiumBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewsPage extends BasePage{

    public ViewsPage(WebDriver driver, AppiumDriverLocalService service) {
        super(driver, service);
    }

    public WebElement getViewsBElement(){
        return driver.findElement(AppiumBy.accessibilityId("Views"));
    }
    public WebElement getExpandableListElement(){
        return driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
    }
    public  WebElement getCustomAdapterElement(){
        return driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
    }
    public  WebElement getPeoplesNameElement(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text = 'People Names']"));
    }
    public WebElement getPopUpSampleMenu(){
        return driver.findElement(By.id("android:id/title"));
    }
    public WebElement getGalleryButton(){
        return driver.findElement(AppiumBy.accessibilityId("Gallery"));
    }
    public WebElement getPhotosButton(){
        return driver.findElement(AppiumBy.accessibilityId("1. Photos"));
    }
    public WebElement getFirstPhoto(){
        return driver.findElement(By.xpath("//android.widget.ImageView[1]"));
    }
    public WebElement getDragAndDropButton(){
        return driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
    }
    public WebElement getFirstDragDot(){
        return driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
    }
    public WebElement getDragResultElement(){
        return driver.findElement(By.id("io.appium.android.apis:id/drag_result_text"));
    }
}
