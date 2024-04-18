package com.isd.W3School.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	 WebElement loginlink=driver.findElement(By.xpath("//a[@class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']"));
	loginlink.click();
}
}