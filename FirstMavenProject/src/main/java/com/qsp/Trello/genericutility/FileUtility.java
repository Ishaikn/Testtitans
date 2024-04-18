package com.qsp.Trello.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class FileUtility {
	WebDriver driver;
	public String readdatafromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Trello.properties");
		Properties  pobj=new Properties();
		pobj.load(fis);
		String Value=pobj.getProperty(key);
		return Value;	
	}
}
