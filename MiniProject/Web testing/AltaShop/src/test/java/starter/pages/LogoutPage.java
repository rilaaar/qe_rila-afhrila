package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject{
    private By logoutBtn(){
        return By.xpath("//div[@class ='v-list-item__title'and contains(., 'Logout')]");
    }
    private By userIcon(){
        return By.xpath("//span//i[contains(@class, 'user')]");
    }

    public void clickLogoutBtn(){
        $(logoutBtn()).click();
    }
    public void clickUserIcon(){
        $(userIcon()).click();
    }

}
