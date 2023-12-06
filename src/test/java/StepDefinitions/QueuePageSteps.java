package StepDefinitions;

import Factory.DriverFactory;
import Pages.QueuePage;
import Pages.StackPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePageSteps {
	private QueuePage quePage = new QueuePage(Factory.DriverFactory.getDriver());
	
	@When("user clicks on the Get Started button under Queue Data Structure")
	public void user_clicks_on_the_get_started_button_under_queue_data_structure() {
		quePage.QueuePgGetStartBtn();
	}

	@Then("it should go to Queue structure home page")
	public void it_should_go_to_queue_structure_home_page() {
		String Title = quePage.QueuePgTitle();
		System.out.println("Queue Page Title is :"+ Title);

	}
	@When("User clicks on Implementation of Queue in Python link")
	public void user_clicks_on_implementation_of_queue_in_python_link() {
		quePage.ImpleOfQueueInPython();
	}

	@Then("User Should be redirected to correct Queue page")
	public void user_should_be_redirected_to_correct_queue_page() {
		System.out.println("Implementation of Queue in Python title is:"+ quePage.QueuePgTitle());
	}
	@Then("Go back to previous page")
	public void go_back_to_previous_page() {
		quePage.goBack();
		//System.out.println("Implementation of Queue in Python title is:"+ quePage.QueuePgTitle());
	}
	@When("User clicks on Implementation using collections.deque link")
	public void user_clicks_on_implementation_using_collections_deque_link() {
		quePage.ImplemeUsngCollectionsLink();
	    
	}
	@When("User clicks on Queue Operations link")
	public void user_clicks_on_queue_operations_link() {
	    quePage.QueueOprationsLink();
	}
	@When("User clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
	    quePage.PracticeQuesLink();
	}


}
