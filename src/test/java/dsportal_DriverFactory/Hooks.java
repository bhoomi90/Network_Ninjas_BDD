package dsportal_DriverFactory;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends DriverManager {
	
	static DriverManager driverManager = new DriverManager();
	
	@BeforeAll
	public static void before_all() throws Throwable {
		LoggerReader.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		String url = ConfigReader.getPropertyValue("URL");
		
		if(browser==null) {
			LoggerReader.info("Browser is null. Take browser from config property");
			browser = ConfigReader.getPropertyValue("BROWSER");
		}
		LoggerReader.info("Setup browser executed");
		LoggerReader.info("Initializing driver for : "+browser);
		driverManager.startBrowser(browser);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterAll
	public static void after_all() {		
		driverManager.quitBrowser();
//		LoggerReader.info("teardown browser executed: " + ConfigReader.getBrowserType());
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Screenshot");
			String base64Screenshot = ((TakesScreenshot)driver)
					.getScreenshotAs(OutputType.BASE64);
			ExtentCucumberAdapter.getCurrentStep().log(
					Status.FAIL, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build()
					);
			} 
		}
}		


