package com.qsp1.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Trellohomepage {
WebDriver driver;
	public  Trellohomepage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);		
	}
	public WebElement getLoginLink() {
		return getLoginLink();
	}
	@FindBy(xpath="//a[text()='Log in']/parent::div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']")
	private WebElement loginlink;	 
}
