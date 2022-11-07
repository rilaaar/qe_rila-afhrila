package stepdefinitions;

import features.Auth.GetUserInformation;
import features.Auth.Login;
import features.Auth.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.net.http.common.Log;
import net.thucydides.core.annotations.Steps;

public class AuthStep {
    @Steps
    Login login;
    @Steps
    Register register;
    @Steps
    GetUserInformation getUserInformation;

    @Given("I set an url api for login")
    public void iSetAnUrlApiForLogin() {
        login.setUrlLogin();
    }
    @And("I set {string} email and {string} password")
    public void iSetEmailAndPassword(String email, String password) {
        login.setBodyData(email, password);
    }
    @When("I request to login")
    public void iRequestToLogin() {
        login.requestLogin();
    }

    @Then("I get a {string}")
    public void iGetA(String result) {
        if(result.equals("i can't login")) {
            login.validateStatusCode400();
        }
        else if(result.equals("i can login")){
            login.validateStatusCode200();
        }
    }

    @Given("I set an url api for regist")
    public void iSetAnUrlApiForRegist() {
        register.setUrlRegist();
    }
    @When("I set  {string} new email {string} new password {string} fullname")
    public void iSetFullnameNewEmailNewPassword(String newemail, String newpassword, String fullname) {
        register.setBodyData(newemail, newpassword, fullname);
    }
    @And("I request to register")
    public void iRequestToRegister() {
        register.requestRegist();
    }
    @Then("I will get the {string} result")
    public void iWillGetTheResult(String result) {
        if(result.equals("Fail register")) {
            login.validateStatusCode400();
        }
        else if(result.equals("Success")){
            login.validateStatusCode200();
        }
    }
    @Given("I set an url api for get user information")
    public void iSetAnUrlApiForGetUserInformation() {
        getUserInformation.setUrlUserInfo();
    }

    @When("I request to get user information")
    public void iRequestToGetUserInformation() {
        getUserInformation.requestUserInfo();
    }
    @And("I will get code verification")
    public void iWillGetCodeVerification() {
        getUserInformation.validateStatusCode401();
    }
}
