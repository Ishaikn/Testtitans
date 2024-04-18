package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pre_PostConditions {
WebDriver Driver;
@BeforeMethod
public void precondition() {
	Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Test
public void loginVtiger() {
	Driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement username=Driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("admin");
	WebElement Password=Driver.findElement(By.id("password"));
	Password.clear();
	Password.sendKeys("admin");
	WebElement submit=Driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
	submit.submit();
	WebElement logout=Driver.findElement(By.className("userName dropdown-toggle pull-right"));
	logout.submit();
}

@AfterMethod(enabled=false)
public void postcondition() {
	Driver.manage().window().minimize();
//	Driver.quit();
}
}
