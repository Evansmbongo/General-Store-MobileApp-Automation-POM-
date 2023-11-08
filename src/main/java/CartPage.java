import Utilities.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends AndroidActions {
    AndroidDriver driver;
    public CartPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/termsButton")
    private WebElement Press;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement closeButton;

    @AndroidFindBy (className = "android.widget.CheckBox")
    private WebElement emailCheckbox;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/btnProceed")
    private WebElement proceedButton;

    public void longPress(){
        longPressAction(driver,Press);
    }

    public void closeBtn(){
        closeButton.click();
    }

    public void checkBox(){
        emailCheckbox.click();
    }

    public void proceedBtn(){
        proceedButton.click();
    }

}
