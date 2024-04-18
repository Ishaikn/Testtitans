	package com.qsp.Trello.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static FileUtility fileutils=new FileUtility();
	public static WebDriverUtility webdriverutils=new WebDriverUtility();
	
	public static WebDriver driver;
	@BeforeMethod
	public void preConditions() throws IOException {
		String browsername=fileutils.readdatafromProperty("browser");
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webdriverutils.implicitwaiit(driver);
		driver.get(fileutils.readdatafromProperty("url"));
		
	}
	@AfterMethod
	public void postcondition() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
