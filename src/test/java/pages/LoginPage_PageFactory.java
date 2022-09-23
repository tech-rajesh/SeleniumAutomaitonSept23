package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LoginPage_PageFactory {

	WebDriver driver;

	public LoginPage_PageFactory(WebDriver rdriver) {
		
		
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// identification

//	By txt_Email = By.name("Email");
//	By txt_Password = By.cssSelector("input#Password");
//	By chk_Remember = By.id("RememberMe");
//	By btn_Login = By.tagName("button");
	
	
	
	//==================================
	
	//Ruto utility
	
//	
//	@FindBy(how = How.NAME, using="Email")
//	private WebElement email;
//	
//	
//	
//	
//	public void enterOnEmail(String str){
//		email.clear();
//		email.sendKeys(str);
//	}
//	
//	
	
	
	
	///=====================================
	
	
	
	@FindBy(name = "Email")
	WebElement txt_UserName;
	
	
	@FindBy(css = "input#Password")
	WebElement txt_Password;
	
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	
	@FindBy(id  = "RememberMe")
	WebElement chk_re;
	
	@FindBy(how = How.ID, using="RememberMe")
	WebElement check_Rem;
	
	
	

	// Actions//Methods

	public void enterUserName(String email) {

//		driver.findElement(txt_Email).clear();
//		driver.findElement(By.name("Email")).sendKeys(email);
		
		System.out.println("===========PageFactory==============");
		txt_UserName.clear();
		txt_UserName.sendKeys(email);
		

	}

	public void enterPassword(String pwd) {

//		driver.findElement(txt_Password).clear();
//		driver.findElement(txt_Password).sendKeys(pwd);
		
		txt_Password.clear();
		txt_Password.sendKeys(pwd);

	}

	public void clickLoginButton() {

		//driver.findElement(btn_Login).click();
		btn_Login.click();
	}

	public void clickRememberCheckbox() {

		//driver.findElement(chk_Remember).click();
		check_Rem.click();
	}
	
	public void verifyApplicationTitle(String expectedTitle) throws Exception {
		
		Thread.sleep(5000);
		System.out.println("Application title: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}

}
