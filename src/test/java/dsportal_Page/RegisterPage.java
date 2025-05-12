package dsportal_Page;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;

public class RegisterPage {
	private WebDriver driver = null;
	public String Dsalgo_url = ConfigReader.getPropertyValue("URL");
	public String homePageURL = Dsalgo_url + "home";
	public String registerPageURL = Dsalgo_url+"register";

	@FindBy(xpath = ("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy(xpath = ("//a[text()=' Register ']")) WebElement register_initial;
	@FindBy(id = "id_username") WebElement usernameInput;
	@FindBy(id = "id_password1") WebElement passwordInput;
	@FindBy(id = "id_password2") WebElement passwordConfirmationInput;
	@FindBy(xpath = ("//input[@type='submit' and @value='Register']")) WebElement register;
	@FindBy (xpath=("//*[@role='alert']")) WebElement alertMsg;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	String errorText;

	public RegisterPage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized Register Page");
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
	public void navigateTo() {
		driver.navigate().to(Dsalgo_url);
	}
	public void getStarted() {
		getStarted.click();
	}

	public void clickRegister(String username, String password, String passwordConfirmation) {
		LoggerReader.info("Registering with username: " + username);
		LoggerReader.info("Registering with password: " + password);
		LoggerReader.info("Registering with passwordConfirmation: " + passwordConfirmation);

		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		passwordConfirmationInput.sendKeys(passwordConfirmation);
		register.click();

	}
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	
	
	@SuppressWarnings("deprecation")
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
