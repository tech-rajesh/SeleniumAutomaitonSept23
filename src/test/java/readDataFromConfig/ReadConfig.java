package readDataFromConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getApplicationURL_QA() {

		String appURL = prop.getProperty("app_url_QA");
		return appURL;

	}

	public String getApplicationURL_Dev() {

		
		return prop.getProperty("app_url_dev");

	}

	public String getApplicationURL_prod() {

		
		return prop.getProperty("app_url_prod");
	}

	public String getAdminUser() {

		String user = prop.getProperty("adminUserName");
		return user;

	}

	public String getAdminPass() {

		String pwd = prop.getProperty("adminPassword");
		return pwd;

	}
	
}
