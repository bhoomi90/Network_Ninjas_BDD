package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsportal_utilities.LoggerReader;

public class LoginPage {

	static WebDriver driver;

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

	String loginText, logoutText;
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;

		if (driver.getTitle().equals("Numpy Ninja"))
			System.out.println("I am on ds-algo App");
		else
			throw new IllegalStateException("This is not ds-algo app. The current page is: " + driver.getCurrentUrl());

		PageFactory.initElements(driver, this);
	}

	public void get_login() {
		getStarted.click();
		signIn.click();
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
		loginText = alertMsg.getText();
		Assert.assertEquals(loginText, "You are logged in");
		LoggerReader.info("User is logged in");
	}

	public void sign_out() {
		signout.click();
	}
	
	public void compareLogoutMsg() {
		logoutText = alertMsg.getText();
		Assert.assertEquals(logoutText, "Logged out successfully");
		LoggerReader.info("User is logged out");
	}
}
