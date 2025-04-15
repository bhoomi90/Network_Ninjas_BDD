package dsportal_DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PageDriverFactory {

	public static WebDriver driver;
	
	public static WebDriver getChromeDriver() {
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver getfirefoxDriver() {
		driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver getsafariDriver() {
		driver = new SafariDriver();
		return driver;
	}
	
}
