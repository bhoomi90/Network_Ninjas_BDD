package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsportal_utilities.LoggerReader;

public class LoginPage {

	static WebDriver driver;
	public static CommonPage cp;
	
	@FindBy(xpath = ("//*[text()='Get Started']"))
	WebElement getStarted;
	@FindBy(xpath = ("//*[text()='Sign in']"))
	WebElement signIn;
	@FindBy(id = "id_username")
	WebElement usernameInput;
	@FindBy(id = "id_password")
	WebElement passwordInput;
	@FindBy(xpath = ("//*[@type='submit']"))
	WebElement login;
	@FindBy(xpath = ("//a[text()='Sign out']"))
	WebElement signout;
	@FindBy (xpath=("//*[@role='alert']")) 
	WebElement alertMsg;

	String loginText, logoutText, errorText;
	private String mSG;

	public static void setUpCommonPage() {
		cp = new CommonPage(driver);
	}
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void getStarted() {
		getStarted.click();
	}	
	
	public void clickSignin() {
		signIn.click();
	}

	
	public String compareLoginText() {
		loginText = alertMsg.getText();
		LoggerReader.info("User is logged in");
		return loginText;
	}

	public void empty_fields() {
		usernameInput.sendKeys("");
		passwordInput.sendKeys("");
		login.click();
	}
	
	public String getValidationMessage_username() {
		String msg = usernameInput.getAttribute("validationMessage");
		LoggerReader.info(msg);
		return msg;
	}
	
	public String getValidationMessage_password() {
		String msg = passwordInput.getAttribute("validationMessage");
		LoggerReader.info(msg);
		return msg;
	}
	
	public void empty_valid_field() {
		usernameInput.sendKeys("");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
	}
	
	public void valid_empty_field() {
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("");
		login.click();
	}
	
	public void invalid_valid_field() {
		usernameInput.sendKeys("bhoomi_k");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
	}
	
	public void valid_invalid_field() {
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("896382");
		login.click();
	}
	
	public void invalid_invalid_field() {
		usernameInput.sendKeys("chak_k");
		passwordInput.sendKeys("yell$345");
		login.click();
	}
	
	public void valid_valid_field() {
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
	}
	
	public String compareAlertText() {
		errorText = alertMsg.getText();
		return errorText;
	}
}
