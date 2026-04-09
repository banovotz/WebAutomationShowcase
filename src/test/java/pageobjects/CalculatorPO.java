package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import runtest.SetDriver;

public class CalculatorPO {
    private WebDriver driver;
    private WebDriverWait wait;

   String numberElement;

    private By plusButton= By.id("buttonplus");
    private By equalsButton = By.id("buttonequals");
    private By resultArea = By.id("calculated-display");




    public CalculatorPO() {
        this.driver = SetDriver.driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    public void enterValueIntoCalculator(int value) {
        String valueStr = String.valueOf(value);

        // Loop through each digit in the number and click the corresponding button
        for (char digit : valueStr.toCharArray()) {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("button0" + digit))).click();
        }
    }



    public void clickPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(plusButton)).click();
    }


    public void clickEqualsButton() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(equalsButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public String readResults() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(resultArea)).getAttribute("value");
    }

    public String pageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
        return driver.getTitle();
    }
}