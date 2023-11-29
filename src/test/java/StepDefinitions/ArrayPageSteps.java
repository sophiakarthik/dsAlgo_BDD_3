package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.ArrayPage;
import Pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageSteps {
	
	private RegisterPage RegPage = new RegisterPage(DriverFactory.getDriver());
	private ArrayPage page;
	
	@Given("User is logged in to the application")
	public void user_is_logged_in_to_the_application(DataTable dataTable) {
	List<Map<String, String>> credentialList = dataTable.asMaps();
	String UserName = credentialList.get(0).get("username");
	String Password = credentialList.get(0).get("password");
	
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	//page = RegPage.UserName(UserName);
	//page = RegPage.password(Password);
	    
	}

	@When("User Clicks on the Get Started button under Array Section")
	public void user_clicks_on_the_get_started_button_under_array_section() {
	
		page.GetStartedBtn(); 
	}

	@Then("Array Page opens up")
	public void array_page_opens_up() {
	  page.ArrayPageTitle();
	  
	    
	}


	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    page.ArrayInPython();
	    
	}

	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
	   page.ChkArrayInPythonPage(); 
	    
	}

	@When("User gets Array Section")
	public void user_gets_array_section(DataTable dataTable) {
	    
	    
	}

	@When("Array Section count should be {int}")
	public void array_section_count_should_be(Integer int1) {
	    
	    
	}



}
