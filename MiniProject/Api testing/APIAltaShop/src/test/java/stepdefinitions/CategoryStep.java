package stepdefinitions;

import features.Auth.Login;
import features.Categories.CategoriesById;
import features.Categories.CreateCategory;
import features.Categories.GetAllCategories;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoryStep {
    @Steps
    GetAllCategories getAllCategories;
    @Steps
    CreateCategory createCategory;
    @Steps
    CategoriesById categoriesById;
    @Steps
    Login login;

    @Given("I set an url api for get all categories")
    public void iSetAnUrlApiForGetAllCategories() {
        getAllCategories.setUrlGetAllCategories();
    }

    @When("I request to get all categories with valid token")
    public void iRequestToGetAllCategoriesWithValidToken() {
        getAllCategories.requestGetAllCategoriesToken();
    }

    @When("I request to get all categories with invalid token")
    public void iRequestToGetAllCategoriesWithInvalidToken() {
        getAllCategories.requestGetAllCategories();
    }

    @Given("I set an url api for Create a category")
    public void iSetAnUrlApiForCreateACategory() {
        createCategory.setUrlCreateCategory();
    }

    @When("I set {string} name category and {string} description category")
    public void iSetNameCategoryAndDescriptionCategory(String namecategory, String descriptioncategory) {
        createCategory.setBodyData(namecategory, descriptioncategory);
    }
    @Then("I request to create a category")
    public void iRequestToCreateACategory() {
        createCategory.requestCreateCategory();
    }

    @Given("I set an url api for get categories  by ID")
    public void iSetAnUrlApiForGetCategoriesByID() {
        categoriesById.setUrlCategoriesById();
    }

    @When("I request to get categories by ID with valid token")
    public void iRequestToGetCategoriesByIDWithValidToken() {
        categoriesById.requestCategoriesByIdToken();
    }

    @When("I request to get categories by ID with invalid token")
    public void iRequestToGetCategoriesByIDWithInvalidToken() {
        categoriesById.requestCategoriesById();
    }

    @And("I will get {string} category")
    public void iWillGetCategory(String result) {
        if(result.equals("Failed")) {
            createCategory.validateStatusCode500();
        }
        else if(result.equals("Success")) {
            login.validateStatusCode200();
        }
    }
}
