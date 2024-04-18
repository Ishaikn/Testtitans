package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TrelloProject {
		WebDriver driver;
		@BeforeClass
		public void preCondition()
		{ 	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	
		}
		@Parameters({"browserName","url","email","password"})
		@Test(priority = 1) 
		public void login(String browserName, String url, String email, String password)
		{
			driver.get(url);

			String exp_title="Log in to Trello";
			String act_title=driver.getTitle();        
			if(exp_title.equals(act_title))
			{
				WebElement emailTextField = driver.findElement(By.id("user"));
				emailTextField.sendKeys(email);

				WebElement login = driver.findElement(By.id("login"));
				login.click();

				WebElement passwordTextField = driver.findElement(By.xpath("//input[@aria-labelledby='password-uid2-label']"));
				passwordTextField.sendKeys(password);

				WebElement login1 = driver.findElement(By.xpath("//span[normalize-space()='Log in']"));
				login1.submit();
			}
			else
			{
				driver.quit();
			}       
		}
		@Parameters({"title"})
		@Test(priority = 2, dependsOnMethods = "login")
		public void createBoards(String title)
		{ 			
			WebElement createNewBoard = driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));
			createNewBoard.click();

			WebElement color = driver.findElement(By.xpath("//span[@data-testid='CheckIcon']"));
			color.click();

			WebElement titleTextField = driver.findElement(By.xpath("//input[@type='text']"));
			titleTextField.sendKeys(title);

			WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
			createButton.click();	
		}
		@Parameters({"skill01","skill02","skill03","skill04"})
		@Test(priority = 3, dependsOnMethods = "createBoards")
		public void createList(String skill01, String skill02, String skill03, String skill04)
		{
			String exp_title1="Boards | Trello";
			String act_title1=driver.getTitle();
			if(exp_title1.equals(act_title1))
			{
				WebElement listTextField1 = driver.findElement(By.xpath("//textarea[@name='Enter list title…']"));
				listTextField1.sendKeys(skill01);
				listTextField1.sendKeys(Keys.ENTER);
				//driver.findElement(By.xpath("//button[text()='Add list']")).click();

				WebElement listTextField2 = driver.findElement(By.xpath("//textarea[@name='Enter list title…']"));
				listTextField2.sendKeys(skill02);
				listTextField2.sendKeys(Keys.ENTER);
				//driver.findElement(By.xpath("//button[text()='Add list']")).click();

				WebElement listTextField3 = driver.findElement(By.xpath("//textarea[@name='Enter list title…']"));
				listTextField3.sendKeys(skill03);
				listTextField3.sendKeys(Keys.ENTER);
				//driver.findElement(By.xpath("//button[text()='Add list']")).click();

				WebElement listTextField4 = driver.findElement(By.xpath("//textarea[@name='Enter list title…']"));
				listTextField4.sendKeys(skill04);
				listTextField4.sendKeys(Keys.ENTER);
				//driver.findElement(By.xpath("//button[text()='Add list']")).click();
			}
			else
			{
				driver.quit();
			}

		}
		@Parameters({"cardTitle1","cardTitle2","cardTitle3","cardTitle4","cardTitle5","cardTitle6","cardTitle7","cardTitle8","cardTitle9","cardTitle10"})
		@Test(priority = 4, dependsOnMethods = "createList")
		public void addCard(String cardTitle1, String cardTitle2, String cardTitle3,String cardTitle4,String cardTitle5,String cardTitle6,String cardTitle7,String cardTitle8,String cardTitle9,String cardTitle10)
		{
			driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add a card'])[1]")).click();

			WebElement cardName1 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName1.sendKeys(cardTitle1);
			cardName1.sendKeys(Keys.ENTER);

			WebElement cardName2 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName2.sendKeys(cardTitle2);
			cardName2.sendKeys(Keys.ENTER);

			WebElement cardName3 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName3.sendKeys(cardTitle3);
			cardName3.sendKeys(Keys.ENTER);

			WebElement cardName4 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName4.sendKeys(cardTitle4);
			cardName4.sendKeys(Keys.ENTER);

			WebElement cardName5 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName5.sendKeys(cardTitle5);
			cardName5.sendKeys(Keys.ENTER);

			WebElement cardName6 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName6.sendKeys(cardTitle6);
			cardName6.sendKeys(Keys.ENTER);

			WebElement cardName7 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName7.sendKeys(cardTitle7);
			cardName7.sendKeys(Keys.ENTER);

			WebElement cardName8 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName8.sendKeys(cardTitle8);
			cardName8.sendKeys(Keys.ENTER);

			WebElement cardName9 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName9.sendKeys(cardTitle9);
			cardName9.sendKeys(Keys.ENTER);

			WebElement cardName10 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
			cardName10.sendKeys(cardTitle10);
			cardName10.sendKeys(Keys.ENTER);

			Actions actions = new Actions(driver);
			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='OOPS']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[2]")) ).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='WEBDRIVER']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[3]")) ).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='LOCATORS']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[3]")) ).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='SMOKE']")), driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='FUNCTIONAL']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='REGGRESSION']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

			actions.dragAndDrop(driver.findElement(By.xpath("//a[text()='ADHOC']")),driver.findElement(By.xpath("(//div[@data-testid='list'])[4]"))).build().perform();

		}
		@Test(priority = 5)
		public void logout()
		{
			driver.findElement(By.xpath("(//span[@aria-label='Vinay (vinayvinn99)'])[1]")).click();
			driver.findElement(By.xpath("//span[text()='Log out']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();
		}
		@AfterClass
		public void postCondition()
		{
			driver.manage().window().minimize();
			driver.quit();
		}
	}
