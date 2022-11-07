package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.beans.IntrospectionException;

public class LoginPage extends BasePageObject {
    private By loginIcon = By.xpath("(//android.widget.Button)[1]");
//    /android.view.View[1]
    private By fieldEmail = By.xpath("//android.widget.EditText[1]");
    private By fieldPassword = By.xpath("//android.widget.EditText[2]");
    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By errorMessage1= MobileBy.AccessibilityId("email can not empty");
    private By errorMessage2= MobileBy.AccessibilityId("password can not empty");
    private By errorMessage3= MobileBy.AccessibilityId("Email atau password tidak valid.");

    public void clickLoginIcon(){
        click(loginIcon);
    }
    public void inputEmail(String email)throws InterruptedException{
        click(fieldEmail);
        Thread.sleep(3000);
        sendKeys(fieldEmail, email);
    }

    public void inputPassword(String password)throws InterruptedException{
        click(fieldPassword);
        Thread.sleep(3000);
        sendKeys(fieldPassword, password);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }
    public void errorEmail(){
        isDisplayed(errorMessage1);
    }
    public void failed(){
        isDisplayed(errorMessage3);
    }

}
