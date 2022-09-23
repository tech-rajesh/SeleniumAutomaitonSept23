package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void verifyLoginTest() throws Exception {
		
		//Validatio before login
		lp.verifyApplicationTitle("Your store. Login");
		
		lp.enterUserName(conf.getAdminUser());
		lp.enterPassword(conf.getAdminPass());
		lp.clickRememberCheckbox();
		lp.clickLoginButton();
		

		//validation after login
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		

		
		
	}
	
	

}
