package dsportal_utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties properties;
	public static final String propertyFilePath = "./src/test/resources/config.properties";
	public static String browserType = null;
	
	public static void loadConfig() throws Throwable {
		FileInputStream fis;
		fis = new FileInputStream(propertyFilePath);
		properties = new Properties();
		properties.load(fis);
		fis.close();
	}
	
	public static String getURL() {
		String url = properties.getProperty("URL");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("URL not specified in config.properties file");
	}

	public static String getBrowser() {
		String browser = properties.getProperty("BROWSER");
		if(browser!=null)
			return browser;
		else
			throw new RuntimeException("browser not specified in config.properties file");
	}
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}

	public static String getBrowserType() {//throws Throwable {
		//if (browserType != null)
			return browserType;
//		else
//			throw new RuntimeException("browser not specified in the testng.xml");
		
	}
	
}
