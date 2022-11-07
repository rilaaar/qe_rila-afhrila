package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject{
    private By payBtn(){
        return By.id("button-bayar");
    }
    private By trolleyIcon(){
        return By.xpath("//span//i[contains(@class, 'shopping-cart')]");
    }
    private By totalPrice(){
        return By.id("label-total-bayar");
    }
    private By quantityProduct(){
        return By.id("label-total-quantity");
    }

    public void showQuantityProduct(){
        $(quantityProduct()).isDisplayed();
    }
    public void showTotalPrice(){
        $(totalPrice()).isDisplayed();
    }
    public void clickTrolleyIcon(){
        $(trolleyIcon()).click();
    }
    public void clickPayBtn(){
        $(payBtn()).click();
    }
    public void showPayBtn(){
        $(payBtn()).isDisplayed();
    }
}
