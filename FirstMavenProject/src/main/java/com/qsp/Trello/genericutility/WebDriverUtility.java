package com.qsp.Trello.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {

	public void implicitwaiit(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	}
}
