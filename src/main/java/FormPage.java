import Utilities.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class FormPage extends AndroidActions{
    AndroidDriver driver;

    public FormPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    @AndroidBy(id= "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement nameField;

    public void setNameField(String name){
        nameField.sendKeys(name);
        driver.hideKeyboard();
    }
    
    @AndroidFindBy (xpath = "//android.widget.RadioButton[@text = 'Female']")
    private WebElement radioButton;
    
    public void setGender(){
        radioButton.click();
    }

    @AndroidFindBy(id = "android:id/text1")
    private WebElement dropDown;

    public void setCountry() throws InterruptedException {
        dropDown.click();
        scrollAction(driver,"Benin");
        Thread.sleep(2000);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement clickLetShop;

    public void clickLetShopButton(){
        clickLetShop.click();

    }
}
