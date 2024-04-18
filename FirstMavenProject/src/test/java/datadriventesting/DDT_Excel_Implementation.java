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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DDT_Excel_Implementation {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/DDT_Excel1.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("data1");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.facebook.com/login.php/");
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
	WebElement Pass=driver.findElement(By.id("pass"));
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(2);
	String cellValue = cell.getStringCellValue();
	Pass.sendKeys(cellValue);
	WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
	Login.click();
	
	
//	WebElement Pass=driver.findElement(By.id("pass").sendKeys(sheet.getRow(1).getCell(2).getNumericCellValue())
//	Row row=sheet.getRow(1);
//	Cell cellvalue=row.getCell(1);
//	System.out.println("Cellino "+cellvalue);
//	
}}
	
