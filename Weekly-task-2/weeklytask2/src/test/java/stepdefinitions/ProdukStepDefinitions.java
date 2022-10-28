package stepdefinitions;

import Product.*;
import features.Product.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProdukStepDefinitions {
    @Steps
    GetAllProduct getAllProduct;
    GetASingleProduct getASingleProduct;
    LimitResultsProduct limitResultsProduct;
    SortResultsProduct sortResultsProduct;
    AddNewProduct addNewProduct;


    @Given("I set url api to get all product")
    public void iSetUrlApiToGetAllProduct() {
        getAllProduct.setUrlGetAllProduct();
    }

    @When("I request get all product")
    public void iRequestGetAllProduct() {
        getAllProduct.requestGetAllProduct();
    }

    @Given("I set url api to Get a single product")
    public void iSetUrlApiToGetASingleProduct() {
        getASingleProduct.setUrlGetSingleProduct();
    }

    @When("I request Get a single product")
    public void iRequestGetASingleProduct() {
        getASingleProduct.requestGetSingleProduct();
    }

    @Given("I set url api to Get Limit results")
    public void iSetUrlApiToGetLimitResults() {
        limitResultsProduct.setUrlLimitProduct();
    }

    @When("I request Get Limit results")
    public void iRequestGetLimitResults() {
        limitResultsProduct.requestLimitProduct();
    }

    @Given("I set url api to Get Sort results")
    public void iSetUrlApiToGetSortResults() {
        sortResultsProduct.setUrlSortProduct();
    }

    @When("I request Get Sort results")
    public void iRequestGetSortResults() {
        sortResultsProduct.requestSortProduct();
    }

    @Given("I set url api Add new product")
    public void iSetUrlApiAddNewProduct() {
        addNewProduct.setUrlAddNewProduct();
    }

    @When("I request Get Add new product")
    public void iRequestGetAddNewProduct() {
        addNewProduct.requestAddNewProduct();
    }

    @And("I set title, price, desc, image and category")
    public void iSetTitlePriceDescImageAndCategory() {
        addNewProduct.setBodyAddNewProduct();
    }
}
