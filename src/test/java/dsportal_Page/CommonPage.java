package dsportal_Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_utilities.dsAlgoLoggerLoad;

public class CommonPage {

	public static WebDriver driver;
	
	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy (xpath=("//*[text()='Sign in']")) WebElement signIn ;
	@FindBy (id=("id_username")) WebElement userName;
	@FindBy (id=("id_password")) WebElement password;
	@FindBy (xpath=("//*[@type='submit']")) WebElement login;
	
	@FindBy (xpath = ("//a[text()='Try here>>>']")) WebElement tryHereClick;
	@FindBy (xpath=("//*[text()='Run']")) WebElement runBttn;
	@FindBy (xpath=("//textarea[@spellcheck='false']")) WebElement enterCode;
	
	@FindBy (xpath = ("//a[text()='Practice Questions']")) WebElement practiceQue;	
	@FindBy (xpath=("//a[text()='Sign out']")) WebElement signOut;
	
	String validCode, invalidCode;
	
	public CommonPage(WebDriver driver) {
		 CommonPage.driver = driver;
		 
		 if(driver.getTitle().equals("Numpy Ninja")) 
			 dsAlgoLoggerLoad.info("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}
	
	public void login() {
		getStarted.click();
		signIn.click();
		userName.sendKeys("Network_Ninjas");
		password.sendKeys("OrangeS@12");
		login.click();
	}
	
	public void tryHere_page() {
		tryHereClick.click();
		dsAlgoLoggerLoad.info("I am on tryEditor window to try Python code");
	}	

	public void emptyCode() {
		runBttn.click();
		dsAlgoLoggerLoad.info("No python code entered");	
	}
	
	public void readExcelsheet() throws IOException {
		 String path = System.getProperty("user.dir")+"/src/test/resources/TestCode/pythonCode.xlsx";
		 File Excelfile = new File(path);
		 
		 FileInputStream Fis = new FileInputStream(Excelfile);
		 XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		 XSSFSheet sheet = workbook.getSheet("Sheet 1");
		 
		 int rows = sheet.getLastRowNum();
		 dsAlgoLoggerLoad.info("Last ROW: "+rows);
		 int cols = sheet.getRow(0).getLastCellNum();
		 dsAlgoLoggerLoad.info("Last col: " +cols);	

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
		dsAlgoLoggerLoad.info("Valid python code entered");
	}
	
	public void invalidCode() throws IOException {
		readExcelsheet();
		enterCode.sendKeys(invalidCode);
		runBttn.click();
		dsAlgoLoggerLoad.info("Invalid python code entered");
	}
	
	public void practiceQue_page() {
		practiceQue.click();
		dsAlgoLoggerLoad.info("I am on practice questions page");
	}
	
	public void signOut() {
		signOut.click();
	}
}
