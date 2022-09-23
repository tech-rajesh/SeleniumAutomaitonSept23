package tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage_PageFactory;
import readDataFromConfig.ReadConfig;

public class BaseTest {
	
	public WebDriver driver;
	public Logger log;
	public ReadConfig conf;
	//public LoginPage lp;
	public LoginPage_PageFactory lp;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		
		//Create an Object on Page
		//lp = new LoginPage(driver);
		lp = new LoginPage_PageFactory(driver);
		
		
		//config logging
		log = Logger.getLogger("Incedo_org_Module_Automation");
		PropertyConfigurator.configure("./testData/log4j.properties");
		
		
		log.info("Chrome Browser launched.");
		
		
		
		//create an object of config file
		conf = new ReadConfig();
		
		
		driver.get(conf.getApplicationURL_QA());
		log.info("Application launched." + conf.getApplicationURL_QA());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		driver.close();
		log.info("Chrome Browser closed.");
		System.out.println("closing application....");
	}
	
	
	

}
