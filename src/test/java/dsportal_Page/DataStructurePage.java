package dsportal_Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {
	public static WebDriver driver;
	
	
	@FindBy (xpath=("//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']")) WebElement DataStrucIntro;
	@FindBy (xpath = ("//a[text()='Time Complexity']")) WebElement timecomplex;	
	@FindBy (xpath = ("//a[text()='Practice Questions']")) WebElement practiceQue;

	public DataStructurePage(WebDriver driver) {
		DataStructurePage.driver = driver;	 
		 PageFactory.initElements(driver, this);
	}
	
	public void DataStruc_page() {
		DataStrucIntro.click();
		System.out.println("I am on DataStructure-Introduction Page");
	}
	
	public void TimecomplexInDataStruc_page() {
		timecomplex.click();
		System.out.println("Directed to Time Complexity in Datastructure page");
	}
	
	public void practiceQue_page() {
		practiceQue.click();
		System.out.println("I am on practice questions page under Datastructure");
	}
}
