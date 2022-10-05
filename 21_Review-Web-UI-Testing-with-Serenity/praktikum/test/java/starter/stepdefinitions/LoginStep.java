package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the books page")
    public void iAmOnTheBooksPage() {
        loginPage.openUrl();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("rilaaar");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Rilaafhrila15!");
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.dashboardPage();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputUsername("rila");
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.getErrorMessage();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("Rila");
    }

    @When("I click new user button")
    public void iClickNewUserButton() {
        loginPage.clickNewUser();
    }

    @Then("I will go to register page")
    public void iWillGoToRegisterPage() {
        loginPage.registerPage();
    }

    @And("I will go to login page")
    public void iWillGoToLoginPage() {
        loginPage.loginHome();
        loginPage.scrollDown();
    }
}
