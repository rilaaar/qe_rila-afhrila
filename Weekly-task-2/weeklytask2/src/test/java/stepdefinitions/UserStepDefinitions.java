package stepdefinitions;

import features.User.AddNewUser;
import features.User.DeleteAUser;
import features.User.GetAllUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinitions {
    @Steps
    GetAllUser getAllUser;
    AddNewUser addNewUser;
    DeleteAUser deleteAUser;

    @Given("I set url api to get all users")
    public void iSetUrlApiToGetAllUsers() {
        getAllUser.setUrlGetAllUser();
    }

    @When("I request get all users")
    public void iRequestGetAllUsers() {
        getAllUser.requestGetAllUser();
    }

    @Given("I set url api Add new user")
    public void iSetUrlApiAddNewUser() {
        addNewUser.setUrlAddNewUser();
    }

    @And("I set email, username, address, phone")
    public void iSetEmailUsernameAddressPhone() {
        addNewUser.setBodyAddNewUser()
    }

    @When("I request Get Add new user")
    public void iRequestGetAddNewUser() {
        addNewUser.requestAddNewUser();
    }

    @Given("I set url api delete user")
    public void iSetUrlApiDeleteUser() {
        deleteAUser.setUrlDeleteUser();
    }

    @When("I request Get delete user")
    public void iRequestGetDeleteUser() {
        deleteAUser.requestDeleteUser();
    }
}
