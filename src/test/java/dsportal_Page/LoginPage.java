package dsportal_Page;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	static WebDriver driver;
	
	@FindBy (xpath=("//*[text()='Get Started']")) WebElement getStarted;
	@FindBy (xpath=("//*[text()='Sign in']")) WebElement signIn ;
	@FindBy(id = "id_username") WebElement usernameInput;
	@FindBy(id = "id_password") WebElement passwordInput;
	@FindBy (xpath=("//*[@type='submit']")) WebElement login;
	@FindBy (xpath=("//a[text()='Sign out']")) WebElement signout;
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		 
		 if(driver.getTitle().equals("Numpy Ninja")) 
			 System.out.println("I am on ds-algo App");
		 else
			 throw new IllegalStateException("This is not ds-algo app. The current page is: " +driver.getCurrentUrl());
		 
		 PageFactory.initElements(driver, this);
	}
	
	public static void WriteExcelSheet() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("Login");
		
		int rowNum =0;
		
		for(int i=1;i<=5;i++) {
			
			XSSFRow row = worksheet.createRow(rowNum++);
			int colNum=0;
			for(int j=1;j<=5;j++) {
				XSSFCell cell=row.createCell(colNum++);
				cell.setCellValue("Row"+i+"Column"+j);
			}
		}
		
		String path = System.getProperty("user.dir")+"/src/test/resources/TestCode/LoginData.xlsx";
		File Excelfile = new File(path);
		FileOutputStream Fos = null;
		try {
			Fos = new FileOutputStream(Excelfile);
			workbook.write(Fos);
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
				Fos.close();
			}
			
		}
	
	public void get_login() {
		getStarted.click();
		signIn.click();
		usernameInput.sendKeys("Network_Ninjas");
		passwordInput.sendKeys("OrangeS@12");
		login.click();
	}
	public void sign_out() {
		signout.click();
	}
	public static void main(String[] args) throws IOException {
		WriteExcelSheet();
	}
}
// username by id = id_username
// password by id = id_password
// Login text contain() = Login
// Register! text contain() = Register!

