package testRunner;

//import dsportal_Commons.DataProvider;
import dsportal_Commons.ExcelReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features/Tree.feature", glue = "dsportal_stepdtefinitions")
public class testRunner extends AbstractTestNGCucumberTests  {
	
	

}
