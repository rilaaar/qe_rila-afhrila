package com.example.steps;

import com.example.app.pages.HomePage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.beans.IntrospectionException;

public class LoginStep {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.pHeaderDisp();
    }

    @And("I click login icon")
    public void iClickLoginIcon() {
        loginPage.clickLoginIcon();
    }

    @When("I input {string} email")
    public void iInputEmail(String arg0) throws InterruptedException {
        loginPage.inputEmail(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg1) throws InterruptedException{
        loginPage.inputPassword(arg1);
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if(result.equals("i can't login")) {
            loginPage.errorEmail();
        }
        else if(result.equals("i can login")){
            homePage.pHeaderDisp();
        }
        else if (result.equals("Failed")){
            loginPage.failed();
        }
    }
//    @And("I go to home page")
//    public void iGoToHomePage() {
//        homePage.pHeaderDisp();
//    }
}
