import Utilities.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class ProductPage extends AndroidActions {
    AndroidDriver driver;
    public ProductPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement productTitleBar;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement clickCartButton;

    public void clickCart(){
        clickCartButton.click();
    }

    public void scrollTOProduct(){
        scrollAction(driver,"Jordan 6 Rings");

        int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for (int i=0; i<productCount; i++){
            String productName =
                    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
            if (productName.equalsIgnoreCase("Jordan 6 Rings")){
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
            }
        }
    }


}
