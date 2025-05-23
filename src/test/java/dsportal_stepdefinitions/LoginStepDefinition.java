package dsportal_stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import dsportal_Page.CommonPage;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	LoginPage login_page = new LoginPage();
	CommonPage cp = new CommonPage();
	String pageTitle, currentPageUrl, expectedPageUrl;
	
	
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {

	    login_page.getStarted();
		pageTitle =login_page.getCurrentTitle();
		Assert.assertEquals(pageTitle, "NumpyNinja");
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    login_page.clickSignin();
	}
	
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		   currentPageUrl = login_page.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/login";
		   LoggerReader.info("The user is able to directed to sign in page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to sign in page");
	}
	
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		pageTitle =login_page.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Login");
	}

	@Then("The user should get Please fill out this field below username field")
	public void the_user_should_get_please_fill_out_this_field_below_username_field() {
		String actualMSG = login_page.getValidationMessage_username();
		String expectedMSG = "Please fill out this field.";
		Assert.assertEquals(actualMSG, expectedMSG, "Error message is not appeared");
		Assert.assertTrue(actualMSG.contains("Please fill out this field"));
	}
	

	@When("The user enter Empty username  and Empty password")
	public void the_user_enter_empty_username_and_empty_password() throws IOException, Throwable {
	    login_page.empty_fields();
	}

	@When("The user enter Empty username  and Valid Password password")
	public void the_user_enter_empty_username_and_valid_password_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.empty_valid_field();
	}

	@When("The user enter Invalid username  and Valid password")
	public void the_user_enter_invalid_username_and_valid_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.invalid_valid_field();
	}

	@Then("The user should get Invalid username and password below username field")
	public void the_user_should_get_invalid_username_and_password_below_username_field() {
		String actualMSG = login_page.compareAlertText();
		LoggerReader.info(actualMSG);
		String expectedMSG = "Invalid Username and Password";
		Assert.assertEquals(actualMSG, expectedMSG, "Error message is not appeared");		
	}

	@When("The user enter Valid username  and Invalid password")
	public void the_user_enter_valid_username_and_invalid_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.valid_invalid_field();
	}

	@When("The user enter Invalid username  and Invalid password")
	public void the_user_enter_invalid_username_and_invalid_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.invalid_invalid_field();
	}

	@When("The user enter valid username and empty password")
	public void the_user_enter_valid_username_and_empty_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.valid_empty_field();
	}

	@Then("The user should get expected_msg below password field")
	public void the_user_should_get_expected_msg_below_password_field() {
		String actualMSG = login_page.getValidationMessage_password();
		String expectedMSG = "Please fill out this field.";
		Assert.assertEquals(actualMSG, expectedMSG, "Error message is not appeared");
		Assert.assertTrue(actualMSG.contains("Please fill out this field"));
	}
	
	@When("The user enter Valid username and Valid password")
	public void the_user_enter_valid_username_and_valid_password() throws IOException, Throwable {
		login_page.clickSignin();
		login_page.valid_valid_field();
	}

	@Then("The user should get expected_msg {string}")
	public void the_user_should_get_expected_msg(String expectedMSG) {
		String actualMSG = login_page.compareLoginText();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Login info message is not appeared");
		pageTitle =login_page.getCurrentTitle();
		Assert.assertEquals(pageTitle, "NumpyNinja");
	}
	
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		   currentPageUrl = login_page.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/home";
		   LoggerReader.info("The user is able to directed to home page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to home page");
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