package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		
		
		driver = rdriver;
		
		

	}

	// identification

	By txt_Email = By.name("Email");
	By txt_Password = By.cssSelector("input#Password");
	By chk_Remember = By.id("RememberMe");
	By btn_Login = By.tagName("button");

	// Actions//Methods

	public void enterUserName(String email) {

		driver.findElement(txt_Email).clear();
		driver.findElement(By.name("Email")).sendKeys(email);

	}

	public void enterPassword(String pwd) {

		driver.findElement(txt_Password).clear();
		driver.findElement(txt_Password).sendKeys(pwd);

	}

	public void clickLoginButton() {

		driver.findElement(btn_Login).click();
	}

	public void clickRememberCheckbox() {

		driver.findElement(chk_Remember).click();
	}
	
	public void verifyApplicationTitle(String expectedTitle) throws Exception {
		
		Thread.sleep(5000);
		System.out.println("Application title: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}

}
