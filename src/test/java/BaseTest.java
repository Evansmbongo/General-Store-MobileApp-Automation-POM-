import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;

    @BeforeMethod
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        options.setDeviceName("Pixel 6 Pro");
        capabilities.setCapability("chromedriverExecutable", "C:/Users/EvansMbongo/Desktop/Tests/General_Store-Automation-POM/General-Store\" +\n" +
                "                \"-Automation-POM/src/main/resources/chromedriver.exe");
        options.setApp("C:/Users/EvansMbongo/Desktop/Tests/General_Store-Automation-POM/General-Store" +
                "-Automation-POM/src/main/resources/General-Store.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./image.png"));
        }
        driver.quit();
    }

}
