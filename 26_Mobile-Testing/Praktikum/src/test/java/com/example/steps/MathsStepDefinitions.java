package com.example.steps;

import com.example.app.pages.CalculatorPage;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.app.Calculator;

public class MathsStepDefinitions {

//    int a = 0;
//    int b = 0;
//    int total = 0;

    Calculator calculator = new Calculator();
    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("a is 1")
    public void givenAIs1() {
//        a = value;
        calculatorPage.clickNumberOne();
        calculator.clickAc();
    }

    @Given("b is 2")
    public void givenBIs2() {
//        b = value;
        calculator.clickNumberTwo();
        calculator.clickAc();
    }

    @When("I add a and b")
    public void iAddAAndB() {
//        total = calculator.add(a,b);
        calculatorPage.clickNumberOne();
        calculator.clickPlus();
        calculator.clickNumberTwo();
    }

    @Then("the total should be 3")
    public void theTotalShouldBe3() {
//        assertThat(total).isEqualTo(expectedTotal);
        calculatorPage.numDisplayed();
    }

}
