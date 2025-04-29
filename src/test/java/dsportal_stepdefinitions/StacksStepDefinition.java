package dsportal_stepdefinitions;


import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.CommonPage;
import dsportal_Page.StackPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StacksStepDefinition extends DriverManager {

	static StackPage stack;
	static CommonPage cp;
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String stackPageURL = homePageURL+"stack/";
	String operationInStackURL = stackPageURL+"operations-in-stack/";
	String implementationURL = stackPageURL+"implementation/";
	String applicationsURL = stackPageURL+"stack-applications/";
	
	public static void setUpStackPage() {
		stack = new StackPage(driver);			
	}
	
	public static void setUpCommonPage() {
		cp = new CommonPage(driver);
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
 
  		if(cp==null) {
  			LoggerReader.info("Create constructor for Common page");
  			setUpCommonPage();
  		}

  		cp.login();	   		
	}
	
	@When("The user clicks the Get Started button in Stack Panel or The user select Stack item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_stack_panel_or_the_user_select_stack_item_from_the_drop_down_menu() {
		if(stack==null) {
			LoggerReader.info("Create constructor for Stack page");
			setUpStackPage();
		}
	    stack.getStarted_stack_page();
	}

	@Then("The user is directed to Stack Data Structure Page")
	public void the_user_is_directed_to_stack_data_structure_page() {
		   currentPageUrl = stack.getCurrentUrl();
		   expectedPageUrl = stackPageURL;
		   LoggerReader.info("The user is able to directed to stack page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to stack page");
	}

	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {
		pageTitle =stack.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Stack");
	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
		
	    stack.operationInStack_page();
	    LoggerReader.info("Clicked Operations in Stack button");
	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
		   currentPageUrl = stack.getCurrentUrl();
		   expectedPageUrl = operationInStackURL;
		   LoggerReader.info("The user is able to directed to Operations in stack page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Operations in stack page");
	}

	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		pageTitle = stack.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Operations in Stack");    
	}


    @When("The user clicks Try Here>>> button")
    public void the_user_clicks_try_here_button() {
       cp.tryHere_page();
    }
    
   	@Then("Navigate to try Editor window with a Run button to test")
	public void navigate_to_try_editor_window_with_a_run_button_to_test() {
		   currentPageUrl = driver.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		   LoggerReader.info("The user is able to directed to try Editor window" +currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to try Editor window");		    		    
	}
   	
	@Given("The user is on the tryEditor window in Stack page")
	public void the_user_is_on_the_try_editor_window_in_stack_page() {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Assessment");    	    	    
	}

   	@When("The user enters the Empty in text editor and clicks RUN Button")
	public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
	    cp.emptyCode();		    
	}
   	
	@Then("The Error message in alert window should be displayed")
	public void the_error_message_in_alert_window_should_be_displayed() {
		Assert.assertFalse(cp.isAlertPresent(cp.driver), "Alert displayed for empty code");
		LoggerReader.error("Test failed: No python code entered. Expected to get alert");	       	       
	}
	
	@When("The user enters the Valid code in text editor and clicks RUN Button")
	public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() throws IOException {
		driver.navigate().refresh();
	    cp.validCode();		    
	}
	
	@Then("The displayed in the console should be displayed")
	public void the_displayed_in_the_console_should_be_displayed() {
		LoggerReader.info("Valid python code entered");
		Assert.assertNotEquals(cp.isAlertPresent(cp.driver), true, "Alert displayed for valid python code");    	       
	}
	
	@When("The user enters the Invalid code in text editor and clicks RUN Button")
	public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() throws IOException {
		driver.navigate().refresh();
	    cp.invalidCode();    
	}
	
    @Then("The nameerror pop up alert message should be displayed")
    public void the_nameerror_pop_up_alert_message_should_be_displayed() {
		LoggerReader.info("Invalid python code entered");
		Assert.assertEquals(cp.isAlertPresent(cp.driver), true, "No alert displayed for invalid python code");	
		Alert alert = driver.switchTo().alert();
		LoggerReader.info(alert.getText());
		//Thread.sleep(2000);
		alert.accept();  //click ok button
    }

   	@When("The user clicks Practice Questions button following browser back arrow")
   	public void the_user_clicks_practice_questions_button_following_browser_back_arrow() {
   	    driver.navigate().back();
   	    //Thread.sleep(1000);
   	    cp.practiceQue_page();
   	}
  
	@Then("The user is navigated to Practice Questions page")
	public void the_user_is_navigated_to_practice_questions_page() {
	    Assert.assertFalse(cp.practiceQue_content(), "No questions on practice que page");
	    LoggerReader.error("Test failed: Found the page blank. Expected to navigate to Practice Questions");
	}
	
    @Given("The user is in the blank Practice page")
    public void the_user_is_in_the_blank_practice_page() {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");   
    }   
    
	@When("The user select Stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
	    stack.dropdown_stack_page();	    
	}

	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() {
	    stack.implementation_page();	    
	}

	@Then("The user should be redirected to Implementation page")
	public void the_user_should_be_redirected_to_implementation_page() {
		   currentPageUrl = stack.getCurrentUrl();
		   expectedPageUrl = implementationURL;
		   LoggerReader.info("The user is able to directed to Implementation page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Implementation page");	    	    
	}

	@Given("The user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
		pageTitle = stack.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation"); 	    	    
	}

	@When("The user clicks Applications button")
	public void the_user_clicks_Applications_button() {
	    stack.application_page();	    
	}
	
	@Then("The user should be redirected to Applications in Stack page")
	public void the_user_should_be_redirected_to_applications_in_stack_page() {
		   currentPageUrl = stack.getCurrentUrl();
		   expectedPageUrl = applicationsURL;
		   LoggerReader.info("The user is able to directed to Applications page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Applications page");		    	    
	}

	@Given("The user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
		pageTitle = stack.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Applications"); 	    	    
	}

	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {
		pageTitle =stack.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Stack");			
	}

	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {		
		cp.signOut();   	
	}
	       
	@Then("The user should be redirected to home page with message Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
	    cp.compareLogoutMsg();     	
   	}
}
