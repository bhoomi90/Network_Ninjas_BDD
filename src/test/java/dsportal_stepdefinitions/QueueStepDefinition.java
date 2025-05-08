package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.QueuePage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueStepDefinition {
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	QueuePage queue = new QueuePage();
	WebDriver driver = DriverManager.getdriver();
	String pageTitle, currentPageUrl, expectedPageUrl;



	@When("The user clicks the Get Started button in Queue Panel or The user select Queue item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_queue_panel_or_the_user_select_queue_item_from_the_drop_down_menu() {

		queue.dropdown_queue_page();
	}

	@Then("The user be directed to Queue Data Structure Page")
	public void the_user_be_directed_to_queue_data_structure_page() {
		currentPageUrl = queue.getCurrentUrl();
		expectedPageUrl = homePageURL + "queue/";
		LoggerReader.info("The user is able to directed to queue page: " + currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl, "The user is not directed to queue page");

	}

	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Queue");
	}

	@When("The user select Queue item from the drop down menu")
	public void the_user_select_Queue_item_from_the_drop_down_menu() {
		queue.dropdown_queue_page();

	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
		queue.clickImplementationQueuePython();
	}

	@Then("The user should be redirected to Implementation of Queue in Python page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		currentPageUrl = queue.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/queue/implementation-lists/";
		LoggerReader.info("The user is able to directed to Implementation of Queue in Python page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Implementation of Queue in Python page");
	}

	@Given("The user is on the Implementation of Queue in Python page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation of Queue in Python");
	}

	@Given("The user is on the tryEditor window in queue page")
	public void the_user_is_on_the_try_editor_window_in_queue_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");
	}

	@When("The user clicks Implementation using collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {
		queue.clickImplementationUsingCollectionsDeque();
	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		currentPageUrl = queue.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/queue/implementation-collections/";
		LoggerReader
				.info("The user is able to directed to Implementation using collections.deque page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Implementation using collections.deque page");

	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation using collections.deque");
	}

	@When("The user clicks Implementation using array button")
	public void the_user_clicks_implementation_using_array_button() {
		queue.clickImplementationUingArray();
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		currentPageUrl = driver.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/queue/Implementation-array/";
		LoggerReader.info("The user is able to directed to Implementation using array " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl,
				"The user is not directed to Implementation using array page");
	}

	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_implementation_using_array_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation using array");
	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		queue.clickQueueOperations();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		currentPageUrl = queue.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/queue/QueueOp/";
		LoggerReader.info("The user is able to directed to Creating Queue Operations page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Queue Operations page");
	}

	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Queue Operations");
	}

	@Then("The user is redirected to Queue Data Structure Page")
	public void the_user_is_redirected_to_queue_data_structure_page() {
		currentPageUrl = queue.getCurrentUrl();
		expectedPageUrl = homePageURL + "queue/";
		LoggerReader.info("The user is able to directed to Queue Data Structure page: " + currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Queue Data Structure page");
	}

	@Given("The user is in the Queue page")
	public void the_user_is_in_the_Queue_page() {
		pageTitle = queue.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Queue");
	}
}