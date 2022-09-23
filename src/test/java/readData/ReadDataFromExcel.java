package readData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		//file
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		//Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//XSSFSheet Sheet = workbook.getSheet("smokeTest");
		XSSFSheet Sheet = workbook.getSheet("Student");
		
		int rowCount = Sheet.getLastRowNum();
		int cloumnCount = Sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Rows: " + rowCount);
		System.out.println("Columns: " + cloumnCount);
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			XSSFRow currentRow = Sheet.getRow(i);
			
			
			
			
			
			String firstName = currentRow.getCell(0).toString();
			String address = currentRow.getCell(4).toString();
			System.out.println("FirstName: " + firstName);
			System.out.println("Address: " + address);
			System.out.println("----------------------------");
			
			
		}
		
		
		
		
		
	}

}
