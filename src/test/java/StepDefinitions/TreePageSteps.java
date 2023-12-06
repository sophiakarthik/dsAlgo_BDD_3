package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.ArrayPage;
import Pages.TreePage;
import Pages.signinpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageSteps {
	private TreePage TreePage = new TreePage(Factory.DriverFactory.getDriver());
	
	
//	@Given("User is logged in to the application")
//	public void user_is_logged_in_to_the_application(DataTable credTable) {
//	List<Map<String, String>> credentialList = credTable.asMaps();
//	String UserName = credentialList.get(0).get("username");
//	String Password = credentialList.get(0).get("password");
//	
//	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
//	
//	page = sgn.dologin(UserName, Password);
//	    
//	}
	
	@When("User Clicks on the Get Started button under Tree Section")
	public void user_clicks_on_the_get_started_button_under_tree_section() {
		TreePage.GetStartedBtn();
	    
	}

	@Then("Tree Page opens up")
	public void tree_page_opens_up() {
		String Title = TreePage.TreePageTitle() ;  
	}

	@When("User clicks on Overview of Trees button")
	public void user_clicks_on_overview_of_trees_button() {
		TreePage.OverviewOfTrees();   
	}

	@Then("User should be redirected to Overview of Trees page")
	public void user_should_be_redirected_to_overview_of_trees_page() {
		TreePage.TreePageTitle();
	}
	@When("User clicks on Terminologies button")
	public void user_clicks_on_terminologies_button() {
		TreePage.Terminologies();   
	}

	@When("User clicks on Types of Trees button")
	public void user_clicks_on_types_of_trees_button() {
		TreePage.TypesofTrees();   
	}
	@When("User clicks on Types of Tree Traversals button")
	public void user_clicks_on_types_of_traversals_button() {
		TreePage.TreeTraversals();   
	}
	@When("User clicks on Traversals-Illustration button")
	public void user_clicks_on_traversals_llustration_button() {
		TreePage.TraversalsIllustration();   
	}
	@When("User clicks on Binary Trees button")
	public void user_clicks_on_binary_trees_button() {
		TreePage.BinaryTrees();   
	}
	@When("User clicks on Types of Binary Trees button")
	public void user_clicks_on_types_of_binary_trees_button() {
		TreePage.TypesofBinaryTrees();   
	}
	@When("User clicks on Implementation in Python button")
	public void user_clicks_on_implementation_in_python_button() {
		TreePage.ImplementationinPython();   
	}
	@When("User clicks on Binary Tree Traversals button")
	public void user_clicks_on_binary_tree_traversals_button() {
		TreePage.BinaryTreeTraversals();   
	}
	@When("User clicks on Implementation of Binary Trees button")
	public void user_clicks_on_implementation_of_binary_trees_button() {
		TreePage.ImplementationofBinaryTrees();   
	}
	@When("User clicks on Applications of Binary trees button")
	public void user_clicks_on_applications_of_binary_trees_button() {
		TreePage.ApplicationsofBinarytrees();   
	}
	@When("User clicks on Binary Search Trees button")
	public void user_clicks_on_binary_search_trees_button() {
		TreePage.BinarySearchTrees();   
	}
	@When("User clicks on Implementation Of BST button")
	public void user_clicks_on_implementation_of_bst_button() {
		TreePage.ImplementationOfBST(); 
		
	}


}