package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends PageObject{
    private By registerText(){
        return By.xpath("//a[contains(@href, '/auth/register')]");
    }
    private By fieldName(){
        return By.xpath("//div[label[text() = 'Nama Lengkap']]/input");
    }
    private By fieldNewEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }
    private By fieldNewPassword(){
        return By.xpath("//div[label[text() = 'Password']]/input");
    }
    private By registerBtn(){
        return By.xpath("//div//span[@class ='v-btn__content'and contains(., 'Register')]");
    }

    public void clickRegiterBtn(){
        $(registerBtn()).click();
    }
    public void inputNewPassword(String password){
        $(fieldNewPassword()).type(password);
    }
    public void inputNewEmail(String email){
        Random rand = new Random();
        email = "rilaaarn" + rand.nextInt() + "@gmail.com";
        $(fieldNewEmail()).type(email);
    }
    public void inputName(String name){
        $(fieldName()).type(name);
    }
    public void clickRegiterText(){
        $(registerText()).click();
    }
}
