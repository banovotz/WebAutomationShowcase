package pageobjects;


import runtest.SetDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CalculatorPO extends SetDriver {
    @FindBy (id ="calculated-display")
    WebElement inputArea;

    @FindBy (id ="button01")
    WebElement buttonNumber1;

    @FindBy (id ="button02")
    WebElement buttonNumber2;

    @FindBy (id ="buttonplus")
    WebElement buttonPlus;

    @FindBy (id ="buttonequals")
    WebElement buttonEquals;



    public CalculatorPO() {
        PageFactory.initElements(driver, this);
    }

    public void enterFirstAdder() {buttonNumber1.click();}
    public void clickPlusButton() {buttonPlus.click();}
    public void enterSecondAdder() {buttonNumber2.click();}
    public void clickEqualsButton() {buttonEquals.click();}
    public String readResults() {return inputArea.getAttribute("value");}
    public String pageTitle() {return driver.getTitle();}



}
