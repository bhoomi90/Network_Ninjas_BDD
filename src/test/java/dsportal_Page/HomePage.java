package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_utilities.LoggerReader;

public class HomePage {
	
	private static WebDriver driver;

	@FindBy(xpath = ("//*[text()='Sign in']"))
	WebElement signIn;
	@FindBy(xpath = ("//*[text()=' Register ']"))
	WebElement Register;
	@FindBy(className = "btn")
	WebElement GetStartedBtn;
	@FindBy(className = "dropdown-toggle")
	WebElement dropdown;
	@FindBy(xpath = ("//div[@class='dropdown-menu show']"))
	WebElement showingdropdownmenu;
	@FindBy(xpath = ("//div[contains(text(),'You are not logged in')]"))
	WebElement notloggedinalert;
	@FindBy(xpath = ("//a[text()='Arrays']"))
	WebElement dropdownarray;
	@FindBy(xpath = ("//a[text()='Linked List']"))
	WebElement dropdownlinkedlist;
	@FindBy(xpath = ("//a[text()='Stack']"))
	WebElement dropdownstack;
	@FindBy(xpath = ("//a[text()='Queue']"))
	WebElement dropdownqueue;
	@FindBy(xpath = ("//a[text()='Tree']"))
	WebElement dropdowntree;
	@FindBy(xpath = ("//a[text()='Graph']"))
	WebElement dropdowngraph;
	@FindBy(xpath = ("//a[@href='data-structures-introduction' and text()='Get Started']"))
	WebElement datastructureintro;
	@FindBy(xpath = ("//a[@href='array' and text()='Get Started']"))
	WebElement array;
	@FindBy(xpath = ("//a[@href='linked-list' and text()='Get Started']"))
	WebElement linkedlist;
	@FindBy(xpath = ("//a[@href='stack' and text()='Get Started']"))
	WebElement stack;
	@FindBy(xpath = ("//a[@href='queue' and text()='Get Started']"))
	WebElement queue;
	@FindBy(xpath = ("//a[@href='tree' and text()='Get Started']"))
	WebElement tree;
	@FindBy(xpath = ("//a[@href='graph' and text()='Get Started']"))
	WebElement graph;
	@FindBy (xpath=("//*[@role='alert']")) 
	WebElement alertMsg;
	
	String Dsalgo_url = ("https://dsportalapp.herokuapp.com/");
	public String Home_Url =(Dsalgo_url+"home/");
	
	String DataStruc_Url =(Dsalgo_url+"data-structures-introduction/");
	String Array_Url =(Dsalgo_url+"array/");
	String Linkedlist_Url =(Dsalgo_url+"linked-list/");
	String Stack_Url =(Dsalgo_url+"stack/");
	String Queue_Url =(Dsalgo_url+"queue/");
	String Tree_Url =(Dsalgo_url+"tree/");
	String Graph_Url =(Dsalgo_url+"graph/");
	String loginText;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;

		if (driver.getTitle().equals("Numpy Ninja"))
			LoggerReader.info("I am on ds-algo App");
		else
			throw new IllegalStateException("This is not ds-algo app. The current page is: " + driver.getCurrentUrl());

		PageFactory.initElements(driver, this);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	public void getstarted() {
		GetStartedBtn.click();
		LoggerReader.info("Clicking GetStarted Button");		
	}
	
	public void dropdown() {
		dropdown.click();
		LoggerReader.info("Clicking Dropdown");		
	}
	public void navigateback() {
		driver.navigate().back();
		LoggerReader.info("Clicking browser back arrow");
	}
	public void refreshPage() {
		driver.navigate().refresh();
	}
	public String compareLoginText() {
		loginText = alertMsg.getText();
		LoggerReader.info("User is logged in");
		return loginText;
	}

	// Clicking the Elements under dropdown 
	public void dropdown_array() {
		dropdownarray.click();
		LoggerReader.info("Clicking Array under Dropdown");		
	}
	
	public void dropdown_linkedlist() {
		dropdownlinkedlist.click();
		LoggerReader.info("Clicking Linkedlist under Dropdown");		
	}
	
	public void dropdown_stack() {
		dropdownstack.click();
		LoggerReader.info("Clicking Stack under Dropdown");		
	}
	
	public void dropdown_queue() {
		dropdownqueue.click();
		LoggerReader.info("Clicking Queue under Dropdown");		
	}
	
	public void dropdown_tree() {
		dropdowntree.click();
		LoggerReader.info("Clicking tree under Dropdown");		
	}
	
	public void dropdown_graph() {
		dropdowngraph.click();
		LoggerReader.info("Clicking Graph under Dropdown");		
	}
	
	// Elements in the Home Page and clicking Get Started under the Elements
	public void datastructure() {
		datastructureintro.click();
		LoggerReader.info("Clicking DataStructure");		
	}
	
	public void array() {
		array.click();
		LoggerReader.info("Clicking Array");		
	}
	
	public void linkedlist() {
		linkedlist.click();
		LoggerReader.info("Clicking Linkedlist");		
	}
	
	public void stack() {
		stack.click();
		LoggerReader.info("Clicking Stack");		
	}
	
	public void queue() {
		queue.click();
		LoggerReader.info("Clicking Queue");		
	}
	
	public void tree() {
		tree.click();
		LoggerReader.info("Clicking Tree");		
	}
	
	public void graph() {
		graph.click();
		LoggerReader.info("Clicking Graph");		
	}
	
	public void sign_in() {
		signIn.click();
	}

	
	
//	String currentPageUrl = cp.getCurrentUrl();
//	   String expectedPageUrl = gp.graphPageURL;
//	   System.out.println("The user is able to directed to graph page: "+currentPageUrl);
//	   Assert.assertEquals(expectedPageUrl, currentPageUrl,"The user not directed to graph page");
//	
	
	
	
	
		
		
		
		
		
		
	
	
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
