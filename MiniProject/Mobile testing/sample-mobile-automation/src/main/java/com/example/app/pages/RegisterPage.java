package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends BasePageObject {
    private By registText = MobileBy.AccessibilityId("Register");
    private By fieldFullname = By.xpath("(//android.widget.EditText[1])[1]");
    private By fieldNewEmail = By.xpath("//android.widget.EditText[2]");
    private By fieldNewPassword = By.xpath("//android.widget.EditText[3]");
    private By registBtn = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By errorMessage1= MobileBy.AccessibilityId("email can not empty");
    private By errorMessage2= MobileBy.AccessibilityId("password can not empty");
    private By errorMessage3 = MobileBy.AccessibilityId("Gagal :(");
    private By errorMessage4= MobileBy.AccessibilityId("fullname can not empty");

    public void clickRegistText(){
        click(registText);
    }
    public void inputFullname(String fullname)throws InterruptedException{
        click(fieldFullname);
        Thread.sleep(3000);
        clear(fieldFullname);
        Thread.sleep(3000);
        sendKeys(fieldFullname, fullname);

    }
    public void inputNewEmail(String newemail)throws InterruptedException{
        click(fieldNewEmail);
        Thread.sleep(3000);
        clear(fieldNewEmail);
        Thread.sleep(3000);
        Random rand = new Random();
        newemail = "alex" + rand.nextInt() + "@email.com";
        sendKeys(fieldNewEmail, newemail);

    }
    public void inputNewPass(String newpassword)throws InterruptedException{
        click(fieldNewPassword);
        Thread.sleep(3000);
        clear(fieldNewPassword);
        Thread.sleep(3000);
        sendKeys(fieldNewPassword, newpassword);
    }
    public void clickRegistBtn(){
        click(registBtn);
    }
    public void errorEmail(){
        isDisplayed(errorMessage1);
    }
    public void gagal(){
        isDisplayed(errorMessage3);
    }
    public void errorPass(){
        isDisplayed(errorMessage2);
    }
    public void errorName(){
        isDisplayed(errorMessage4);
    }
}
