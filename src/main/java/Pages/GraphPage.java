package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {
	//Locators or Object repositiories
		private WebDriver driver;
		By GetStartBtn = By.xpath("//body/div/div[7]/div/div/a");
		By GraphPageBtn = By.linkText("Graph");
		By GrfRepresentationBtn = By.linkText("Graph Representations");
		
	//Constructor
		public GraphPage(WebDriver driver) {
			this.driver = driver;
		}
		
	//page Actions
	public void GetStartedBtn() {
		driver.findElement(GetStartBtn).click();
	}
	public String GraphPageTitle() {
		System.out.println("Graph Page title is :"+ driver.getTitle());
		return driver.getTitle();
	}
	public void GraphBtn() {
		driver.findElement(GraphPageBtn).click();
	}

	public void GrfRepresentationBtn() {
		driver.findElement(GrfRepresentationBtn).click();
	}
	

}
