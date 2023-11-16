import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest{
    @Test
    public void PageTest() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        FormPage formPage = new FormPage(driver);
        formPage.setCountry();
        formPage.setNameField("Evans Mbongo");
        formPage.setGender();
        formPage.clickLetShopButton();

        Thread.sleep(2000);
        Assert.assertTrue(productPage.productTitleBar.isDisplayed());
        productPage.scrollTOProduct();
        productPage.clickCart();




    }
}
