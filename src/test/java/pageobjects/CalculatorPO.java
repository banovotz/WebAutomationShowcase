package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import runtest.SetDriver;
import static java.lang.Character.isDigit;

public class CalculatorPO {
    private WebDriver driver;
    private WebDriverWait wait;

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


    public void enterDoubleValueIntoCalculator(Double value) {
        String valueStr = String.valueOf(value);
        // Loop through each digit in the number and click the corresponding button
        for (char digit : valueStr.toCharArray()) {
            if (Character.isDigit(digit)) {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button0" + digit)));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            } else {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("buttondot")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

            }
        }
    }

    public void enterOperationIntoCalculator(String operation) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button" + operation)));
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