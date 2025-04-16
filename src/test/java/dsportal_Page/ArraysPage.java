package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArraysPage {

//		@FindBy (xpath = ("//a[text()='Practice Questions']")) WebElement practiceQuestionsButton;

//		@FindBy(xpath = "//button[text()='Sign out']")
//		WebElement signOutButton;
//
//		@FindBy(id = "editor")  WebElement editorField;
//
//		@FindBy (xpath = ("//button[text()='Run']")) WebElement runButton;
//
//		@FindBy(id = "outputMessage")
//		WebElement outputMessage;

//		public void clickPracticeQuestions() {
//			practiceQuestionsButton.click();
//		}
//		

//		public void clickSignOut() {
//			signOutButton.click();
//		}
//	}

	public static WebDriver driver;

	@FindBy(xpath = ("//h5[text()='Array']/../a[text()='Get Started']"))
	WebElement arrayClick;
	@FindBy(xpath = ("//*[@data-toggle='dropdown']"))
	WebElement dropdown;
	@FindBy(xpath = ("//a[text()='Array']"))
	WebElement dropdownArray;

	@FindBy(xpath = ("//a[text()='Arrays in Python']"))
	WebElement arraysInPython;
	@FindBy(xpath = ("//a[text()='Arrays Using List']"))
	WebElement arraysUsingList;
	@FindBy(xpath = ("//a[text()='Basic Operations in Lists']"))
	WebElement basicOperationsInLists;
	@FindBy(xpath = ("//a[text()='Applications of Array']"))
	WebElement applicationsOfArray;

	@FindBy(xpath = ("//a[text()='Search the array']"))
	WebElement searchTheArray;
	@FindBy(xpath = ("//a[text()='Max Consecutive Ones']"))
	WebElement maxConsecutiveOnes;
	@FindBy(xpath = ("//a[text()='Find Numbers with Even Number of Digits']"))
	WebElement findNumbersWithEvenNumberOfDigits;
	@FindBy(xpath = ("//a[text()='Squares of  a Sorted Array']"))
	WebElement squaresOfASortedArray;

	public ArraysPage(WebDriver driver) {
		ArraysPage.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void dropdown_array_page() {
		dropdown.click();
		dropdownArray.click();
		System.out.println("I am on Array Page");
	}

	public void clickArraysInPython() {
		arraysInPython.click();
		System.out.println("I am on Arrays In Python Page");
	}

	public void clickArraysUsingList() {
		arraysUsingList.click();
		System.out.println("I am on Arrays Using List Page");
	}

	public void clickBasicOperationsInLists() {
		basicOperationsInLists.click();
		System.out.println("I am on Basic Operation in  List Page");
	}

	public void clickApplicationsOfArray() {
		applicationsOfArray.click();
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