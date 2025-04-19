package dsportal_Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dsportal_utilities.LoggerReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserManager {

	public static WebDriver driver;
	
	OptionManager options = new OptionManager();
	
	public WebDriver startbrowser() {
		String browserName = "chrome";
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options.getChromeOptions());
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options.getEdgeOptions());
		}
		LoggerReader.info(browserName+ "Browser Started");
		return driver;		
	}
	
	public void quitbrowser() {
		if(driver != null)
			driver.quit();
	}
}
