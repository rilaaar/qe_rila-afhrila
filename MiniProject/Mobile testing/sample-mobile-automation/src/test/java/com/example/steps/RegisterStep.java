package com.example.steps;

import com.example.app.pages.HomePage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {
    @Steps
    RegisterPage registerPage;
    @Steps
    HomePage homePage;

    @And("I click register text")
    public void iClickRegisterText() {
        registerPage.clickRegistText();
    }

    @When("I input {string} fullname")
    public void iInputFullname(String arg0) throws InterruptedException{
        registerPage.inputFullname(arg0);
    }

    @And("I input {string} new email")
    public void iInputNewEmail(String arg0) throws InterruptedException{
        registerPage.inputNewEmail(arg0);
    }

    @And("I input {string} new password")
    public void iInputNewPassword(String arg0) throws InterruptedException{
        registerPage.inputNewPass(arg0);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickRegistBtn();
    }

    @Then("I will get the {string} result")
    public void iWillGetTheResult(String result) {
        if(result.equals("Error email")) {
            registerPage.errorEmail();
        }
        else if (result.equals("Error password")) {
            registerPage.errorPass();
        }
        else if (result.equals("Error name")) {
            registerPage.errorName();
        }
        else if (result.equals("Gagal")) {
            registerPage.gagal();
        }
        else if(result.equals("Succes")){
            homePage.pHeaderDisp();
        }
    }
}
