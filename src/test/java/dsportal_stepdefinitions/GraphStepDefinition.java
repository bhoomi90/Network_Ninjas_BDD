package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.GraphPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDefinition {
	
	GraphPage graph = new GraphPage();
	WebDriver driver = DriverManager.getdriver();
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String GraphPageURL = homePageURL+"graph/";


	
	@When("The user clicks the Get Started button in Graph Panel or The user select Graph item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_graph_panel_or_the_user_select_graph_item_from_the_drop_down_menu() {

		graph.GraphIntro();
	}

	@Then("The user is directed to Graph Data Structure Page")
	public void the_user_is_directed_to_graph_data_structure_page() {
		   currentPageUrl = graph.getCurrentUrl();
		   expectedPageUrl = GraphPageURL;
		   LoggerReader.info("The user is able to directed to graph page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to graph page");    
	}

	@Given("The user is in the Graph Introduction Page after Sign in")
	public void the_user_is_in_the_graph_introduction_page_after_sign_in() {
		pageTitle =graph.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Graph");    
	}

	@When("The user clicks the Graph link in Graph Introduction page")
	public void the_user_clicks_the_graph_link_in_graph_introduction_page() {
		graph.GraphElementPage();
	    
	}

	@Then("The user be directed to Graph Page")
	public void the_user_be_directed_to_graph_page() {
		   currentPageUrl = graph.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/graph/graph/";
		   LoggerReader.info("The user is able to directed to graph page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to graph page");    	    	    
	}

	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
		pageTitle =graph.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Graph");

	    
	}

	@Given("The user is on the tryEditor window in Graph page")
	public void the_user_is_on_the_try_editor_window_in_graph_page() {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Assessment");
	    
	}

	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
	    
		graph.dropdown_graph_page();

	}

	@When("The user clicks the Graph Representations link in Graph Introduction page")
	public void the_user_clicks_the_graph_representations_link_in_graph_introduction_page() {
		graph.GraphRepresentations(); 
	    
	}

	@Then("The user be directed to Graph Representations Page")
	public void the_user_be_directed_to_graph_representations_page() {
		   currentPageUrl = graph.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/graph/graph-representations/";
		   LoggerReader.info("The user is able to directed to graph Representations page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to graph Representations page");    	        
	    
	}

	@Given("The user is in the Graph Representations page")
	public void the_user_is_in_the_graph_representations_page() {
	    
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Graph Representations");
	}

}