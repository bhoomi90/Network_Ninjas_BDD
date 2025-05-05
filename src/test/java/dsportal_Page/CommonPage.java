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
		 
//		 if(driver.getTitle().equals("Numpy Ninja")) 
//			 LoggerReader.info("I am on ds-algo App");
//		 else
//			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}
	

	
	public void login() {
		getStarted.click();
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
//		Assert.assertFalse(isAlertPresent(CommonPage.driver), "Alert displayed for empty code");
//		LoggerReader.error("Test failed: No python code entered. Expected to get alert");
	}
	
	public void readExcelsheet() throws IOException {
		 String path = System.getProperty("user.dir")+"/src/test/resources/TestCode/pythonCode.xlsx";
		 File Excelfile = new File(path);
		 
		 FileInputStream Fis = new FileInputStream(Excelfile);
		 XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		 XSSFSheet sheet = workbook.getSheet("Sheet 1");
		 
		 int rows = sheet.getLastRowNum();
		 LoggerReader.info("Last ROW: "+rows);
		 int cols = sheet.getRow(0).getLastCellNum();
		 LoggerReader.info("Last col: " +cols);	

		 validCode = sheet.getRow(0).getCell(0).getStringCellValue();
		 System.out.print(sheet.getRow(0).getCell(0).getStringCellValue());
	
		 invalidCode = sheet.getRow(0).getCell(1).getStringCellValue();
		 System.out.print(sheet.getRow(0).getCell(1).getStringCellValue());
		 	
		 workbook.close();
		 Fis.close();			
	}
	
	public void validCode() throws IOException {
		readExcelsheet();
		enterCode.sendKeys(validCode);
		runBttn.click();
//		LoggerReader.info("Valid python code entered");
//		Assert.assertNotEquals(isAlertPresent(CommonPage.driver), true, "Alert displayed for valid python code");
	}
	
	public void invalidCode() throws IOException {
		readExcelsheet();
		enterCode.sendKeys(invalidCode);
		runBttn.click();
//		LoggerReader.info("Invalid python code entered");
//		Assert.assertEquals(isAlertPresent(CommonPage.driver), true, "No alert displayed for invalid python code");		
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
