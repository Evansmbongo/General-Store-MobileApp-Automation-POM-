import Utilities.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    @Test(groups = {"smoke"})
    public void PageTest() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        FormPage formPage = new FormPage(driver);
        CartPage cartPage = new CartPage(driver);

        formPage.setCountry();
        formPage.setNameField("Evans Mbongo");
        formPage.setGender();
        formPage.clickLetShopButton();

        Thread.sleep(2000);
        productPage.scrollTOProduct();
        productPage.clickCart();

        Assert.assertTrue(cartPage.cartTitleBar.isDisplayed());
        cartPage.longPress();
        cartPage.closeBtn();
        cartPage.checkBox();
        cartPage.proceedBtn();

        Thread.sleep(5000);



    }
}
