package stepmethods;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorSumDoubleSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator to sum decimal numbers")
    public void i_am_on_the_calculator_to_sum_decimal_numbers() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I add decimal number {double} and {double}")
    public void i_add_and(Double double1, Double double2) {
        calculatorPO.enterDoubleValueIntoCalculator(double1);
        calculatorPO.enterOperationIntoCalculator("plus");
        calculatorPO.enterDoubleValueIntoCalculator(double2);
        calculatorPO.enterOperationIntoCalculator("equals");
    }

    @Then("the sum of decimal numbers is {double}")
    public void the_sum_of_decimal_numbers_is(Double double3) {
        Assertions.assertEquals(double3.toString(), calculatorPO.readResults());
    }
}