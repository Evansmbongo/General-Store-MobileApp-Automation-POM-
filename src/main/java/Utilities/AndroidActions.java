package Utilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
    public void scrollAction(AndroidDriver driver,String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new " +
                "UiSelector().text(\"" + text + "\"))")).click();
    }

}



