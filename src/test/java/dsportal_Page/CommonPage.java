package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	protected WebDriver driver;
	
	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy (xpath=("//*[text()='Sign in']")) WebElement signIn ;
	@FindBy (id=("id_username")) WebElement userName;
	@FindBy (id=("id_password")) WebElement password;
	@FindBy (xpath=("//*[@type='submit']")) WebElement login;
	
	@FindBy (xpath = ("//a[text()='Try here>>>']")) WebElement tryHereClick;
	
	public CommonPage(WebDriver driver) {
		 this.driver = driver;
		 
		 if(driver.getTitle().equals("Numpy Ninja")) 
			 System.out.println("I am on ds-algo App");
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
		System.out.println("I am on tryEditor window from introduction page");
	}	
	
}
