package com.example.steps;

import com.example.app.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStep {
    @Steps
    HomePage homePage;

    @When("I click buy button")
    public void iClickBuyButton() {
        homePage.clickBtnP1();
    }

    @Then("The product success added to cart")
    public void theProductSuccessAddedToCart() {
    }

    @And("I click buy button in other product")
    public void iClickBuyButtonInOtherProduct() {
        homePage.clickBtnP2();
    }
}
