package dsportal_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataStructurePage {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/");
		
		// have to give login Credentials and home page access for go below step
		driver.findElement(By.linkText("time-complexity")).click();
		driver.findElement(By.linkText("Practice Questions")).click();
	

	// Time Complexity linktext () ="time-complexity"
	// Practice Questions linktext()= Practice Questions
	}
}
