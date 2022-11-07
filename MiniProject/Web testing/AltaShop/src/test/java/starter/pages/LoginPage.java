package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {
    private By loginIcon(){
        return By.xpath("//button//i[contains(@class, 'sign-in')]");
    }
    private By headerHome(){
        return By.xpath("//div[@class = 'v-main__wrap']");
    }
    private By fieldEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }
    private By password(){
        return By.xpath("//div[label[text() = 'Password']]/input");
    }
    private By loginButton(){
        return By.xpath("//button/span[text() = 'Login']");
    }
    private By errorMessage(){
        return By.xpath("//div[@class = 'v-alert__wrapper']");
    }

    public void openUrl(){
        openAt("/");
    }

    public void inputEmail(String email){
        $(fieldEmail()).type(email);

    }
    public void inputPassword(String password){
        $(password()).type(password);

    }
    public void clickLoginBtn(){
        $(loginButton()).click();

    }
    public void headerHomeDisplayed(){
        $(headerHome()).isDisplayed();

    }
    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();

    }
    public void clickLoginIcon(){
        $(loginIcon()).click();
    }
    public void showLoginBtn(){
        $(loginButton()).isDisplayed();
    }
}
