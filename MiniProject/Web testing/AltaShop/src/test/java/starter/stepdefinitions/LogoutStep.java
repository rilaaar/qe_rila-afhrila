package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;

public class LogoutStep {
    @Steps
    LoginPage loginPage;
    LogoutPage logoutPage;

    @And("I am on logged account")
    public void iAmOnLoggedAccount() {
        loginPage.clickLoginIcon();
        loginPage.inputEmail("rilaaarn@gmail.com");
        loginPage.inputPassword("Rilaafhrila15!");
        loginPage.clickLoginBtn();
    }
    @And("I click user icon")
    public void iClickUserIcon() {
        logoutPage.clickUserIcon();
    }
    @When("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clickLogoutBtn();
    }

    @Then("My account success logout")
    public void myAccountSuccessLogout() {
        loginPage.showLoginBtn();
    }


}
