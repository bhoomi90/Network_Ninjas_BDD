package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {

	public static WebDriver driver;

	@FindBy (xpath=("//h5[text()='Stack']/../a[text()='Get Started']")) WebElement stackClick;
	@FindBy (xpath=("//*[@data-toggle='dropdown']")) WebElement dropdown;
	@FindBy (xpath=("//a[text()='Stack']")) WebElement dropdownStack;

	@FindBy (xpath = ("//a[text()='Operations in Stack']")) WebElement operationStack;
	@FindBy (xpath = ("//a[text()='Implementation']")) WebElement implementationStack;
	@FindBy (xpath = ("//a[text()='Applications']")) WebElement applicationsStack;
	
	@FindBy (xpath = ("//a[text()='Practice Questions']")) WebElement practiceQue;

	
	public StackPage(WebDriver driver) {
		 StackPage.driver = driver;
		 
//		 if(driver.getTitle().equals("NumpyNinja")) 
//			 System.out.println("I am on ds-algo App");
//		 else
//			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}


	
	public void dropdown_stack_page() {
		dropdown.click();
		dropdownStack.click();
		System.out.println("I am on Stack Page");
	}
	
	public void operationInStack_page() {
		operationStack.click();
		System.out.println("Directed to Operations in Stack page from Stack");
	}
	
	public void practiceQue_page() {
		practiceQue.click();
		System.out.println("I am on practice questions page under Slack");
	}
	
	public void implementation_page() {
		implementationStack.click();
		System.out.println("Directed to Implementation page from Stack");
	}
	
	public void application_page() {
		applicationsStack.click();
		System.out.println("Directed to Applications page from Stack");
	}
}
