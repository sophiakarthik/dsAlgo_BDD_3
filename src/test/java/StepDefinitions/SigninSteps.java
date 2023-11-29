package StepDefinitions;

import org.openqa.selenium.WebElement;

import Pages.signinpage;
import Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninSteps {
	private signinpage sgn = new signinpage(Factory.DriverFactory.getDriver());
	@Given("Browser is open")
	public void browser_is_open() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");	
	   	}

	@When("user clicks on get started")
	public void user_clicks_on_get_started() {
		sgn.getstartbtn();
		System.out.println("success1"); 
	   	}

	@When("when user enters signin button")
	public void when_user_enters_signin_button() {
		sgn.signinbtn();
		System.out.println("success2"); 
	}

	@When("user enter credentials username as {string}")
	public void user_enter_credentials_username_as(String usernam) {
		sgn.username(usernam);
		System.out.println("success3");
	}
	@When("user left password box empty {string}")
	public void user_left_password_box_empty(String passwod) {
		sgn.password(passwod);
		System.out.println("success4");
	}

	@When("user click login button")
	public void user_click_login_button() {
		sgn.loginbtn();
		System.out.println("success5");
	   	}
	
	@Then("it should display message")
	public void it_should_display_message() {
		//sgn.popupmsg();
		System.out.println("success6");  
		
	}
	
	@Given("Browser is open2")
	public void browser_is_open2() {
	    	}

	@When("user clicks on get started2")
	public void user_clicks_on_get_started2() {
		}

	@When("when user enters credentials test case2")
	public void when_user_enters_credentials_test_case2() {
	    
	}

	@When("clicks on login for sec time")
	public void clicks_on_login_for_sec_time() {
	   	}

	@Then("it should display message for second case")
	public void it_should_display_message_for_second_case() {
	   	}



}
