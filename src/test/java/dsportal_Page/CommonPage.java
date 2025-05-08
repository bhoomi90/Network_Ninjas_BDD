package dsportal_Page;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ExcelReader;
import dsportal_utilities.LoggerReader;

public class CommonPage {

	public WebDriver driver;
	
	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy (xpath=("//*[text()='Sign in']")) WebElement signIn ;
	@FindBy (id=("id_username")) WebElement userName;
	@FindBy (id=("id_password")) WebElement password;
	@FindBy (xpath=("//*[@type='submit']")) WebElement login;
	@FindBy (xpath=("//*[@role='alert']")) WebElement alertMsg;
	
	@FindBy (xpath = ("//a[text()='Try here>>>']")) WebElement tryHereClick;
	@FindBy (xpath=("//*[text()='Run']")) WebElement runBttn;
	@FindBy (xpath=("//textarea[@spellcheck='false']")) WebElement enterCode;
	
	@FindBy (xpath = ("//a[text()='Practice Questions']")) WebElement practiceQue;	
	@FindBy (className = ("container")) WebElement pageContent;
	@FindBy (xpath=("//a[text()='Sign out']")) WebElement signOut;
	
	String validCode, invalidCode, loginText, logoutText;
	
	public CommonPage() {
		 this.driver = DriverManager.getdriver();		 
		 PageFactory.initElements(driver, this);
		 LoggerReader.info("Initialized Common Page");
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();	
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void getStarted() {
		getStarted.click();
	}
	
	public void login() {	
		signIn.click();
		userName.sendKeys("Network_Ninjas");
		password.sendKeys("OrangeS@12");
		login.click();
		loginText = alertMsg.getText();
		Assert.assertEquals(loginText, "You are logged in");
		LoggerReader.info("User is logged in");
	}
	
	public void tryHere_page() {
		tryHereClick.click();
		LoggerReader.info("I am on tryEditor window to try Python code");
	}	

	public void emptyCode() {
		runBttn.click();			
	}
	
	public void validCode() throws IOException {
		ExcelReader.readExcelSheet();
		//readExcelsheet();
		enterCode.sendKeys(ExcelReader.getValidCode());
		runBttn.click();
	}
	
	public void invalidCode() throws IOException {
		ExcelReader.readExcelSheet();
		//readExcelsheet();
		enterCode.sendKeys(ExcelReader.getInvalidCode());
		runBttn.click();
	}
	
	public void practiceQue_page() {
		practiceQue.click();
		LoggerReader.info("I am on practice questions page");
	}
	
	public boolean practiceQue_content() {
		LoggerReader.info("Page content is: " +pageContent.getText());
		if(pageContent.getText().length()==0)
			return false;
		else
			return true;
	}
	
	public void signOut() {
		signOut.click();
	}
	
	public void compareLogoutMsg() {
		logoutText = alertMsg.getText();
		Assert.assertEquals(logoutText, "Logged out successfully");
		LoggerReader.info("User is logged out");
	}
	
	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
}
