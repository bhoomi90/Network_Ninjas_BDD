//package dsportal_stepdefinitions;
//
//import dsportal_DriverFactory.DriverManager;
//import dsportal_Page.LoginPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefinition extends DriverManager {
//	
//	
//	static LoginPage login_page;
//	
//	public static void setUpLoginPage() {
//		login_page = new LoginPage(driver);
//	}
//     
//	
//	
//	@Given("The user is on the DS Algo Home Page")
//	public void the_user_is_on_the_ds_algo_home_page() {
//	  
//		
//	}
//
//	@When("The user should click the Sign in link")
//	public void the_user_should_click_the_sign_in_link() {
//	    
//	}
//
//	@Then("The user should be redirected to Sign in page")
//	public void the_user_should_be_redirected_to_sign_in_page() {
//	    
//	}
//	
//	@Given("The user is on the DS Algo Sign in Page")
//	public void the_user_is_on_the_ds_algo_sign_in_page() {
//	    
//	}
//
//	@When("The user enter username Empty and password Empty")
//	public void the_user_enter_username_empty_and_password_empty() {
//	    
//	}
//
//	@Then("The user should get Please fill out this field")
//	public void the_user_should_get_please_fill_out_this_field() {
//	    
//	}
//
//	@When("The user enter username Empty and password Valid Password")
//	public void the_user_enter_username_empty_and_password_valid_password() {
//	    
//	}
//
//	@When("The user enter username Valid Username and password Empty")
//	public void the_user_enter_username_valid_username_and_password_empty() {
//	    
//	}
//
//	@When("The user enter username Invalid Username and password Valid Password")
//	public void the_user_enter_username_invalid_username_and_password_valid_password() {
//	   
//	}
//
//	@Then("The user should get Invalid username and password")
//	public void the_user_should_get_invalid_username_and_password() {
//	   
//	}
//
//	@When("The user enter username Valid Username and password Invalid Password")
//	public void the_user_enter_username_valid_username_and_password_invalid_password() {
//	    
//	}
//
//	@When("The user enter username Invalid Username and password Invalid Password")
//	public void the_user_enter_username_invalid_username_and_password_invalid_password() {
//	   
//	}
//
//	@When("The user enter username Valid Username and password Valid Password")
//	public void the_user_enter_username_valid_username_and_password_valid_password() {
//		if(login_page==null) {
//			setUpLoginPage();
//		}
//		login_page.get_login();
//		
//		
//	}
//
//	@Then("The user should get You are logged in and directing to Home page")
//	public void the_user_should_get_you_are_logged_in_and_directing_to_home_page() {
//	   
//	}
//
//	@Given("The user is in the Home page after Sign out")
//	public void the_user_is_in_the_home_page_after_sign_out() {
//	    
//	}
//
//	@When("The user clicks Sign out")
//	public void the_user_clicks_sign_out() {
//		login_page.sign_out();
//	}
//
//	@Then("The user should be redirected to home page with message Logged out successfully")
//	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
//	   
//	}
//}

package dsportal_stepdefinitions;

import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends DriverManager {
	
	
	static LoginPage lp;
	 
	
	String pageTitle, currentPageUrl, expectedPageUrl ;
//	String homePageURL = "https://dsportalapp.herokuapp.com/";
	
	public static void setUpLoginPage() {
		lp = new LoginPage(driver);
	}
     
	
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
//		pageTitle = lp.getCurrentTitle();
//		expectedPageUrl = homePageURL;
//		LoggerReader.info("The user is directed to Home page: "+currentPageUrl);
//		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Home page");
		
	}


	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    lp.sign_in();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
//		pageTitle = lp.getCurrentTitle();
//		Assert.assertEquals(pageTitle, " Login ");
	}
	
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
//		pageTitle = lp.getCurrentTitle();
//		Assert.assertEquals(pageTitle, " Login ");
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

	@When("The user enter valid username  and valid password")
	public void the_user_enter_valid_username_and_valid_password() {
	    
	}
	@Then("The user should get You are logged in message")
	public void the_user_should_get_you_are_logged_in_message() {
		LoggerReader.info("You are logged in");
	}

	@Then("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		if(lp==null) setUpLoginPage();
		lp.get_login();
	}

	@Given("The user is in the Home page after Sign out")
	public void the_user_is_in_the_home_page_after_sign_out() {
		pageTitle = lp.getCurrentTitle();
		Assert.assertEquals(pageTitle, " Home ");
	}

	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {
		lp.sign_out();
	}

	@Then("The user should be redirected to home page with message Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
	   lp.compareLogoutMsg();
	}
}
