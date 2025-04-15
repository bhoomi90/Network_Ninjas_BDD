package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	static	WebDriver driver;
	
	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy (xpath=("//a[text()=' Register ']")) WebElement register_initial;	
	@FindBy(id = "id_username") WebElement usernameInput;
	@FindBy(id = "id_password1") WebElement passwordInput;
	@FindBy(id = "id_password2") WebElement passwordConfirmationInput;
	@FindBy(linkText = "Register") WebElement register;
	
	public RegisterPage(WebDriver driver) {
		RegisterPage.driver = driver;
		 
		 if(driver.getTitle().equals("Numpy Ninja")) 
			 System.out.println("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
		 }
	
	public void clickregister() {	
		getStarted.click();
		register_initial.click();
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("OrangeS@12");
		passwordConfirmationInput.sendKeys("OrangeS@12");
		register.click();
	}	
}



	//User name by id= id_username
	// password by id = id_password1
	// password confirmation by id = id_password2
	// Register button text contain()= Register
	// Login linktext contains() = Login 