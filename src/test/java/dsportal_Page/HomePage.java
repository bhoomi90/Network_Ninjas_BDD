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
	@FindBy (xpath=("//a[@href='data-structures-introduction' and text()='Get Started']")) WebElement datastructureintro;
	@FindBy (xpath=("//a[@href='array' and text()='Get Started']")) WebElement array;
	@FindBy (xpath=("//a[@href='linked-list' and text()='Get Started']")) WebElement linkedlist;
	@FindBy (xpath=("//a[@href='stack' and text()='Get Started']")) WebElement stack;
	@FindBy (xpath=("//a[@href='queue' and text()='Get Started']")) WebElement queue;
	@FindBy (xpath=("//a[@href='tree' and text()='Get Started']")) WebElement tree;
	@FindBy (xpath=("//a[@href='graph' and text()='Get Started']")) WebElement graph;
	
	String Dsalgo_url = ("https://dsportalapp.herokuapp.com/");
	String Home_Url =(Dsalgo_url+"home/");
	String DataStruc_Url =(Dsalgo_url+"data-structures-introduction/");
	String Array_Url =(Dsalgo_url+"array/");
	String Linkedlist_Url =(Dsalgo_url+"linked-list/");
	String Stack_Url =(Dsalgo_url+"stack/");
	String Queue_Url =(Dsalgo_url+"queue/");
	String Tree_Url =(Dsalgo_url+"tree/");
	String Graph_Url =(Dsalgo_url+"graph/");
	
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
