package StepDefinitions;

import org.junit.Assert;

import Factory.DriverFactory;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {
	private RegisterPage RegPage = new RegisterPage(DriverFactory.getDriver());
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	String Title = RegPage.RegisterPageTitle();
	System.out.println("Registerpage Title is :"+Title);
	//Assert.assertTrue(Title.contains(expectedTitleName));
	    
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
		RegPage.RegisterBtn();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		RegPage.errorMsg();
	}

	
	@When("User enters Username {string}")
	public void user_enters_username(String username) {
		System.out.println("I am here...");
		RegPage.UserName(username);
		  
		  }
		  
		  @And("User leaves the password textbox blank")
		  public void user_leaves_the_password_textbox_blank() { 
			  RegPage.password(""); 
		  
		  }
		  
		  @And("User clicks on the Register button")
		  public void user_clicks_on_the_register_button1() {
			  RegPage.RegisterBtn2();  
		  
		  }
		  
		  @Then("It should display an error {string} below password textbox") 
		  public void it_should_display_an_error_below_password_textbox(String string) {
			  RegPage.errorMsg();
		  }
		  
		  @When("User enters the password {string}")
		  public void user_enters_the_password(String Password) {
			  RegPage.password(Password);
		      
		  }

		  @When("leaves the password confirmation textbox blank")
		  public void leaves_the_password_confirmation_textbox_blank() {
			  RegPage.PasswordConf("");
		      
		  }

		  @When("User Clicks on the Register button")
		  public void user_clicks_on_the_register_button() {
			  RegPage.RegisterBtn2();
		      
		  }

		  @Then("It should display an error {string} below password confirmation textbox")
		  public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
			  RegPage.errorMsg();
		      
		  }
		  @When("enters differnt value in the password confirmation textbox {string}")
		  public void enters_differnt_value_in_the_password_confirmation_textbox(String passconf) {
			  RegPage.PasswordConf(passconf); 
		  }
		  @Then("It should display an error {string}")
		  public void it_should_display_an_error(String string) {
			  RegPage.PsswrdAlrtMsg();   
		  }
		  @When("Account should be created with the specified username and password")
		  public void account_should_be_created_with_the_specified_username_and_password() {
			  RegPage.AccCrtedMsg();
		  }

		  @Then("User should be logged in with the specified username")
		  public void user_should_be_logged_in_with_the_specified_username() {
		      
		  }

	

}
