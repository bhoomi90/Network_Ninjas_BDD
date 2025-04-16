package dsportal_stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dsportal_Page.GraphPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDefinition {

//	@Given("The user is in the Home Page")
//	public void the_user_is_in_the_home_page() {
//	   
//	    
//	}
	WebDriver driver ; 
	  
	 GraphPage GraphPage; 
	
	
//
	@Given("The user is in the Graph Introduction Page after Sign in")
	public void the_user_is_in_the_graph_introduction_page_after_sign_in() {
	   
		//DriverConfig.getDriverInstance(); 
		driver = new ChromeDriver();
		GraphPage = new GraphPage(driver);
		driver.get("https://dsportalapp.herokuapp.com/home");
		 
		
		
	    GraphPage.Graph_IntroLink();
	    
		
		
	}

	@When("The user clicks the  Graph link in Graph Introduction page")
	public  void the_user_clicks_the_graph_link_in_graph_introduction_page() {
	   
	    GraphPage.Graph_Page();
	    GraphPage.TryEd_Btn();
	}

	@Then("The user be directed to Graph Page")
	public void the_user_be_directed_to_graph_page() {
	   
	    
	}

	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
	   
	    
	}

//	@When("The user clicks Try here>>> button")
//	public void the_user_clicks_try_here_button() {
//	   
//  }
//
//	@Then("The user is navigated to tryEditor window")
//	public void the_user_is_navigated_to_try_editor_window() {
//	   
//	    
//	}
//
//	@Given("The user is on the tryEditor page")
//	public void the_user_is_on_the_try_editor_page() {
//	   
//	    
//	}
//
//	@When("The user enters the Empty in Text Editor and clicks RUN button")
//	public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
//	   
//	    
//	}
//
//	@When("The user enters the valid code in Text Editor and clicks RUN button")
//	public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
//	   
//	    
//	}
//
//	@When("The user enters the Invalid code in Text Editor and clicks RUN button")
//	public void the_user_enters_the_invalid_code_in_text_editor_and_clicks_run_button() {
//	   
//	    
//	}
//
	@Given("The user is on the Try Editor of Graph page")
	public void the_user_is_on_the_try_editor_of_graph_page() {
	   
	    
	}

//	@When("The user clicks browser back arrow")
//	public void the_user_clicks_browser_back_arrow() {
//	   
//	    
//	}
//
	@Then("The user is navigated to Graph page")
	public void the_user_is_navigated_to_graph_page() {
	   

	}

	@When("The user clicks the Graph Representations link in Graph Introduction page")
	public void the_user_clicks_the_graph_representations_link_in_graph_introduction_page() {
	   
	    
	}

	@Then("The user be directed to Graph Representations Page")
	public void the_user_be_directed_to_graph_representations_page() {
	   
	    
	}

	@Given("The user is in the Graph Representations page")
	public void the_user_is_in_the_graph_representations_page() {
	   
	    
	}

	@Given("The user is on the Try Editor of Graph Representations page")
	public void the_user_is_on_the_try_editor_of_graph_representations_page() {
	   
	    
	}

	@Then("The user is navigated to Graph Representations page")
	public void the_user_is_navigated_to_graph_representations_page() {
	   
	    
	}

	@Given("the user is signed in to dsAlgo Portal and is on the Graph page")
	public void the_user_is_signed_in_to_ds_algo_portal_and_is_on_the_graph_page() {
	   
	    
	}

	@When("the user clicks the Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {
	   
	    
	}
//
	@Then("the user should be redirected to the Practice page")
	public void the_user_should_be_redirected_to_the_practice_page() {
	   
	    
	}
//
	@Then("The user is redirected to Graph Page")
	public void the_user_is_redirected_to_graph_page() {
	   
	    
	}
//
//	@Then("The user is directed to Home page with message Logged out successfully")
//	public void the_user_is_directed_to_home_page_with_message_logged_out_successfully() {
//	   
//	    
//	}

}
