package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HistoryPage extends BasePageObject {
    private By deleteBtn = By.xpath("//android.widget.Button[2]");
    private By emptyHeader = MobileBy.AccessibilityId("Empty!");

    public void clickDelBtn(){
        click(deleteBtn);
    }
    public void empHeaderDisplayed(){
        isDisplayed(emptyHeader);
    }

}
