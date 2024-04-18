package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileuploadPopup {

	WebDriver driver;
	
	public void notificationpopup() {
		driver.get("https://www.ajio.com");
		
	}
	public void fileuploadpopup() {
		driver.get(null);
		WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys("C:\\Users\\ishai\\OneDrive\\Desktop");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();	
	}
	public void filedownload() {
		//popoup again
	}
}
