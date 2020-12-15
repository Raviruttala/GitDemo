package cucmberOptions;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\\\Login.feature",
		glue = "stepDefinationFile"
		)
public class TestRunner  extends AbstractTestNGCucumberTests{

}
