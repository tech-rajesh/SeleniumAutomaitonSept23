package dataDriventest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPLogin extends BaseTest{
	
	
	@Test(priority = 1, dataProvider = "regressionData")
	public void loginWithInvalidUserDetails(String email, String pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Enter userName: " + email);
		System.out.println("Enter password: " + pwd);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(4000);
		//validation of error message
		Boolean validationerror = driver.getPageSource().contains("Login was unsuccessful.");
		System.out.println("Error present on page: " + validationerror);
		Assert.assertTrue(validationerror);
		
	}
	
	
	@DataProvider
	public Object[][] smokeData() {
		
		//get data from different sources
		Object[][] data = {{"anuj@gmail.com", "34534534"}, {"Abhey@yahoo.com", "welcome@123"}, {"Amit@google.com", "welcome@123"}};
		return data;
		
	}
	
	@DataProvider
	public Object[][] regressionData() {
		
		//get data from different sources
		Object[][] data = {{"regressionuser1@testmail.com", "34534534"}, {"regressionUser2@testmail.com", "welcome@123"}, {"regressionUser3@testmail.com", "welcome@123"}, {"regressionUser4@testmail.com", "welcome@123"}};
		return data;
		
	}
	
	

}
