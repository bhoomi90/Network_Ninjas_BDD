package dsportal_stepdefinitions;


import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.DataStructurePage;
import dsportal_Page.LoginPage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureStepDefinition extends DriverManager {
	
	static DataStructurePage DataStrucpge;
	static LoginPage login_page;
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String dsPageURL = homePageURL+"data-structures-introduction/";
	
	public static void setUpDataStructurePage() {
		DataStrucpge = new DataStructurePage(driver);
	}
	
	@When("The user clicks the Getting Started button in Data Structures - Introduction")
	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction() {
		if(DataStrucpge==null) {
  			LoggerReader.info("Create constructor for Data Structures page");
  			setUpDataStructurePage();
  		}
	   DataStrucpge.DataStruc_page(); 
	}

	@Then("The user be directed to Data Structures- Introduction Page")
	public void the_user_be_directed_to_data_structures_introduction_page() {
		   currentPageUrl = DataStrucpge.getCurrentUrl();
		   expectedPageUrl = dsPageURL;
		   LoggerReader.info("The user is able to directed to Data Structures page: "+currentPageUrl);
		   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to Data Structures page"); 
	    
	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		pageTitle =DataStrucpge.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Data Structures-Introduction");
	    
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		DataStrucpge.TimecomplexInDataStruc_page();
	    
	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
		   currentPageUrl = DataStrucpge.getCurrentUrl();
		   expectedPageUrl = "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
		   LoggerReader.info("The user is able to directed to Time Complexity page: "+currentPageUrl);
		   Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Time Complexity page"); 
	    
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		pageTitle = DataStrucpge.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Time Complexity");
	    
	}

	@Given("The user is on the tryEditor Operations in Data structures-Introduction page")
	public void the_user_is_on_the_try_editor_operations_in_data_structures_introduction_page() {
		pageTitle = DataStrucpge.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");     
	    
	}

	@When("The user clicks browser back arrow to go to Data Structures - Introduction  page")
	public void the_user_clicks_browser_back_arrow_to_go_to_data_structures_introduction_page() {
		driver.navigate().back();
		driver.navigate().back();
	}
}

