package dsportal_Commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties properties;
	static {
		try(FileInputStream fileinputstream = new FileInputStream("src/test/resources/Utilities/config.properties"))
		{
		    properties= new Properties();
            properties.load(fileinputstream);
            System.out.println(properties.getProperty("BROWSER"));
            System.out.println(properties.getProperty("URL"));
		}catch(FileNotFoundException e) {
		
	   }catch(IOException e1) {}
}
	
	public static String getProperty(String key)
	{
		return properties.getProperty(key);
	}
	

}
