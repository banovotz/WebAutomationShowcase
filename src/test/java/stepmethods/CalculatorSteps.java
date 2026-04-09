package stepmethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pageobjects.CalculatorPO;

public class CalculatorSteps {
    CalculatorPO calculatorPO = new CalculatorPO();

    @Given("I am on the calculator")
    public void i_am_on_the_calculator() {
        Assertions.assertEquals("Button Calculator UI Testing App | Test Pages", calculatorPO.pageTitle());
    }

    @When("I add one and two")
    public void i_add_one_and_two() {
        calculatorPO.enterFirstAdder();
        calculatorPO.clickPlusButton();
        calculatorPO.enterSecondAdder();
        calculatorPO.clickEqualsButton();
    }

    @Then("the result is three}")
    public void the_result_is_three(Integer expected) {
        Assertions.assertEquals(3, calculatorPO.readResults());
    }
}