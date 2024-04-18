package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_Stringdata {
public static void main(String[] args) {
	FileInputStream fis=new FileInputStream("");
	Workbook workbook1=WorkbookFactory.create("");
	Sheet sheetname=workbook1.getSheet("details");
	Row rownum=sheetname.

}}