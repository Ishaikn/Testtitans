package datadriventesting;

//Perfect Example for Runtime Polymorphism and Compile time Polymorphism
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//reading the data from Propertyfie


public class datadriventesting01 {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	//Access the data
	FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
	//Instance of Properties class
	Properties Pobj=new Properties();
	//Load the data for the file and to store the data inside POBJ
	Pobj.load(fis);
	String Browsername=Pobj.getProperty("browsername");
	System.out.println(Browsername);
	if(Browsername.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(Browsername.equals("edge")){
		driver=new EdgeDriver();
	}
	else if(Browsername.equals("firefox")){
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Pobj.getProperty("url"));
	
	Thread.sleep(2000);
	WebElement emailTextfield=driver.findElement(By.id("email"));
	emailTextfield.sendKeys(Pobj.getProperty("un"));
	
	Thread.sleep(2000);
	WebElement passwordfield=driver.findElement(By.id("pass"));
	passwordfield.sendKeys(Pobj.getProperty("pn"));
	
	Thread.sleep(2000);
	driver.findElement(By.name("login")).submit();
	driver.manage().window().minimize();
	
}
}
