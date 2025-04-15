package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(className =  "btn") WebElement GetStartedBtn;
	@FindBy(className = "dropdown-toggle") WebElement dropdown;
	@FindBy (xpath=("//a[text()='Arrays']")) WebElement dropdownarray;
	@FindBy (xpath=("//a[text()='Linked List']")) WebElement dropdownlinkedlist;
	@FindBy (xpath=("//a[text()='Stack']")) WebElement dropdownstack;
	@FindBy (xpath=("//a[text()='Queue']")) WebElement dropdownqueue;
	@FindBy (xpath=("//a[text()='Tree']")) WebElement dropdowntree;
	@FindBy (xpath=("//a[text()='Graph']")) WebElement dropdowngraph;
	@FindBy (xpath=("//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']")) WebElement datastructureintro;
	@FindBy (xpath=("//h5[text()='Array']/../a[text()='Get Started']")) WebElement array;
	@FindBy (xpath=("//h5[text()='Linked List']/../a[text()='Get Started']")) WebElement linkedlist;
	@FindBy (xpath=("//h5[text()='Stack']/../a[text()='Get Started']")) WebElement stack;
	@FindBy (xpath=("//h5[text()='Queue']/../a[text()='Get Started']")) WebElement queue;
	@FindBy (xpath=("//h5[text()='Tree']/../a[text()='Get Started']")) WebElement tree;
	@FindBy (xpath=("//h5[text()='Graph']/../a[text()='Get Started']")) WebElement graph;
	
	public void getstarted() {
		GetStartedBtn.click();
		//LoginPage.clicklogin();
		
	}
	
	
	
	public void dropdown_elements() {
		dropdown.click();
		dropdownarray.click();
		dropdownlinkedlist.click();
		dropdownstack.click();
		dropdownqueue.click();
		dropdowntree.click();
		dropdowngraph.click();
	}
	
	public void elements() {
		datastructureintro.click();
		array.click();
		linkedlist.click();
		stack.click();
		queue.click();
		tree.click();
		graph.click();
	}
	
	
	
	//Get Started button by class =btn
	// Data structure class = nav-link dropdown-toggle
	//drop down Array class = dropdown-item contain text()='Arrays'
	//drop down Linked List class = dropdown-item contain text()='Linked List'
	//drop down Stack class = dropdown-item contain text()='Stack'
	//drop down Queue class = dropdown-item contain text()='Queue'
	//drop down Tree class = dropdown-item contain text()='Tree'
	//drop down Graph class = dropdown-item contain text()='Graph'
	
	// Register by linktext("Register")
	// Sign in by linktext("Sign in")
	
	}
