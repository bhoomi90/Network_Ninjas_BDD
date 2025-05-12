package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.ConfigReader;
import dsportal_utilities.LoggerReader;

public class DataStructurePage {
	private WebDriver driver = null;
	public String homePageURL = ConfigReader.getPropertyValue("URL");
	public String dsPageURL = homePageURL+"data-structures-introduction/";

	@FindBy(xpath = ("//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']"))
	WebElement DataStrucIntro;
	@FindBy(xpath = ("//a[text()='Time Complexity']"))
	WebElement timecomplex;
	@FindBy(xpath = ("//a[text()='Try here>>>']"))
	WebElement tryHereClick;
	@FindBy(xpath = ("//textarea[@spellcheck='false']"))
	WebElement enterCode;
	@FindBy(xpath = ("//*[text()='Run']"))
	WebElement runBttn;
	@FindBy(xpath = ("//a[text()='Practice Questions']"))
	WebElement practiceQue;

	String validCode, invalidCode;

	public DataStructurePage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized DataStructurePage Page");
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void DataStruc_page() {
		DataStrucIntro.click();
		System.out.println("I am on DataStructure-Introduction Page");
	}

	public void TimecomplexInDataStruc_page() {
		timecomplex.click();
		System.out.println("Directed to Time Complexity in Datastructure page");
	}
}