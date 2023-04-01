import com.sun.org.glassfish.gmbal.Description;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class appiumBasics extends BaseTest {
    @Test(priority = 10)
    @Description("")
    public void WifiTest() {
        String inputText = "Sejn";
        preferencePage.getPreferenceButton().click();
        preferencePage.getPreferenceDepButton().click();
        preferencePage.getWifiCheckBox().click();
        preferencePage.getWifiPrefButton().click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(preferencePage.getWifiPopUpText().getText(),
                "WiFi settings",
                "Text in popUp is incorrect");

        preferencePage.getWifiInput().sendKeys(inputText);
        preferencePage.getWifiPopUpOkButton().click();

    }
}
