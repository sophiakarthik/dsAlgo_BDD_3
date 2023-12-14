package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {
	private WebDriver driver;
    //1.My Locators;
private By getstart= By.className("btn");
private By signin=By.xpath("//a[contains(text(),'Sign in')]");
private By usernm=By.name("username");
private By passwd=By.name("password");
private By login=By.xpath("//input[@type='submit']");
private By getstarted=By.xpath("//body/div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]/div[1]/div[1]/a[1]");
private By TimeComplexbtn=By.className("list-group-item");
private By practicebtn=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
private By tryherebtn=By.xpath("//a[@class='btn btn-info']");
private By codess=By.xpath("//div[@class='CodeMirror-scroll']");
private By runbtn=By.xpath("//button[@type='button']");


   //2.constructor of the page class
public DataStructurePage (WebDriver driver) {
	this.driver=driver;
}
  //3.page actions -features of the page in the form of methods
public void getstartbtn() {
	driver.findElement(getstart).click();
}

public void signinbtn() {
	driver.findElement(signin).click();
}

public void username(String usernam) {
	driver.findElement(usernm).sendKeys(usernam);
}
public void password(String passwod) {
	driver.findElement(passwd).sendKeys(passwod);
}
public void loginbtn(){
	driver.findElement(login).click();
	
}
public String getHomePageTitle(){
	return driver.getTitle();
}
public void datastructuregetstartbtn() {
	driver.findElement(getstarted).click();
}

public void Timecomplxbtn() {
	driver.findElement(TimeComplexbtn).click();
}

public void practicequ() {
	driver.findElement(practicebtn).click();
}
public void TryHereBtn() {
	driver.findElement(tryherebtn).click();	
}
public void code(String  codes) {
	driver.findElement(codess).sendKeys(codes);
}
public void runbt() {
	driver.findElement(runbtn).click();
}
}


