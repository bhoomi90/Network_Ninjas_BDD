package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.QueuePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueStepDefinition {
	static WebDriver driver;
	static QueuePage queue;

	public static void setUpQueuePage() {
		try {
			QueueStepDefinition.driver = DriverManager.driver;
			queue = new QueuePage(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("The user clicks the Get Started button in Queue Panel or The user select Queue item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_queue_panel_or_the_user_select_queue_item_from_the_drop_down_menu() {
		if (queue == null) {
			setUpQueuePage();
		}
		// queue.clickGetStarted();
		queue.dropdown_queue_page();
	}

	@Then("The user be directed to Queue Data Structure Page")
	public void the_user_be_directed_to_queue_data_structure_page() {

	}

	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {
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

	}

	@Given("The user is on the Implementation of Queue in Python page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() {

	}

	
	@Given("The user is in the tryEditor Implementation of Queue in Python page")
	public void the_user_is_in_the_try_editor_implementation_of_queue_in_python_page() {

	}

	@Given("The user is on the tryEditor Operations for Implementation of Queue in Python page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_of_queue_in_python_page() {

	}

	@When("The user clicks Implementation using collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {
		queue.clickImplementationUsingCollectionsDeque();
	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {

	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {

	}

	@Given("The user is on the tryEditor Implementation using collections.deque page")
	public void the_user_is_on_the_try_editor_implementation_using_collections_deque_page() {

	}

	@Given("The user is on the tryEditor Operations for Implementation using collections.deque page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_using_collections_deque_page() {

	}

	@When("The user clicks Implementation using array button")
	public void the_user_clicks_implementation_using_array_button() {
		queue.clickImplementationUingArray();
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {

	}

	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_implementation_using_array_page() {

	}

	@Given("The user is on the tryEditor Implementation using array page")
	public void the_user_is_on_the_try_editor_implementation_using_array_page() {

	}

	@Given("The user is on the tryEditor Operations for Implementation using array page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_using_array_page() {

	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		queue.clickQueueOperations();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {

	}

	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {

	}

	@Given("The user is in the tryEditor Queue Operations page")
	public void the_user_is_in_the_try_editor_queue_operations_page() {

	}

	@Given("The user is on the tryEditor Operations for Queue Operations page")
	public void the_user_is_on_the_try_editor_operations_for_queue_operations_page() {

	}

	@Then("The user is redirected to Queue Data Structure Page")
	public void the_user_is_redirected_to_queue_data_structure_page() {

	}

	@Given("The user is in the Queue page")
	public void the_user_is_in_the_Queue_page() {

	}
}
