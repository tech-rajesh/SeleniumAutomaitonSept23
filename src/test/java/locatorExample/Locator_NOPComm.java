package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_NOPComm {
	
	
	@Test
	public void verifyLoginTest() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		//Locator
//		name
//		id
//		classname
//		tagname
//
//		linkText
//		partialLinkText
//
//				condition
//						tagname: a
//						text: 
//
//		Advanced ------
//		XPATH
//		CSS Selector
//		
		
		
		
		//ID
		//Identification
		//id - Email
		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		//action
		txtEmail.clear();
		Thread.sleep(3000);
		txtEmail.sendKeys("admin@yourstore.com");
		
		//get value of any attribute
		System.out.println("Autofocus attribute value are: " + txtEmail.getAttribute("autofocus"));
		System.out.println("Class attribute value are: " + txtEmail.getAttribute("class"));
		System.out.println("data-val-required attribute value are: " + txtEmail.getAttribute("data-val-required"));
		
		
		//Name
		//name - Password
		
		driver.findElement(By.name("Password")).clear();
		//driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.className("password")).sendKeys("admin");
		//tagname
		//tagname - 5 match
		//driver.findElement(By.tagName("input")).click(); // click on Input Tag  ---- target element --- 3rd
		
		
		driver.findElements(By.tagName("input")).get(2).click();  //
		
		
		//driver.findElement(By.linkText("Log in")).click();
		
		//ClassName
		//click on Login Button
		driver.findElement(By.className("login-button")).click();		//
		//driver.findElement(By.className("button-1")).click();
		
		
		Thread.sleep(4000);
		//LinkText
		//PartialLinkText
		//tagname: a, text: 
		//Logout 
		
		//driver.findElement(By.linkText("Logout")).click();
		
		
		//partialLinlText
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		Thread.sleep(5000);
		//XPATH
		//enter value in email field
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@admindemo");
		
		
		
		//CSS Selector
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
		
		Thread.sleep(5000);
		//close the application
		driver.close();
		
	}
	
	

}
