package dsportal_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Graph']")
	WebElement grapg_Intro;
	
	@FindBy(xpath="//a[@class='list-group-item'][text()='Graph']")
	WebElement graph_Page;
	
/*	@FindBy(xpath="//a[text()='Graph Representations']")
	WebElement grRep_Page;
	*/
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryEditor_Btn;

	 		
	
	
	
	public GraphPage(WebDriver driver)
	{
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	  // driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	public void Graph_IntroLink()
	{
		//driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.id("id_username")).sendKeys("Network_Ninjas");
		driver.findElement(By.id("id_password")).sendKeys("OrangeS@12\r\n");
				
		//driver.findElement(By.xpath("//*[@value='Login']")).click();
		
		 driver.findElement(By.xpath("//*[@data-toggle='dropdown']")).click();
		 
		  grapg_Intro.click();
	}
	
	public void Graph_Page()
	{
		graph_Page.click();	
	}
	
	public void GrRep_Page()
	{
		//grRep_Page.click();	
	}
	
	public void TryEd_Btn()
	{
		tryEditor_Btn.click();	
	}
	
	//@findBy("xpath="//div/a[text()='Graph']")public WebElement graIntro;
	//@findBy("xpath="//a[@class='list-group-item'][text()='Graph']")public WebElement grapage;
	//@findBy("xpath="//a[text()='Graph Representations']")public WebElement gReppage;
			
}
