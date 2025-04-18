package dsportal_stepdefinitions;

import org.openqa.selenium.WebDriver;

import dsportal_DriverFactory.PageDriverFactory;
import dsportal_Page.TreePage;
import dsportal_utilities.dsAlgoLoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition {

	static WebDriver driver;
	static TreePage tree;
	
	public static void setUpTreePage() {
		try {
			TreeStepDefinition.driver = PageDriverFactory.driver;
			tree = new TreePage(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("The user clicks the Get Started button in Tree Panel or The user select Tree item from the drop down menu")
	public void the_user_clicks_the_get_started_button_in_stack_panel_or_the_user_select_stack_item_from_the_drop_down_menu() {
		
		if(tree==null) {
			dsAlgoLoggerLoad.info("Create driver for Tree page");
			setUpTreePage();
		}
	    tree.dropdown_tree_page();

	}

	@Given("The user is in the Tree Introduction Page after Sign in")
	public void the_user_is_in_the_tree_introduction_page_after_sign_in() {
	    
	    
	}

	@When("The user clicks the Overview of Trees link in Tree Introduction page")
	public void the_user_clicks_the_overview_of_trees_link_in_tree_introduction_page() {
	    tree.overview_tree();
	    
	}

	@Then("The user be directed to Overview of Trees Page")
	public void the_user_be_directed_to_overview_of_trees_page() {
	    
	    
	}

	@Given("The user is in Overview of Trees page")
	public void the_user_is_in_overview_of_trees_page() {
	    
	    
	}

	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Overview of Trees page")
	public void the_user_is_on_the_try_editor_operations_for_overview_of_trees_page() {
	    
	    
	}

	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
	    tree.dropdown_tree_page();
	    
	}

	@Then("The user is redirected to Tree Data Structure Page")
	public void the_user_is_redirected_to_tree_data_structure_page() {
	    
	    
	}

	@When("The user clicks the Terminologies link in Tree Introduction page")
	public void the_user_clicks_the_terminologies_link_in_tree_introduction_page() {
	    tree.Terminology_Link();
	    
	}

	@Then("The user be directed to Terminologies Page")
	public void the_user_be_directed_to_terminologies_page() {
	    
	    
	}

	@Given("The user is in the Terminologies page")
	public void the_user_is_in_the_terminologies_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Terminologies page")
	public void the_user_is_on_the_try_editor_operations_for_terminologies_page() {
	    
	    
	}

	@When("The user clicks the Types of Trees link in Tree Introduction page")
	public void the_user_clicks_the_types_of_trees_link_in_tree_introduction_page() {
	    tree.TypesOfTree_Link();
	    
	}

	@Then("The user be directed to Types of Trees Page")
	public void the_user_be_directed_to_types_of_trees_page() {
	    
	    
	}

	@Given("The user is in the Types of Trees pag")
	public void the_user_is_in_the_types_of_trees_pag() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Types of Trees page")
	public void the_user_is_on_the_try_editor_operations_for_types_of_trees_page() {
	    
	    
	}

	@When("The user clicks the Tree Traversals link in Tree Introduction page")
	public void the_user_clicks_the_tree_traversals_link_in_tree_introduction_page() {
	    tree.Traverse_Link();
	    
	}

	@Then("The user be directed to Tree Traversals Page")
	public void the_user_be_directed_to_tree_traversals_page() {
	    
	    
	}

	@Given("The user is in the Tree Traversals page")
	public void the_user_is_in_the_tree_traversals_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Tree Traversals page")
	public void the_user_is_on_the_try_editor_operations_for_tree_traversals_page() {
	    
	    
	}

	@When("The user clicks the Traversals Illustration link in Tree Introduction page")
	public void the_user_clicks_the_traversals_illustration_link_in_tree_introduction_page() {
	    tree.TreeIllus_Link();
	    
	}

	@Then("The user be directed to Traversals Illustration Page")
	public void the_user_be_directed_to_traversals_illustration_page() {
	    
	    
	}

	@Given("The user is in the Traversals Illustration page")
	public void the_user_is_in_the_traversals_illustration_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Traversals-Illustration page")
	public void the_user_is_on_the_try_editor_operations_for_traversals_illustration_page() {
	    
	    
	}

	@When("The user clicks the Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_binary_trees_link_in_tree_introduction_page() {
	    tree.BinaryTree_Link();
	    
	}

	@Then("The user be directed to Binary Trees Page")
	public void the_user_be_directed_to_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Binary Trees page")
	public void the_user_is_in_the_binary_trees_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Binary Trees page")
	public void the_user_is_on_the_try_editor_operations_for_binary_trees_page() {
	    
	    
	}

	@When("The user clicks the Types of Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_types_of_binary_trees_link_in_tree_introduction_page() {
	    
	    
	}

	@Then("The user be directed to Types of Binary Trees Page")
	public void the_user_be_directed_to_types_of_binary_trees_page() {
	    tree.TypeBinary_Link();
	    
	}

	@Given("The user is in the Types of Binary Trees page")
	public void the_user_is_in_the_types_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Types of Binary Trees page")
	public void the_user_is_on_the_try_editor_operations_for_types_of_binary_trees_page() {
	    
	    
	}

	@When("The user clicks the Implementation in Python link in Tree Introduction page")
	public void the_user_clicks_the_implementation_in_python_link_in_tree_introduction_page() {
	    tree.ImplePython_Link();
	    
	}

	@Then("The user be directed to Implementation in Python Page")
	public void the_user_be_directed_to_implementation_in_python_page() {
	    
	    
	}

	@Given("The user is in the Implementation in Python page")
	public void the_user_is_in_the_implementation_in_python_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Implementation in Python page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_in_python_page() {
	    
	    
	}

	@When("The user clicks the Binary Tree Traversals link in Tree Introduction page")
	public void the_user_clicks_the_binary_tree_traversals_link_in_tree_introduction_page() {
	    tree.BinTrave_Link();
	    
	}

	@Then("The user be directed to Binary Tree Traversals Page")
	public void the_user_be_directed_to_binary_tree_traversals_page() {
	    
	    
	}

	@Given("The user is in the Binary Tree Traversals page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Binary Tree Traversals page")
	public void the_user_is_on_the_try_editor_operations_for_binary_tree_traversals_page() {
	    
	    
	}

	@When("The user clicks the Implementation of Binary Trees link in Tree Introduction page")
	public void the_user_clicks_the_implementation_of_binary_trees_link_in_tree_introduction_page() {
	    tree.ImpleBinary_Link();
	    
	}

	@Then("The user be directed to Implementation of Binary Trees Page")
	public void the_user_be_directed_to_implementation_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Implementation of Binary Trees page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Implementation of Binary Trees page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_of_binary_trees_page() {
	    
	    
	}

	@When("The user clicks the Applications of Binary trees link in Tree Introduction page")
	public void the_user_clicks_the_applications_of_binary_trees_link_in_tree_introduction_page() {
	    tree.AppBinary_Link();
	    
	}

	@Then("The user be directed to Applications of Binary trees Page")
	public void the_user_be_directed_to_applications_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Applications of Binary trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
	    
	    
	}

	@When("The user clicks the Binary Search Trees link in Tree Introduction page")
	public void the_user_clicks_the_binary_search_trees_link_in_tree_introduction_page() {
	    tree.BinSearch_Link();
	    
	}

	@Then("The user be directed to Binary Search Trees Page")
	public void the_user_be_directed_to_binary_search_trees_page() {
	    
	    
	}

	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
	    
	    
	}

	@When("The user clicks the Implementation Of BST link in Tree Introduction page")
	public void the_user_clicks_the_implementation_of_bst_link_in_tree_introduction_page() {
	    tree.ImpleBST_Link();
	    
	}

	@Then("The user be directed to Implementation Of BST Page")
	public void the_user_be_directed_to_implementation_of_bst_page() {
	    
	    
	}

	@Given("The user is in the Implementation Of BST page")
	public void the_user_is_in_the_implementation_of_bst_page() {
	    
	    
	}

	@Given("The user is on the tryEditor Operations for Implementation Of BST page")
	public void the_user_is_on_the_try_editor_operations_for_implementation_of_bst_page() {
	    
	    
	}

	@Given("The user is in the Tree page")
	public void the_user_is_in_the_tree_page() {
	    
	    
	}
	
}
