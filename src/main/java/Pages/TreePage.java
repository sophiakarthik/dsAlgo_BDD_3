package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {
	
	//Locators or Object repositiories
	private WebDriver driver;
	
	By GetStartedBtn = By.xpath("//body/div/div[6]/div/div/a");
	By OverviewOfTrees = By.linkText("Overview of Trees");
	By Terminologies = By.linkText("Terminologies");
	By TypesofTrees = By.linkText("Types of Trees");
	By TreeTraversals = By.linkText("Tree Traversals");
	By TraversalsIllustration = By.linkText("Traversals-Illustration");
	By BinaryTrees = By.linkText("Binary Trees");
	By TypesofBinaryTrees = By.linkText("Types of Binary Trees");
	By ImplementationinPython = By.linkText("Implementation in Python");
	By BinaryTreeTraversals = By.linkText("Binary Tree Traversals");
	By ImplementationofBinaryTrees = By.linkText("Implementation of Binary Trees");
	By ApplicationsofBinarytrees = By.linkText("Applications of Binary trees");
	By BinarySearchTrees = By.linkText("Binary Search Trees");
	By ImplementationOfBST = By.linkText("Implementation Of BST");
	
	
	
	
	//Constructor
	public TreePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Page Actions
	public void GetStartedBtn() {
		driver.findElement(GetStartedBtn).click();
	}
	public String TreePageTitle() {
		 System.out.println("The Page title is :"+ driver.getTitle()); 
		return driver.getTitle();
	}
	
	public void OverviewOfTrees() {
		driver.findElement(OverviewOfTrees).click();
	}
	public void Terminologies() {
		driver.findElement(Terminologies).click();
	}
	public void TypesofTrees() {
		driver.findElement(TypesofTrees).click();
	}
	public void TreeTraversals() {
		driver.findElement(TreeTraversals).click();
	}
	public void TraversalsIllustration() {
		driver.findElement(TraversalsIllustration).click();
	}
	public void BinaryTrees() {
		driver.findElement(BinaryTrees).click();
	}
	public void TypesofBinaryTrees() {
		driver.findElement(TypesofBinaryTrees).click();
	}
	public void ImplementationinPython() {
		driver.findElement(ImplementationinPython).click();
	}
	public void BinaryTreeTraversals() {
		driver.findElement(BinaryTreeTraversals).click();
	}
	public void ImplementationofBinaryTrees() {
		driver.findElement(ImplementationofBinaryTrees).click();
	}
	public void ApplicationsofBinarytrees() {
		driver.findElement(ApplicationsofBinarytrees).click();
	}
	public void BinarySearchTrees() {
		driver.findElement(BinarySearchTrees).click();
	}
	public void ImplementationOfBST() {
		driver.findElement(ImplementationOfBST).click();
	}

}