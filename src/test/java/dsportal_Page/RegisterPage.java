package dsportal_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
	public static void main(String[] args) {
	
		
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://dsportalapp.herokuapp.com/register");
	
	driver.findElement(By.id("id_username"));
	driver.findElement(By.id("id_password1"));
	driver.findElement(By.id("id_password2"));
	driver.findElement(By.linkText("Register"));
	
	// User name by id= id_username
	// password by id = id_password1
	// password confirmation by id = id_password2
	// Register button text contain()= Register
	// Login linktext contains() = Login 

	}
}
