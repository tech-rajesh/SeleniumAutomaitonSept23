package fileUploadExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadAppTest_Monster2 {

	
	
	@Test
	public void fileUpload() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//choose File
		WebElement uploadElement = driver.findElement(By.cssSelector("input[type='file']"));
		
		
		uploadElement.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\Training_Sept\\Images\\POM.png");
		
		
		
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
		
		Thread.sleep(2000);
		Boolean verifyImagePresent = driver.findElement(By.xpath("//a[text()='POM.png']")).isDisplayed();
		
		System.out.println("Image present on page or not : " + verifyImagePresent);
		
		
		
		
		
		
	}
	
	
	
}
