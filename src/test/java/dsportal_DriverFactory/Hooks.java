package dsportal_DriverFactory;

import java.time.Duration;

import dsportal_utilities.LoggerReader;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

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
	
}
