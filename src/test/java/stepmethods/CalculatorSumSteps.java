package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorSumSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator to sum")
    public void i_am_on_the_calculator_to_sum() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calculatorPO.enterValueIntoCalculator(int1);
        calculatorPO.enterOperationIntoCalculator("plus");
        calculatorPO.enterValueIntoCalculator(int2);
        calculatorPO.enterOperationIntoCalculator("equals");
    }

    @Then("the sum is {int}")
    public void the_sum_is(Integer int3) {
        Assertions.assertEquals(int3.toString(), calculatorPO.readResults());
    }
}