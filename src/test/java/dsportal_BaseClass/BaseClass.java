package dsportal_BaseClass;

import java.time.Duration;

import dsportal_DriverFactory.PageDriverFactory;
import dsportal_utilities.dsAlgoLoggerLoad;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class BaseClass extends DriverInstance {
	
	@BeforeAll
	public static void before_all() {
		dsAlgoLoggerLoad.info("Setup browser executed");
		driver = PageDriverFactory.getChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	@AfterAll
	public static void after_all() {
		dsAlgoLoggerLoad.info("teardown browser executed");
		if(driver!=null) {
			//driver.close();
			driver.quit();
		}
	}
	
}
