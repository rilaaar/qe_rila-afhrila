package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject{
    private By buyBtn(){
        return By.xpath("//div//span[@class ='v-btn__content'and contains(., 'Beli')]");
    }
    private By buyBtn2(){
        return By.xpath("//div//span[@class ='v-btn__content'and contains(., 'Beli')]");
    }
    private By detailBtnPS5(){
        return By.xpath("//div//span[@class ='v-btn__content'and contains(., 'Detail')]");
    }
    private By detailBtnPS2(){
        return By.xpath("//div//span[@class ='v-btn__content'and contains(., 'Detail')]");
    }
    private By headerDetail(){
        return By.xpath("//div[@class='v-card__text']");
    }
    private By selectCategory(){
        return By.xpath("//div[@class='v-select__selections']");
    }
    private By gaming(){
        return By.xpath("//div[@class ='v-list-item__title'and contains(., 'gaming')]");
    }
    private By detailGaming(){
        return By.xpath("//div[@class='col-md-4 col-lg-3 col-6']");
    }
    private By dolanan(){
        return By.xpath("//div[@class ='v-list-item__title'and contains(., 'Dolanan')]");
    }
    private By detailDolanan(){
        return By.xpath("//div[@class='col-md-4 col-lg-3 col-6']");
    }
    private By numBadge(){
        return By.xpath("//div//span[@class ='v-badge__badge primary']");
    }

    public void showNumBadge(){
        $(numBadge()).isDisplayed();
    }
    public void clickBuyBtn(){
        $(buyBtn()).click();
    }
    public void clickBuyBtn2(){
        $(buyBtn2()).click();
    }
    public void clickDetailBtnPS5(){
        $(detailBtnPS5()).click();
    }
    public void clickDetailBtnPS2(){
        $(detailBtnPS2()).click();
    }
    public void showHeaderDetail(){
        $(headerDetail()).isDisplayed();
    }
    public void clickSelectCategory(){
        $(selectCategory()).click();
    }
    public void clickGaming(){
        $(gaming()).click();
    }
    public void showDetailGaming(){
        $(detailGaming()).isDisplayed();
    }
    public void clickDolanan(){
        $(dolanan()).click();
    }
    public void showDetailDolanan(){
        $(detailDolanan()).isDisplayed();
    }
}
