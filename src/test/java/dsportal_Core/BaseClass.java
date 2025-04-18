package dsportal_Core;

import java.time.Duration;

import dsportal_utilities.dsAlgoLoggerLoad;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class BaseClass extends BrowserManager {
	
	static BrowserManager browserManager = new BrowserManager();
	
	@BeforeAll
	public static void before_all() {
		dsAlgoLoggerLoad.info("Setup browser executed");
		browserManager.startbrowser();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	@AfterAll
	public static void after_all() {		
		browserManager.quitbrowser();
		dsAlgoLoggerLoad.info("teardown browser executed");
	}
	
}
