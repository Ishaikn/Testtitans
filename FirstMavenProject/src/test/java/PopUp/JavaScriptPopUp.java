package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptPopUp {
	WebDriver driver;
	@Test
	public void alertpopup() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("");
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert Message"+alertmsg);
		driver.switchTo().alert().accept();
	}@Test
	public void confirmpop() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(null);
		String confirmpopup=driver.switchTo().alert().getText();
		System.out.println("Confirmation Message"+confirmpopup);
		driver.switchTo().alert().dismiss();
	}@Test
	public void PromtPopup() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///c:/Users/BTM-Faculty");
		driver.switchTo().alert().sendKeys("100");
		driver.switchTo().alert().accept();
	}@Test
	public void hiddenDivision() {
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/?gad_source=1&gclid=EAIaIQobChMIzITWg7fUgwMV8KlmAh1X-gIjEAAYASAAEgIoF_D_BwE");
//		WebElement popup=driver.findElement(By.xpath(""));
		
		
	}
	}
