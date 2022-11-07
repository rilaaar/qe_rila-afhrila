package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HomePage extends BasePageObject {
    private By productHeader = MobileBy.AccessibilityId("Products");
    private By productBtn1 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    private By productBtn2 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");


    public void pHeaderDisp(){
        isDisplayed(productHeader);
    }
    public void clickBtnP1(){
        click(productBtn1);
    }
    public void clickBtnP2(){
        click(productBtn2);
    }
}
