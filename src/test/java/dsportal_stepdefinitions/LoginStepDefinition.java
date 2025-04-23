package dsportal_stepdefinitions;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends DriverManager {
	
	
	static LoginPage login_page;
	
	public static void setUpLoginPage() {
		login_page = new LoginPage(driver);
	}
     
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
 
  		if(login_page==null) {
  			LoggerReader.info("Create constructor for Login page");
  			setUpLoginPage();
  		}
  		login_page.get_login();   		
	}	
//	@Given("The user is on the DS Algo Home Page")
//	public void the_user_is_on_the_ds_algo_home_page() {
//	  
//		if(login_page==null) setUpLoginPage();
//		login_page.get_login();
//	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    
	}
	
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
	    
	}

	@When("The user enter username Empty and password Empty")
	public void the_user_enter_username_empty_and_password_empty() {
	    
	}

	@Then("The user should get Please fill out this field")
	public void the_user_should_get_please_fill_out_this_field() {
	    
	}

	@When("The user enter username Empty and password Valid Password")
	public void the_user_enter_username_empty_and_password_valid_password() {
	    
	}

	@When("The user enter username Valid Username and password Empty")
	public void the_user_enter_username_valid_username_and_password_empty() {
	    
	}

	@When("The user enter username Invalid Username and password Valid Password")
	public void the_user_enter_username_invalid_username_and_password_valid_password() {
	   
	}

	@Then("The user should get Invalid username and password")
	public void the_user_should_get_invalid_username_and_password() {
	   
	}

	@When("The user enter username Valid Username and password Invalid Password")
	public void the_user_enter_username_valid_username_and_password_invalid_password() {
	    
	}

	@When("The user enter username Invalid Username and password Invalid Password")
	public void the_user_enter_username_invalid_username_and_password_invalid_password() {
	   
	}

	@When("The user enter username Valid Username and password Valid Password")
	public void the_user_enter_username_valid_username_and_password_valid_password() {
	    
	}

	@Then("The user should get You are logged in and directing to Home page")
	public void the_user_should_get_you_are_logged_in_and_directing_to_home_page() {
	   
	}

	@Given("The user is in the Home page after Sign out")
	public void the_user_is_in_the_home_page_after_sign_out() {
	    
	}

	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {
		login_page.sign_out();
	}

	@Then("The user should be redirected to home page with message Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
	   login_page.compareLogoutMsg();
	}
}