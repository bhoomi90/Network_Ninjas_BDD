package dsportal_stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.ArraysPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysStepDefinition {

	ArraysPage arrays = new ArraysPage();
	WebDriver driver = DriverManager.getdriver();
	String pageTitle, currentPageUrl, expectedPageUrl;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String arrayPageURL = homePageURL + "array/";
	// enterCode, queRunButton;

	@When("The user clicks the Get Started button in Array Panel or The user select Array item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_Array_panel_or_the_user_select_Array_item_from_the_drop_down_menu() {
		arrays.arrayGetStarted();
	}

	@Then("The user is directed to Array Data Structure Page")
	public void the_user_is_directed_to_Array_data_structure_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = arrayPageURL;
		LoggerReader.info("The user is able to directed to linked list page: " + currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl, "The user is not directed to Linked List page");
	}

	@Given("The user is signed in to dsAlgo Portal and is on the Array page")
	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Array");
	}

	@When("The user clicks the Arrays in Python button")
	public void the_user_clicks_the_arrays_in_python_button() {
		arrays.clickArraysInPython();
	}

	@Then("The user should be redirected to the Arrays in Python page")
	public void the_user_should_be_redirected_to_the_arrays_in_python_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/array/arrays-in-python/";
		LoggerReader.info("The user is able to directed to Arrays in Python page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Arrays in Python page");
	}

	@Given("the user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Arrays in Python");
	}

	@Given("The user is on the tryEditor window in Arrays page")
	public void the_user_is_on_the_try_editor_window_in_arrays_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");
	}

	@Then("The user should be directed to Array practice question page")
	public void the_user_should_be_directed_to_array_practice_question_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/array/practice";
		LoggerReader.info("The user is able to directed to Array practice question page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Array practice question page");
	}

	@Given("The user is in the Practice Questions of array page")
	public void the_user_is_in_the_practice_questions_of_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@When("The user clicks Search the Array link")
	public void the_user_clicks_search_the_array_link() {
		arrays.clickSearchTheArray();
	}

	@Then("The user should be redirected to Search the Array Question page")
	public void the_user_should_be_redirected_to_search_the_array_question_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/question/1";
		LoggerReader.info("The user is able to directed to Search the Array Question page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Search the Array Question");
	}

	@Given("The user is in the Practice page with run and submit buttons")
	public void the_user_is_in_the_practice_page_with_run_and_submit_buttons() {
		pageTitle = arrays.getCurrentTitle();
		//Assert.assertEquals(pageTitle, "Practice Questions");
		Assert.assertEquals(pageTitle, "Assessment");
	}

	@When("The user enters the Empty in practice question and clicks Submit Button and RUN Button")
	public void the_user_enters_the_empty_in_practice_question_and_clicks_submit_button_and_run_button() {
		arrays.emptyCode();
	}

	@When("The user enters the Valid code in practice question and clicks Submit Button and RUN Button")
	public void the_user_enters_the_valid_code_in_practice_question_and_clicks_submit_button_and_run_button()
			throws IOException {
		arrays.validCode();

	}

	@Then("The Output displayed in the console should be displayed in Practice")
	public void the_output_displayed_in_the_console_should_be_displayed_in_practice() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user enters the Invalid code in practice question and clicks Submit Button and RUN Button")
	public void the_user_enters_the_invalid_code_in_practice_question_and_clicks_submit_button_and_run_button()
			throws IOException {
		arrays.invalidCode();
	}

	@Then("The Bad Input error msg should be displayed in Practice")
	public void the_bad_input_error_msg_should_be_displayed_in_practice() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the Search the array page")
	public void the_user_is_on_the_search_the_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@Given("The user will be redirected to Array question page")
	public void the_user_will_be_redirected_to_array_question_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Array question page");
	}

	@When("The user clicks Max Consecutive Ones link")
	public void the_user_clicks_max_consecutive_ones_link() {
		arrays.clickMaxConsecutiveOnes();
	}

	@Then("The user should be directed to Max Consecutive Ones Question page")
	public void the_user_should_be_directed_to_max_consecutive_ones_question_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/question/2";
		LoggerReader.info("The user is able to directed to Max Consecutive Ones Question page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Max Consecutive Ones Question page");
	}

	@Given("the user is on the Max Consecutive Ones page")
	public void the_user_is_on_the_max_consecutive_ones_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@Given("the user will be redirected to Array page")
	public void the_user_will_be_redirected_to_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Array");
	}

	@When("the user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		arrays.clickFindNumbersWithEvenNumberOfDigits();
	}

	@Then("the user should be directed to Find Numbers with Even Number of Digits Question page")
	public void the_user_should_be_directed_to_find_numbers_with_even_number_of_digits_question_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/question/3";
		LoggerReader.info(
				"The user is able to directed to Find Numbers with Even Number of Digits page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Find Numbers with Even Number of Digits Question page");
	}

	@Given("the user is on the Find Numbers with Even Number of Digits page")
	public void the_user_is_on_the_find_numbers_with_even_number_of_digits_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@When("the user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arrays.clickSquaresOfASortedArray();
	}

	@Then("the user should be redirected to Squares of a Sorted Array Question page")
	public void the_user_should_be_redirected_to_squares_of_a_sorted_array_question_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/question/4";
		LoggerReader.info("The user is able to directed to Squares of a Sorted Array page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Squares of a Sorted Array page");
	}

	@Given("the user is on the Squares of a Sorted Array page")
	public void the_user_is_on_the_squares_of_a_sorted_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Squares of a Sorted Array");
	}

	@Given("the user should be redirected to Array home page")
	public void the_user_should_be_redirected_to_array_home_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Array");
	}

	@When("the user clicks the Arrays Using List button")
	public void the_user_clicks_the_arrays_using_list_button() {
		arrays.clickArraysUsingList();
	}

	@Then("the user should be redirected to the Arrays Using List page")
	public void the_user_should_be_redirected_to_the_arrays_using_list_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/array/arrays-using-list/";
		LoggerReader.info("The user is able to directed to Arrays Using List page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Arrays Using List page");
	}

	@Given("the user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Arrays Using List");
	}

	@When("the user clicks the Basic Operations in Lists button")
	public void the_user_clicks_the_basic_operations_in_lists_button() {
		arrays.clickBasicOperationsInLists();
	}

	@Then("the user should be redirected to the Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_the_basic_operations_in_lists_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
		LoggerReader.info("The user is able to directed to Basic Operations in Lists page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Basic Operations in Lists page");
	}

	@Given("the user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Basic Operations in Lists");
	}

	@When("the user clicks the Applications of Array button")
	public void the_user_clicks_the_applications_of_array_button() {
		arrays.clickApplicationsOfArray();
	}

	@Then("the user should be redirected to the Applications of Array page")
	public void the_user_should_be_redirected_to_the_applications_of_array_page() {
		currentPageUrl = arrays.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
		LoggerReader.info("The user is able to directed to Applications of Array page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Applications of Array page");
	}

	@Given("The user is in the Array page")
	public void the_user_is_in_the_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");
	}

	@Given("the user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		pageTitle = arrays.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Applications of Array");
	}
}