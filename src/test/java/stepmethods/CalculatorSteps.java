package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import io.cucumber.java.sl.In;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator")
    public void i_am_on_the_calculator() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calculatorPO.enterValueIntoCalculator(int1);
        calculatorPO.clickPlusButton();
        calculatorPO.enterValueIntoCalculator(int2);
        calculatorPO.clickEqualsButton();
    }

    @Then("the result is {int}")
    public void the_result_is(Integer int3) {
        Assertions.assertEquals(int3.toString(), calculatorPO.readResults());
    }
}