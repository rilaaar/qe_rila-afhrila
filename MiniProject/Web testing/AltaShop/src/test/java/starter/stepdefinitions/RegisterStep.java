package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    RegisterPage registerPage;
    LoginPage loginPage;
    @And("I click register text")
    public void iClickRegisterText() {
        registerPage.clickRegiterText();
    }

    @When("I input {string} name")
    public void iInputName(String arg0) {
        registerPage.inputName(arg0);
    }

    @And("I input new {string} email")
    public void iInputNewEmail(String arg0) {
        registerPage.inputNewEmail(arg0);
    }

    @And("I input new {string} password")
    public void iInputNewPassword(String arg0) {
        registerPage.inputNewPassword(arg0);
    }
    @And("I click Register button")
    public void iClickRegisterButton() {
        registerPage.clickRegiterBtn();
    }

    @Then("I will get the {string} result")
    public void iWillGetTheResult(String result) {
        if(result.equals("Fail register")) {
            loginPage.errorMessageDisplayed();
        }
        else if(result.equals("Success register")){
            loginPage.showLoginBtn();
        }
    }
}
