package dsportal_stepdefinitions;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import dsportal_Page.DataStructurePage;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureStepDefinition {
	
	static WebDriver driver;
	static DataStructurePage DataStrucpge;
	static LoginPage login_page;
	
	public static void setUpDataStructurePage() {
		//this.driver = PageDriverFactory.driver ;
		DataStrucpge = new DataStructurePage(driver);
		login_page = new LoginPage(driver);
	}
	
	public static void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		
		if(DataStrucpge==null) {
  			LoggerReader.info("Create driver for Common page");
  			setUpDataStructurePage();
  		}
		login_page.get_login();
	    
	}

	@When("The user clicks the Getting Started button in Data Structures - Introduction")
	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction() {
	   
	}

	@Then("The user be directed to Data Structures- Introduction Page")
	public void the_user_be_directed_to_data_structures_introduction_page() {
	   
	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	    
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
	    
	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
	    
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
	   
	}

	@When("The user clicks Try Here>>> button")
	public void the_user_clicks_try_here_button() {
		DataStrucpge.tryHere_page();
	    
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   
	}

	@Given("The user is on the tryEditor Operations in Data structures-Introduction page")
	public void the_user_is_on_the_try_editor_operations_in_data_structures_introduction_page() {
	    
	}

	@When("The user enters the Empty in text editor and clicks RUN Button")
	public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
		DataStrucpge.emptyCode();
	   
	}

	@Then("The Error message in alert window should be displayed")
	public void the_error_message_in_alert_window_should_be_displayed() {
	    
	}

	@When("The user enters the Valid code in text editor and clicks RUN Button")
	public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
		driver.navigate().refresh();
		try {
			DataStrucpge.validCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("The displayed in the console should be displayed")
	public void the_displayed_in_the_console_should_be_displayed() {
	    
	}

	@When("The user enters the Invalid code in text editor and clicks RUN Button")
	public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() {
		driver.navigate().refresh();
		try {
			DataStrucpge.invalidCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("The nameerror pop up alert message should be displayed")
	public void the_nameerror_pop_up_alert_message_should_be_displayed() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//Thread.sleep(2000);
		alert.accept();
	}

	@When("The user clicks the Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {
		driver.navigate().back();
   	    //Thread.sleep(1000);
		DataStrucpge.practiceQue_page();
	    
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	   
	}

	@Given("The user is in the blank Practice page")
	public void the_user_is_in_the_blank_practice_page() {
	    
	}

	@When("The user selected item from the drop down menu")
	public void the_user_selected_item_from_the_drop_down_menu() {
	    
	}

	@Then("The user be directed to selected itemPage")
	public void the_user_be_directed_to_selected_item_page() {
	   
	}

	
//	static WebDriver driver;
//	static DataStructurePage datastruc;
//	
//	public static void setUpDataStrucPage() {
//		try {
//			DataStructureStepDefinition.driver = Hooks.driver;
//			datastruc = new DataStructurePage(driver);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Given("The user is in the Home page after logged in")
//	public void the_user_is_in_the_home_page_after_logged_in() {
//		
//	    
//	   
//	}
//
//	@When("The user clicks the Getting Started button in Data Structures - Introduction")
//	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction(){
//		if(datastruc==null) {
//			System.out.println("Create driver for DataStructures page");
//			setUpDataStrucPage();
//		}
//		datastruc.DataStruc_page();
//
//	   
//	}
//
//	@Then("The user be directed to Data Structures- Introduction Page")
//	public void the_user_be_directed_to_data_structures_introduction_page() {
//	    
//	   
//	}
//
//	@Given("The user is in the Data Structures - Introduction page")
//	public void the_user_is_in_the_data_structures_introduction_page() {
//	    
//	   
//	}
//
//	@When("The user clicks Time Complexity button")
//	public void the_user_clicks_time_complexity_button() {
//		datastruc.TimecomplexInDataStruc_page();
//	   
//	}
//
//	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
//	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
//	    
//	   
//	}
//
//	@Given("The user is in the Time Complexity page")
//	public void the_user_is_in_the_time_complexity_page() {
//	    
//	   
//	}
//
//	@When("The user clicks Try Here button")
//	public void the_user_clicks_try_here_button() {
//	    
//	   
//	}
//
//	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
//	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
//	    
//	   
//	}

//	@Given("The user is in the tryEditor page")
//	public void the_user_is_in_the_try_editor_page() {
//	    
//	   
//	}

//	@When("The user clicks the Run Button without entering the code in the Editor")
//	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
//	    
//	   
//	}

//	@Then("The user should able to see an error message in alert window")
//	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
//	    
//	   
//	}

//	@When("The user write the invalid code in Editor and click the Run Button")
//	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
//	    
//	   
//	}

//	@When("The user write the valid code in Editor and click the Run Button")
//	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
//	    
//	   
//	}

//	@Then("The user should able to see output in the console")
//	public void the_user_should_able_to_see_output_in_the_console() {
//	    
//	   
//	}

//	@When("The user clicks the Practice Questions button")
//	public void the_user_clicks_the_practice_questions_button() {
//	    
//	   
//	}
//
//	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
//	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
//	    
//	   
//	}
//
//	@When("The user selected item from the drop down menu")
//	public void the_user_selected_item_from_the_drop_down_menu() {
//	    
//	   
//	}
//
//	@Then("The user be directed to selected itemPage")
//	public void the_user_be_directed_to_selected_item_page() {
//	    
//	   
//	}
	
//	@Then("The user should be redirected to home page with message Logged out successfully")
//	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
//	    
//	}

//	@Given("The user is on the tryEditor Operations in Data structures-Introduction page")
//	public void the_user_is_on_the_try_editor_operations_in_data_structures_introduction_page() {
//	   
//	}

	

}
