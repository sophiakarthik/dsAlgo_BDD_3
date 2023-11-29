package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signinpage {
private WebDriver driver;
    //1.My Locators;
private By getstart= By.className("btn");
private By signin=By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]");
private By usernm=By.name("username");
private By passwd=By.name("password");
private By login=By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
   //2.constructor of the page class
public signinpage (WebDriver driver) {
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
public void loginbtn() {
	driver.findElement(login).click();





}
}