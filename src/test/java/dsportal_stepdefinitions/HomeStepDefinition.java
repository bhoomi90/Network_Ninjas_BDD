package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_DriverFactory.Hooks;
import dsportal_Page.CommonPage;
import dsportal_Page.DataStructurePage;
import dsportal_Page.HomePage;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition extends DriverManager  {
	static HomePage hp;
	static LoginPage lp;
	static CommonPage cp;
	static DataStructurePage DataStrucpge;
	
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String Dsalgo_url = ("https://dsportalapp.herokuapp.com/");
	String Home_Url =(Dsalgo_url+"home");
	String DataStruc_Url =(Dsalgo_url+"data-structures-introduction/");
	String Array_Url =(Dsalgo_url+"array/");
	String Linkedlist_Url =(Dsalgo_url+"linked-list/");
	String Stack_Url =(Dsalgo_url+"stack/");
	String Queue_Url =(Dsalgo_url+"queue/");
	String Tree_Url =(Dsalgo_url+"tree/");
	String Graph_Url =(Dsalgo_url+"graph/");
	
	
	@FindBy (xpath=("//div[contains(text(),'You are not logged in')]")) WebElement notloggedinalert;
	
	public static void setUpHomePage() {
		hp = new HomePage(driver);
	}
	public static void setUpCommonPage() {
		cp = new CommonPage(driver);
	}
	public static void setUpDataStructurePage() {
		DataStrucpge = new DataStructurePage(driver);
	}
	
	@Given("The user has browser open")
	public void the_user_has_browser_open() {
		 System.out.println("Browser is open. Current URL: " + driver.getCurrentUrl());   	    
	}

	@When("The user enter correct dsAlgo portal URL")
	public void the_user_enter_correct_ds_algo_portal_url() {
	    driver.get("https://dsportalapp.herokuapp.com/");
	    LoggerReader.info("User navigated to the dsAlgo portal URL");
	    
	}

	@Then("The user should be able to land on dsAlgo portal with Get Started button")
	public void the_user_should_be_able_to_land_on_ds_algo_portal_with_get_started_button() {
		if(hp == null) {
			LoggerReader.info("Create constructor for Home Page");
			setUpHomePage();
		}
		 	currentPageUrl = hp.getCurrentUrl();
		 	expectedPageUrl = Dsalgo_url;
		 	LoggerReader.info("The user is able to directed to ds-algo page: "+currentPageUrl);
		 	Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to dsalgo page");		    
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		pageTitle =hp.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Numpy Ninja");	    
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
	    hp.getstarted();	    
	}
	
	@Then("The user should be navigated to the Home page which displays the Register and Sign in links.")
	public void the_user_should_be_navigated_to_the_home_page_which_displays_the_register_and_sign_in_links() {
		 currentPageUrl = hp.getCurrentUrl();
		 expectedPageUrl = Home_Url;
		 LoggerReader.info("The user is able to directed to Home page: "+currentPageUrl);
		 Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Home page");	  
	}

//	@Then("The user should be navigated to the Data Structure Introduction page, which displays the Register and Sign in links.")
//	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_register_and_sign_in_links() {
//		 currentPageUrl = hp.getCurrentUrl();
//		 expectedPageUrl = Home_Url;
//		 LoggerReader.info("The user is able to directed to Home page: "+currentPageUrl);
//		 Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Home page");	    
//	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		pageTitle =hp.getCurrentTitle();
		Assert.assertEquals(pageTitle, "NumpyNinja");	    
	}

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
	    hp.dropdown();	    
	}

	@Then("The user should able to see {int} options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu")
	public void the_user_should_able_to_see_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu(Integer int1) {

	    
	}

//	@When("The user selects Data Structures from the drop down without Sign in.")
//	public void the_user_selects_data_structures_from_the_drop_down_without_sign_in() {
//	    
//	    
//	}

	@When("The user selects Arrays from the drop down without Sign in.")
	public void the_user_selects_arrays_from_the_drop_down_without_sign_in() {
		hp.dropdown_array();    
	}
	
	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String expectedMSG) {
		String actualMSG = hp.compareLoginText();
		LoggerReader.info(actualMSG);
		Assert.assertEquals(actualMSG, expectedMSG, "Login info message is not appeared");
	}
	
	@When("The user selects Linked List from the drop down without Sign in.")
	public void the_user_selects_linked_list_from_the_drop_down_without_sign_in() {
		hp.dropdown();
		hp.dropdown_linkedlist();	    
	}

	@When("The user selects Stack from the drop down without Sign in.")
	public void the_user_selects_stack_from_the_drop_down_without_sign_in() {
		hp.dropdown();
		hp.dropdown_stack();	    
	}

	@When("The user selects Queue from the drop down without Sign in.")
	public void the_user_selects_queue_from_the_drop_down_without_sign_in() {
		hp.dropdown();
		hp.dropdown_queue();	    
	}

	@When("The user selects Tree from the drop down without Sign in.")
	public void the_user_selects_tree_from_the_drop_down_without_sign_in() {
		hp.dropdown();
		hp.dropdown_tree();    
	}

	@When("The user selects Graph from the drop down without Sign in.")
	public void the_user_selects_graph_from_the_drop_down_without_sign_in() {
		hp.dropdown();
	   	hp.dropdown_graph();	    
	}

	@When("The user selects Array from the drop down after Log in.")
	public void the_user_selects_array_from_the_drop_down_after_log_in() {
		if(cp==null) setUpCommonPage();
	    cp.login();
	    hp.dropdown();
	    hp.dropdown_array();	    
	}

	@Then("The user should be redirected to Array page")
	public void the_user_should_be_redirected_to_array_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Array_Url;
		LoggerReader.info("The user is able to directed to array page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to array page");  
		hp.navigateback();
	}

	@When("The user selects Linked List from the drop down after Log in.")
	public void the_user_selects_linked_list_from_the_drop_down_after_log_in() {		
		cp.signOut();
		cp.login();
		hp.dropdown();
		hp.dropdown_linkedlist();	    
	}

	@Then("The user should be redirected to Linked List page")
	public void the_user_should_be_redirected_to_linked_list_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Linkedlist_Url;
		LoggerReader.info("The user is able to directed to linkedlist page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to linkedlist page");
	    hp.navigateback();
	}

	@When("The user selects Stack from the drop down after Log in.")
	public void the_user_selects_stack_from_the_drop_down_after_log_in() {
		cp.signOut();
		cp.login();
		hp.dropdown();
		hp.dropdown_stack();	    
	}

	@Then("The user should be redirected to Stack page")
	public void the_user_should_be_redirected_to_stack_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Stack_Url;
		LoggerReader.info("The user is able to directed to stack page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to stack page");
	    hp.navigateback();
	    
	}

	@When("The user selects Queue from the drop down after Log in.")
	public void the_user_selects_queue_from_the_drop_down_after_log_in() {
		cp.signOut();
		cp.login();
		hp.dropdown();
		hp.dropdown_queue();	    
	}

	@Then("The user should be redirected to Queue page")
	public void the_user_should_be_redirected_to_queue_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Queue_Url;
		LoggerReader.info("The user is able to directed to queue page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to queue page");
	    hp.navigateback();    
	}

	@When("The user selects Tree from the drop down after Log in.")
	public void the_user_selects_tree_from_the_drop_down_after_log_in() {
		cp.signOut();
		cp.login();
		hp.dropdown();
		hp.dropdown_tree();	    
	}

	@Then("The user should be redirected to Tree page")
	public void the_user_should_be_redirected_to_tree_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Tree_Url;
		LoggerReader.info("The user is able to directed to tree page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to tree page");
	    hp.navigateback();	    
	}

	@When("The user selects Graph from the drop down after Log in.")
	public void the_user_selects_graph_from_the_drop_down_after_log_in() {
		cp.signOut();
		cp.login();
		hp.dropdown();
		hp.dropdown_graph();;	    
	}

	@Then("The user should be redirected to Graph page")
	public void the_user_should_be_redirected_to_graph_page() {
		currentPageUrl = hp.getCurrentUrl();
		expectedPageUrl = Graph_Url;
		LoggerReader.info("The user is able to directed to graph page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to graph page");
	    hp.navigateback();	    
	}

	@When("The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_data_structures_introduction_on_the_homepage_without_sign_in() {
	    cp.signOut();
		hp.datastructure();	    
	}
	
	@When("The user clicks Get Started buttons of Array on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_array_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.array();	    
	}

	@When("The user clicks Get Started buttons of Linked List on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_linked_list_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.linkedlist();	    
	}

	@When("The user clicks Get Started buttons of Stack on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_stack_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.stack();	    
	}

	@When("The user clicks Get Started buttons of Queue on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_queue_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.queue();	    
	}

	@When("The user clicks Get Started buttons of Tree on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.tree();	    
	}

	@When("The user clicks Get Started buttons of Graph on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_without_sign_in() {
		hp.refreshPage();
		hp.graph();	    
	}

	@When("The user clicks Get Started buttons of Data Structures-Introduction on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_data_structures_introduction_on_the_homepage_while_log_in() {
		cp.login();
		hp.datastructure();    
	}
	
	@Then("The user should be redirected to Data Structures page")
	public void the_user_should_be_redirected_to_data_structures_page() {
		 currentPageUrl = hp.getCurrentUrl();
		 expectedPageUrl = DataStruc_Url;
		 LoggerReader.info("The user is able to directed to Data Structures page: "+currentPageUrl);
		 Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Data Structures page"); 
		 hp.navigateback();	  
	}

	@When("The user clicks Get Started buttons of Array on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_array_on_the_homepage_while_log_in() {
		cp.signOut();
	    cp.login();
		hp.array();
	}

	@When("The user clicks Get Started buttons of Linked List on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_linked_list_on_the_homepage_while_log_in() {
		cp.signOut();
	    cp.login();
		hp.linkedlist();	    
	}

	@When("The user clicks Get Started buttons of Stack on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_stack_on_the_homepage_while_log_in() {
		cp.signOut();
	    cp.login();
		hp.stack();	    
	}

	@When("The user clicks Get Started buttons of Queue on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_queue_on_the_homepage_while_log_in() {
		cp.signOut();
		cp.login();
		hp.queue();	    
	}

	@When("The user clicks Get Started buttons of Tree on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_while_log_in() {
		cp.signOut();
		cp.login();
		hp.tree();	    
	}

	@When("The user clicks Get Started buttons of Graph on the homepage while Log in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_while_log_in() {
		cp.signOut();
		cp.login();
		hp.graph();	    
	}

}
