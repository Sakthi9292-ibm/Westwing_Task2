package testAutomation.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},glue={"testAutomation/StepDefinitions"},features ="src/main/java/testAutomation/Features",tags= {"@All"})
public class TestRunner {

}
