import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormPageTest extends BaseTest{
    @Test
    public void FormTest() throws InterruptedException {
        FormPage formPage = new FormPage(driver);
        formPage.setCountry();
        formPage.setNameField("Evans Mbongo");
        formPage.setGender();
        formPage.clickLetShopButton();
        Thread.sleep(5000);

    }


}
