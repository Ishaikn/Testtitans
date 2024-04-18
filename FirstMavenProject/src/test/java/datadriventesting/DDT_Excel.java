package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		FileInputStream fis = new FileInputStream("./src/test/resources/DDT_Excel1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("data");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);
//	Row row1=sheet.getRow(3);
//	Cell cell1=row1.getCell(1);
//	String cellvalue1=cell1.getStringCellValue();
//	System.out.println(cellvalue1);	
	}
}
