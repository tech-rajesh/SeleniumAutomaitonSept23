package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PayTMExample extends BaseTest{

	
	
	@Test
	public void verifyWatchVideoTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
		
		
		
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
		
	}
	
	
}
