package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.QueuePage;
import Pages.StackPage;
import Pages.signinpage;
import Pages.HomePage;
import Pages.ArrayPage;
import Pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	//private signinpage sgnpage = new signinpage(Factory.DriverFactory.getDriver());
	private HomePage homePage = new HomePage(Factory.DriverFactory.getDriver()) ;
	
//	@Given("User is logged in to the application")
//	public void user_is_logged_in_to_the_application(DataTable credTable) {
//	List<Map<String, String>> credentialList = credTable.asMaps();
//	String UserName = credentialList.get(0).get("username");
//	String Password = credentialList.get(0).get("password");
//	
//	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
//
//	//homePage = sgnpage.dologin(UserName, Password);
//	    
//	}
//	@Given ("User is on Home Page")
//	public void user_is_on_home_page(){
//		homePage.PageTitle();
//	}
	
		
	@When("The user clicks Data Structures drop down")
	public void the_user_clicks_data_structures_drop_down() {
		homePage.DropDownLst();
	}
	@Then("Then user should see  panes with different data strucures and different entries")
	public void then_user_should_see_panes_with_different_data_strucures_and_different_entries() {
		homePage.dropdowndata();   
	}
	
	@Then("dropdown list should be displayed")
	public void dropdown_list_should_be_displayed() {
//		List<String> ExpectedList = HomeSecList.asList();
//		String Title =  homePage.ArrayPageTitle();
//		System.out.println("I am in homePage title is :"+ Title);
//		System.out.println("Expected dropDown List :"+ ExpectedList);
	    List<String> ActualList = homePage.getHomeSecList();
	    System.out.println("Actual homePage List :"+ ActualList );
	}
	
	@When("user selects Array from Dropdown")
	public void user_selects_Array_from_Dropdown() {
		homePage.ArraySelection();
	}
	@When("user selects Linked List from Dropdown")
	public void user_selects_Linked_List_from_Dropdown() {
		homePage.LinkedListSelection();;
	}
	
	@When("user selects Stack from Dropdown")
	public void user_selects_stack_from_dropdown() {
		homePage.StackSelection();
	}
	@When("user selects Queue from Dropdown")
	public void user_selects_queue_from_dropdown() {
		homePage.QueueSelection();
	}

	@When("user selects Tree from Dropdown")
	public void user_selects_tree_from_dropdown() {
		homePage.treeSelection();
	}

	@When("user selects Graph from Dropdown")
	public void user_selects_graph_from_dropdown() {
		homePage.GraphSelection();
	}
	@Then("Respective Page opens up")
	public void Respective_Page_opens_up() {
		homePage.RespPageTitle();
	}
	@Then("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		homePage.error_msg();
	 
	}
	@Then("It should through error message")
	public void it_should_through_error_message() {
		homePage.error_msg();
	}
	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		homePage.signin();
	   
	}
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		homePage.PageTitle();
	  
	}
	@When("The user clicks Register button")
	public void the_user_clicks_register_button() {
		homePage.Register();
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		homePage.RegisterPageValidation();
	  
	}
	

	


}