package dsportal_stepdefinitions;

import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.RegisterPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition extends DriverManager {

	static RegisterPage reg;
	private String filePath = "src/test/resources/TestCode/Credentials.xlsx";
	String pageTitle, currentPageUrl, expectedPageUrl;

//	public RegisterStepDefinition() {
//        this.reg = new RegisterPage(driver);  // Ensure it is initialized
//    }
	public void setUp_RegisterPage() {
		this.reg = new RegisterPage(driver);
	}

	@Given("The user is on the ds portal  page")
	public void the_user_is_on_the_ds_portal_page() {
		if (reg == null) {
			LoggerReader.info("Create constructor for Register Page");
			setUp_RegisterPage();
		}
		pageTitle = reg.getCurrentTitle();
	}

	@When("The user clicks get started on the Home page")
	public void the_user_clicks_get_started_on_the_home_page() {

		reg.getStarted();
	}

	@Then("The user should be redirected to home page")
	public void the_user_should_be_redirected_to_home_page() {
	}

	@Given("The user is on the ds portal home page")
	public void the_user_is_on_the_ds_portal_home_page() {
		// driver = DriverManager.getDriver(); // Ensure WebDriver is initialized
		reg = new RegisterPage(driver);
////
		if (reg.getCurrentTitle().equals("Numpy Ninja")) {
			System.out.println("User is on the DS Algo portal.");
		}
	}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
		reg.register_initial();
	}

	@Then("The user should be redirected to Register page")
	public void the_user_should_be_redirected_to_register_page() {

	}

	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
		pageTitle = reg.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Registration");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		setUp_RegisterPage();

		reg.clickRegister(" ", " ", " ");
	}

	@Then("The error Please fill out this field. appears below Username textbox")
	public void the_error_please_fill_out_this_field_appears_below_username_textbox() {

	}

	@When("The user clicks Register button without entering Username with all other fields filled")
	public void the_user_clicks_register_button_without_entering_username_with_all_other_fields_filled() {
		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
		reg.clickRegister(" ", "password", "password");

	}

	@Then("The error message Please fill out this field. appears below Username textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_username_textbox() {

	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
		reg.clickRegister("username", " ", " ");

	}

	@Then("The error message Please fill out this field. appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {

	}

	@When("The user clicks Register button after entering Username and Password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() {
		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
		reg.clickRegister("username", "password", " ");

	}

	@Then("The error message Please fill out this field. appears below  Password Confirmation textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_confirmation_textbox() {

	}

	@When("The user clicks Register button after entering a username with spacebar characters other than digits and @\\/.\\/+\\/-\\/_")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and() {
		reg.clickRegister("@/./+/-/_", "password", "password");

		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@Then("The user is not able to see error msg after entering invalid data")
	public void the_user_is_not_able_to_see_error_msg_after_entering_invalid_data() {

	}

	@When("The user clicks Register button after entering a password with numeric data")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() {
		reg.clickRegister("1234", "password", "password");

		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
		reg.clickRegister("username", "password", "passwordConfirmation");

//	 reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@Then("The user should able to see an pwd warning message password_mismatch:The two password fields didn’t match.")
	public void the_user_should_able_to_see_an_pwd_warning_message_password_mismatch_the_two_password_fields_didn_t_match() {
		System.out.println("password_mismatch:The two password fields didn’t match");
	}

	@When("The user clicks Register button after entering existing Username")
	public void the_user_clicks_register_button_after_entering_existing_username() {
		reg.clickRegister("Network_Ninjas", "Oranges@12", "Oranges@12");

		// reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@Then("The user is not able to see error msg after entering existing username")
	public void the_user_is_not_able_to_see_error_msg_after_entering_existing_username() {
		System.out.println("existing username");
	}

	@When("The user clicks Register button after entering same Username and password")
	public void the_user_clicks_register_button_after_entering_same_username_and_password() {
		reg.clickRegister("password", "password", "password");

//	 reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@Then("The user is not able to see error msg after entering same Username and password")
	public void the_user_is_not_able_to_see_error_msg_after_entering_same_username_and_password() {
		System.out.println("same username and password");
	}

	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
		reg.clickRegister("Network_nija", "Oranges@11", "Oranges@11");

//	 reg.clickRegister(pageTitle, expectedPageUrl, currentPageUrl);
	}

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in_as_id() {
		System.out.println("New Account Created. You are logged in as <ID>");
	}
}
