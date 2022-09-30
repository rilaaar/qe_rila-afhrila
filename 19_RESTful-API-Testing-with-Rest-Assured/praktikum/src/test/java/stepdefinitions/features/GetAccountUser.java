package stepdefinitions.features;

import features.GetAccessAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetAccountUser {

    @Steps
     GetAccessAccount getAccessAccount;

    @Given("I set a name and password")
    public void iSetANameAndPassword() {
        GetAccessAccount.setNameAndPassword();
    }

    @When("I request get new account")
    public void iRequestGetNewAccount() {
        GetAccessAccount.requestAccount();
    }

    @Then("I will get code 201")
    public void iWillGetCode201() {
            GetAccessAccount.validateStatusCode();
        }


    @And("Get new account")
    public void getNewAccount() {
        GetAccessAccount.validateGetAccount();
    }

    @Given("I set valid username and valid password")
    public void iSetValidUsernameAndValidPassword() {
        GetAccessAccount.setNameAndPassword();
    }

    @When("I request to login")
    public void iRequestToLogin() {
        GetAccessAccount.requestAccount();
    }

    @And("Get manage my account")
    public void getManageMyAccount() {
        GetAccessAccount.validateGetAccount();
    }

    @Given("I set valid username and invalid password")
    public void iSetValidUsernameAndInvalidPassword() {
        GetAccessAccount.setNameAndPassword();

    }

    @Then("I will get code 400")
    public void iWillGetCode400() {
        GetAccessAccount.validateStatusCode();
    }

    @And("Get error message")
    public void getErrorMessage() {
        GetAccessAccount.validateGetAccount();
    }

    @Then("I will get code 404")
    public void iWillGetCode404() {
        GetAccessAccount.validateStatusCode();
    }
}

