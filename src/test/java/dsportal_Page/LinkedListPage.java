package dsportal_Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LinkedListPage {

		protected WebDriver driver;

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
		
		public LinkedListPage(WebDriver driver) {
			 this.driver = driver;
			 
			 if(driver.getTitle().equals("NumpyNinja")) 
				 System.out.println("I am on ds-algo App");
			 else
				 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
			 
			 PageFactory.initElements(driver, this);
		}
		
		public void open_linkedList_page() {
			linkedListClick.click();
		}
		
		public void dropdown_linkedList_page() {
			dropdown.click();
			dropdownLinkedList.click();
			System.out.println("I am on Linked List Page");
		}
		
		public void introduction_page() {
			introductionClick.click();
			System.out.println("Directed to Introduction page from Linked List");
		}
	
		public void createLinkedList_page() {
			createLinkedListClick.click();
			System.out.println("Directed to Creating Linked List page from Linked List");
		}
		
		public void typesLinkedList_page() {
			typesLinkedListClick.click();
			System.out.println("Directed to Types of Linked List Page from Linked List");
		}
		
		public void implementLinkedList_page () {
			implementClick.click();
			System.out.println("Directed to Implement Linked List Page from Linked List");
		}
		
		public void traversal_page() {
			traversalClick.click();
			System.out.println("Directed to Traversal page from Linked List");
		}
		
		public void insertion_page() {
			insertionClick.click();
			System.out.println("Directed to from Linked List");
		}
		
		public void deletion_page() {
			deletionClick.click();
			System.out.println("Directed to from Linked List");
		}
}
