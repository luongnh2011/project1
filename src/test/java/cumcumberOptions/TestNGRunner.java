package cumcumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue="StepDefinitions", monochrome=true)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	

}
