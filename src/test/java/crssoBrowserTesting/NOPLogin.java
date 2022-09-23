package crssoBrowserTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPLogin extends BaseTest{
	
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	}
	
	@Test(priority = 2)
	public void logout() {
		
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@Test(priority = 3)
	public void verifyAppTitle() throws Exception {
		
		Thread.sleep(3000);
		System.out.println("Title: " +driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
	}

}
