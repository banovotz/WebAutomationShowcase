package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorMemorySteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator to memoryplus")
    public void i_am_on_the_calculator_to_memoryplus() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I add {int} to memory")
    public void i_add_to_memory(Integer int1) {
        calculatorPO.enterValueIntoCalculator(int1);
        calculatorPO.enterOperationIntoCalculator("memoryplus");
    }

    @And("I enter some number such as {int}")
    public void i_enter_some_number_such_as(Integer int2) {
        calculatorPO.enterValueIntoCalculator(int2);

    }


    @Then("the number {int} is in memory")
    public void the_number_is_in_memory(Integer expected) {
        calculatorPO.enterOperationIntoCalculator("memoryrecall");
        Assertions.assertEquals(expected.toString(), calculatorPO.readResults());
    }
}