package dsportal_DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import dsportal_utilities.LoggerReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public static WebDriver driver;
    // Method to configure Chrome options
    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        return options;
    }
    // Method to configure Edge options
    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        return options;
    }
    // Method to configure Firefox options
    public FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        return options;
    }
    // Start browser based on the input
    public WebDriver startBrowser() {
    	String browserName = "chrome";
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(getChromeOptions());
            } else if (browserName.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(getEdgeOptions());
            } else if (browserName.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(getFirefoxOptions());
            } else {
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
            }
            LoggerReader.info(browserName + " Browser Started");
        } catch (Exception e) {
            LoggerReader.error("Failed to start browser: " + e.getMessage());
            throw e;
        }
        return driver;
    }
    // Quit browser
    public void quitBrowser() {
//        if (driver != null) {
//            driver.quit();
//            LoggerReader.info("Browser Closed");
//        }
    }
}
