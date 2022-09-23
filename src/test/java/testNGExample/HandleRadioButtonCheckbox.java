package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleRadioButtonCheckbox {
	
	//TestNG <--------- JUnit
	//Unit Testing Framework
	//Pre-condition  ------- @Before
	//@BeforeSuite-----@BeforeTest-----@BeforeClass ------@BeforeMethod
	
	
	//@Test  ---- test case 
	
	//Post-condition  ------- @After
	//@AfterSuite-----@AfterTest-----@AfterClass ------@AfterMethod
	
	
	//control the execution
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching application....");
	}
	
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application....");
	}
	
	
	@Test
	public void handleRadioButtonTest3() {
		
		System.out.println("testcase3");
		
	}
	
	@Test
	public void handleRadioButtonTest() {
		
		System.out.println("testcase1");
		
	}
	
	@Test
	public void handleRadioButtonTest2() {
		
		System.out.println("testcase2");
		
	}
	

}
