package stepdefinitions;

import features.Cart.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CartStepDefinitions {
    @Steps
    GetAllCart getAllCart;
    GetASingleCart getASingleCart;
    LimitResultsCart limitResultsCart;
    SortResultsCart sortResultsCart;
    AddNewCart addNewCart;

    @Given("I set url api to get all cart")
    public void iSetUrlApiToGetAllCart() {
        getAllCart.setUrlGetAllCart();
    }
    @When("I request get all cart")
    public void iRequestGetAllCart() {
        getAllCart.requestGetAllCart();
    }

    @Given("I set url api to Get a single cart")
    public void iSetUrlApiToGetASingleCart() {
        getASingleCart.setUrlGetSingleCart();
    }

    @Given("I set url api to Get Limit results cart")
    public void iSetUrlApiToGetLimitResultsCart() {
        limitResultsCart.setUrlLimitCart();
    }

    @When("I request Get Limit results cart")
    public void iRequestGetLimitResultsCart() {
        limitResultsCart.requestLimitCart();
    }

    @Given("I set url api to Get Sort results cart")
    public void iSetUrlApiToGetSortResultsCart() {
        sortResultsCart.setUrlSortCart();
    }

    @When("I request Get Sort results cart")
    public void iRequestGetSortResultsCart() {
        sortResultsCart.requestSortCart();
    }

    @Given("I set url api Add new cart")
    public void iSetUrlApiAddNewCart() {
        addNewCart.setUrlAddNewCart();
    }

    @And("I set userId, date, products")
    public void iSetUserIdDateProducts() {
        addNewCart.setBodyAddNewCart();
    }

    @When("I request Get Add new cart")
    public void iRequestGetAddNewCart() {
        addNewCart.requestAddNewCart();
    }
}
