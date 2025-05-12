package dsportal_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.ExcelReader;
import dsportal_utilities.LoggerReader;

public class ArraysPage {

	private WebDriver driver = null;
	public String homePageURL = ConfigReader.getPropertyValue("URL");;
	public String arrayPageURL = homePageURL + "array/";
	
	@FindBy(xpath = ("//h5[text()='Array']/../a[text()='Get Started']"))
	WebElement arrayGetStarted;
	@FindBy(xpath = ("//*[@data-toggle='dropdown']"))
	WebElement dropdown;
	@FindBy(xpath = ("//a[text()='Arrays']"))
	WebElement dropdownArray;
	//@FindBy(css = ".CodeMirror")
//	@FindBy(xpath=("//div[@class='CodeMirror-lines']"))
//	WebElement enterCode;
	@FindBy(css = ".CodeMirror.cm-s-default")  WebElement enterCode;

	@FindBy(xpath = ("//button[text()='Run']"))
	WebElement queRunButton;
	@FindBy(xpath = ("//*[@type='submit']"))
	WebElement submitButton;
	@FindBy(id="output") 
	WebElement displayedOutput;

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
	@FindBy (className = ("list-group")) 
	WebElement pageContent;
	
	@FindBy(xpath = ("//a[text()='Search the array']"))
	WebElement searchTheArray;
	@FindBy(xpath = ("//a[text()='Max Consecutive Ones']"))
	WebElement maxConsecutiveOnes;
	@FindBy(xpath = ("//a[text()='Find Numbers with Even Number of Digits']"))
	WebElement findNumbersWithEvenNumberOfDigits;
	@FindBy(xpath = ("//a[text()='Squares of  a Sorted Array']"))
	WebElement squaresOfASortedArray;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public ArraysPage() {

		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized Array Page");
	}

	public void arrayGetStarted() {
		arrayGetStarted.click();
	}

	public void practiceQuesOfArray() {
		PracticeQuesOfArray.click();
	}

	public void dropdown_array_page() {
		dropdown.click();
		dropdownArray.click();
		System.out.println("I am on Array Page");
	}

	public void clickRunButton() {
		wait.until(ExpectedConditions.elementToBeClickable(queRunButton)).click();
		//queRunButton.click();
	}
	public void clickSubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		//submitButton.click();
	}
	public void checkOutputafterRun(String codeType, String questionPage) throws IOException, Throwable {
		String expectedOutput, actualOutput;
		actualOutput = displayedOutput.getText();
		LoggerReader.info("Actual Output is: " +actualOutput);
		
		switch(questionPage.toLowerCase()) {
		case "search the array":
			expectedOutput = ExcelReader.getCellValue("Array", 2, 2);
			break;
		case "max consecutive ones":
			expectedOutput = ExcelReader.getCellValue("Array", 4, 2);
			break;
		case "find numbers with even number of digits":
			expectedOutput = ExcelReader.getCellValue("Array", 6, 2);
			break;
		case "squares of a sorted array":
			expectedOutput = ExcelReader.getCellValue("Array", 8, 2);
			break;
		default:
			throw new IllegalArgumentException("Unsupported questionPage: " +questionPage);
		}
		int comparison = actualOutput.compareTo(expectedOutput);
		if(comparison==0)
			LoggerReader.info("Output after "+codeType+" matched for "+questionPage+" Practice que page after click on Run button");
		else
			LoggerReader.error("Output after "+codeType+" mismatched for "+questionPage+" Practice que page after click on Run button");
		//Assert.assertEquals(expectedOutput, actualOutput, "Output mismatched for "+questionPage+" Practice que page");
	}
	public void checkOutputafterSubmit(String codeType, String questionPage) {
		String actualMsg, expectedMsg;
		actualMsg = wait.until(ExpectedConditions.elementToBeClickable(displayedOutput)).getText();
		LoggerReader.info("Actual message after submit button: " +actualMsg+ " Code type is: "+codeType);
		
		if(codeType.equals("Valid code"))
			expectedMsg = "Submission Successful";
		else
			expectedMsg = "Error occurred during submission";		
		LoggerReader.info("Expected message after submit button: " +expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg, "Output after "+codeType+" mismatched for "+questionPage+" Practice que page after click on Submit button");
		
	}
	public void clickPracticePage(String linkText) {
		switch(linkText.trim().toLowerCase()) {
		case "search the array":
			searchTheArray.click();
			LoggerReader.info("I am on Search The Array Page");
			break;
		case "max consecutive ones":
			maxConsecutiveOnes.click();
			LoggerReader.info("I am on max Consecutive Ones Page");
			break;
		case "find numbers with even number of digits":
			findNumbersWithEvenNumberOfDigits.click();
			LoggerReader.info("I am on Find Numbers with Even Number of Digits Page");
			break;
		case "squares of a sorted array":
			squaresOfASortedArray.click();
			LoggerReader.info("I am on Squares of a Sorted Array Page");
			break;
		default:
			throw new IllegalArgumentException("Unsupported link: " +linkText);
		}
	}
	public void validCode(String questionPage) throws IOException, Throwable {
		String codeSnippet;
		switch(questionPage.toLowerCase()) {
		case "search the array":
			codeSnippet = ExcelReader.getCellValue("Array", 2, 1);
			writeCode(codeSnippet);
			break;
		case "max consecutive ones":
			codeSnippet = ExcelReader.getCellValue("Array", 4, 1);
			writeCode(codeSnippet);
			break;
		case "find numbers with even number of digits":
			codeSnippet = ExcelReader.getCellValue("Array", 6, 1);
			writeCode(codeSnippet);
			break;
		case "squares of a sorted array":
			codeSnippet = ExcelReader.getCellValue("Array", 8, 1);
			writeCode(codeSnippet);
			break;
		default:
			throw new IllegalArgumentException("Unsupported questionPage: " +questionPage);
		}
	}
	public void invalidCode(String questionPage) throws IOException, Throwable {
		String codeSnippet;
		switch(questionPage.toLowerCase()) {
		case "search the array":
			codeSnippet = ExcelReader.getCellValue("Array", 2, 3);
			writeCode(codeSnippet);
			break;
		case "max consecutive ones":
			codeSnippet = ExcelReader.getCellValue("Array", 4, 3);
			writeCode(codeSnippet);
			break;
		case "find numbers with even number of digits":
			codeSnippet = ExcelReader.getCellValue("Array", 6, 3);
			writeCode(codeSnippet);
			break;
		case "squares of a sorted array":
			codeSnippet = ExcelReader.getCellValue("Array", 8, 3);
			writeCode(codeSnippet);
			break;
		default:
			throw new IllegalArgumentException("Unsupported questionPage: " +questionPage);
		}
	}
	
	public void writeCode(String code) {
		
		wait.until(ExpectedConditions.visibilityOf(enterCode));
        //CommonMethods.waitForElementToBeVisible(driver, enterCode);
        //	codeMirror.clear();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   
		 //get HTML element document.querySelector('.CodeMirror') & reference to the actual CodeMirror editor instance. Stores code-mirror editor instance to editor variable.
		
	    js.executeScript(
			"let editor = document.querySelector('.CodeMirror').CodeMirror;" +
			"editor.setValue(arguments[0]);", code);	//passing code as a parameter rather than hardcoding it inside the JS string.editor.setValue(code);	
	}	

	public boolean practiceQue_content() {
		LoggerReader.info("Page content is: " +pageContent.getText());
		if(pageContent.getText().length()==0)
			return false;
		else
			return true;
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}
	public void navigateTo() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
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
}
//public void emptyCode() {
//System.out.println("No python code entered");
// submitButton.click();
//queRunButton.click();
//}

//	public String readExcelFile() throws IOException {
//	FileInputStream fis = new FileInputStream(new File("src/test/resources/TestCode/Arraypractice.xlsx"));
//	Workbook workbook = new XSSFWorkbook(fis);
//	Sheet sheet = workbook.getSheetAt(0);
//	Row row = sheet.getRow(0);
//	Cell cell = row.getCell(0);
//
//	String validCode = cell.getStringCellValue();
//	workbook.close();
//	fis.close();
//
//	return validCode;
//}
	
//	public void validCode() throws IOException {
//		String validCode = readExcelFile(); // Implement or call from a utility
//
//		if (validCode != null && !validCode.isEmpty()) {
//			System.out.println("Entering Valid code");
//			enterCode.clear();
//			enterCode.sendKeys(validCode);
//			System.out.println("Valid Python code entered: " + validCode);
//
//			switch (validCode) {
//			case "search":
//				int[] nums = { 12, 23, 45, 67, 6, 90 };
//				search(nums, 12);
//				search(nums, 25);
//				break;
//
//			case "findMaxConsecutiveOnes":
//				int[] onesArray = { 1, 1, 0, 1, 1, 1 };
//				System.out.println("Max consecutive 1's: " + findMaxConsecutiveOnes(onesArray));
//				break;
//
//			case "findNumbers":
//				int[] digitsArray = { 12, 345, 2, 6, 7896 };
//				System.out.println("Even digit count: " + findNumbers(digitsArray));
//				break;
//
//			case "sortedSquares":
//				int[] squaresArray = { -4, -1, 0, 3, 10 };
//				System.out.println("Sorted squares: " + Arrays.toString(sortedSquares(squaresArray)));
//				break;
//
//			default:
//				System.out.println("Unknown code keyword: " + validCode);
//			}
//		} else {
//			System.out.println("No valid code found in Excel.");
//			return;
//		}
//
//		// Click submit and run
//		try {
//			submitButton.click();
//			queRunButton.click();
//			System.out.println("Code submitted and run.");
//		} catch (Exception e) {
//			System.err.println("Button click failed: " + e.getMessage());
//		}
//	}

	// Helper functions
//	private void search(int[] list, int value) {
//		boolean found = false;
//		for (int num : list) {
//			if (num == value) {
//				found = true;
//				break;
//			}
//		}
//		System.out.println(found ? "Element Found" : "Not Found");
//	}
//
//	private int findMaxConsecutiveOnes(int[] nums) {
//		int max = 0, count = 0;
//		for (int num : nums) {
//			if (num == 1) {
//				count++;
//				max = Math.max(max, count);
//			} else {
//				count = 0;
//			}
//		}
//		return max;
//	}
//
//	private int findNumbers(int[] nums) {
//		int count = 0;
//		for (int num : nums) {
//			if (String.valueOf(num).length() % 2 == 0) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	private int[] sortedSquares(int[] nums) {
//		return Arrays.stream(nums).map(n -> n * n).sorted().toArray();
//	}
//
//	public void invalidCode() throws IOException {
//		readExcelFile();
//		// enterCode.sendKeys(invalidCode);
//		System.out.println("Invalid python code entered");
//		System.out.println("Element Not found in search the Array");
//		submitButton.click();
//		queRunButton.click();
//	}
//	public void clickSearchTheArray() {
//		searchTheArray.click();
//		System.out.println("I am on Search The Array Page");
//	}
//
//	public void clickMaxConsecutiveOnes() {
//		maxConsecutiveOnes.click();
//		System.out.println("I am on max Consecutive Ones Page");
//	}
//
//	public void clickFindNumbersWithEvenNumberOfDigits() {
//		findNumbersWithEvenNumberOfDigits.click();
//		System.out.println("I am on Find Numbers with Even Number of Digits Page");
//	}
//
//	public void clickSquaresOfASortedArray() {
//		squaresOfASortedArray.click();
//		System.out.println("I am on Squares of a Sorted Array Page");
//	}
	


