package logExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class NOPLogin extends BaseTest{
	
	
	@Test(priority = 1)
	public void login() {
		
		log.info("username field cleared.");
		driver.findElement(By.name("Email")).clear();
		log.info("username entered - admin@yourstore.com");
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		log.info("password field cleared.");
		driver.findElement(By.cssSelector("input#Password")).clear();
		log.info("password entred .");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		log.info("click on login button");
		driver.findElement(By.tagName("button")).click();
		
		
		
	}
	
	@Test(priority = 2)
	public void logout() {
		
		log.info("click on logout.");
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@Test(priority = 3)
	public void verifyAppTitle() throws Exception {
		
		log.info("validation of application tile : "+ driver.getTitle());
		Thread.sleep(3000);
		System.out.println("Title: " +driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
	}

}
