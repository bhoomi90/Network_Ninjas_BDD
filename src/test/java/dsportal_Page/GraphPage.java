package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsportal_DriverFactory.DriverManager;
import dsportal_utilities.LoggerReader;

public class GraphPage {
	
	private WebDriver driver = null;
	public String homePageURL = "https://dsportalapp.herokuapp.com/";
	public String graphPageURL = homePageURL+"graph/";

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

	public GraphPage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
		LoggerReader.info("Initialized Graph Page");
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void GraphIntro() {
		graphIntro.click();
		LoggerReader.info("Directed to Graph Introduction page");
	}

	public void dropdown_graph_page() {
		dropdown.click();
		dropdowngraph.click();
		LoggerReader.info("Directed to Graph Page from dropdown button");
	}

	public void GraphRepresentations() {
		graphRep.click();
		LoggerReader.info("Directed to Graph Representation page");
	}

	public void GraphElementPage() {
		graphPage.click();
		LoggerReader.info("Directed to Graph page");
	}

//	public void clickTryEditor() {
//		tryEditorButton.click();
//		LoggerReader.info("");
//	}

//	public void clickGetStarted() {
//		getStarted.click();
//		LoggerReader.info("Directed to Graph Introduction page");
//	}
}