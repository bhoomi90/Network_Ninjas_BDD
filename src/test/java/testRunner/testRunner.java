package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "dsportal_stepdtefinitions", plugin = { "pretty",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }

)
public class testRunner {
	// No need for a main method; execution is handled by JUnit.

}
