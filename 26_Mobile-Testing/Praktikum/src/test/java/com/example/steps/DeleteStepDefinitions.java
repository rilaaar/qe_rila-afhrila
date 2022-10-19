package com.example.steps;

import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import com.example.app.pages.HistoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteStepDefinitions {
    HistoryPage historyPage = new HistoryPage();
    CalculatorPage calculatorPage = new CalculatorPage();
    Calculator calculator = new Calculator();
    @Given("I am on the history page")
    public void iAmOnTheHistoryPage() {
        calculatorPage.calculatorHeaderDisplayed();
        calculatorPage.clickNumberOne();
        calculator.clickPlus();
        calculator.clickNumberTwo();
        calculator.clickEquel();
        calculatorPage.clickHistoryBtn();
        calculatorPage.hisHeaderDisplayed();
    }

    @When("I click delete button")
    public void iClickDeleteButton() {
        historyPage.clickDelBtn();
    }

    @Then("the history can deleted")
    public void theHistoryCanDeleted() {
        calculatorPage.clickHistoryBtn();
        historyPage.empHeaderDisplayed();
    }
}
