package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {

	
	public WebDriver driver;
	Actions act;
	@BeforeTest
	public void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		
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
	public void dragDropTestCase1() {
		
		
		
		WebElement trashFrame =driver.findElement(By.xpath("//iframe[contains(@data-src,'photo')]"));
		driver.switchTo().frame(trashFrame);
		//concept ----missing
		
		WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		//Method1
		//act.dragAndDrop(img3, trash).perform();
		//act.dragAndDrop(img4, trash).perform();
		
		
		//Method2
		
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		//act.clickAndHold(img3).moveToElement(trash).release().build().perform();
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
	}
}
