package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReaddatafromXMLfile {
	WebDriver driver;

	@Parameters({"browser", "url", "user", "password", "userfield"})
	@Test
	public void loginToVtiger(String browser, String url, String user, String password, String userfield) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("There is not Drivers available");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(url);
		WebElement login = driver.findElement(By.id("username"));
		login.clear();
		login.sendKeys(userfield);
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.clear();
		Pass.sendKeys(password);
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
		Loginbutton.click();
	}
}
