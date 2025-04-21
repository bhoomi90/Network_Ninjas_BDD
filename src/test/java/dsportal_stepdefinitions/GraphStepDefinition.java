package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsportal_DriverFactory.PageDriverFactory;
import dsportal_Page.GraphPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDefinition {
	static WebDriver driver;
	static GraphPage graph;

	public static void setUpGraphPage() {
		try {
			GraphStepDefinition.driver = PageDriverFactory.driver;
			graph = new GraphPage(driver);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@When("The user clicks the Get Started button in Graph Panel or The user select Graph item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_Graph_panel_or_the_user_select_graph_item_from_the_drop_down_menu() {
		if (graph == null) {
			setUpGraphPage();
		}
//    graph.GraphIntro();
		graph.dropdown_graph_page();
	}

	@Given("The user is in the Graph Introduction Page after Sign in")
	public void the_user_is_in_the_graph_introduction_page_after_sign_in() {

	}

	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
		graph.dropdown_graph_page();

	}
	@Then("The user is redirected to Graph Data Structure Page")
	public void the_user_is_redirected_to_graph_data_structure_page() {
		
	}

	@When("The user clicks the Graph link in Graph Introduction page")
	public void the_user_clicks_the_graph_link_in_graph_introduction_page() {

		graph.GraphElementPage();

	}

	@Then("The user be directed to Graph Page")
	public void the_user_be_directed_to_graph_page() {

	}

	@Then("The user be directed to Graph Data Structure Page")
	public void the_user_be_directed_to_graph_data_strucuture_page() {

	}

	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {

	}

	@Given("The user is in the Try Editor of Graph page")
	public void the_user_is_in_the_try_editor_of_graph_page() {

	}

	@Given("The user is on the tryEditor Graph page")
	public void the_user_is_on_the_try_editor_graph_page() {

	}

	@Then("The user is navigated to Graph page")
	public void the_user_is_navigated_to_graph_page() {

	}

	@When("The user clicks the Graph Representations link in Graph Introduction page")
	public void the_user_clicks_the_graph_representations_link_in_graph_introduction_page() {

		graph.GraphRepresentations();
	}

	@Then("The user be directed to Graph Representations Page")
	public void the_user_be_directed_to_graph_representations_page() {

	}
	@Given("The user is on the tryEditor Operations for Graph page")
	public void the_user_is_on_the_try_editor_operations_for_graph_page() {
	    
	    
	}
	@Given("The user is in the Graph Representations page")
	public void the_user_is_in_the_graph_representations_page() {

	}

	@Given("The user is on the tryEditor Graph Representations page")
	public void the_user_is_on_the_try_editor_graph_representations_page() {

	}

	@Given("The user is on the Try Editor of Graph Representations page")
	public void the_user_is_on_the_try_editor_of_graph_representations_page() {

	}

	@Then("The user is navigated to Graph Representations page")
	public void the_user_is_navigated_to_graph_representations_page() {

	}

	@Given("The user is on the tryEditor Operations for Graph Representations page")
	public void the_user_is_on_the_try_editor_operations_for_graph_representations_page() {
	    
	    
	}

//	@Given("The user is in the Graph page")
//	public void the_user_is_in_the_graph_page() {
//	    
//	    
//	}
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

	@Then("The user is directed to Home page with message Logged out successfully")
	public void the_user_is_directed_to_home_page_with_message_logged_out_successfully() {
	   
	    
	}

}