package com.example.steps;

import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickNumberStepDefinitions {
    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("I am on the calculator page")
    public void iAmOnTheCalculatorPage() {
        calculatorPage.calculatorHeaderDisplayed();
    }

    @When("I click one number")
    public void iClickOneNumber() {
        calculatorPage.clickNumberOne();
    }

    @Then("the number can displayed in the screen")
    public void theNumberCanDisplayedInTheScreen() {
        calculatorPage.numDisplayed();
    }
}
