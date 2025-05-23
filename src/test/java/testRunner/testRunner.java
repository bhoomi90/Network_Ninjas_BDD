package testRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsportal_utilities.ConfigReader;
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
				features = {"src/test/resources/features"}, 				
				tags="@overall",
				glue= {"dsportal_stepdefinitions","dsportal_DriverFactory"}) //location of step definition files

		public class testRunner extends AbstractTestNGCucumberTests{	
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }
			
			@BeforeTest
			@Parameters({ "browser" })
			public void defineBrowser(String browser) throws Throwable {
				ConfigReader.setBrowserType(browser);
			}
		}