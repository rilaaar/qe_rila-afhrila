package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.OrderPage;

public class HomeStep {
    @Steps
    HomePage homePage;
    OrderPage orderPage;

    @When("I click buy button")
    public void iClickBuyButton() {
        homePage.clickBuyBtn();
    }

    @Then("The product success added to cart")
    public void theProductSuccessAddedToCart() {
        homePage.showNumBadge();
    }

    @And("I click buy button in other product")
    public void iClickBuyButtonInOtherProduct() {
        homePage.clickBuyBtn2();
    }

    @When("I click detail button in PS5")
    public void iClickDetailButtonInPS5() {
        homePage.clickDetailBtnPS5();
    }

    @Then("The detail page is showed")
    public void theDetailPageIsShowed() {
        homePage.showHeaderDetail();
    }

    @When("I click select category")
    public void iClickSelectCategory() {
        homePage.clickSelectCategory();
    }

    @And("I click gaming")
    public void iClickGaming() {
        homePage.clickGaming();
    }

    @Then("Data gaming success showed")
    public void dataGamingSuccessShowed() {
        homePage.showDetailGaming();
    }

    @And("I click dolanan")
    public void iClickDolanan() {
        homePage.clickDolanan();
    }
    @Then("Data dolanan success showed")
    public void dataDolananSuccessShowed() {
        homePage.showDetailDolanan();
    }

    @When("I click detail button in PS2")
    public void iClickDetailButtonInPS2() {
        homePage.clickDetailBtnPS2();
    }
}
