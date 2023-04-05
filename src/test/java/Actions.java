import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public abstract class Actions {

    public static void longClickAction(WebElement element, AndroidDriver driver){
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(), "duration",2000));
    }
    public static void scrollToEndAction(AndroidDriver driver){
        boolean canScrollMore;
        do{
            canScrollMore = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript("mobile: scrollGesture", ImmutableMap.of(

                            "left", 100, "top", 100, "width", 200, "height", 200,
                            "direction", "down",
                            "percent", 20.0
                    ));
        }while (canScrollMore);
    }
    public static void swipeToElementAction(WebElement element, AndroidDriver driver){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "direction", "left",
                "percent", 0.75
        ));
    }
    public static void dragAndDropAction(WebElement element, AndroidDriver driver, int x, int y){
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", x,
                "endY", y
        ));
    }
}
