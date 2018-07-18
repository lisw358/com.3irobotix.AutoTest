package com.test.cases;

import com.test.utils.SwipeTools;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyDemo1 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("autimationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","7.0");
        capabilities.setCapability("appPackage","com.irobotix.vbot");
        capabilities.setCapability("appActivity","com.spain.cleanrobot.ui.welcome.ActivitySplash");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        Thread.sleep(5000);
        System.out.println(driver.manage().window().getSize());
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        int duration = 2000;
        driver.swipe(height / 2, width * 3 / 4, height / 2, width / 4,duration);
//        SwipeTools.swipeLeft(driver,2000,2);
//        driver.findElement(By.id("com.irobotix.vbot:id/guide_btn_start_use"));
//        WebElement element = driver.findElement(By.id("com.irobotix.vbot:id/login_psw_edt_account"));
//        element.clear();
//        element.sendKeys("19928804035");
//        WebElement element1 = driver.findElement(By.id("com.irobotix.vbot:id/login_psw_edt_psw"));
//        element1.clear();
//        element1.sendKeys("123456");
//        driver.findElement(By.id("com.irobotix.vbot:id/fragment_psw_btn_login")).click();

    }
}
