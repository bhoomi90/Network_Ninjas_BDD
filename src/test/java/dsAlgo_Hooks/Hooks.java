package dsAlgo_Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
          //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); can be used in place of the above line
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://dsportalapp.herokuapp.com/");
        }

    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (driver != null && scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                String screenshotName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");
                scenario.attach(screenshot, "image/png", screenshotName);
                scenario.log("Test failed. Screenshot attached.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
}
