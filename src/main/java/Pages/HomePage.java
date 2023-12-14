package Pages;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	
	//Object repositiories or Locators
	
	//private By HomePageSections = By.xpath("//div[@class='dropdown-menu show']");
	//By DropdownLst = By.xpath("//div[@class='navbar-nav']/div/a");
	By ArrayLst = By.linkText("Arrays");
	By LinkListLnk = By.linkText("Linked List");
	By StackLnk = By.linkText("Stack");
	By QueueLnk = By.linkText("Queue");
	By TreeLnk = By.linkText("Tree");
	By GraphLnk = By.linkText("Graph");
    By signin=By.linkText("Sign in");
	By register=By.xpath("//ul/a[2]");	
	private By home=By.xpath("\"//*[text()='Get Started']");
	 private By dropodown=By.xpath("//body/div/nav/div/div/div");
	 private By Arrays=By.linkText("Arrays");
	 private By Linkedlist=By.linkText("Linked List");
	 private By Msg=By.xpath("//body/div[2]");
	 private By Stack=By.xpath("//*[text()='Stack']");
	 private By Queue=By.xpath("//*[text()='Queue']");
	 private By Tree=By.xpath("//*[text()='Tree']");
	 private By Graph=By.xpath("//*[text()='Graph']");

	
	//Constructor
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	//Page Actions
	
	public void DropDownLst() {
		driver.findElement(dropodown).click();
		}
	
	public List<String> getHomeSecList() {
		List<String> HomePgeList = new ArrayList<String>();
		List<WebElement> HomePageList = driver.findElements(home);
		for (WebElement e : HomePageList) {
			String text = e.getText();
			System.out.println(text);
			HomePgeList.add(text);
		}
		return HomePgeList;
	}
	public void ArraySelection() {
		driver.findElement(ArrayLst).click();
	}
	
	public void LinkedListSelection() {
		driver.findElement(LinkListLnk).click();
	}
	public void StackSelection() {
		driver.findElement(StackLnk).click();
	}
	public void QueueSelection() {
		driver.findElement(QueueLnk).click();
	}
	public void treeSelection() {
		driver.findElement(TreeLnk).click();
	}
	public void GraphSelection() {
		driver.findElement(GraphLnk).click();
	}
	public void RespPageTitle() {
		driver.getCurrentUrl();
		driver.getTitle();
		System.out.println("Current page title is:"+ driver.getTitle());
		System.out.println("Page Current Title of the page is :"+ driver.getCurrentUrl());
		
	}
	public String PageTitle() {
		return driver.getTitle();
	}
	public String error_msg() {
   	 //dropdownclick();    	 
//   	 WebElement error=driver.findElement(Tree);
//   	 System.out.println("I am clicking : " + error.getText());
//   	 error.click();
//   	 //String error_message=error.getAttribute("error");
   	 //WebElement errorMsg=driver.findElement(Msg);
   	 String eMsg = driver.findElement(Msg).getText();
   	 System.out.println("The error message is: " + eMsg);
   	 return eMsg;
   	 }
    public void signin() {
   	 driver.findElement(signin).click();
    }
    public void Register() {
   	 driver.findElement(register).click();
   	 }	
	
	
    public ArrayList<String> dropdowndata() {
   	 ArrayList<String> myList=new ArrayList<>();
   	 String str= driver.findElement(Arrays).getText();
   	 System.out.println("My message " + str);
   	 myList.add(str);
   	 myList.add(driver.findElement(LinkListLnk).getText());
   	 myList.add(driver.findElement(StackLnk).getText());
   	 myList.add(driver.findElement(QueueLnk).getText());
   	 myList.add(driver.findElement(TreeLnk).getText());
   	 myList.add(driver.findElement(GraphLnk).getText());
   	 System.out.println("List size: " + myList.size());
   	 System.out.println("List of Elements: " + myList);
   	 return myList;	

    }
	public void signinPgTitle() {
   	 String SigninPageMsg = driver.getTitle();
   	 System.out.println(SigninPageMsg);
    }
    public void RegisterPageValidation() {
   	System.out.println(driver.getCurrentUrl()); 
    }
	

}