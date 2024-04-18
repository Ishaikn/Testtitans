package TestNg;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Check {
WebDriver driver;
private WebElement[] option;
@Parameters({"browser", "url","userfield", "password"})
@Test
	public void demo(String browser, String url, String userfield, String password ) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		}else if (browser.equals("edge")) {
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
WebElement SearchButton=driver.findElement(By.id("adv-search"));
SearchButton.click();
WebElement search2=driver.findElement(By.id("select2-chosen-1"));
search2.click();
 
Select dropdown=new Select(search2);
List<WebElement> options =dropdown.getOptions();
for(WebElement Options:option) {
	if(dropdown.isMultiple()) {
		System.out.println("Multi options");
	}
}dropdown.getOptions();
//Actions action=new Actions(driver);
//action.moveToElement(search2).scrollToElement(search2).click(search2.findElement(By.id("select2-chosen-27")));
//action.click(search2).scrollToElement(search2).moveToElement(search2.findElement(By.id("select2-chosen-27")));
//List<WebElement> options=dropdown.getOptions();
//for(WebElement option:options) {
//if(dropdown.isMultiple()) {
//	System.out.println("Multiple options Available");
//}else {
//	System.out.println("Fail");
//}}
}}
