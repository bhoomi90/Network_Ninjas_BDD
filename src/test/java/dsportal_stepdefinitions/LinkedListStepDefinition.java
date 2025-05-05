package dsportal_stepdefinitions;

import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.CommonPage;
import dsportal_Page.LinkedListPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition extends DriverManager {

	static LinkedListPage linkedList;
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String linkedListPageURL = homePageURL+"linked-list/";
	
	public static void setUp_LinkedlistPage() {
			linkedList = new LinkedListPage(driver);
	}
	
	@When("The user clicks the Get Started button in Linked List Panel or The user select Linked List item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel_or_the_user_select_linked_list_item_from_the_drop_down_menu() {

		if(linkedList == null) {
			LoggerReader.info("Create constructor for Linked List Page");
			setUp_LinkedlistPage();
		}
		linkedList.open_linkedList_page();	    
	}

	@Then("The user is directed to Linked List Data Structure Page")
	public void the_user_is_directed_to_linked_list_data_structure_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = linkedListPageURL;
		   LoggerReader.info("The user is able to directed to linked list page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Linked List page");	    
	}

	@Given("The user is in the Linked List page after Sign in")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Linked List");			    
	}

	@When("The user clicks Introduction in Linked List page")
	public void the_user_clicks_introduction_in_linked_list_page() {
		linkedList.introduction_page();	    
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/introduction/";
		   LoggerReader.info("The user is able to directed to Introduction page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Introduction page");	    
	}

	@Given("The user is on the Introduction in Linked List page")
	public void the_user_is_on_the_introduction_in_linked_list_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Introduction");
	}
	
	@Given("The user is on the tryEditor window in Linked List page")
	public void the_user_is_on_the_try_editor_window_in_Linked_List_page() {
		pageTitle = linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");    	    	    
	}

	@When("The user select Linked List item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
	    linkedList.dropdown_linkedList_page();
	}

	@When("The user clicks Creating Linked List button")
	public void the_user_clicks_creating_linked_list_button() {
	    linkedList.createLinkedList_page();	    
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/";
		   LoggerReader.info("The user is able to directed to Creating Linked LIst page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Creating Linked LIst page");	        
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Creating Linked LIst");	   	    
	}

	@When("The user clicks Types of Linked List in Linked List Page")
	public void the_user_clicks_types_of_linked_list_in_linked_list_page() {
	    linkedList.typesLinkedList_page();
	    
	}

	@Then("The user should be redirected to Types of Linked List in Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_in_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/";
		   LoggerReader.info("The user is able to directed to Types of Linked List page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Types of Linked List page");	    
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Types of Linked List");    	    
	}

	@When("The user clicks Implement Linked List in Python in Linked List Page")
	public void the_user_clicks_implement_linked_list_in_python_in_linked_list_page() {
	    linkedList.implementLinkedList_page();
	    
	}

	@Then("The user should be redirected to Implement Linked List in Python in Linked List page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_in_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/";
		   LoggerReader.info("The user is able to directed to Implement Linked List in Python page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Implement Linked List in Python page");	    	    
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implement Linked List in Python");   	    
	}

	@When("The user clicks Traversal in Linked List Page")
	public void the_user_clicks_traversal_in_linked_list_page() {
	    linkedList.traversal_page();
	    
	}

	@Then("The user should be redirected to Traversal in Linked List page")
	public void the_user_should_be_redirected_to_traversal_in_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/traversal/";
		   LoggerReader.info("The user is able to directed to Traversal page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Traversal page");	    	    
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Traversal");       
	}

	@When("The user clicks Insertion in Linked List Page")
	public void the_user_clicks_insertion_in_linked_list_page() {
	    linkedList.insertion_page();
	    
	}

	@Then("The user should be redirected to Insertion in Linked List page")
	public void the_user_should_be_redirected_to_insertion_in_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/";
		   LoggerReader.info("The user is able to directed to Insertion page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Insertion page");	    	    
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Insertion");       
	}

	@When("The user clicks Deletion in Linked List Page")
	public void the_user_clicks_deletion_in_linked_list_page() {
	    linkedList.deletion_page();
	    
	}

	@Then("The user should be redirected to Deletion in Linked List page")
	public void the_user_should_be_redirected_to_deletion_in_linked_list_page() {
		   currentPageUrl = linkedList.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/";
		   LoggerReader.info("The user is able to directed to Deletion page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Deletion page");    	    
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Deletion");   	    	    
	}

	@Given("The user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		pageTitle =linkedList.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Linked List");		
	}
}
