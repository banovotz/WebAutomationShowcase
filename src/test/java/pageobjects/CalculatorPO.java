package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import runtest.SetDriver;

public class CalculatorPO {
    private WebDriver driver;
    private WebDriverWait wait;
    // Locators (Example IDs - update to match your actual app)
    private By firstAdder = By.id("button01");
    private By secondAdder = By.id("button02");
    private By plusButton= By.id("buttonplus");
    private By equalsButton = By.id("buttonequals");
    private By resultArea = By.id("calculated-display");

    public CalculatorPO() {
        this.driver = SetDriver.driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
    }

    public void enterFirstAdder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstAdder));
    }

    public void clickPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(plusButton)).click();
    }

    public void enterSecondAdder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondAdder));
    }

    public void clickEqualsButton() {
        driver.findElement(equalsButton).click();
    }

    public String readResults() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultArea)).getText();
    }

    public String pageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // This waits until the title is actually populated
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
        return driver.getTitle();
    }
}