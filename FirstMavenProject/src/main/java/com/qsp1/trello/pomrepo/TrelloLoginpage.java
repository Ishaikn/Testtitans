package com.qsp1.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginpage {
	
	WebDriver driver;

	public TrelloLoginpage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getcontinuebutton() {
		return continuebutton;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public WebElement getLoginButton() {
		return LoginButton ;
	}

	@FindBy(id ="login-submit")
	private WebElement continuebutton;
	@FindBy(id ="password")
	private WebElement PasswordTextField;
	@FindBy(id="login-submit")
	private WebElement LoginButton;
}
