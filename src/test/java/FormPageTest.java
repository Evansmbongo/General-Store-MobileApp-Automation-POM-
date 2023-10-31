import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormPageTest extends BaseTest{
    @Test
    public void FormTest(){
        FormPage formPage = new FormPage(driver);
        formPage.clickDropDown();
        formPage.setNameField("Evans Mbongo");
        formPage.setGender();




    }


}
