package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArrayPage {
	
	//Locators or Object repositories
	
	private WebDriver driver;
	By GetStarted = By.linkText("Get Started");
	By ArrayInPython = By.linkText("Arrays in Python");
	By ChekArrayPage = By.xpath("/html/body/div[2]/div/div[2]/strong/p");
	
	private By ArraySections = By.cssSelector("div#content a");
	
	//constructor
	
	public ArrayPage() {
		this.driver = driver;
	}
	
	//Page actions
	
	public int getArraySectionCount() {
		return driver.findElements(ArraySections).size();
	}
	
	public List<String> getArraySecList() {
		List<String> ArrayList = new ArrayList<String>();
		List<WebElement> ArraySecList = driver.findElements(ArraySections);
		
		for(WebElement e : ArraySecList) {
			String text = e.getText();
			System.out.println(text);
			ArrayList.add(text);
		}
		return ArrayList;
	}
	public void GetStartedBtn() {
		driver.findElement(GetStarted);
	}
	public void ArrayPageTitle() {
		driver.getTitle();
	}
	public void ArrayInPython() {
		driver.findElement(ArrayInPython);
	}
	public void ChkArrayInPythonPage() {
		
		if(driver.getCurrentUrl()== "https://dsportalapp.herokuapp.com/array/arrays-in-python/") {
			System.out.println("Arrays in Python Page is displayed");
			
		}
	}
	
	

}
