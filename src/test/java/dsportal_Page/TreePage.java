package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_utilities.LoggerReader;

public class TreePage {

	static WebDriver driver;
	
	@FindBy (xpath=("//*[@data-toggle='dropdown']")) WebElement dropdown;
	@FindBy (xpath=("//a[text()='Tree']")) WebElement dropdownTree;	
	@FindBy(xpath="//a[text()='Overview of Trees']") WebElement overview_Tree;	
	@FindBy(xpath="//a[text()='Terminologies']") WebElement termino_Tree;
	@FindBy(xpath="//a[text()='Types of Trees']") WebElement types_Tree;
	@FindBy(xpath="//a[text()='Tree Traversals']")	WebElement travers_Tree;
	@FindBy(xpath="//a[text()='Traversals-Illustration']") WebElement illus_Tree;
	@FindBy(xpath="//a[text()='Binary Trees']")	WebElement binary_Tree;
	@FindBy(xpath="//a[text()='Types of Binary Trees']") WebElement typebin_Tree;
	@FindBy(xpath="//a[text()='Implementation in Python']")	WebElement implePy_Tree;
	@FindBy(xpath="//a[text()='Binary Tree Traversals']") WebElement binTrave_Tree;
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']") WebElement impbinary_Tree;
	@FindBy(xpath="//a[text()='Applications of Binary trees']")	WebElement appbinary_Tree;
	@FindBy(xpath="//a[text()='Binary Search Trees']") 	WebElement binsearch_Tree;
	@FindBy(xpath="//a[text()='Implementation Of BST']") WebElement impleBST_Tree;
	
	public TreePage(WebDriver driver) {
		 TreePage.driver = driver;
		 
		 if(driver.getTitle().equals("NumpyNinja")) 
			 LoggerReader.info("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}
	
	public void dropdown_tree_page() {
		dropdown.click();
		dropdownTree.click();
		LoggerReader.info("I am on Tree Page");
	}

	public void overview_tree() {
		overview_Tree.click();
		LoggerReader.info("");
	}
	
	public void Terminology_Link()
	{
		termino_Tree.click();
		LoggerReader.info("");
		
	}
	public void TypesOfTree_Link()
	{
		types_Tree.click();
		LoggerReader.info("");
		
	}
	public void Traverse_Link()
	{
		travers_Tree.click();
		LoggerReader.info("");
	}
	public void TreeIllus_Link()
	{
		illus_Tree.click();
		LoggerReader.info("");
	}
	public void BinaryTree_Link()
	{
		binary_Tree.click();
		LoggerReader.info("");
	}
	public void TypeBinary_Link()
	{
		typebin_Tree.click();
		LoggerReader.info("");
	}
	
	public void ImplePython_Link()
	{
		implePy_Tree.click();
		LoggerReader.info("");
	}
	
	public void  BinTrave_Link()
	{
		binTrave_Tree.click();
		LoggerReader.info("");
	}
	
	public void ImpleBinary_Link()
	{
		impbinary_Tree.click();
		LoggerReader.info("");
	}
	
	public void AppBinary_Link()
	{
		appbinary_Tree.click();
		LoggerReader.info("");
	}
	
	public void BinSearch_Link()
	{
		binsearch_Tree.click();
		LoggerReader.info("");
	}
	
	public void ImpleBST_Link()
	{
		impleBST_Tree.click();
		LoggerReader.info("");
	}
}