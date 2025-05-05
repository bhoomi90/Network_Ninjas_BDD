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

import dsportal_utilities.LoggerReader;

public class DataStructurePage {
	public static WebDriver driver;

	@FindBy(xpath = ("//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']"))
	WebElement DataStrucIntro;
	@FindBy(xpath = ("//a[text()='Time Complexity']"))
	WebElement timecomplex;
	@FindBy(xpath = ("//a[text()='Try here>>>']"))
	WebElement tryHereClick;
	@FindBy(xpath = ("//textarea[@spellcheck='false']"))
	WebElement enterCode;
	@FindBy(xpath = ("//*[text()='Run']"))
	WebElement runBttn;
	@FindBy(xpath = ("//a[text()='Practice Questions']"))
	WebElement practiceQue;

	String validCode, invalidCode;

	public DataStructurePage(WebDriver driver) {
		DataStructurePage.driver = driver;

		if (driver.getTitle().equals("NumpyNinja"))
			LoggerReader.info("I am on ds-algo App");
		else
			throw new IllegalStateException("This is not ds-algo app. The current page is: " + driver.getCurrentUrl());

		PageFactory.initElements(driver, this);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void DataStruc_page() {
		DataStrucIntro.click();
		System.out.println("I am on DataStructure-Introduction Page");
	}

	public void TimecomplexInDataStruc_page() {
		timecomplex.click();
		System.out.println("Directed to Time Complexity in Datastructure page");
	}
	
//	public void tryHere_page() {
//		tryHereClick.click();
//		LoggerReader.info("I am on tryEditor window to try Python code");
//	}
//
//	public void emptyCode() {
//		runBttn.click();
//		LoggerReader.info("No python code entered");
//	}

//	public void readExcelsheet() throws IOException {
//		String path = System.getProperty("user.dir") + "/src/test/resources/TestCode/pythonCode.xlsx";
//		File Excelfile = new File(path);
//
//		FileInputStream Fis = new FileInputStream(Excelfile);
//		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet 1");
//
//		int rows = sheet.getLastRowNum();
//		LoggerReader.info("Last ROW: " + rows);
//		int cols = sheet.getRow(0).getLastCellNum();
//		LoggerReader.info("Last col: " + cols);
//
//		validCode = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.print(sheet.getRow(0).getCell(0).getStringCellValue());
//
//		invalidCode = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.print(sheet.getRow(0).getCell(1).getStringCellValue());
//
//		workbook.close();
//		Fis.close();
//	}
//
//	public void validCode() throws IOException {
//		readExcelsheet();
//		enterCode.sendKeys(validCode);
//		runBttn.click();
//		LoggerReader.info("Valid python code entered");
//	}
//
//	public void invalidCode() throws IOException {
//		readExcelsheet();
//		enterCode.sendKeys(invalidCode);
//		runBttn.click();
//		LoggerReader.info("Invalid python code entered");
//	}
//
//	public void practiceQue_page() {
//		practiceQue.click();
//		LoggerReader.info("I am on practice questions page");
//	}


}