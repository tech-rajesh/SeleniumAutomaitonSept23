package incedo_test;

import org.testng.annotations.Test;

import utility.Constants;
import utility.ExcelUtil;
import utility.ExcelUtil2;

public class RegisterStudentTest extends BaseTest{
	
	//ExcelUtil excelUtil;
	ExcelUtil2 excelUtil;
	
	@Test
	public void verifyRegisterStudentTest() throws Exception {
		
		
//		//Student Registration Form
//		
//		rs.enterFirstName("Anuj");
//		rs.enterLastName("Malik");
//		rs.enterEmail("anuj@gmail.com");
//		rs.clickMaleRadio_JS();
//		rs.enterMobile("9998887771");
//		//rs.en
//		rs.enterAddress("Delhi");
//		rs.clickSportCheckbox_JS();
//		
//		rs.clickSubmitButton_usingJS();
//		
//		
//		//validation steps - thank you message
//		
//		
//		//close the dialog
		
		
		
		excelUtil = new ExcelUtil2();
		
		
		//record ---- rowcount
		//String Excelfile = Constants.Path_TestData + Constants.File_TestData_xls;
		String Excelfile = Constants.Path_TestData + Constants.File_TestData_xlsx;
		
		excelUtil.setExcelFile(Excelfile, Constants.sheetName);
		
		
		//excelUtil.getRowCountInSheet();
		
		for (int i = 1; i <= excelUtil.getRowCountInSheet(); i++) {
			
			Thread.sleep(2000);
			rs.enterFirstName(excelUtil.getCellData(i, 0));
			Thread.sleep(2000);
			rs.enterLastName(excelUtil.getCellData(i, 1));
			Thread.sleep(2000);
			rs.enterEmail(excelUtil.getCellData(i, 2));
			
			Thread.sleep(2000);
			rs.clickMaleRadio_JS();
			
			Thread.sleep(2000);
			rs.enterMobile(excelUtil.getCellData(i, 3));
			Thread.sleep(2000);
			rs.enterAddress(excelUtil.getCellData(i, 4));
			
			Thread.sleep(2000);
			//select checkbox
			
			rs.clickSportCheckbox_JS();
			
			Thread.sleep(2000);
			rs.clickSubmitButton_JS();
			
			Thread.sleep(2000);
			//verification
			//thank you message
			
			Boolean validationOfThanksMess = rs.verifyThankYouMessage();
			
			if(validationOfThanksMess) {
				
				
				excelUtil.setCellValue(i, 6, "PASS", Excelfile);
				
			}
			else {
				
				excelUtil.setCellValue(i, 6, "FAIL", Excelfile);
			}
			
			
			//close dailog
			rs.click_CloseButton();
			
			
			
			Thread.sleep(2000);
			
		}
		
		
		
		
	}
	

}
