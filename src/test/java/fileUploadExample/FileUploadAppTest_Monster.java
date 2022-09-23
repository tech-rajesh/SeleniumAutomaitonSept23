package fileUploadExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadAppTest_Monster {

	
	
	@Test
	public void fileUpload() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//choose File
		WebElement uploadElement = driver.findElement(By.cssSelector("#file-upload"));
		
		
		uploadElement.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		
		
		
		
		
	}
	
	
	
}
