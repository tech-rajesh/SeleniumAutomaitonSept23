package incedo_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import incedo_pages.RegisterStudentPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class BaseTest {

	
	public WebDriver driver;
	public RegisterStudentPage rs;
	//launch
	//close
	
	
	
	@BeforeTest
	public void launchApp() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//instance created
		
		
		
		
		//Create an Object of Pages
		rs = new RegisterStudentPage(driver);
		
		//rs.enterFirstName(null);
		
		
		driver.get(Constants.URL);   //read data from config file
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
