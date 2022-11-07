package com.example.steps;

import com.example.app.pages.HomePage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.beans.IntrospectionException;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;


    @And("I am on logged account")
    public void iAmOnLoggedAccount() throws InterruptedException {
        loginPage.clickLoginIcon();
        loginPage.inputEmail("ra@email.com");
        loginPage.inputPassword("Rilaafhrila15!");
        loginPage.clickLoginBtn();
        homePage.pHeaderDisp();
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clickLgtBtn();
    }

    @Then("My account success logout")
    public void myAccountSuccessLogout() {
        homePage.pHeaderDisp();
    }
}
