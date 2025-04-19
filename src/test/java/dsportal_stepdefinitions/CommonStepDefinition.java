package dsportal_stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import dsportal_Core.BrowserManager;
import dsportal_Page.CommonPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefinition extends BrowserManager {
	
	static CommonPage common;
	
	public static void setUpCommonPage() {
		common = new CommonPage(driver);
	}	
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
 
  		if(common==null) {
  			LoggerReader.info("Create constructor for Common page");
  			setUpCommonPage();
  		}
  		common.login();	   		
	}

    @When("The user clicks Try Here>>> button")
    public void the_user_clicks_try_here_button() {
       common.tryHere_page();
    }
	       
   	@Then("Navigate to try Editor window with a Run button to test")
	public void navigate_to_try_editor_window_with_a_run_button_to_test() {
		    
		    
	}
	       
   	@When("The user enters the Empty in text editor and clicks RUN Button")
	public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
	    common.emptyCode();
		    
	}

	   	
	@When("The user enters the Valid code in text editor and clicks RUN Button")
	public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() throws IOException {
		driver.navigate().refresh();
	    common.validCode();
		    
	}

	@When("The user enters the Invalid code in text editor and clicks RUN Button")
	public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() throws IOException {
		driver.navigate().refresh();
	    common.invalidCode();    
	}
	
	@Then("The Error message in alert window should be displayed")
	public void the_error_message_in_alert_window_should_be_displayed() {
	       
	       
	}

	@Then("The displayed in the console should be displayed")
	public void the_displayed_in_the_console_should_be_displayed() {
	       
	       
	}


    @Then("The nameerror pop up alert message should be displayed")
    public void the_nameerror_pop_up_alert_message_should_be_displayed() {
		Alert alert = driver.switchTo().alert();
		LoggerReader.info(alert.getText());
		//Thread.sleep(2000);
		alert.accept();  //click ok button
    }

   	@When("The user clicks Practice Questions button following browser back arrow")
   	public void the_user_clicks_practice_questions_button_following_browser_back_arrow() {
   	    driver.navigate().back();
   	    //Thread.sleep(1000);
   	    common.practiceQue_page();
   	}
  
	@Then("The user is navigated to Practice Questions page")
	public void the_user_is_navigated_to_practice_questions_page() {
	    Assert.assertFalse(CommonPage.practiceQue_content(), "No questions on practice que page");
	    LoggerReader.error("Test failed: Found the page blank. Expected to navigate to Practice Questions");
	}
	
    @Given("The user is in the blank Practice page")
    public void the_user_is_in_the_blank_practice_page() {


    }   

    @When("The user clicks Sign out")
    public void the_user_clicks_sign_out() {
    	if(common==null) setUpCommonPage();
    	common.signOut();   	
    }
       
   	@Then("The user should be redirected to home page with message Logged out successfully")
   	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
   	    common.compareLogoutMsg();
     	
   	}
}
