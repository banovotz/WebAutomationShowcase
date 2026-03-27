package runtest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features/calculator.feature",

        glue = {"stepmethods"},

        plugin = {"pretty", "html:test-outout", "json:test-outout/report.json" },

        monochrome = true,

        junit = "--step-notifications",

        dryRun = false

        //tags = {"@ThirdScenario"}


)


public class RunTest {



}
