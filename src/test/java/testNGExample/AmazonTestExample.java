package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestExample {
	
	//TestNG <--------- JUnit
	//Unit Testing Framework
	//Pre-condition  ------- @Before
	//@BeforeSuite-----@BeforeTest-----@BeforeClass ------@BeforeMethod
	
	
	//@Test  ---- test case 
	
	//Post-condition  ------- @After
	//@AfterSuite-----@AfterTest-----@AfterClass ------@AfterMethod
	
	
	//control the execution
	//Priority
	//By default - priority - 0
	//Highest negative number is having highest priority
	//If priority is same ---- execution as per aplhabetic order
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching Amazon application....");
	}
	
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application....");
	}
	
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login testcase");
		
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout testcase");
		
	}
	
	@Test()
	public void addItemsToCart() {
		
		System.out.println("addItemsToCart testcase");
		
	}
	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment testcase");
		
	}
	
	
	@Test(priority = 3)
	public void cancelOrder() {
		
		System.out.println("cancelOrder testcase");
		
	}

}
