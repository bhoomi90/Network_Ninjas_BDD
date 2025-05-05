package dsportal_Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsportal_utilities.ExcelReader;
import dsportal_utilities.LoggerReader;

public class CommonPage {

	public static WebDriver driver;
	
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
	@FindBy (xpath=("//a[text()='Sign out']")) WebElement signOut;
	
	String validCode, invalidCode, loginText, logoutText;
	
	public CommonPage(WebDriver driver) {
		 CommonPage.driver = driver;		 
		 PageFactory.initElements(driver, this);
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();	
//		if (driver != null && ((RemoteWebDriver) driver).getSessionId() != null) {
//		    return driver.getTitle(); // or other actions
//		} else {
//		    throw new IllegalStateException("WebDriver session is not active.");
//		}		
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
	
	public static boolean practiceQue_content() {
		WebElement content = driver.findElement(By.className("container"));
		LoggerReader.info("Page content is: " +content.getText());
		if(content.getText().length()==0)
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
	
	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
}
