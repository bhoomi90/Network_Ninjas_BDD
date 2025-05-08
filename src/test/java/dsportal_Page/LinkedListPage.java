package dsportal_Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;


public class LinkedListPage {

		private WebDriver driver = null;
		public String homePageURL = ConfigReader.getPropertyValue("URL");;
		public String linkedListPageURL = homePageURL+"linked-list/";

		@FindBy (xpath=("//h5[text()='Linked List']/../a[text()='Get Started']")) WebElement linkedListClick;
		@FindBy (xpath=("//*[@data-toggle='dropdown']")) WebElement dropdown;
		@FindBy (xpath=("//a[text()='Linked List']")) WebElement dropdownLinkedList;
		
		@FindBy (xpath=("//a[text()='Introduction']")) WebElement introductionClick;
		@FindBy (linkText = ("Creating Linked LIst")) WebElement createLinkedListClick; 
		@FindBy (linkText = ("Types of Linked List")) WebElement typesLinkedListClick;
		@FindBy (linkText = ("Implement Linked List in Python")) WebElement implementClick;
		@FindBy (linkText = ("Traversal")) WebElement traversalClick;
		@FindBy (linkText = ("Insertion")) WebElement insertionClick;
		@FindBy (linkText = ("Deletion")) WebElement deletionClick;
		
		@FindBy (xpath = ("//a[text()='Try here>>>']")) WebElement tryHereClick;
		@FindBy (xpath=("//*[text()='Run']")) WebElement runBttn;
		@FindBy (xpath=("//textarea[@spellcheck='false']")) WebElement enterCode;
		
		public LinkedListPage() {
			this.driver = DriverManager.getdriver();
			PageFactory.initElements(driver, this);
			LoggerReader.info("Initialized Linked List Page");
		}

		public String getCurrentUrl() {
			return driver.getCurrentUrl();
		}
		
		public String getCurrentTitle() {
			return driver.getTitle();
		}
		
		public void open_linkedList_page() {
			linkedListClick.click();
		}
		
		public void dropdown_linkedList_page() {
			dropdown.click();
			dropdownLinkedList.click();
			LoggerReader.info("I am on Linked List Page");
		}
		
		public void introduction_page() {
			introductionClick.click();
			LoggerReader.info("Directed to Introduction page from Linked List");
		}
	
		public void createLinkedList_page() {
			createLinkedListClick.click();
			LoggerReader.info("Directed to Creating Linked List page from Linked List");
		}
		
		public void typesLinkedList_page() {
			typesLinkedListClick.click();
			LoggerReader.info("Directed to Types of Linked List Page from Linked List");
		}
		
		public void implementLinkedList_page () {
			implementClick.click();
			LoggerReader.info("Directed to Implement Linked List Page from Linked List");
		}
		
		public void traversal_page() {
			traversalClick.click();
			LoggerReader.info("Directed to Traversal page from Linked List");
		}
		
		public void insertion_page() {
			insertionClick.click();
			LoggerReader.info("Directed to Insertion page from Linked List");
		}
		
		public void deletion_page() {
			deletionClick.click();
			LoggerReader.info("Directed to Deletion page from Linked List");
		}
}
