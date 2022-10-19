package com.example.steps;

import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HistoryStepDefinitions {
    CalculatorPage calculatorPage = new CalculatorPage();
    Calculator calculator = new Calculator();

    @And("I click plus")
    public void iClickPlus() {
        calculator.clickPlus();

    }

    @And("I click one number again")
    public void iClickOneNumberAgain() {
        calculator.clickNumberTwo();
    }

    @Then("I click equel")
    public void iClickEquel() {
        calculator.clickEquel();
    }

    @And("I can manage my history page")
    public void iCanManageMyHistoryPage() {
        calculatorPage.clickHistoryBtn();
        calculatorPage.hisHeaderDisplayed();
    }
}
