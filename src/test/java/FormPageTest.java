import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormPageTest extends BaseTest{
    @Test
    public void FormTest() throws InterruptedException {
        FormPage formPage = new FormPage(driver);
        Assert.assertTrue(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")).isDisplayed());
        formPage.setCountry();
        formPage.setNameField("Evans Mbongo");
        formPage.setGender();
        formPage.clickLetShopButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        Thread.sleep(2000);
    }


}
