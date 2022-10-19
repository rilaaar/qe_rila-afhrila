package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class CalculatorPage extends BasePageObject {
    private By calculatorHeader = MobileBy.AccessibilityId("Calculator");
    private By numberOne = MobileBy.AccessibilityId("1");
    private By numberDisplayed = By.xpath("(//android.view.View[@content-desc=\"1\"])[1]");
    private By historyBtn = By.xpath("//android.widget.Button");
    private By historyHeader = MobileBy.AccessibilityId("History");
    public void calculatorHeaderDisplayed(){
//        AndroidElement headerElm = driver.findElement(calculatorHeader);
//        AndroidElement headerElm = find(calculatorHeader);
//        headerElm.isDisplayed();
        isDisplayed(calculatorHeader);
    }
    public void clickNumberOne(){
//        AndroidElement numberElm = driver.findElement(numberOne);
//        AndroidElement numberElm = find(numberOne);
//        numberElm.click();
        click(numberOne);
    }

    public void numDisplayed(){
//        AndroidElement numDisplayedElm = driver.findElement(numberDisplayed);
//        AndroidElement numDisplayedElm = find(numberDisplayed);
//        numDisplayedElm.isDisplayed();
        isDisplayed(numberDisplayed);
    }
    public void clickHistoryBtn(){
        click(historyBtn);
    }
    public void hisHeaderDisplayed(){
        isDisplayed(historyHeader);
    }


}
