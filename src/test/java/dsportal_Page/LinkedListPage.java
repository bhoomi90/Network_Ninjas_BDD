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
	

}
