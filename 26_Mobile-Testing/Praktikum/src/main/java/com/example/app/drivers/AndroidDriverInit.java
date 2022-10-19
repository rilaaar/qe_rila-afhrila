package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {
    public static AndroidDriver<AndroidElement> driver;

    public static void initialization(){
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability("platformVersion","11");
        caps.setCapability("platformName","Android");
        caps.setCapability("automatioName","UiAutomator2");
        caps.setCapability("app","D:\\Ra\\file kuliah\\semester 7\\resume alta\\26_Mobile-Testing\\sample-mobile-automation\\src\\test\\resources\\application\\calculator-alta-qe.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
    public static void close(){
        driver.quit();
    }
}
