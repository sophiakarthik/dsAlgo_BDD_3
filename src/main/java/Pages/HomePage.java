package Pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	 private WebDriver driver;
	 private By home=By.xpath("\"//*[text()='Get Started']");
	 private By dropodown=By.xpath("//body/div/nav/div/div/div");
	 private By Arrays=By.linkText("Arrays");
	 private By Linkedlist=By.linkText("Linked List");
	 private By Msg=By.xpath("//body/div[2]");
	 private By Stack=By.xpath("//*[text()='Stack']");
	 private By Queue=By.xpath("//*[text()='Queue']");
	 private By Tree=By.xpath("//*[text()='Tree']");
	 private By Graph=By.xpath("//*[text()='Graph']");
	 private By signin=By.linkText("Sign in");
	 private By register=By.xpath("//ul/a[2]");
	 //private By login=By.xpath("//ul/a[3]");
	 //private By collection_getstart=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	 //constructor of the homepg
	 public HomePage (WebDriver driver) {
		 this.driver=driver;
	 }
	 //page actions:features(behavior) of the page the form of methods
	 public void click_home() {
		 driver.findElement(home).click();
		
	 }
     public void dropdownclick() {
    	 driver.findElement(dropodown).click();
     }
     public String Arraydropdown_validation() {
    	 String str= driver.findElement(Arrays).getText();
    	 System.out.println("My message " + str);
    	 return str;
    	 }
     public String error_msg() {
    	 //dropdownclick();    	 
    	 WebElement error=driver.findElement(Tree);
    	 System.out.println("I am clicking : " + error.getText());
    	 error.click();
    	 //String error_message=error.getAttribute("error");
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
    	 myList.add(driver.findElement(Linkedlist).getText());
    	 myList.add(driver.findElement(Stack).getText());
    	 myList.add(driver.findElement(Queue).getText());
    	 myList.add(driver.findElement(Tree).getText());
    	 myList.add(driver.findElement(Graph).getText());
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