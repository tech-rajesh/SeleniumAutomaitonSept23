package fileUploadExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99AppTest {

	
	
	@Test
	public void fileUpload() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//choose File
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		
		uploadElement.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\Training_Sept\\Images\\POM.png");
		
		//accept terms checkbox
		driver.findElement(By.cssSelector(".field_check")).click();
		
		//click on Sumit button
		driver.findElement(By.name("send")).click();
		
		
		
		
	}
	
	
	
}
