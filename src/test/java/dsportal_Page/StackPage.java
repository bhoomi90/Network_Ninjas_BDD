package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_utilities.LoggerReader;

public class StackPage {

	static WebDriver driver;

	@FindBy (xpath=("//h5[text()='Stack']/../a[text()='Get Started']")) WebElement stackClick;
	@FindBy (xpath=("//*[@data-toggle='dropdown']")) WebElement dropdown;
	@FindBy (xpath=("//a[text()='Stack']")) WebElement dropdownStack;

	@FindBy (xpath = ("//a[text()='Operations in Stack']")) WebElement operationStack;
	@FindBy (xpath = ("//a[text()='Implementation']")) WebElement implementationStack;
	@FindBy (xpath = ("//a[text()='Applications']")) WebElement applicationsStack;
		
	public StackPage(WebDriver driver) {
		 StackPage.driver = driver;
		 
		 if(driver.getTitle().equals("NumpyNinja")) 
			 LoggerReader.info("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void getStarted_stack_page() {
		stackClick.click();
	}
	
	public void dropdown_stack_page() {
		dropdown.click();
		dropdownStack.click();
		LoggerReader.info("I am on Stack Page");
	}
	
	public void operationInStack_page() {
		operationStack.click();
		LoggerReader.info("Directed to Operations in Stack page from Stack");
	}
	
	public void implementation_page() {
		implementationStack.click();
		LoggerReader.info("Directed to Implementation page from Stack");
	}
	
	public void application_page() {
		applicationsStack.click();
		LoggerReader.info("Directed to Applications page from Stack");
	}
}
