//package dsportal_stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import dsAlgo_DriverFactory.DriverFactory;
//import dsportal_Page.ArraysPage;
//
//public class ArraysStepDefinition {
//    WebDriver driver;
//   // ArraysPage array;
//	ArraysPage array = new ArraysPage(driver);
//
//    @Given("the user is signed in to dsAlgo Portal and is on the {string} page")
//    public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_array_page(String pageName) {
//this.driver = DriverFactory.getChromeDriver();
//driver.get("https://dsportalapp.herokuapp.com/");
//driver.manage().window().maximize();
//array.clickLoginIn();
//    }
//
//	@When("the user clicks the {string} button")
//	public void the_user_clicks_the_button(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to the {string} page")
//	public void the_user_should_be_redirected_to_the_page(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		driver.get("https://dsportalapp.herokuapp.com/array");
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the {string} button in the Arrays in Python page")
//	public void the_user_clicks_the_button_in_the_arrays_in_python_page(String string) {
//		array.clickArraysInPython();
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to Arrays in Python page ")
//	public void the_user_should_be_redirected_to_a_arrays_in_python_page() {
//		// Write code here that turns the phrase above into concrete actions
//	//	array.clickTryHere();
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the Try Editor Array page")
//	public void the_user_is_on_the_try_editor_array_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
////	@When("The user enters the Empty in Text Editor and clicks RUN button")
////	public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
////		// Write code here that turns the phrase above into concrete actions
////		array.enterCode(" ");
////		array.clickRunButton();
////		throw new io.cucumber.java.PendingException();
////	}
//
//	@Then("The <message> should be displayed")
//	public void the_message_should_be_displayed() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
////	@When("The user enters the valid code in Text Editor and clicks RUN button")
////	public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
////		// Write code here that turns the phrase above into concrete actions
////		throw new io.cucumber.java.PendingException();
////	}
//
////	@When("The user enters the Invalid code in Text Editor and clicks RUN button")
////	public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() {
////		// Write code here that turns the phrase above into concrete actions
////		throw new io.cucumber.java.PendingException();
////	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the Array page")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_array_page() {
//		// Write code here that turns the phrase above into concrete actions
//		
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the Arrays in Python page")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_arrays_in_python_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the {string} link")
//	public void the_user_clicks_the_link(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to a {string} page containing a question and a Try Editor with Run and Submit buttons")
//	public void the_user_should_be_redirected_to_a_page_containing_a_question_and_a_try_editor_with_run_and_submit_buttons(
//			String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the practice question editor page")
//	public void the_user_is_on_the_practice_question_editor_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The Output displayed in the console should be displayed")
//	public void the_output_displayed_in_the_console_should_be_displayed() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The error message pop in the window should be displayed")
//	public void the_error_message_pop_in_the_window_should_be_displayed() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to the {string} page containing a question and a Try Editor with Run and Submit buttons")
//	public void the_user_should_be_redirected_to_the_page_containing_a_question_and_a_try_editor_with_run_and_submit_buttons(
//			String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user will be redirected to {string} page")
//	public void the_user_will_be_redirected_to_page(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the practice question editor")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_practice_question_editor() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user enters invalid Python code and clicks the Run button")
//	public void the_user_enters_invalid_python_code_and_clicks_the_run_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("an error message should be displayed in an alert window")
//	public void an_error_message_should_be_displayed_in_an_alert_window() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user enters valid Python code and clicks the Run button")
//	public void the_user_enters_valid_python_code_and_clicks_the_run_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the output should be displayed in the console")
//	public void the_output_should_be_displayed_in_the_console() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user should be redirected to {string} home page")
//	public void the_user_should_be_redirected_to_home_page(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should be redirected to a page containing a Try Editor with a Run button")
//	public void the_user_should_be_redirected_to_a_page_containing_a_try_editor_with_a_run_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the {string} page after signing in")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_page_after_signing_in(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user enters invalid Python code in the Editor and clicks the Run button")
//	public void the_user_enters_invalid_python_code_in_the_editor_and_clicks_the_run_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should see an error message in an alert window")
//	public void the_user_should_see_an_error_message_in_an_alert_window() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user enters valid Python code in the Editor and clicks the Run button")
//	public void the_user_enters_valid_python_code_in_the_editor_and_clicks_the_run_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the user should see the output in the console")
//	public void the_user_should_see_the_output_in_the_console() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the {string} button in the Basic Operations in Lists page")
//	public void the_user_clicks_the_button_in_the_basic_operations_in_lists_page(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		array.clickBasicOperationsInLists();
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the Basic Operations in Lists page")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_basic_operations_in_lists_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the {string} button in the Applications of Array page")
//	public void the_user_clicks_the_button_in_the_applications_of_array_page(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		array.clickApplicationsOfArray();
//		throw new io.cucumber.java.PendingException();
//		
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the Try Editor page")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_try_editor_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("the user clicks the Run button without entering any code in the Editor")
//	public void the_user_clicks_the_run_button_without_entering_any_code_in_the_editor() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("the user is signed in to dsAlgo Portal and is on the Applications of Array page")
//	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_applications_of_array_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Queue page")
//	public void the_user_is_in_the_queue_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks {string}")
//	public void the_user_clicks(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to home page with message {string}")
//	public void the_user_should_be_redirected_to_home_page_with_message(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//}
package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.PageDriverFactory;
import dsportal_Page.ArraysPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysStepDefinition {

	static WebDriver driver;
	static ArraysPage arrays;

	public static void setUpArraysPage() {
		try {
			ArraysStepDefinition.driver = PageDriverFactory.driver;
			arrays = new ArraysPage(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("The user clicks the Get Started button in Array Panel or The user select Stack item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_Arrays_panel_or_the_user_select_stack_item_from_the_drop_down_menu() {

		if (arrays == null) {
			System.out.println("Create driver for Arrays page");
			setUpArraysPage();
		}
		arrays.dropdown_array_page();

	}

	@Then("The user is directed to Arrays Data Structure Page")
	public void the_user_is_directed_to_Arrays_data_structure_page() {

	}

	@Given("The user is in the Arrays page after Sign in")
	public void the_user_is_in_the_Arrays_page_after_sign_in() {

	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {

		if (arrays == null) {
			System.out.println("Again Create driver for Array page");
			setUpArraysPage();
		}
		arrays.clickArraysInPython();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {

	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {

	}
//	@Given("The user is on the tryEditor Operations for Arrays in Python page")
//	public void the_user_is_on_the_try_editor_operations_for_arrays_in_python_page() {
//	    
//	    
//	}

//	@When("The user clicks Practice Questions button following browser back arrow")
//	public void the_user_clicks_practice_questions_button_in_array_page() {
//	    
//	    
//	}
//

	@When("The user select Arrays item from the drop down menu")
	public void the_user_select_arrays_item_from_the_drop_down_menu() {

	}

	@Then("The user is redirected to Arrays Data Structure Page")
	public void the_user_is_redirected_to_arrays_data_structure_page() {

	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {

	}

//	@Given("The user is on the Arrays Using List page")
//	public void the_user_is_on_the_arrays_using_list_page() {
//	    
//	    
//	}
//
//	@Given("The user is on the tryEditor Arrays Using List page")
//	public void the_user_is_on_the_try_editor_arrays_using_list_page() {
//	    
//	    
//	}

//	@Given("The user is on the tryEditor Operations for Applications page")
//	public void the_user_is_on_the_try_editor_operations_for_applications_page() {
//	    
//	    to do for arrays
//	}

	@Given("The user is in the Array page")
	public void the_user_is_in_the_arrays_page() {
		if (arrays == null)
			setUpArraysPage();
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
	}

}
