package com.qsp.Trello.genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
	
	WebDriver driver;
	
	public String readdatafromExcel(String Sheetname, int rowindex, int cellindex) {
		FileInputStream fis1=new FileInputStream("./src/test/resources/");
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet(Sheetname);
		Row row=sheet.getRow(rowindex);
		Cell cell=row.getCell(cellindex);
		String cellvalue=cell.getStringCellValue();
		return cellvalue;
	}
	
	public double readdoubledatafromExcel(String Sheetname, int rowindex, int cellindex) {
		
		{
			FileInputStream fis1=new FileInputStream("./src/test/resources/");
			Workbook workbook=WorkbookFactory.create(file);
			Sheet sheet=workbook.getSheet(Sheetname);
			Row row=sheet.getRow(rowindex);
			Cell cell=row.getCell(cellindex);
			double cellvalue=cell.getNumericCellValue();
			return cellvalue;
		}
	}
public long readLongdatafromExcel(String Sheetname, int rowindex, int cellindex) {
		
		{
			FileInputStream fis1=new FileInputStream("./src/test/resources/");
			Workbook workbook=WorkbookFactory.create(file);
			Sheet sheet=workbook.getSheet(Sheetname);
			Row row=sheet.getRow(rowindex);
			Cell cell=row.getCell(cellindex);
			long cellvalue=(long)cell.getNumericCellValue();
			return cellvalue;
		}
	}
}
