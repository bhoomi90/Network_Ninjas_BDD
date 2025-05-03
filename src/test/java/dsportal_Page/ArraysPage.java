
package dsportal_Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsportal_utilities.LoggerReader;

public class ArraysPage {

//private static final CharSequence validCode = null;
	// public static WebDriver driver;

//	private WebDriver driver;
	public WebDriverWait wait;
	public static WebDriver driver;
	@FindBy(xpath = ("//h5[text()='Array']/../a[text()='Get Started']"))
	WebElement arrayGetStarted;
	@FindBy(xpath = ("//*[@data-toggle='dropdown']"))
	WebElement dropdown;
	@FindBy(xpath = ("//a[text()='Arrays']"))
	WebElement dropdownArray;
	@FindBy(xpath = ("*//type[text()=' CodeMirror-line ']"))
	WebElement enterCode;
	//@FindBy(id = "editor")


	@FindBy(xpath = ("//button[text()='Run']"))
	public WebElement queRunButton;
	@FindBy(xpath = ("*//type[text()='submit']"))
	WebElement submitButton;

	@FindBy(xpath = ("//a[text()='Arrays in Python']"))
	WebElement arraysInPython;
	@FindBy(xpath = ("//a[text()='Arrays Using List']"))
	WebElement arraysUsingList;
	@FindBy(xpath = ("//a[text()='Basic Operations in Lists']"))
	WebElement basicOperationsInLists;
	@FindBy(xpath = ("//a[text()='Applications of Array']"))
	WebElement applicationsOfArray;
	@FindBy(xpath = ("//a[text()='Practice Questions']"))
	WebElement PracticeQuesOfArray;

	@FindBy(xpath = ("//a[text()='Search the array']"))
	WebElement searchTheArray;
	@FindBy(xpath = ("//a[text()='Max Consecutive Ones']"))
	WebElement maxConsecutiveOnes;
	@FindBy(xpath = ("//a[text()='Find Numbers with Even Number of Digits']"))
	WebElement findNumbersWithEvenNumberOfDigits;
	@FindBy(xpath = ("//a[text()='Squares of  a Sorted Array']"))
	WebElement squaresOfASortedArray;
	

	
	public ArraysPage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (driver.getTitle().equals("NumpyNinja"))
			LoggerReader.info("I am on ds-algo App");
		else
			throw new IllegalStateException("This is not ds-algo app. The current page is: " + driver.getCurrentUrl());

		PageFactory.initElements(driver, this);
	}

	public void arrayGetStarted() {
		arrayGetStarted.click();
	}

	public void practiceQuesOfArray() {
		PracticeQuesOfArray.click();
	}

	public static boolean practiceQue_content() {
		WebElement content = driver.findElement(By.className("container"));
		LoggerReader.info("Page content is: " +content.getText());
		if(content.getText().length()==0)
			return false;
		else
			return true;
	}
	
	
	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	public void dropdown_array_page() {
		dropdown.click();
		dropdownArray.click();
		System.out.println("I am on Array Page");
	}

	public String readExcelFile() throws IOException {
		FileInputStream fis = new FileInputStream(new File("src/test/resources/TestCode/Arraypractice.xlsx"));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		String validCode = cell.getStringCellValue();
		workbook.close();
		fis.close();

		return validCode;
	}

	public void validCode() throws IOException {
		String validCode = readExcelFile(); // Implement or call from a utility

		if (validCode != null && !validCode.isEmpty()) {
			enterCode.clear();
			enterCode.sendKeys(validCode);
			System.out.println("Valid Python code entered: " + validCode);

			switch (validCode) {
			case "search":
				int[] nums = { 12, 23, 45, 67, 6, 90 };
				search(nums, 12);
				search(nums, 25);
				break;

			case "findMaxConsecutiveOnes":
				int[] onesArray = { 1, 1, 0, 1, 1, 1 };
				System.out.println("Max consecutive 1's: " + findMaxConsecutiveOnes(onesArray));
				break;

			case "findNumbers":
				int[] digitsArray = { 12, 345, 2, 6, 7896 };
				System.out.println("Even digit count: " + findNumbers(digitsArray));
				break;

			case "sortedSquares":
				int[] squaresArray = { -4, -1, 0, 3, 10 };
				System.out.println("Sorted squares: " + Arrays.toString(sortedSquares(squaresArray)));
				break;

			default:
				System.out.println("Unknown code keyword: " + validCode);
			}
		} else {
			System.out.println("No valid code found in Excel.");
			return;
		}

		// Click submit and run
		try {
			//submitButton.click();
			queRunButton.click();
			System.out.println("Code submitted and run.");
		} catch (Exception e) {
			System.err.println("Button click failed: " + e.getMessage());
		}
	}

	// Helper functions
	private void search(int[] list, int value) {
		boolean found = false;
		for (int num : list) {
			if (num == value) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Element Found" : "Not Found");
	}

	private int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for (int num : nums) {
			if (num == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		return max;
	}

	private int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private int[] sortedSquares(int[] nums) {
		return Arrays.stream(nums).map(n -> n * n).sorted().toArray();
	}

	public void invalidCode() throws IOException {
		readExcelFile();
		enterCode.clear();
		enterCode.sendKeys("cp");
		System.out.println("Invalid python code entered");
		System.out.println("Element Not found in search the Array");
		//submitButton.click();
		queRunButton.click();
	}

	public void emptyCode() {
		System.out.println("No python code entered");
		// submitButton.click();
		queRunButton.click();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}

	public void clickArraysInPython() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arraysInPython);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", arraysInPython);
		System.out.println("I am on Arrays In Python Page");
	}

	public void clickArraysUsingList() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", arraysUsingList);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", arraysUsingList);
		System.out.println("I am on Arrays Using List Page");
	}

	public void clickBasicOperationsInLists() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", basicOperationsInLists);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", basicOperationsInLists);
		System.out.println("I am on Basic Operation in  List Page");
		// js.executeScript("arguments[0].scrollIntoView();", arraysInPython);

	}

	public void clickApplicationsOfArray() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", applicationsOfArray);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", applicationsOfArray);
		System.out.println("I am on Application Array Page");
	}

	public void clickSearchTheArray() {
		searchTheArray.click();
		System.out.println("I am on Search The Array Page");
	}

	public void clickMaxConsecutiveOnes() {
		maxConsecutiveOnes.click();
		System.out.println("I am on max Consecutive Ones Page");
	}

	public void clickFindNumbersWithEvenNumberOfDigits() {
		findNumbersWithEvenNumberOfDigits.click();
		System.out.println("I am on Find Numbers with Even Number of Digits Page");
	}

	public void clickSquaresOfASortedArray() {
		squaresOfASortedArray.click();
		System.out.println("I am on Squares of a Sorted Array Page");
	}

}