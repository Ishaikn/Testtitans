package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class W3Schools {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement parentFrame=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(parentFrame);

		WebElement childFrame=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(childFrame);
		WebElement childFrameText=driver.findElement(By.tagName("h1"));
		//		wait.until(ExpectedConditions.visibilityOf(childFrameText));
		String childText=childFrameText.getText();
		System.out.println(childText);

		driver.switchTo().parentFrame();
		WebElement parentFrameText=driver.findElement(By.xpath("//body/p"));
		//		wait.until(ExpectedConditions.visibilityOf(parentFrameText ));
		String parentText=parentFrameText.getText();
		System.out.println(parentText);
	}
}
