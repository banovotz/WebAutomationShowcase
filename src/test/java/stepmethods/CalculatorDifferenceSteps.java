package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorDifferenceSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator to minus")
    public void i_am_on_the_calculator_to_minus() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I substract {int} and {int}")
    public void i_substract_and(Integer int1, Integer int2) {
        calculatorPO.enterValueIntoCalculator(int1);
        calculatorPO.enterOperationIntoCalculator("minus");
        calculatorPO.enterValueIntoCalculator(int2);
        calculatorPO.enterOperationIntoCalculator("equals");
    }

    @Then("the difference is {int}")
    public void the_difference_is(Integer int3) {
        Assertions.assertEquals(int3.toString(), calculatorPO.readResults());
    }
}