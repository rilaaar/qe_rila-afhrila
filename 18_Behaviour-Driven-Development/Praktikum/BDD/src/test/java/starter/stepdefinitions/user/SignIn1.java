package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn1 {
    @Given("I want to sign in page")

    public void iGoToSignInPage(){
    }

    @When("I click sign in button")
    public void iClickSignInButton(){
    }


    @Then("I will get error message")
    public void iWillGetErrorMessage() {
    }

    @And("I can't sign in")
    public void iCanTSignIn() {
    }

    @Then("I will success sign in")
    public void iWillSuccessSignIn() {
    }

    @And("I get my account")
    public void iGetMyAccount() {
    }

    @When("I don't click sign in button")
    public void iDonTClickSignInButton() {
    }

    @Then("I will not response")
    public void iWillNotResponse() {
    }

    @When("I click google button")
    public void iClickGoogleButton() {
    }

    @When("I click get help button")
    public void iClickGetHelpButton() {
        
    }

    @When("I click sign in button, click show password")
    public void iClickSignInButtonClickShowPassword() {
    }

    @When("I click sign in button, don't click show password")
    public void iClickSignInButtonDonTClickShowPassword() {
    }
}
