package dsportal_Page;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsportal_utilities.LoggerReader;

public class RegisterPage {
	public static WebDriver driver;

	@FindBy(xpath = ("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy(xpath = ("//a[text()=' Register ']")) WebElement register_initial;
	@FindBy(id = "id_username") WebElement usernameInput;
	@FindBy(id = "id_password1") WebElement passwordInput;
	@FindBy(id = "id_password2") WebElement passwordConfirmationInput;
	@FindBy(xpath = ("//input[@type='submit' and @value='Register']")) WebElement register;
	@FindBy (xpath=("//*[@role='alert']")) WebElement alertMsg;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	String errorText;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}

	public void register_initial() {
		register_initial.click();
		LoggerReader.info("Clicking Register button");
	}

	public void getStarted() {
		getStarted.click();
	}

	public void clickRegister(String username, String password, String passwordConfirmation) {
		LoggerReader.info("Registering user: " + username);
		LoggerReader.info("Registering with password: " + password);

		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		passwordConfirmationInput.sendKeys(passwordConfirmation);
		register.click();

	}
	
	public String getValidationMessage_username() {
		String msg;
		try {
			msg = usernameInput.getAttribute("validationMessage");
		} catch (StaleElementReferenceException e) {
			msg = usernameInput.getAttribute("validationMessage");			
		}
			LoggerReader.info(msg);
			return msg;
	}
	
	public String getValidationMessage_password() {
		String msg;
		try {
			msg = passwordInput.getAttribute("validationMessage");
		} catch (StaleElementReferenceException e) {
			msg = passwordInput.getAttribute("validationMessage");
		}
		LoggerReader.info(msg);
		return msg;
	}
	
	public String getValidationMessage_passwordConfirmation() {
		String msg;
		try {
			msg = passwordConfirmationInput.getAttribute("validationMessage");
		} catch (StaleElementReferenceException e) {
			msg = passwordConfirmationInput.getAttribute("validationMessage");
		}
		LoggerReader.info(msg);
		return msg;
	}
	public String compareAlertText() {
		errorText = alertMsg.getText();
		return errorText;
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
//	 public WebDriverWait wait;
//	 
//	public void registerUsersFromExcel(String filePath) throws IOException {
//		
//		System.out.println(filePath + "filePath");
//		
//		try (FileInputStream fis = new FileInputStream(filePath);
//	          XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
//System.out.println("the user is in excel path");
//	         Sheet sheet = workbook.getSheetAt(0); 
//
//	         for (Row row : sheet) {
//	             Cell usernameCell = row.getCell(0);
//	             Cell passwordCell = row.getCell(1);
//	             Cell passwordConfirmationCell = row.getCell(2);
//
//	             if (usernameCell != null && passwordCell != null && passwordConfirmationCell != null) {
//	                 String username = usernameCell.getStringCellValue();
//	                 String password = passwordCell.getStringCellValue();
//	                 String passwordConfirmation = passwordConfirmationCell.getStringCellValue();
//System.out.println("reading username and password");
//	                 clickRegister(username, password, passwordConfirmation);
//	             }
//	         }
//	     }
//	}



