package stepdefinitions;

import features.Auth.Login;
import features.helo.Index;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HelloStep {
    @Steps
    Index index;
    @Steps
    Login login;

    @Given("I set an url api for index")
    public void iSetAnUrlApiForIndex() {
        index.setUrlIndex();
    }

    @When("I request to index with valid token")
    public void iRequestToIndexWithValidToken() {
        index.requestIndexToken();
    }

    @Then("I will get code 200")
    public void iWillGetCode200() {
        login.validateStatusCode200();
    }

    @When("I request to index with invalid token")
    public void iRequestToIndexWithInvalidToken() {
        index.requestIndex();
    }

    @Then("I will get code 400")
    public void iWillGetCode400() {
        login.validateStatusCode400();
    }
}
