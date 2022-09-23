package readDataFromConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromConfigFile {

	public static void main(String[] args) throws Exception {
		
		
		
		//file location
		
		//win/non-win : /
		//window: \\
		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
		//FileInputStream fis = new FileInputStream("./data.properties");
		//Properties
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		
		//get the properties value from file
		
		String application_URL = prop.getProperty("app_url_dev");
		System.out.println("Application: " + application_URL);
		
		System.out.println(prop.getProperty("adminUserName"));
		

	}

}
