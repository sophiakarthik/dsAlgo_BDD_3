package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	
	//Locators or Object repositiories
	private WebDriver driver;
	
	By GetStartedBtn = By.xpath("//body/div/div[4]/div/div/a");
	By OperationsInStack = By.linkText("Operations in Stack");
	By Implementation = By.linkText("Implementation");
	By Application = By.linkText("Applications");
	
	
	//Constructor
	public StackPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	//Page Actions
	public void GetStartedBtn() {
		driver.findElement(GetStartedBtn).click();
	}
	public String StackPageTitle() {
		return driver.getTitle();
	}
	
	public void OperationsInStack() {
		driver.findElement(OperationsInStack).click();
	}
	public void OperationsInStackPage() {
		driver.getCurrentUrl();
		System.out.println("Operations In Stack Page current Title is :"+driver.getTitle());
	}
	public void Implementation() {
		driver.findElement(Implementation).click();
	}
	public void ImplementationPage() {
		System.out.println("Implementation page current Title is :"+driver.getTitle());
	}
	public void Application() {
		driver.findElement(Application).click();
	}
	public void ApplicationPage() {
		System.out.println("Applications Page Current Title is :"+driver.getTitle());
	}
	
	
	

}
