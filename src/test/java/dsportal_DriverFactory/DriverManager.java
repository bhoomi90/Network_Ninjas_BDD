package dsportal_DriverFactory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ThreadGuard;

import dsportal_utilities.LoggerReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	protected static WebDriver driver= null;
    // Method to configure Chrome options
    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        return options;
    }
    // Method to configure Edge options
    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        return options;
    }
    // Method to configure Firefox options
    public FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        return options;
    }
    // Start browser based on the input
    public WebDriver startBrowser(String browserName) {
    	quitBrowser();    
        
        switch(browserName.toLowerCase()) {
        case "chrome":
        	WebDriverManager.chromedriver().setup();
            threadDriver.set(ThreadGuard.protect( new ChromeDriver(getChromeOptions())));
            break;
        case "edge" :
        	 WebDriverManager.edgedriver().setup();
             threadDriver.set(ThreadGuard.protect(new EdgeDriver(getEdgeOptions())));
        	break;
        case "firefox":
        	WebDriverManager.firefoxdriver().setup();
            threadDriver.set(ThreadGuard.protect(new FirefoxDriver(getFirefoxOptions())));
        	break;
        default:
        	throw new IllegalArgumentException("Unsupported browser: " +browserName);
        }
        
        driver = threadDriver.get();
        LoggerReader.info(browserName + " Browser Started");
        return driver;
    }
    // Quit browser
    public void quitBrowser() {
        if(threadDriver.get() != null) {
        	//threadDriver.get().close();
        	threadDriver.get().quit();
        	threadDriver.remove();
        }
    }
}
