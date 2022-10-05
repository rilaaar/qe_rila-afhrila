package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends PageObject {
    public void openUrl(){
        openAt("/");
    }
    public void scrollDown(){
        $("//body").sendKeys(Keys.END);
    }

    private By fieldUsername(){
        return By.id("userName");
    }
    private By password(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }
    private By dashboardFeature(){
        return By.id("userName-value");
    }
    private By errorMessage(){
        return By.id("name");
    }
    private By newUserBtn(){
        return By.id("newUser");
    }
    private By register(){
        return By.xpath("//h4");
    }
    private By loginHomePage(){
        return By.xpath("//h2");
    }

    public void loginHome(){
        $(loginHomePage()).isDisplayed();
    }
    public void registerPage(){
        $(register()).isDisplayed();
    }
    public void clickNewUser(){
        $(newUserBtn()).click();
    }
    public void getErrorMessage(){
        $(errorMessage()).isDisplayed();
    }
    public void dashboardPage(){
        $(dashboardFeature()).isDisplayed();
    }
    public void clickLoginBtn(){
        $(loginButton()).click();
    }

    public void inputPassword(String password){
        $(password()).type(password);
    }
    public void inputUsername(String username){
        $(fieldUsername()).type(username);
    }


}
