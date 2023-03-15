import com.sun.org.glassfish.gmbal.Description;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class appiumBasics extends BaseTest {
    @Test(priority = 10)
    @Description("")
    public void WifiTest() {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    }
}
