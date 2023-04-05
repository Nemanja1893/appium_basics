import com.google.common.collect.ImmutableMap;
import com.sun.org.glassfish.gmbal.Description;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
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
    @Test(priority = 20)
    @Description("Long Click Gesture")
    public void LongClickTest() throws InterruptedException {
        viewsPage.getViewsBElement().click();
        viewsPage.getExpandableListElement().click();
        viewsPage.getCustomAdapterElement().click();

        WebElement peopleNames = viewsPage.getPeoplesNameElement();
//        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
//                ImmutableMap.of("elementId", ((RemoteWebElement)peopleNames).getId(), "duration",2000));

        Util.longClickAction(peopleNames, driver);
        SoftAssert softAssert = new SoftAssert();
        String sampleMenuTxt = viewsPage.getPopUpSampleMenu().getText();

        softAssert.assertEquals(sampleMenuTxt,
                "Sample menu",
                "Text in PopUp is incorrect");

        Thread.sleep(3000);
    }
    @Test(priority = 30)
    @Description("Scroll gesture test")
    public void scrollGesture(){
        viewsPage.getViewsBElement().click();
        Util.scrollToEndAction(driver);

    }
    @Test(priority = 40)
    @Description("Swipe gesture test")
    public void swipeGesture(){
        viewsPage.getViewsBElement().click();
        viewsPage.getGalleryButton().click();
        viewsPage.getPhotosButton().click();

        WebElement firstPhoto = viewsPage.getFirstPhoto();
        Assert.assertEquals(firstPhoto.getAttribute("focusable"),
                "true",
                "Focusable attribute has wrong value");

        Util.swipeToElement(firstPhoto, driver);

        Assert.assertEquals(firstPhoto.getAttribute("focusable"),
                "false",
                "Focusable attribute has wrong value");
    }
}
