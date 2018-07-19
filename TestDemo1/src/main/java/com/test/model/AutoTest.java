package com.test.model;

import com.test.utils.SwipeTools;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AutoTest {
    static Duration duration = Duration.ofSeconds(1);
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("","");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("appPackage","com.irobotix.whirlpool");
        capabilities.setCapability("appActivity","com.spain.cleanrobot.ui.welcome.ActivitySplash");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Thread.sleep(10000);

        SwipeTools.swipeLeft(driver,2);

        driver.findElement(By.id("com.irobotix.whirlpool:id/guide_btn_start_use")).click();


    }

}
