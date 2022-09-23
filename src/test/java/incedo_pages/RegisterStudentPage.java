package incedo_pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterStudentPage {

	WebDriver driver;
	JavascriptExecutor JS;

	public RegisterStudentPage(WebDriver rdriver) {

		// this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Identifiation

	// By txt_firstName = By.id("firstName");

	@FindBy(id = "firstName")
	WebElement txt_FirstName;

	@FindBy(css = "#lastName")
	WebElement txt_LastName;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	WebElement dob;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement txt_Email;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement txt_Add;

	@FindBy(xpath = "//label[text()='Sports']//preceding-sibling::input")
	WebElement chk_Sport;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement btn_Submit;

	@FindBy(xpath = "//input[@value='Male']")
	WebElement radio_male;

	@FindBy(xpath = "//input[@value='Female']")
	WebElement radio_female;

	@FindBy(xpath = "//input[@id='userNumber']")
	WebElement txt_MOB;

	@FindBy(xpath = "//div[text()='Thanks for submitting the form']")
	WebElement lbl_ThanksMessage;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement btn_close;

	// Methods

	public void enterFirstName(String fname) {

		// webelement.sendKeys(fname);

		// driver.findElement(txt_firstName).sendKeys(fname);
		txt_FirstName.clear();
		txt_FirstName.sendKeys(fname);

	}

	public void enterLastName(String lname) {

		txt_LastName.clear();
		txt_LastName.sendKeys(lname);
	}

	public void enterDOB(String dobValue) {

		dob.clear();
		dob.sendKeys(dobValue);
	}

	public void enterEmail(String email) {

		txt_Email.clear();
		txt_Email.sendKeys(email);
	}

	public void enterAddress(String add) {

		txt_Add.clear();
		txt_Add.sendKeys(add);
	}

	public void enterMobile(String mob) {

		txt_MOB.clear();
		txt_MOB.sendKeys(mob);
	}

	public void clickSportCheckbox() {

		chk_Sport.click();
	}

	
	
	public void clickSubmitButton() {

		btn_Submit.click();
	}

	
	public void clickSubmitButton_JS() {

		click_ele_using_JS(btn_Submit);
		//btn_Submit.click();
	}
	
	public void clickSubmitButton_usingJS() {

		JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click();", btn_Submit);

		// btn_Submit.click();
	}

	// Generic Methods
	public void click_ele_using_JS(WebElement ele) {

		JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click();", ele);
	}

	public void clickSportCheckbox_JS() {

		click_ele_using_JS(chk_Sport);
	}

	public void clickFemaleRadio_JS() {

		click_ele_using_JS(radio_female);
	}

	public void clickMaleRadio_JS() {

		click_ele_using_JS(radio_male);
	}

	public boolean verifyThankYouMessage() {

		return lbl_ThanksMessage.isDisplayed();

//		if(lbl_ThanksMessage.isDisplayed()) {
//			
//			
//			//enter value into excel file ----pass
//			
//		}
//		
//		else {
//			
//			//enter value into excel file ----failed
//		}

	}

	public void click_CloseButton() {

		btn_close.click();
	}

	public void click_CloseButton_JS() {

		click_ele_using_JS(btn_close);
		//btn_close.click();
	}

//	// generic method
//	public boolean verifyFirstNamePresent() {
//
//		verifyElementPresent(txt_FirstName);
//
//	}
//
//	// generic method
//	public boolean verifyElementPresent(WebElement ele) {
//
//		return ele.isDisplayed();
//
//	}

}
