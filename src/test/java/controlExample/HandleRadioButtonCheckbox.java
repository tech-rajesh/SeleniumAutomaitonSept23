package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRadioButtonCheckbox extends BaseTest{
	
	
	
	@Test
	public void handleRadioButtonTest() {
		
		driver.findElement(By.xpath("//input[contains(@value,'fem')]")).click();
		
	}
	
	@Test
	public void handleCheckboxTest() {
		
		driver.findElement(By.xpath("//input[contains(@value,'Boat')]")).click();
		
	}
	

}
