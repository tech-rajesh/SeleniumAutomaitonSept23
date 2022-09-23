package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClickDoubleClick extends BaseTest {
	
	
	//@Test
	public void RightClickTest() throws Exception {
		
		
		//Actions act = new Actions(driver);  // WebDriver
		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));			//identification
		
		
		//methods 
		act.contextClick(rightButton).perform();
		
		//click on delete button
		WebElement deleteButton =driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		
		deleteButton.click();
		//act.click(deleteButton);
		
		
		//handle Alert
		Alert deleteAlert = driver.switchTo().alert();
		String deleteAlertText = deleteAlert.getText();
		System.out.println(deleteAlertText);
		Assert.assertTrue(deleteAlertText.contains("delete") );
		Thread.sleep(2000);
		deleteAlert.accept();
	}
	
	
	@Test
	public void DoubleClickTest() throws Exception {
		
		
		//Actions act = new Actions(driver);  // WebDriver
		WebElement doubleClickButton =driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		
		//methods 
		act.doubleClick(doubleClickButton).perform();
		
		
		
		//handle Alert
		Alert doubleAlert = driver.switchTo().alert();
		String doubleAlertText = doubleAlert.getText();
		System.out.println(doubleAlertText);
		
		Assert.assertTrue(doubleAlertText.contains("double") );
		
		Thread.sleep(5000);
		//doubleAlert.accept();
		
		
		//sync issue
		//conditional wait
		
		//doubleAlert.dismiss();
		doubleAlert.accept();
		
		Thread.sleep(5000);
		
		
		//conditional wait
		
		
		
		
		
	}
	

}
