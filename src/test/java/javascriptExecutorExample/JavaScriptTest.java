package javascriptExecutorExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	
	public WebDriver driver;
	Actions act;
	@BeforeTest
	public void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

		driver.get("http://www.uitestpractice.com/Students/Switchto");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Create an Object
		act = new Actions(driver);
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		driver.close();
		System.out.println("closing application....");
	}
	
	
	@Test
	public void TestCase1() throws Exception {
		
		
		Thread.sleep(4000);
		
		
		WebElement launchModal =driver.findElement(By.cssSelector("[data-target=\"#myModal\"]"));
		
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click();", launchModal);
		
		
		//launchModal.click();
		
	}
}
