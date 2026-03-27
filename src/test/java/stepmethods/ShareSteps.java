package stepmethods;

import runtest.SetDriver;
import runtest.Settings;


import cucumber.api.java.Before;
import cucumber.api.java.After;



public class ShareSteps extends SetDriver{
    @Before()
    public void SetUp(){

        initializeFirefoxDriver(false);
        driver.navigate().to(Settings.CALCULATOR_HOME);
    }



  @After()
    public void TearDown()  {


        SetDriver.quitDriver();


    }

}