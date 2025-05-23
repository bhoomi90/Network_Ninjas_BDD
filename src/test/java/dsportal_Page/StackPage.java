package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;

public class StackPage {

	private WebDriver driver = null;

	public String homePageURL = ConfigReader.getPropertyValue("URL"); // shouldhandle these on page
	public String stackPageURL = homePageURL + "stack/";
	public String operationInStackURL = stackPageURL + "operations-in-stack/";
	public String implementationURL = stackPageURL + "implementation/";
	public String applicationsURL = stackPageURL + "stack-applications/";

	
	@FindBy (xpath=("//h5[text()='Stack']/../a[text()='Get Started']")) WebElement stackClick;
	@FindBy (xpath=("//*[@data-toggle='dropdown']")) WebElement dropdown;
	@FindBy (xpath=("//a[text()='Stack']")) WebElement dropdownStack;

	@FindBy (xpath = ("//a[text()='Operations in Stack']")) WebElement operationStack;
	@FindBy (xpath = ("//a[text()='Implementation']")) WebElement implementationStack;
	@FindBy (xpath = ("//a[text()='Applications']")) WebElement applicationsStack;
		
	public StackPage() {
		 this.driver = DriverManager.getdriver(); 
		 PageFactory.initElements(driver, this);
		 LoggerReader.info("Initialized Stack Page");
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void getStarted_stack_page() {
		stackClick.click();
		LoggerReader.info("I am on Stack Page");
	}
	
	public void dropdown_stack_page() {
		dropdown.click();
		dropdownStack.click();
		LoggerReader.info("I am on Stack Page from dropdown");
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
