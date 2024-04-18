package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class TrelloProject1 {
	WebDriver driver;

	@Parameters({"browserName","url","username","password"})
	@Test (priority = 1)
	public void loginTrello(String browserName, String url,String user,String password)
	{
		if (browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		WebElement emailTextField=driver.findElement(By.id("user"));
		emailTextField.sendKeys(user);
		WebElement continueButton=driver.findElement(By.id("login"));
		continueButton.click();
		WebElement passwordTextField= driver.findElement(By.xpath("//input[@aria-labelledby=\"password-uid2-label\"]"));
		passwordTextField.sendKeys(password);
		WebElement loginButton=driver.findElement(By.xpath("//span[normalize-space()='Log in']"));
		loginButton.click();
	}@Test(priority = 2)
	@Parameters("board")
	public void createBoard(String board)
	{
		WebElement createLink=driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));

		createLink.click();

		WebElement boardInput= driver.findElement(By.xpath("//input[@data-testid= 'create-board-title-input']"));
		boardInput.sendKeys(board);

		WebElement createButton= driver.findElement(By.xpath("//button[text()='Create']"));
		createButton.click();}
	@Test(priority = 3)
	@Parameters({"list1","list2","list3","list4"})
	public void title(String list1,String list2,String list3,String list4)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement textareaTextField=driver.findElement(By.xpath("//textarea[@name=\"Enter list title…\"]"));
		textareaTextField.sendKeys(list1);

		driver.findElement(By.xpath("//button[text()='Add list']")).submit();
		driver.switchTo().activeElement().sendKeys(list2);
		driver.findElement(By.xpath("//button[text()='Add list']")).submit();
		driver.switchTo().activeElement().sendKeys(list3);
		driver.findElement(By.xpath("//button[text()='Add list']")).submit();
		driver.switchTo().activeElement().sendKeys(list4);
		driver.findElement(By.xpath("//button[text()='Add list']")).submit();
	}@Test(priority = 4)
	//@Parameters({"addCardData","addCardData1","addCardData2","addCardData3","addCardData4","addCardData5","addCardData6","addCardData7"})
	public void concepts() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/ProjectData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet workbook.getSheet("Topics");
		Row rowNum=sheetName.getRow(1);
		Cell cellNum=rowNum.getCell(0);
		String cellvalue=cellNum.getStringCellValue();
		Row rowNum1=sheetName.getRow(2);
		Cell cellNum1=rowNum1.getCell(0);
		String cellvalue1=cellNum1.getStringCellValue();
		Row rowNum2=sheetName.getRow(3);
		Cell cellNum2=rowNum2.getCell(0);
		String cellvalue2=cellNum2.getStringCellValue();
		Row rowNum3=sheetName.getRow(4);
		Cell cellNum3=rowNum3.getCell(0);
		String cellvalue3=cellNum3.getStringCellValue();
		Row rowNum4=sheetName.getRow(5);
		Cell cellNum4=rowNum4.getCell(0);
		String cellvalue4=cellNum4.getStringCellValue();
		Row rowNum5=sheetName.getRow(6);
		Cell cellNum5=rowNum5.getCell(0);
		String cellvalue5=cellNum5.getStringCellValue();
		Row rowNum6=sheetName.getRow(7);
		Cell cellNum6=rowNum6.getCell(0);
		String cellvalue6=cellNum6.getStringCellValue();
		Row rowNum7=sheetName.getRow(8);
		Cell cellNum7=rowNum7.getCell(0);
		String cellvalue7=cellNum7.getStringCellValue();
		WebElement addCardLink=driver.findElement(By.xpath("//button[@data-testid=\"list-add-card-button\"]"));
		addCardLink.click();
		WebElement cardName1 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName1.sendKeys(cellvalue);
		cardName1.sendKeys(Keys.ENTER);
		WebElement cardName2 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName2.sendKeys(cellvalue1);
		cardName2.sendKeys(Keys.ENTER);
		WebElement cardName3 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName3.sendKeys(cellvalue2);
		cardName3.sendKeys(Keys.ENTER);
		WebElement cardName4 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName4.sendKeys(cellvalue3);
		cardName4.sendKeys(Keys.ENTER);
		WebElement cardName5 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName5.sendKeys(cellvalue4);
		cardName5.sendKeys(Keys.ENTER);
		WebElement cardName6 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName6.sendKeys(cellvalue5);
		cardName6.sendKeys(Keys.ENTER);
		WebElement cardName7 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName7.sendKeys(cellvalue6);
		cardName7.sendKeys(Keys.ENTER);
		WebElement cardName8 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		cardName8.sendKeys(cellvalue7);
		cardName8.sendKeys(Keys.ENTER);

	}@Test(priority = 5)
	public void dragAndDrop()
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='Joins']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[2]")) ).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='DDL']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[2]")) ).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='OOPS']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[3]")) ).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='Exception Handling']")), driver.findElement(By.xpath("(//div[@data-testid='list'])[3]"))).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='WebDriver']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='WebElements']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

	}@Test
	public void logout(){

		WebElement profileLink = driver.findElement(By.xpath("//div[@data-testid=\"header-member-menu-avatar\"]//span[@role=\"img\"]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(profileLink));
		profileLink.click();
		WebElement logoutLink= driver.findElement(By.xpath("//span[text()='Log out']"));
		logoutLink.click();
		WebElement logoutButton=driver.findElement(By.xpath("//span[text()='Log out']"));
		logoutButton.click();
		driver.manage().window().minimize();
		driver.quit();

	}
}

