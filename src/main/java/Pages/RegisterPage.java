package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	private WebDriver driver;
	
	//By locators or Object Repositories
	
	By RegisterBtn = By.linkText("Register");
	By Rgster = By.xpath("//input[@value='Register']");
	By UserName = By.id("id_username");
	By Passwrd = By.id("id_password1");
	By passwrdConf = By.id("id_password2");
	By alrtMsg = By.xpath("//div[@class='alert alert-primary']");
	By psswrdAlrMsg = By.xpath("//div[@class = 'alert alert-primary']");
	By AcntCrtedMsg = By.xpath("//div[@class='alert alert-primary']");
	
	//constructor
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Page Actions Features(behavior of the page)
	
	public String RegisterPageTitle() {		
		return driver.getTitle();
				}
	
	public void RegisterBtn(){
		driver.findElement(RegisterBtn).click();
	                           	}
	
	public void errorMsg() {
		driver.findElement(Rgster).click();
		 WebElement activeElement = driver.switchTo().activeElement();
		    String msgStr = activeElement.getAttribute("validationMessage");
		    System.out.println("Message appeared "+ msgStr);
	    
	}
	public void UserName(String username) {
		driver.findElement(UserName).sendKeys(username);
			
	}
	public void password(String Password) {
		
		driver.findElement(Passwrd).sendKeys(Password);
	}
	public void RegisterBtn2() {
		driver.findElement(Rgster).click();
	}
	public void PasswordConf(String passconf) {
		driver.findElement(passwrdConf).sendKeys(passconf);
	}
	public void PsswrdAlrtMsg() {
		System.out.println("New message: "+ driver.findElement(psswrdAlrMsg).getText());
	}
	public void AccCrtedMsg() {
		System.out.println("Account Created Message: "+ driver.findElement(AcntCrtedMsg).getText());
	}
	
		
	}


