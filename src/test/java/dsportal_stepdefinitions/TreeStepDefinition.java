package dsportal_stepdefinitions;

import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_Page.TreePage;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition extends DriverManager {

	static TreePage tree;
	String pageTitle, currentPageUrl, expectedPageUrl ;
	String homePageURL = "https://dsportalapp.herokuapp.com/";
	String treePageURL = homePageURL+"tree/";
	
	public static void setUpTreePage() {
		tree = new TreePage(driver);
	}
	
	@When("The user clicks the Get Started button in Tree Panel or The user select Tree item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_stack_panel_or_the_user_select_stack_item_from_the_drop_down_menu() {
		
		if(tree==null) {
			LoggerReader.info("Create constructor for Tree page");
			setUpTreePage();
		}
	    tree.open_tree_page();
	}
	
	@Then("The user is directed to Tree Data Structure Page")
	public void the_user_is_directed_to_tree_data_structure_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = treePageURL;
		LoggerReader.info("The user is able to directed to tree page: "+currentPageUrl);
		Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user is not directed to tree page");			    	    
	}

	@Given("The user is in the Tree Introduction Page after Sign in")
	public void the_user_is_in_the_tree_introduction_page_after_sign_in() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Tree");		
	}

	@When("The user clicks the Overview of Trees link in Tree Introduction page")
	public void the_user_clicks_the_overview_of_trees_link_in_tree_introduction_page() {
	    tree.overview_tree(); 
	}

	@Then("The user be directed to Overview of Trees Page")
	public void the_user_be_directed_to_overview_of_trees_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/overview-of-trees/";
		LoggerReader.info("The user is able to directed to Overview of Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Overview of Trees Page");	       	    
	}

	@Given("The user is in Overview of Trees page")
	public void the_user_is_in_overview_of_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Overview of Trees");	    
	}

	@Given("The user is on the tryEditor window in Tree page")
	public void the_user_is_on_the_tryEditor_window_in_Tree_page() {
		pageTitle = tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Assessment");    	    
	}

	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
	    tree.dropdown_tree_page();	    
	}

	@When("The user clicks the Terminologies link in Tree Introduction page")
	public void the_user_clicks_the_terminologies_link_in_tree_introduction_page() {
	    tree.Terminology_Link();	    
	}

	@Then("The user be directed to Terminologies Page")
	public void the_user_be_directed_to_terminologies_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/terminologies/";
		LoggerReader.info("The user is able to directed to Terminologies Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Terminologies Page");	           
	}

	@Given("The user is in the Terminologies page")
	public void the_user_is_in_the_terminologies_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Terminologies");	
	}

	@When("The user clicks the Types of Trees link in Tree Introduction page")
	public void the_user_clicks_the_types_of_trees_link_in_tree_introduction_page() {
	    tree.TypesOfTree_Link();    
	}

	@Then("The user be directed to Types of Trees Page")
	public void the_user_be_directed_to_types_of_trees_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/types-of-trees/";
		LoggerReader.info("The user is able to directed to Types of Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Types of Trees Page");	    	    
	}

	@Given("The user is in the Types of Trees pag")
	public void the_user_is_in_the_types_of_trees_pag() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Types of Trees");	
	}

	@When("The user clicks the Tree Traversals link in Tree Introduction page")
	public void the_user_clicks_the_tree_traversals_link_in_tree_introduction_page() {
	    tree.Traverse_Link();	    
	}

	@Then("The user be directed to Tree Traversals Page")
	public void the_user_be_directed_to_tree_traversals_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/tree-traversals/";
		LoggerReader.info("The user is able to directed to Tree Traversals Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Tree Traversals Page");	        
	}

	@Given("The user is in the Tree Traversals page")
	public void the_user_is_in_the_tree_traversals_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Tree Traversals");	
	}

	@When("The user clicks the Traversals Illustration link in Tree Introduction page")
	public void the_user_clicks_the_traversals_illustration_link_in_tree_introduction_page() {
	    tree.TreeIllus_Link();	    
	}

	@Then("The user be directed to Traversals Illustration Page")
	public void the_user_be_directed_to_traversals_illustration_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/traversals-illustration/";
		LoggerReader.info("The user is able to directed to Traversals-Illustration Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Traversals-Illustration Page");	     	    
	}

	@Given("The user is in the Traversals Illustration page")
	public void the_user_is_in_the_traversals_illustration_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Traversals-Illustration");	
	}

	@When("The user clicks the Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_binary_trees_link_in_tree_introduction_page() {
	    tree.BinaryTree_Link();	    
	}

	@Then("The user be directed to Binary Trees Page")
	public void the_user_be_directed_to_binary_trees_page() {
		currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/binary-trees/";
		LoggerReader.info("The user is able to directed to Binary Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Binary Trees Page");	    	    
	}

	@Given("The user is in the Binary Trees page")
	public void the_user_is_in_the_binary_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Binary Trees");		    
	}


	@When("The user clicks the Types of Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_types_of_binary_trees_link_in_tree_introduction_page() {
	    tree.TypeBinary_Link();
	}

	@Then("The user be directed to Types of Binary Trees Page")
	public void the_user_be_directed_to_types_of_binary_trees_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/";
		LoggerReader.info("The user is able to directed to Types of Binary Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Types of Binary Trees Page");	    	    
	}

	@Given("The user is in the Types of Binary Trees page")
	public void the_user_is_in_the_types_of_binary_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Types of Binary Trees");	
	}


	@When("The user clicks the Implementation in Python link in Tree Introduction page")
	public void the_user_clicks_the_implementation_in_python_link_in_tree_introduction_page() {
	    tree.ImplePython_Link();
	}

	@Then("The user be directed to Implementation in Python Page")
	public void the_user_be_directed_to_implementation_in_python_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/implementation-in-python/";
		LoggerReader.info("The user is able to directed to Implementation in Python Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Implementation in Python Page");	        
	}

	@Given("The user is in the Implementation in Python page")
	public void the_user_is_in_the_implementation_in_python_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation in Python");	
	}

	@When("The user clicks the Binary Tree Traversals link in Tree Introduction page")
	public void the_user_clicks_the_binary_tree_traversals_link_in_tree_introduction_page() {
	    tree.BinTrave_Link();
	}

	@Then("The user be directed to Binary Tree Traversals Page")
	public void the_user_be_directed_to_binary_tree_traversals_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/";
		LoggerReader.info("The user is able to directed to Binary Tree Traversals Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Binary Tree Traversals Page");	        
	}

	@Given("The user is in the Binary Tree Traversals page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Binary Tree Traversals");	
	}

	@When("The user clicks the Implementation of Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_implementation_of_binary_trees_link_in_tree_introduction_page() {
	    tree.ImpleBinary_Link();
	}

	@Then("The user be directed to Implementation of Binary Trees Page")
	public void the_user_be_directed_to_implementation_of_binary_trees_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/";
		LoggerReader.info("The user is able to directed to Implementation of Binary Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Implementation of Binary Trees Page");	    	    
	}

	@Given("The user is in the Implementation of Binary Trees page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation of Binary Trees");	
	}

	@When("The user clicks the Applications of Binary trees link in Tree Introduction page")
	public void the_user_clicks_the_applications_of_binary_trees_link_in_tree_introduction_page() {
	    tree.AppBinary_Link();	    
	}

	@Then("The user be directed to Applications of Binary trees Page")
	public void the_user_be_directed_to_applications_of_binary_trees_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/";
		LoggerReader.info("The user is able to directed to Applications of Binary trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Applications of Binary trees Page");	    	    
	}

	@Given("The user is in the Applications of Binary trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Applications of Binary trees");		    
	}

	@When("The user clicks the Binary Search Trees link in Tree Introduction page")
	public void the_user_clicks_the_binary_search_trees_link_in_tree_introduction_page() {
	    tree.BinSearch_Link();	    
	}

	@Then("The user be directed to Binary Search Trees Page")
	public void the_user_be_directed_to_binary_search_trees_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/binary-search-trees/";
		LoggerReader.info("The user is able to directed to Binary Search Trees Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Binary Search Trees Page");	    	    
	}

	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Binary Search Trees");		    
	}

	@When("The user clicks the Implementation Of BST link in Tree Introduction page")
	public void the_user_clicks_the_implementation_of_bst_link_in_tree_introduction_page() {
	    tree.ImpleBST_Link();	    
	}

	@Then("The user be directed to Implementation Of BST Page")
	public void the_user_be_directed_to_implementation_of_bst_page() {
	    currentPageUrl = tree.getCurrentUrl();
		expectedPageUrl = "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/";
		LoggerReader.info("The user is able to directed to Implementation Of BST Page: "+currentPageUrl);
		Assert.assertEquals(currentPageUrl, expectedPageUrl, "The user is not directed to Implementation Of BST Page");	    	    
	}

	@Given("The user is in the Implementation Of BST page")
	public void the_user_is_in_the_implementation_of_bst_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Implementation Of BST");		    
	}

	@Given("The user is in the Tree page")
	public void the_user_is_in_the_tree_page() {
		pageTitle =tree.getCurrentTitle();
		Assert.assertEquals(pageTitle, "Tree");		    
	}
	
}
