package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {
    private By logoutBtn = By.xpath("(//android.widget.Button)[1]");

    public void clickLgtBtn(){
        click(logoutBtn);
    }
}
