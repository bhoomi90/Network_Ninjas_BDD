package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;

public class QueuePage {

	private WebDriver driver = null;
	String homePageURL = ConfigReader.getPropertyValue("URL");;
	String QueueImpleURL, QueueCollectURL, QueueImpArrayURL, QueueOperURL, QueuePageURL;
	
	@FindBy(xpath = ("//*[text()='Get Started']"))
	WebElement getStarted;
	@FindBy(xpath = ("//*[text()='Sign In']"))
	WebElement signIn;
	@FindBy(id = ("id_username"))
	WebElement userName;
	@FindBy(id = ("id_password"))
	WebElement password;
	@FindBy(xpath = ("//*[type()='submit']"))
	WebElement loginIn;
	@FindBy(xpath = ("//h5[text()='Queue']/../a[text()='Get Started']"))
	WebElement queue;
	@FindBy(xpath = ("//*[@data-toggle='dropdown']"))
	WebElement dropdown;
	@FindBy(xpath = ("//a[text()='Queue']"))
	WebElement dropdownqueue;

	@FindBy(xpath = ("//a[text()='Implementation of Queue in Python']"))
	WebElement implementationOfQueueInPython;
	@FindBy(xpath = ("//a[text()='Implementation using collections.deque']"))
	WebElement implementationUsingCollectionsDeque;
	@FindBy(xpath = ("//a[text()='Implementation using array']"))
	WebElement implementationUingArray;
	@FindBy(xpath = ("//a[text()='Queue Operations']"))
	WebElement queueOperations;

	@FindBy(xpath = ("//a[text()='Try here>>>']"))
	WebElement tryHereButton;

	@FindBy(xpath = ("//a[text()='Practice Questions']"))
	WebElement practiceQuestionsButton;

	@FindBy(xpath = "//button[text()='Sign out']")
	WebElement signOutButton;

	@FindBy(id = "editor")
	WebElement editorField;

	@FindBy(xpath = ("//button[text()='Run']"))
	WebElement runButton;

	@FindBy(id = "outputMessage")
	WebElement outputMessage;

	// Constructor
	public QueuePage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized Queue Page");
	}

	// Methods

	public void clickLoginIn() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		userName.sendKeys("Network_Ninjas");
		password.sendKeys("OrangeS@12");
		loginIn.click();
	}

	public void clickGetStarted() {
		getStarted.click();
	}

	public void dropdown_queue_page() {
		dropdown.click();
		dropdownqueue.click();
	}

	public void clickImplementationQueuePython() {
		implementationOfQueueInPython.click();
	}

	public void clickImplementationUsingCollectionsDeque() {
		implementationUsingCollectionsDeque.click();
	}

	public void clickImplementationUingArray() {
		implementationUingArray.click();
	}

	public void clickQueueOperations() {
		queueOperations.click();
	}

	public void clickTryHere() {
		tryHereButton.click();
	}

	public void clickPracticeQuestions() {
		practiceQuestionsButton.click();
	}

	public void enterCode(String code) {
		editorField.sendKeys(code);
	}

	public void clickRunButton() {
		runButton.click();
	}

	public String getOutputMessage() {
		return outputMessage.getText();
	}

	public void clickSignOut() {
		signOutButton.click();
	}




	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
}
