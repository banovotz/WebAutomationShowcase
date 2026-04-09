package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorMultiplicationSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator to multiply")
    public void i_am_on_the_calculator_to_multiply() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I multiply {int} and {int}")
    public void i_multiply_and(Integer int1, Integer int2) {
        calculatorPO.enterValueIntoCalculator(int1);
        calculatorPO.enterOperationIntoCalculator("multiply");
        calculatorPO.enterValueIntoCalculator(int2);
        calculatorPO.clickEqualsButton();
    }

    @Then("the multiplication result is {int}")
    public void the_multiplication_result_is(Integer int3) {
        Assertions.assertEquals(int3.toString(), calculatorPO.readResults());
    }
}