package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsportal_DriverFactory.PageDriverFactory;
import dsportal_Page.StackPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StacksStepDefinition {

	static WebDriver driver;
	static StackPage stack;
	
	public static void setUpStackPage() {
		try {
			StacksStepDefinition.driver = PageDriverFactory.driver;
			stack = new StackPage(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("The user clicks the Get Started button in Stack Panel or The user select Stack item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_stack_panel_or_the_user_select_stack_item_from_the_drop_down_menu() {
		
		if(stack==null) {
			System.out.println("Create driver for Stack page");
			setUpStackPage();
		}
	    stack.dropdown_stack_page();

	}

	@Then("The user is directed to Stack Data Structure Page")
	public void the_user_is_directed_to_stack_data_structure_page() {
	    

	}

	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {

	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {

		if(stack == null) {
			System.out.println("Again Create driver for Stack page");
			setUpStackPage();
		}
	    stack.operationInStack_page();
	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
	    
	    
	}

	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
	    
	    
	}

	@Then("Navigate to try Editor window with a Run button to test")
	public void navigate_to_try_editor_window_with_a_run_button_to_test() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations in Stack page")
	public void the_user_is_on_the_try_editor_operations_in_stack_page() {
	    
	    
	}


	@Given("The user is on the tryEditor Operations for Operations in Stack page")
	public void the_user_is_on_the_try_editor_operations_for_operations_in_stack_page() {
	    
	    
	}

	@When("The user clicks Practice Questions button following browser back arrow")
	public void the_user_clicks_practice_questions_button_following_browser_back_arrow() {
	    driver.navigate().to("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	    stack.practiceQue_page();
	}

	@Then("The user is navigated to Practice Questions page")
	public void the_user_is_navigated_to_practice_questions_page() {
	    
	    
	}

//	@Given("The user is in the blank Practice page")
//	public void the_user_is_in_the_blank_practice_page() {
//	    
//	    
//	}

	@When("The user select Stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
	    stack.dropdown_stack_page();
	    
	}

	@Then("The user is redirected to Stack Data Structure Page")
	public void the_user_is_redirected_to_stack_data_structure_page() {
	    
	    
	}

	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() {
	    stack.implementation_page();
	    
	}

	@Then("The user should be redirected to Implementation page")
	public void the_user_should_be_redirected_to_implementation_page() {
	    
	    
	}

	@Given("The user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
	    
	    
	}


	@Given("The user is on the tryEditor Implementation page")
	public void the_user_is_on_the_try_editor_implementation_page() {
	    
	    
	}

	@When("The user clicks Applications button")
	public void the_user_clicks_Applications_button() {
	    stack.application_page();
	    
	}
	
	@Then("The user should be redirected to Applications in Stack page")
	public void the_user_should_be_redirected_to_applications_in_stack_page() {
	    
	    
	}

	@Given("The user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Applications page")
	public void the_user_is_on_the_try_editor_applications_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Applications page")
	public void the_user_is_on_the_try_editor_operations_for_applications_page() {
	    
	    
	}

	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {
		//if(stack==null) setUpStackPage();
	    //driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
	}

	@Then("The user should be redirected to home page with message Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
	    
	    
	}
}
