package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IRCTC_MutipleWindow extends BaseTest{
	
	
	
	@Test
	public void verifyHotelBooking() throws Exception {
		
		//Multiple Windows
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);

		
		//click on Ok button
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("HOTEL")).click();
		
		
		
		Set<String> allWindow = driver.getWindowHandles();
		
		String mainWindow = (String) allWindow.toArray()[0];
		String hotelWindow = (String) allWindow.toArray()[1];
		
		System.out.println("Main Window: " + mainWindow);
		System.out.println("Hotel Window: " + hotelWindow);
		
		
		
		Thread.sleep(4000);
		//Switch To Hotel Window
		
		driver.switchTo().window(hotelWindow);
		
		//click on Login 
		driver.findElement(By.linkText("Login")).click();
		
		
		Thread.sleep(4000);
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		
		Thread.sleep(4000);
		//Switch To Hotel Window
		
		driver.switchTo().window(hotelWindow);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
