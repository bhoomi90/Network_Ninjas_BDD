package dsportal_stepdefinitions;

import dsportal_BaseClass.DriverInstance;
import dsportal_Page.LinkedListPage;
import dsportal_utilities.dsAlgoLoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition extends DriverInstance {

	static LinkedListPage linkedList;
	
	public static void setUp_LinkedlistPage() {
			linkedList = new LinkedListPage(driver);
	}
	
	@When("The user clicks the Get Started button in Linked List Panel or The user select Linked List item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel_or_the_user_select_linked_list_item_from_the_drop_down_menu() {

		if(linkedList == null) {
			dsAlgoLoggerLoad.info("Create driver for Linked List Page");
			setUp_LinkedlistPage();
		}
		linkedList.open_linkedList_page();	    
	}

	@Then("The user be directed to Linked List Data Structure Page")
	public void the_user_be_directed_to_linked_list_data_structure_page() {
		
	    
	}

	@Given("The user is in the Linked List page after Sign in")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		
	    
	}

	@When("The user clicks Introduction in Linked List page")
	public void the_user_clicks_introduction_in_linked_list_page() {
		if(linkedList == null) {
			dsAlgoLoggerLoad.info("Again Create driver for Linked List Page");
		}
		linkedList.introduction_page();	    
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
	    
	    
	}

	@Given("The user is on the Introduction in Linked List page")
	public void the_user_is_on_the_introduction_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Introduction page")
	public void the_user_is_on_the_try_editor_introduction_page() {

	    
	}

	@Given("The user is on the tryEditor Operations for Introduction page")
	public void the_user_is_on_the_try_editor_operations_for_introduction_page() {
	    
	    
	}

	@When("The user select Linked List item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
	    linkedList.dropdown_linkedList_page();
	    
	}

	@Then("The user is redirected to Linked List Data Structure Page")
	public void the_user_is_redirected_to_linked_list_data_structure_page() {
	    
	    
	}

	@When("The user clicks Creating Linked List button")
	public void the_user_clicks_creating_linked_list_button() {
	    linkedList.createLinkedList_page();
	    
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Creating Linked List page")
	public void the_user_is_on_the_try_editor_creating_linked_list_page() {
	    
	    
	}

	@When("The user clicks Types of Linked List in Linked List Page")
	public void the_user_clicks_types_of_linked_list_in_linked_list_page() {
	    linkedList.typesLinkedList_page();
	    
	}

	@Then("The user should be redirected to Types of Linked List in Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Types of Linked List page")
	public void the_user_is_on_the_try_editor_types_of_linked_list_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Types of Linked List page")
	public void the_user_is_on_the_try_editor_operations_for_types_of_linked_list_page() {
	    
	    
	}

	@When("The user clicks Implement Linked List in Python in Linked List Page")
	public void the_user_clicks_implement_linked_list_in_python_in_linked_list_page() {
	    linkedList.implementLinkedList_page();
	    
	}

	@Then("The user should be redirected to Implement Linked List in Python in Linked List page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Implement Linked List in Python page")
	public void the_user_is_on_the_try_editor_implement_linked_list_in_python_page() {
	    
	    
	}

	@When("The user clicks Traversal in Linked List Page")
	public void the_user_clicks_traversal_in_linked_list_page() {
	    linkedList.traversal_page();
	    
	}

	@Then("The user should be redirected to Traversal in Linked List page")
	public void the_user_should_be_redirected_to_traversal_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Traversal page")
	public void the_user_is_on_the_try_editor_traversal_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Traversal page")
	public void the_user_is_on_the_try_editor_operations_for_traversal_page() {
	    
	    
	}

	@When("The user clicks Insertion in Linked List Page")
	public void the_user_clicks_insertion_in_linked_list_page() {
	    linkedList.insertion_page();
	    
	}

	@Then("The user should be redirected to Insertion in Linked List page")
	public void the_user_should_be_redirected_to_insertion_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Insertion page")
	public void the_user_is_on_the_try_editor_insertion_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Insertion page")
	public void the_user_is_on_the_try_editor_operations_for_insertion_page() {
	    
	    
	}

	@When("The user clicks Deletion in Linked List Page")
	public void the_user_clicks_deletion_in_linked_list_page() {
	    linkedList.deletion_page();
	    
	}

	@Then("The user should be redirected to Deletion in Linked List page")
	public void the_user_should_be_redirected_to_deletion_in_linked_list_page() {
	    
	    
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Deletion page")
	public void the_user_is_on_the_try_editor_deletion_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Deletion page")
	public void the_user_is_on_the_try_editor_operations_for_deletion_page() {
	    
	    
	}

	@Given("The user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {

		
	}
}
