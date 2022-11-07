package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStepDefinition {
    @Steps
    LoginPage loginPage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        loginPage.openUrl();
        loginPage.headerHomeDisplayed();
    }

    @And("I click login icon")
    public void iClickLoginIcon() {
        loginPage.clickLoginIcon();
    }

    @When("I input {string} email")
    public void iInputEmail(String arg0) {
        loginPage.inputEmail(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg0) {
        loginPage.inputPassword(arg0);
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if(result.equals("i can't login")) {
            loginPage.errorMessageDisplayed();
        }
        else if(result.equals("i can login")){
            loginPage.headerHomeDisplayed();
        }
    }

}
