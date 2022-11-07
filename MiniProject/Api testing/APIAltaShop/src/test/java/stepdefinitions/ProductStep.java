package stepdefinitions;

import features.Auth.Login;
import features.Product.DeleteProduct;
import features.Product.GetAllProduct;
import features.Product.NewProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductStep {
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    NewProduct newProduct;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    Login login;

    @Given("I set an url api for get all product")
    public void iSetAnUrlApiForGetAllProduct() {
        getAllProduct.setUrlGetAllProduct();
    }

    @When("I request to get all product with valid token")
    public void iRequestToGetAllProductWithValidToken() {
        getAllProduct.requestGetAllProductToken();
    }

    @When("I request to get all product with invalid token")
    public void iRequestToGetAllProductWithInvalidToken() {
        getAllProduct.requestGetAllProduct();
    }

    @Given("I set an url api for Create a new product")
    public void iSetAnUrlApiForCreateANewProduct() {
        newProduct.setUrlNewProduct();
    }

    @When("I set {string} name product {string} description product {int} price product {int} categories product")
    public void iSetNameProductDescriptionProductPriceProductCategoriesProduct(String nameproduct, String descriptionproduct, Integer priceproduct, Integer categoriesproduct) {
        newProduct.setBodyData(nameproduct, descriptionproduct, priceproduct, categoriesproduct);
    }

    @Then("I request to create a new product")
    public void iRequestToCreateANewProduct() {
        newProduct.requestNewProduct();
    }

    @And("I will get {string} result")
    public void iWillGetResult(String result) {
        if(result.equals("Failed")) {
            newProduct.validateStatusCode500();
        }
        else if(result.equals("Success")) {
            login.validateStatusCode200();
        }
    }

    @Given("I set an url api for Delete a product")
    public void iSetAnUrlApiForDeleteAProduct() {
        deleteProduct.setUrlDelProduct();
    }

    @When("I request to Delete a product with valid token")
    public void iRequestToDeleteAProductWithValidToken() {
        deleteProduct.requestDelProductToken();
    }

    @When("I request to Delete a product with invalid token")
    public void iRequestToDeleteAProductWithInvalidToken() {
        deleteProduct.requestDelProduct();
    }

    @Then("I will get code 404")
    public void iWillGetCode404() {
        deleteProduct.validateStatusCode404();
    }

    @When("I set {string} name product {string} description product")
    public void iSetNameProductDescriptionProduct(String arg0, String arg1) {
    }

}
