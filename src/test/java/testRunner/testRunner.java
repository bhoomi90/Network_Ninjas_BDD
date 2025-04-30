package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"pretty", "html:target/cucumber/cucumber-reports.html",
						"json:target/cucumber/Cucumber.json",
						"com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				},
						
				monochrome=true,  //console output color
				//features = {"src/test/resources/features"}, //location of feature files
				features = {"src/test/resources/features/Login.feature", 
						"src/test/resources/features/LinkedList.feature",
						"src/test/resources/features/stacks.feature",
						"src/test/resources/features/Tree.feature",
						"src/test/resources/features/Graph.feature",
						"src/test/resources/features/DataStructure.feature",
						}, 
				glue= {"dsportal_stepdefinitions","dsportal_DriverFactory"}) //location of step definition files

		public class testRunner extends AbstractTestNGCucumberTests{	
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }
		}