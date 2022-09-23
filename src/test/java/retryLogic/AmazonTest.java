package retryLogic;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest {
	
	
	
	
	@Test
	public void login() {
		
		System.out.println("login test case");
		
		
		//pass/failed/skipped ----status
		
	}

	
	@Test
	public void verifyAppTitle() {
		
		//int x = 10/0;
		System.out.println("verifyAppTitle test case");
		
	}
	
	
	//@Test(retryAnalyzer = RetryLogic.class)
	@Test
	public void addItems() {
		
		
		//int x = 10/0;
		Assert.assertTrue(false);
		System.out.println("addItems test case");
		
	}
	
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
}
