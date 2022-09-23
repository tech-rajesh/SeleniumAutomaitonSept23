package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;

public class HandleListboxTest extends BaseTest{
	
	
	@Test
	public void handleList() throws Exception {
		
		//validate listbox accept multiple selection
		//select some value from listbox
		//index/visibletext/value
		
		
		
		WebElement list = driver.findElement(By.cssSelector("select[name*='omL']"));
		
		
		
		//create an object of class
		
		Select li = new Select(list);
		
		
		System.out.println("Is listbox accept multiple selection or not: " + li.isMultiple());			//True
		
		//select value from listbox
		//Index
		li.selectByIndex(0);			//USA
		li.selectByIndex(2);			//Japan
		
		Thread.sleep(2000);
		//Select by Value
		li.selectByValue("India");		//India
		
		
		Thread.sleep(2000);
		//Select By VisibleText
		li.selectByVisibleText("Spain");	//Spain
		
		Thread.sleep(2000);
		//DeSelect value
		li.deselectByIndex(2);				//JAPAN
		
		Thread.sleep(2000);
		//DeSelect value
		li.deselectByValue("Spain");		//Spain
		
		
		
	}
	
	@Test
	public void handleList2() throws Exception {
		
		
		WebElement list = driver.findElement(By.tagName("select"));			//3 match-----by deafult it can perform action on first one
		
		
		Select li = new Select(list);
		
		System.out.println("Is Multiple: " + li.isMultiple());				//false
		
		li.selectByIndex(1);					//Saab
		
		Thread.sleep(2000);
		li.selectByValue("Singapore");			//opel
		
		
		Thread.sleep(2000);
		li.selectByVisibleText("Toyota");		//Toyota
		
		
		
		
	}

}
