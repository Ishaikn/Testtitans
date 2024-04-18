package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageofModifierKeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernametextfield=driver.findElement(By.id("username"));
	Actions actions = new Actions(driver);
	actions.keyDown(usernametextfield,Keys.CONTROL).sendKeys(usernametextfield,"a").keyUp(usernametextfield, Keys.CONTROL).sendKeys(usernametextfield,Keys.DELETE).sendKeys(usernametextfield,"ADMIN").perform();	
}
}
