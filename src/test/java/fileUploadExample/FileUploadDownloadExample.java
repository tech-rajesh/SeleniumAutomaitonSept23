package fileUploadExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDownloadExample {
	
	

	@Test
	public void fileUpload() {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeOptions opt = new ChromeOptions();
		
		Map<String, Object> pref = new HashMap<String, Object>();
		
		pref.put("download.prompt_for_download", false);
		
		opt.setExperimentalOption("prefs", pref);
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=105.0.5195.52/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		
		
		
	}
	

}
