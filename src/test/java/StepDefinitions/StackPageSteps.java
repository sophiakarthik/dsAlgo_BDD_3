package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.ArrayPage;
import Pages.StackPage;
import Pages.signinpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPageSteps {
	private StackPage StkPage = new StackPage(Factory.DriverFactory.getDriver());
	
	
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
	
	@When("User Clicks on the Get Started button under Stack Section")
	public void user_clicks_on_the_get_started_button_under_stack_section() {
		StkPage.GetStartedBtn();
	    
	}

	@Then("Stack Page opens up")
	public void stack_page_opens_up() {
		String Title = StkPage.StackPageTitle() ;
		 System.out.println("Stack Page title is :"+ Title);    	    
	}

	@When("User clicks on Operations in Stack button")
	public void user_clicks_on_operations_in_stack_button() {
		StkPage.OperationsInStack();
	    
	}

	@Then("User should be redirected to Operations in Stack page")
	public void user_should_be_redirected_to_operations_in_stack_page() {
		StkPage.OperationsInStackPage();
	    
	}
	@When("User clicks on Implementation button")
	public void user_clicks_on_implementation_button() {
		StkPage.Implementation();
	}

	@Then("User should be redirected to Implementation page")
	public void user_should_be_redirected_to_implementation_page() {
		StkPage.ImplementationPage();
	}
	@When("User clicks on Applications button")
	public void user_clicks_on_applications_button() {
		StkPage.Application();
	}

	@Then("User should be redirected to Applications page")
	public void user_should_be_redirected_to_applications_page() {
		StkPage.ApplicationPage();
		
	}

}
