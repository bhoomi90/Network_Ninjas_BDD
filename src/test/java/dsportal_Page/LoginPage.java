package dsportal_Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ExcelReader;
import dsportal_utilities.LoggerReader;

public class LoginPage {

	private WebDriver driver = null;
	
	@FindBy(xpath = ("//*[text()='Get Started']"))
	WebElement getStarted;
	@FindBy(xpath = ("//*[text()='Sign in']"))
	WebElement signIn;
	@FindBy(id = "id_username")
	WebElement usernameInput;
	@FindBy(id = "id_password")
	WebElement passwordInput;
	@FindBy(xpath = ("//*[@type='submit']"))
	WebElement login;
	@FindBy(xpath = ("//a[text()='Sign out']"))
	WebElement signout;
	@FindBy (xpath=("//*[@role='alert']")) 
	WebElement alertMsg;

	String loginText, logoutText, errorText;
	String userName, password;
	
	public LoginPage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized Login Page");
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void getStarted() {
		getStarted.click();
	}	
	
	public void clickSignin() {
		signIn.click();
	}

	
	public String compareLoginText() {
		loginText = alertMsg.getText();
		LoggerReader.info("User is logged in");
		return loginText;
	}

	public void empty_fields() {
		usernameInput.sendKeys("");
		passwordInput.sendKeys("");
		login.click();
	}
	
	public String getValidationMessage_username() {
		@SuppressWarnings("deprecation")
		String msg = usernameInput.getAttribute("validationMessage");
		LoggerReader.info(msg);
		return msg;
	}
	
	public String getValidationMessage_password() {
		@SuppressWarnings("deprecation")
		String msg = passwordInput.getAttribute("validationMessage");
		LoggerReader.info(msg);
		return msg;
	}
	
	public void empty_valid_field() throws IOException, Throwable {
		usernameInput.sendKeys("");
//		passwordInput.sendKeys("OrangeS@12");
		password = ExcelReader.getCellValue("Login", 1, 2);
		passwordInput.sendKeys(password);
		login.click();
	}
	
	public void valid_empty_field() throws IOException, Throwable {
		userName = ExcelReader.getCellValue("Login", 1, 0);
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys("");
		login.click();
	}
	
	public void invalid_valid_field() throws IOException, Throwable {
		userName = ExcelReader.getCellValue("Login", 1, 1);
		password = ExcelReader.getCellValue("Login", 1, 2);
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		login.click();
	}
	
	public void valid_invalid_field() throws IOException, Throwable {
		userName = ExcelReader.getCellValue("Login", 1, 0);
		password = ExcelReader.getCellValue("Login", 1, 3);
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		login.click();
	}
	
	public void invalid_invalid_field() throws IOException, Throwable {
		userName = ExcelReader.getCellValue("Login", 1, 1);
		password = ExcelReader.getCellValue("Login", 1, 3);
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		login.click();
	}
	
	public void valid_valid_field() throws IOException, Throwable {
		userName = ExcelReader.getCellValue("Login", 1, 0);
		password = ExcelReader.getCellValue("Login", 1, 2);
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		login.click();
	}
	
	public String compareAlertText() {
		errorText = alertMsg.getText();
		return errorText;
	}
}
