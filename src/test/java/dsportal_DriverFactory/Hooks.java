package dsportal_DriverFactory;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import dsportal_utilities.LoggerReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends DriverManager {
	
	static DriverManager driverManager = new DriverManager();
	
	@BeforeAll
	public static void before_all() {
		LoggerReader.info("Setup browser executed");
		driverManager.startBrowser();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	@AfterAll
	public static void after_all() {		
		driverManager.quitBrowser();
		LoggerReader.info("teardown browser executed");
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


