package dsportal_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_utilities.LoggerReader;

public class GraphPage {
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	@FindBy(id = "id_username")
	WebElement userName;

	@FindBy(id = "id_password")
	WebElement password;
	@FindBy(xpath = ("//*[@data-toggle='dropdown']"))
	WebElement dropdown;
	@FindBy(xpath = ("//a[text()='Graph']"))
	WebElement dropdowngraph;
	@FindBy(xpath = ("//*[text()='Get Started']"))
	WebElement getStarted;

	@FindBy(xpath = ("//h5[text()='Graph']/../a[text()='Get Started']"))
	WebElement graphIntro;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Graph Representations']")
	WebElement graphRep;

	@FindBy(xpath = "//a[@class='list-group-item'][text()='Graph']")
	WebElement graphPage;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryEditorButton;

	public GraphPage(WebDriver driver) {
		GraphPage.driver = driver;
		if(driver.getTitle().equals("NumpyNinja")) 
			 LoggerReader.info("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		PageFactory.initElements(driver, this);
	}
	
	 

	public void GraphIntro() {
		graphIntro.click();
		LoggerReader.info("");
	}

	public void dropdown_graph_page() {
		dropdown.click();
		dropdowngraph.click();
		LoggerReader.info("I am on Graph Page");
	}

	public void GraphRepresentations() {
		graphRep.click();
		LoggerReader.info("");
	}

	public void GraphElementPage() {
		graphPage.click();
		LoggerReader.info("");
	}

	public void clickTryEditor() {
		tryEditorButton.click();
		LoggerReader.info("");
	}

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		GraphPage obj = new GraphPage(driver);
		obj.clickGetStarted();

	}

	private void clickGetStarted() {
		getStarted.click();
		LoggerReader.info("");
	}

	// Methods

	public void clickLoginIn() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		userName.sendKeys("Network_Ninjas");
		password.sendKeys("OrangeS@12");
		loginButton.click();
	}

}