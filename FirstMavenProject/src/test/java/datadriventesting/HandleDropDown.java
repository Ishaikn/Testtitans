package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement list = driver.findElement(
				By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-11']"));
//	list.click();
		Select listop = new Select(list);
		List<WebElement> alloption = listop.getAllSelectedOptions();
		for (WebElement options : alloption) {
			if (options.getText().equals("AC 3 Economy (3E)")) {
				options.click();
				break;
			}
		}
//	listop.selectByVisibleText("Vistadome Chair Car (VC)");
	}
}
