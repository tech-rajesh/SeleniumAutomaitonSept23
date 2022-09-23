package takeScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PayTMExample extends BaseTest{

	
	
	@Test
	public void verifyWatchVideoTest() throws InterruptedException, Exception {
		
		
		Logger log = Logger.getLogger("Module1");
		PropertyConfigurator.configure("./testData\\log4j.properties");
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
		
		log.info("-------------");
		
		//concept
		//frame
		//Index - start from 0
		//driver.switchTo().frame(0);
		
		//Name or ID
		//driver.switchTo().frame("name/id");
		
		
		//WebElement myFrame = driver.findElement(By.tagName("iframe"));
		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@src,'login?is')]"));
		
		//
		driver.switchTo().frame(myFrame);
		
		
		Thread.sleep(5000);
		
		//click on Watch Videos
		driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();
		
		
		//get the text
		String headingText = driver.findElement(By.cssSelector(".heading")).getText();
		String expectedHeadingText = "To Login into your Paytm Web account";
		
		System.out.println(headingText);
		Assert.assertEquals(headingText, expectedHeadingText);
		
		
		//takeScreenshot
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File targetLocation = new File("./screenshot/PayTM.png");
		
		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
		
	}
	
	
}
