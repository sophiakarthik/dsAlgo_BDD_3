package StepDefinitions;

import Pages.GraphPage;
import Pages.StackPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageSteps {
	private GraphPage GrfPage = new GraphPage(Factory.DriverFactory.getDriver());
	
	
	@When("User Clicks on the Get Started button under Graph Section")
	public void user_clicks_on_the_get_started_button_under_graph_section() {
		GrfPage.GetStartedBtn();
	   
	}

	@Then("Graph Page opens up")
	public void graph_page_opens_up() {
		GrfPage.GraphPageTitle();
	   
	}

	@When("User clicks on Graph in Graph page")
	public void user_clicks_on_graph_in_graph_page() {
		GrfPage.GraphBtn();
	   
	}

	@Then("User should be redirected to Graph in Graph page")
	public void user_should_be_redirected_to_graph_in_graph_page() {
		GrfPage.GraphPageTitle();
	   
	}
	@When("User clicks on Graph Representations in Graph page")
	public void user_clicks_on_graph_representations_in_graph_page() {
		GrfPage.GrfRepresentationBtn();
	}

	@Then("User should be redirected to Graph Representations in Graph page")
	public void user_should_be_redirected_to_graph_representations_in_graph_page() {
		GrfPage.GraphPageTitle();
		
	}

}
