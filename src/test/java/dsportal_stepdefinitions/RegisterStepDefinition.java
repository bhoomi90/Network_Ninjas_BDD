package dsportal_stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import dsportal_Page.RegisterPage;
import dsportal_utilities.ExcelReader;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition  {

	RegisterPage reg = new RegisterPage();
	String pageTitle, currentPageUrl, expectedPageUrl;
	String username, password, passwordconfirm;

	@Given("The user is on the ds portal  page")
	public void the_user_is_on_the_ds_portal_page() {
		reg.navigateTo();
	}

	@When("The user clicks get started on the Home page")
	public void the_user_clicks_get_started_on_the_home_page() {
		pageTitle = reg.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Numpy Ninja");
		reg.getStarted();
	}

	@Then("The user should be redirected to home page")
	public void the_user_should_be_redirected_to_home_page() {
		   currentPageUrl = reg.getCurrentUrl();
		   expectedPageUrl = reg.homePageURL;
		   LoggerReader.info("The user is able to directed to home page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to sign in page");
	}

	@Given("The user is on the ds portal home page")
	public void the_user_is_on_the_ds_portal_home_page() {
	
		if (reg.getCurrentTitle().equals("NumpyNinja")) {
			System.out.println("User is on the DS Algo portal.");
		}
	}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
		reg.register_initial();
	}

	@Then("The user should be redirected to Register page")
	public void the_user_should_be_redirected_to_register_page() {
		   currentPageUrl = reg.getCurrentUrl();
		   expectedPageUrl = reg.registerPageURL;
		   LoggerReader.info("The user is able to directed to register page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to sign in page");
	}

	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
		pageTitle = reg.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Registration");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() throws InterruptedException {
		reg.clickRegister(" ", " ", " ");
		Thread.sleep(1000);
	}

	@Then("The error {string} appears below Username textbox")
	public void the_error_appears_below_username_textbox(String expectedMSG) {
		String actualMSG = reg.getValidationMessage_username();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Error message under username is not appeared");
	}

	@When("The user clicks Register button without entering Username with all other fields filled")
	public void the_user_clicks_register_button_without_entering_username_with_all_other_fields_filled() throws IOException, Throwable {
		reg.register_initial();
		password = ExcelReader.getCellValue("Register", 3, 1);
		passwordconfirm = ExcelReader.getCellValue("Register", 3, 2);
		reg.clickRegister("", password, passwordconfirm);
		//reg.clickRegister(" ", "hukasdyi", "hukasdyi");
		Thread.sleep(1000);
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 3, 0);
		reg.clickRegister(username, " ", " ");
		//reg.clickRegister("nikiy", " ", " ");
		Thread.sleep(1000);
	}

	@Then("The error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String expectedMSG) {
		String actualMSG = reg.getValidationMessage_password();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Error message under password is not appeared"); 
	}

	@When("The user clicks Register button after entering Username and Password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 3, 0);
		password = ExcelReader.getCellValue("Register", 3, 1);
		reg.clickRegister(username, password, " ");
		//reg.clickRegister("nikiy", "hukasdyi", " ");
		Thread.sleep(1000);
	}

	@Then("The error message {string} appears below  Password Confirmation textbox")
	public void the_error_message_appears_below_password_confirmation_textbox(String expectedMSG) {
		String actualMSG = reg.getValidationMessage_passwordConfirmation();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Error message under password confirmation is not appeared"); 
	}

//	@When("The user clicks Register button after entering a username with spacebar characters other than digits")
//	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits() {
//		reg.clickRegister("@/./+/-/_", "password", "password");
//	}

	@Then("The user is able to see error msg after entering invalid data {string}")
	public void the_user_is_able_to_see_error_msg_after_entering_invalid_data(String expectedMSG) {
		String actualMSG = reg.compareAlertText();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Didn't get password warning message");	
	}

	@When("The user clicks Register button after entering a password with numeric data")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 7, 0);
		reg.clickRegister(username, "789123456", "789123456");
		//reg.clickRegister("networkninjas", "789123456", "789123456");
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 3, 0);
		password = ExcelReader.getCellValue("Register", 3, 1);
		passwordconfirm = ExcelReader.getCellValue("Register", 3, 3);
		reg.clickRegister(username, password, passwordconfirm);
		//reg.clickRegister("nikiy", "hukasdyi", "qwerty");
	}

	@Then("The user should able to see an pwd warning message {string}")
	public void the_user_should_able_to_see_an_pwd_warning_message(String expectedMSG) {
		String actualMSG = reg.compareAlertText();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Didn't get password warning message");		
	}
	
	@When("The user clicks Register button after entering existing Username")
	public void the_user_clicks_register_button_after_entering_existing_username() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 4, 0);
		password = ExcelReader.getCellValue("Register", 4, 1);
		passwordconfirm = ExcelReader.getCellValue("Register", 4, 2);
		reg.clickRegister(username, password, passwordconfirm);
		//reg.clickRegister("Network_Ninjas", "Oranges@12", "Oranges@12");
	}

	@Then("The user is not able to see error msg {string} after entering existing username")
	public void the_user_is_not_able_to_see_error_msg_after_entering_existing_username(String expectedMSG) {
		String actualMSG = reg.getValidationMessage_username();
		LoggerReader.info(actualMSG);
		//Assert.assertEquals(actualMSG, expectedMSG, "Didn't get error that username exists");
	}
	
	@When("The user clicks Register button after entering same Username and password")
	public void the_user_clicks_register_button_after_entering_same_username_and_password() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 5, 0);
		password = ExcelReader.getCellValue("Register", 5, 1);
		passwordconfirm = ExcelReader.getCellValue("Register", 5, 2);
		reg.clickRegister(username, password, passwordconfirm);
		//reg.clickRegister("networkninjas", "networkninjas", "networkninjas");
	}

	@Then("The user is not able to see error msg {string} after entering same Username and password")
	public void the_user_is_not_able_to_see_error_msg_after_entering_same_username_and_password(String expectedMSG) {
		String actualMSG = reg.compareAlertText();
		LoggerReader.info(actualMSG);
		//Assert.assertEquals(actualMSG, expectedMSG, "Didn't get error to change username");
	}

	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() throws IOException, Throwable {
		reg.register_initial();
		username = ExcelReader.getCellValue("Register", 6, 0);
		password = ExcelReader.getCellValue("Register", 6, 1);
		passwordconfirm = ExcelReader.getCellValue("Register", 6, 2);
		reg.clickRegister(username, password, passwordconfirm);
		//reg.clickRegister("Network_nija", "Oranges@11", "Oranges@11");
	}

	@Then("The user should be redirected to Home Page of DS Algo with message {string}")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message(String expectedMSG) {
		String actualMSG = reg.compareAlertText();
		LoggerReader.info(actualMSG);
		//Assert.assertEquals(actualMSG, expectedMSG, "Didn't get msg that New Account Created");
	}
	
}