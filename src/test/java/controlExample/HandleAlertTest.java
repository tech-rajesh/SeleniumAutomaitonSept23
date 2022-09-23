package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class HandleAlertTest extends BaseTest{
	
	
	
	@Test
	public void simpleAlert() throws Exception {

		
		//generate an alert
		//click on Show me Alert button
		
		driver.findElement(By.xpath("//input[contains(@value,'Me Alert')]")).click();
		
		
		//Handle an Alert
		
		//Alert/Window/frame -------- driver.switchTo()
		
		//Alert
		//accept ----click on OK button
		//dismiss ---- click on cancel button
		//getText ----
		//SendKeys  ----- enter value on alert
		
		Thread.sleep(4000);
		
		//Switch to Alert
		
		Alert SimpleAlert = driver.switchTo().alert();
		
		
		String AlertText = SimpleAlert.getText();
		System.out.println("Alert text: " + AlertText);
		
		String expectedAlertText = "Hi.. This is alert message!";
		SimpleAlert.accept();
		
		//Validation Step
		Assert.assertEquals(AlertText, expectedAlertText,"Error Message: Alert text validation get failed.");
		
		
	}
	
	@Test(priority = -1)
	public void ConfirmAlert() throws Exception {
		
		
		//generate an Alert
		
		driver.findElement(By.xpath("//button[contains(text(),'Conf')]")).click();
		
		
		Thread.sleep(4000);
		Alert confirmAlert = driver.switchTo().alert();
	
		
		
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");
		System.out.println(confirmAlert.getText());
		
		confirmAlert.accept(); 			//click on Ok button
		//confirmAlert.dismiss(); 			//click on Cancel button
		
		//Validation Step
		String actualTextAfterAcceptAlert = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(actualTextAfterAcceptAlert);
		
		Assert.assertTrue(actualTextAfterAcceptAlert.contains("OK"),"Validation get failed"); ////method expecting true
		
		
	}

	@Test(priority = -101)
	public void promptAlert() throws Exception {
		
		//click on Prompt button to generate an alert
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		
		
		Thread.sleep(4000);
		//SwtichTo Alert - handle alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		//vAlidation Step - ALert text
		System.out.println(promptAlert.getText());
		Assert.assertTrue(promptAlert.getText().contains("Name Please"));
		
		
		//Enter value on Alert
		promptAlert.sendKeys("Amit");
		
		//Accept/dismiss alert
		promptAlert.accept();
		
		
	}
}
