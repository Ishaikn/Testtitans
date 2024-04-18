package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ReadDataFromXML {
	WebDriver driver;
	@Parameters({"browserName","url","username","password"})
	@Test
	public void loginToVtiger(String browserName, String url, String username, String password) throws InterruptedException {

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
		Thread.sleep(2000);
		WebElement userNameTextField=driver.findElement(By.id("username"));
		userNameTextField.clear();
		userNameTextField.sendKeys(username);
		Thread.sleep(2000);
		WebElement passwordTextField= driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		Thread.sleep(2000);
		WebElement signinButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.submit();
		driver.manage().window().minimize();
		driver.quit();

	}


}
