package stepdefinitions;

import features.Login.LoginProject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
    @Steps
    LoginProject loginProject;

    @Given("I set an url api for login")
    public void iSetAnUrlApiForLogin() {
        loginProject.setUrlLogin();
    }
    @And("I set valid username and valid password")
    public void iSetValidUsernameAndValidPassword() {
        loginProject.setBodyValidUsernameValidPassword();
    }
    @When("I request to login")
    public void iRequestToLogin() {
        loginProject.requestLogin();
    }

    @Then("I will get code 200")
    public void iWillGetCode200() {
        loginProject.validateStatusCode200();

    }

    @And("I set valid username and invalid password")
    public void iSetValidUsernameAndInvalidPassword() {
        loginProject.setBodyValidUsernameInvalidPassword();
    }

    @Then("I will get code 401")
    public void iWillGetCode401() {
        loginProject.validateStatusCode401();
    }

    @And("I set invalid username and valid password")
    public void iSetInvalidUsernameAndValidPassword() {
        loginProject.setBodyInvalidUsernameValidPassword();
    }

    @And("I set null username and null password")
    public void iSetNullUsernameAndNullPassword() {
        loginProject.setBodyNullUsernameNullPassword();
    }
}
