package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgo.html"},
						//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
				monochrome=false,  //console output color
				//features = {"src/test/resources/features"}, //location of feature files
				features = {"src/test/resources/features/stacks.feature", 
						"src/test/resources/features/LinkedList.feature",
						"src/test/resources/features/Tree.feature"}, //location of feature files
				glue= {"dsportal_stepdefinitions","dsportal_Core"}) //location of step definition files


		public class testRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }
		}