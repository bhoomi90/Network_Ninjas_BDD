package dsportal_Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "id_username") WebElement usernameInput;
	@FindBy(id = "id_password") WebElement passwordInput;
	@FindBy (xpath=("//*[@type='submit']")) WebElement login;
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }

	public void clicklogin() {		
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/login");
		LoginPage obj = new LoginPage(driver);
		obj.clicklogin();
		
	}
}
// username by id = id_username
// password by id = id_password
// Login text contain() = Login
// Register! text contain() = Register!

