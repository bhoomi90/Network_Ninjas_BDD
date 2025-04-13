package dsportal_stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import dsportal_DriverFactory.PageDriverFactory;
import dsportal_Page.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefinition {
	
	static WebDriver driver;
	static CommonPage common;
	
	public static void setUpCommonPage() {
		//this.driver = PageDriverFactory.driver ;
		common = new CommonPage(driver);
	}
	
	public static void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	       @Given("The user is in the Home page after Sign in")
	       public void the_user_is_in_the_home_page_after_sign_in() {

	    	driver = PageDriverFactory.getChromeDriver();	    	
	   		driver.get("https://dsportalapp.herokuapp.com/");
	   		driver.manage().window().maximize();
	   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	   
	   		if(common==null) setUpCommonPage();
	   		common.login();
	   		
	       }

	       @When("The user clicks Try Here>>> button")
	       public void the_user_clicks_try_here_button() {
	    	   common.tryHere_page();
	       }
	       
	   	@When("The user enters the Empty in text editor and clicks RUN Button")
		public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
		    common.emptyCode();
		    
		}

	   	
		@When("The user enters the Valid code in text editor and clicks RUN Button")
		public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
		    common.validCode();
		    
		}



		@When("The user enters the Invalid code in text editor and clicks RUN Button")
		public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() {
		    
		    
		}
	       @Then("The Error message in alert window should be displayed")
	       public void the_error_message_in_alert_window_should_be_displayed() {
	       
	       
	       }

	       @Then("The displayed in the console should be displayed")
	       public void the_displayed_in_the_console_should_be_displayed() {
	       
	       
	       }


       @Then("The nameerror pop up alert message should be displayed")
       public void the_nameerror_pop_up_alert_message_should_be_displayed() {


       }

       @Given("The user is in the blank Practice page")
       public void the_user_is_in_the_blank_practice_page() {


       }

       @When("The user clicks Sign out")
       public void the_user_clicks_sign_out() {
    	   if(common==null) setUpCommonPage();
    	   common.signOut();
    	   if(driver != null) teardown();
       }

}
