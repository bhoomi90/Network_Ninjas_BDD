package dsportal_DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsportal_Commons.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConfig {
	
    static  WebDriver driver = null;
	static String URL = ConfigReader.getProperty("url");
	protected static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
	public static void getdriver(String browser)
	{
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
		webdriver.set(driver);
		getDriverInstance().manage().window().maximize();
		getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriverInstance().get(URL);
		
	}
		public static WebDriver getDriverInstance()
		{
			return webdriver.get();
		}
		
	  public static void quitDriver()
	  {
		  getDriverInstance().manage().deleteAllCookies();
		  getDriverInstance().quit();
		  webdriver.remove();
	  }
		
	}


