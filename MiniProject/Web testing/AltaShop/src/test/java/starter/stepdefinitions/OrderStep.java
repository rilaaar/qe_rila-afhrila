package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.OrderPage;

public class OrderStep {
    @Steps
    OrderPage orderPage;
    HomePage homePage;
    LoginPage loginPage;

    @And("I click trolley icon")
    public void iClickTrolleyIcon() {
        orderPage.clickTrolleyIcon();
    }

    @Then("Total price can showed")
    public void totalPriceCanShowed() {
        orderPage.showTotalPrice();
    }

    @When("I click buy button to two product")
    public void iClickBuyButtonToTwoProduct() {
        homePage.clickBuyBtn();
        homePage.clickBuyBtn2();
    }

    @Then("Quantity product can showed")
    public void quantityProductCanShowed() {
        orderPage.showQuantityProduct();
    }

    @And("I click pay button")
    public void iClickPayButton() {
        orderPage.clickPayBtn();
    }

    @Then("Redirected to login page")
    public void redirectedToLoginPage() {
        loginPage.showLoginBtn();
    }
}
