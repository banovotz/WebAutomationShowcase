package stepmethods;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.CalculatorPO;
import runtest.Settings;


public class Calculator {
    CalculatorPO calculatorPO;

    @Before

    @Given("I am on the calculator")
    public void i_am_on_the_calculator() {
       calculatorPO = new CalculatorPO();
        Assert.assertEquals("Calculator", calculatorPO.pageTitle());



    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calculatorPO.enterFirstAdder();
        calculatorPO.clickPlusButton();
        calculatorPO.enterSecondAdder();
        calculatorPO.clickEqualsButton();
    }

    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        Assert.assertEquals("3", calculatorPO.readResults());
    }

}
