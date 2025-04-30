package dsportal_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public static WebDriver driver;

	@FindBy(xpath = ("//*[text()='Get Started']"))
	WebElement getStarted;
	@FindBy(xpath = ("//a[text()=' Register ']"))
	WebElement register_initial;
	@FindBy(id = "id_username")
	WebElement usernameInput;
	@FindBy(id = "id_password1")
	WebElement passwordInput;
	@FindBy(id = "id_password2")
	WebElement passwordConfirmationInput;
	// @FindBy(linkText = "Register") WebElement register;
	// @FindBy (xpath = ("*//type[text()='Register']")) WebElement register;

	@FindBy(xpath = ("//input[@type='submit' and @value='Register']"))
	WebElement register;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
//	 public WebDriverWait wait;
//	 
//	public void registerUsersFromExcel(String filePath) throws IOException {
//		
//		System.out.println(filePath + "filePath");
//		
//		try (FileInputStream fis = new FileInputStream(filePath);
//	          XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
//System.out.println("the user is in excel path");
//	         Sheet sheet = workbook.getSheetAt(0); 
//
//	         for (Row row : sheet) {
//	             Cell usernameCell = row.getCell(0);
//	             Cell passwordCell = row.getCell(1);
//	             Cell passwordConfirmationCell = row.getCell(2);
//
//	             if (usernameCell != null && passwordCell != null && passwordConfirmationCell != null) {
//	                 String username = usernameCell.getStringCellValue();
//	                 String password = passwordCell.getStringCellValue();
//	                 String passwordConfirmation = passwordConfirmationCell.getStringCellValue();
//System.out.println("reading username and password");
//	                 clickRegister(username, password, passwordConfirmation);
//	             }
//	         }
//	     }
//	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}

	public void register_initial() {
		register_initial.click();
	}

	public void getStarted() {
		getStarted.click();
	}

	public void clickRegister(String username, String password, String passwordConfirmation) {
		System.out.println("Registering user: " + username);
		System.out.println("Registering with password: " + password);

		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		passwordConfirmationInput.sendKeys(passwordConfirmation);
		register.click();

	}
}
