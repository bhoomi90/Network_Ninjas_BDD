package dsportal_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
	    
	}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
	   
	    
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	   
	    
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
	   
	    
	}

	@Then("The error Please fill out this field. appears below Username textbox")
	public void the_error_please_fill_out_this_field_appears_below_username_textbox() {
	   
	    
	}

	@When("The user clicks Register button without entering Username with all other fields filled")
	public void the_user_clicks_register_button_without_entering_username_with_all_other_fields_filled() {
	   
	    
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
	   
	    
	}

	@When("The user clicks Register button after entering Username and Password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() {
	   
	    
	}

	@Then("The error message Please fill out this field. appears below  Password Confirmation textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_confirmation_textbox() {
	   
	    
	}

	@When("The user clicks Register button after entering a username with spacebar characters other than digits and @\\/.\\/+\\/-\\/_")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and() {
	   
	    
	}

	@Then("The user is not able to see error msg after entering invalid data")
	public void the_user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
	   
	    
	}

	@When("The user clicks Register button after entering a password with numeric data")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() {
	   
	    
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
	   
	    
	}

	@Then("The user should able to see an pwd warning message password_mismatch:The two password fields didn’t match.")
	public void the_user_should_able_to_see_an_pwd_warning_message_password_mismatch_the_two_password_fields_didn_t_match() {
	   
	    
	}

	@When("The user clicks Register button after entering existing Username")
	public void the_user_clicks_register_button_after_entering_existing_username() {
	   
	    
	}

	@Then("The user is not able to see error msg after entering existing username")
	public void the_user_is_not_able_to_see_error_msg_after_entering_existing_username() {
	   
	    
	}

	@When("The user clicks Register button after entering same Username and password")
	public void the_user_clicks_register_button_after_entering_same_username_and_password() {
	   
	    
	}

	@Then("The user is not able to see error msg after entering same Username and password")
	public void the_user_is_not_able_to_see_error_msg_after_entering_same_username_and_password() {
	   
	    
	}

	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
	   
	    
	}

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in_as_id() {
	   
	    
	}
	}
