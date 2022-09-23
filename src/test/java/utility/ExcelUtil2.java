package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil2 {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	public void setExcelFile(String excelFilePath, String sheetName) throws Exception {
		
		//Create an Object of file class to open xls file
		//
		FileInputStream fis = new FileInputStream(excelFilePath);
		
		workbook = new XSSFWorkbook(fis);
		
		
		//Sheet
		sheet = workbook.getSheet(sheetName);
		
		
	}
	
	
	public int getRowCountInSheet() {
		
		//return sheet.getLastRowNum();
		
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		return rowCount;
	}
	
	
	public String getCellData(int rowNumber, int cellNumber) {
		
		//sheet.getRow(rowNumber);
		
		XSSFCell cell = sheet.getRow(rowNumber).getCell(cellNumber);
		
		//return cell value as String
		return cell.getStringCellValue();
	}
	
	
	public void setCellValue(int rowNumber, int cellNumber, String CellValue, String excelFilePath) throws Exception {
		
		
		sheet.getRow(rowNumber).createCell(cellNumber).setCellValue(CellValue);
		
		FileOutputStream outStream = new FileOutputStream(excelFilePath);
		
		workbook.write(outStream);
		
		
	}

}
