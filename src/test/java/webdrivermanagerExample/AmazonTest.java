package webdrivermanagerExample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	
	
	@Test
	public void verifySearchTest() {
		
		
		//ctrl+Shift+O - autoimport/removed unused import
		//chromebrowser
		//WebDriverManager.chromedriver().setup();   //autodownload chromedriver & config
		//WebDriver driver = new ChromeDriver();
		
		//edgebrowser
		//WebDriverManager.edgedriver().setup();   //autodownload chromedriver & config
		//WebDriver driver = new EdgeDriver();
		
		
		//firefoxbrowser
		WebDriverManager.firefoxdriver().setup();   //autodownload chromedriver & config
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.manage().window().maximize();
		//launch Amazon Application
		driver.get("https://www.amazon.in/");
		
		
		
		
	}
	
	

}
