package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.ArrayPage;
import Pages.DataStructurePage;
//import Pages.RegisterPage;
//import Pages.StackPage;
import Pages.signinpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ArrayPageSteps {

	private ArrayPage page = new ArrayPage(Factory.DriverFactory.getDriver());

	@When("User Clicks on the Get Started button under Array Section")
	public void user_clicks_on_the_get_started_button_under_array_section() {
	
		page.GetStartedBtn(); 
	}

	@Then("Array Page opens up")
	public void array_page_opens_up() {
	 String Title =  page.ArrayPageTitle();
	 System.out.println("Array Page title is :"+ Title);
	}
	
	
	@Given ("User is on ArrayPage")
	public void user_is_on_array_page(){
		 String Title =  page.ArrayPageTitle();
		 System.out.println("Array Page title is :"+ Title);
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		//page.GetStartedBtn();
		page.ArrayInPython();
		 String Title =  page.ArrayPageTitle();
		 System.out.println("Python Page title is :"+ Title);
	}

	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
	   page.ChkArrayInPythonPage(); 
	    
	}

	@When("User gets Array Section")
	public void user_gets_array_section(DataTable ArraySecList) {

		List<String> ExpectedArrayList = ArraySecList.asList();
		String Title =  page.ArrayPageTitle();
		System.out.println("I am in Page title is :"+ Title);
		System.out.println("Expected Array L:ist :"+ ExpectedArrayList);
	    List<String> ActualArrayList = page.getArraySecList();
	    System.out.println("Actual Array List :"+ ActualArrayList );
	    
	    Assert.assertTrue(ExpectedArrayList.containsAll(ActualArrayList));
	    
	}

	@When("Array Section count should be {int}")
	public void array_section_count_should_be(Integer int1) {
	    Assert.assertTrue( page.getArraySectionCount()==int1);
	    
	}
	
	@When("User clicks on Try Here button")
	public void User_clicks_on_Try_Here_button() {
		//page.GetStartedBtn();
		//page.ArrayInPython();
		page.TryHere();
	}
	@Then ("User should be redirected to next page")
	public void User_should_be_redirected_to_next_page() {
		//page.GetStartedBtn();
		//page.ArrayInPython();
		//page.TryHere();
		page.TryEditorPage();
		
	}
	@When("User enters the text in the TextBox {string}")
	public void user_enters_the_text_in_the_text_box(String TryEditortxt) {
	    page.entrTextInTryEditorTxtBox();
	}

	@When("Clicks on the Run button")
	public void clicks_on_the_run_button() {
	    page.RunBtn();
	}

	@Then("Result is displayed on the console")
	public void result_is_displayed_on_the_console() {
	    page.Consoleoutput();
	}
	@When("User clicks on Arrays Using List button")
	public void user_clicks_on_arrays_using_list_button() {
	    page.ArrayUsingList();
	}

	@Then("User should be redirected to Arrays Using List page")
	public void user_should_be_redirected_to_arrays_using_list_page() {
	    page.ChkArrayUsingListsPage();
	    	}
	

	@When("User clicks on Basic Operations in Lists button")
	public void user_clicks_on_basic_operations_in_lists_button() {
	   page.BsicOprtionInLst();
	}

	@Then("User should be redirected to Basic Operations in Lists page")
	public void user_should_be_redirected_to_basic_operations_in_lists_page() {
	    page.ChkBasicOperationListPage();
	}
	@When("User clicks on Applications of Array button")
	public void user_clicks_on_applications_of_array_button() {
	    page.AppsOfArray();
	}

	@Then("User should be redirected to Applications of Array page")
	public void user_should_be_redirected_to_applications_of_array_page() {
	   page.ChkApplicationOfArrayPage();	   
	}
	@When("User clicks on Practice Questions in Lists button")
	public void user_clicks_on_practice_questions_in_lists_button() {
		page.ArrayInPython();
		page.PracticeQuesLink();
	}

	@Then("User should be redirected to Practice Questions in Lists page")
	public void user_should_be_redirected_to_practice_questions_in_lists_page() {
		page.ArrayPageTitle();
	}

	@When("User clicks on Search the array Link")
	public void user_clicks_on_search_the_array_link() {
		page.SearchArray();
	}

	@When("Clicks on the submit button")
	public void clicks_on_the_submit_button() {
		page.SubmitBtn();
	}

	@Then("error message is displayed on the console")
	public void error_message_is_displayed_on_the_console() {
	    page.ErrorMsg();
	    page.Consoleoutput();
	}
	@When("User clicks on Max Consecutive Ones Link")
	public void user_clicks_on_max_consecutive_ones_link() {
	    page.MaxConsOnes();
	}
	@When("User clicks on Find Numbers with Even Number of Digits Link")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_link() {
	    page.EvenNoOfDigits();
	}
	@When("User clicks on Squares of  a Sorted Array Link")
	public void user_clicks_on_squares_of_a_sorted_array_link() {
	    page.SquaresOfSortedArray();
	}
	@When("User refresh the page")
	public void user_refresh_the_page() {
	    page.PageRefresh();
		 String Title =  page.ArrayPageTitle();
		 System.out.println("Refresh Page title is :"+ Title);
	}

	
}