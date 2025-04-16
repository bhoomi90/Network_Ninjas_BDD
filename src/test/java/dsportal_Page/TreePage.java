package dsportal_Page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsportal_Commons.ExcelReader;

public class TreePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Tree']")	WebElement tree_Intro;
	
	@FindBy(xpath="//a[text()='Overview of Trees']") WebElement overview_Tree;
	
	@FindBy(xpath="//a[text()='Terminologies']") WebElement termino_Tree;

	@FindBy(xpath="//a[text()='Types of Trees']") WebElement types_Tree;

	@FindBy(xpath="//a[text()='Tree Traversals']")	WebElement travers_Tree;

	@FindBy(xpath="//a[text()='Traversals-Illustration']") WebElement illus_Tree;

	@FindBy(xpath="//a[text()='Binary Trees']")	WebElement binary_Tree;
	
	@FindBy(xpath="//a[text()='Types of Binary Trees']") WebElement typebin_Tree;
	
	@FindBy(xpath="//a[text()='Implementation in Python']")	WebElement implePy_Tree;
	
	@FindBy(xpath="//a[text()='Binary Tree Traversals']") WebElement binTrave_Tree;
	
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']") WebElement impbinary_Tree;
	
	@FindBy(xpath="//a[text()='Applications of Binary trees']")	WebElement appbinary_Tree;
	
	@FindBy(xpath="//a[text()='Binary Search Trees']") 	WebElement binsearch_Tree;
	
	@FindBy(xpath="//a[text()='Implementation Of BST']") WebElement impleBST_Tree;
	
	@FindBy(xpath="//a[text()='Try here>>>']") 	WebElement tryEditor_Btn;
	
	@FindBy(xpath="//*[text()='Run']") 	WebElement run_Btn;
	
	@FindBy (xpath=("//textarea[@spellcheck='false']")) WebElement editor_window;
	
/*	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy(xpath="//a[text()='Sign in']") 	WebElement signin;
	@FindBy(id = "id_username") 	WebElement username;
	@FindBy(id ="id_password") 	WebElement password;
	@FindBy(xpath="//*[@type='submit']") 	WebElement login;
	@FindBy(xpath="//*[@data-toggle='dropdown']") 	WebElement dropdown;
	*/
	
	public TreePage(WebDriver driver)
	{
	    this.driver= driver;
	    PageFactory.initElements(driver, this);
	}
/*	public void Ds_login()	 
	{
		getStarted.click();
		signin.click();
		username.sendKeys("Network_Ninjas");
		password.sendKeys("OrangeS@12\\r\\n");
		login.click();
		
	}*/
	public void Tree_IntroLink()
	{
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.id("id_username")).sendKeys("Network_Ninjas");
		driver.findElement(By.id("id_password")).sendKeys("OrangeS@12\r\n");
				
		//driver.findElement(By.xpath("//*[@value='Login']")).click();
		
		 driver.findElement(By.xpath("//*[@data-toggle='dropdown']")).click();
		 //dropdown.click();
		 tree_Intro.click();
		
	}
	
	public void Overview_Link()
	{
		overview_Tree.click();
		
	}
	
	//public String[][] TryEd_Btn() throws IOException
	public void TryEd_Btn()  
	{
		tryEditor_Btn.click();
			
		
	}
	

/*@DataProvider(name="getTestData")
public Object[][] testData() throws Exception {
    return ExcelReader.getTestData("Sheet1");
}*/

	public void validCode() throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/TestData/Excel_TestData.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
         XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
        System.out.println("Last ROW: "+rows);
        int cols = sheet.getRow(0).getLastCellNum();
        System.out.println("Last col: " +cols);  
        editor_window.sendKeys ( sheet.getRow(0).getCell(0).getStringCellValue());
        System.out.print(sheet.getRow(0).getCell(0).getStringCellValue());
   
      //  invalidCode = sheet.getRow(0).getCell(1).getStringCellValue();
      //  System.out.print(sheet.getRow(0).getCell(1).getStringCellValue());
           
         	
		
		/*XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		String[][] testData = new String[rows][cols];
		for(int r=1; r<=rows; r++){
			
			 for(int c=0;c<cols; c++){
			 	testData[r-1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}		
		for (String[] rowData : testData) {
		    for (String val : rowData) {
		        System.out.print(val + "\n");
		      }
		     System.out.println();
		     editor_window.sendKeys(rowData);
		}*/
		 
		workbook.close();
		fis.close();
		run_Btn.click();
		
		driver.switchTo().alert().accept();
		driver.navigate().back();
		}
		
//	public void emptyCode() {
//		editor_window.sendKeys(" ");
//		System.out.println("Please enterd vaild code");
//		run_Btn.click(); 
//	}
//
//	
//	
//	public void invalidCode() {
//		editor_window.sendKeys("prt'hello'");
//		System.out.println("Invalid python code entered");
//		run_Btn.click(); 
//	}

	public void Run_Btn()  
	{ 
		//run_Btn.click();
	}
	
	public void Terminology_Link()
	{
		termino_Tree.click();
		
	}
	public void TypesOfTree_Link()
	{
		types_Tree.click();
		
	}
	public void Traverse_Link()
	{
		travers_Tree.click();
		
	}
	public void TreeIllus_Link()
	{
		illus_Tree.click();
		
	}
	public void BinaryTree_Link()
	{
		binary_Tree.click();
		
	}
	public void TypeBinary_Link()
	{
		typebin_Tree.click();
		
	}
	
	public void ImplePython_Link()
	{
		implePy_Tree.click();
		
	}
	
	public void  BinTrave_Link()
	{
		binTrave_Tree.click();
		
	}
	
	public void ImpleBinary_Link()
	{
		impbinary_Tree.click();
		
	}
	
	public void AppBinary_Link()
	{
		appbinary_Tree.click();
		
	}
	
	public void BinSearch_Link()
	{
		binsearch_Tree.click();
		
	}
	
	public void ImpleBST_Link()
	{
		impleBST_Tree.click();
		
	}
	
	 
	/*public void TypeBinary_Link()
	{
		typebin_Tree.click();
		
	}*/
	


}
