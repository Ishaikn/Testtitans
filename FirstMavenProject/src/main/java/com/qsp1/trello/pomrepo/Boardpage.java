package com.qsp1.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Boardpage {

	WebDriver driver;
	
	public Boardpage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);//page factory is a class
		
	}
	@FindBy(xpath="//span[text()='Boards']/parent::a[@class='oTmCsFlPhDLGz2 undefined RPa_ezCLkUNX1W RdqZOPHqhCnasP']")
	private WebElement Boardlink;
	@FindBy(xpath="//div[@class='board-tile mod-add']/parent::li[@class='boards-page-board-section-list-item']")
	private WebElement Createboardbutton;
	@FindBy(xpath="//input[contains(@class,'nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst')]/parent::label[@class='fMvxkh4DHKJGnq']")
	private WebElement BoardTitle;
	@FindBy(xpath="//div[@class='t3Ou6F9HZxP3VK css-ufz0vj-control']/parent::div")
	private WebElement Boardtitledropdown;
	Actions action=new Actions(driver);
	@FindBy(xpath="//button[@data-testid='create-board-submit-button']")
	private WebElement CreateButton;
	@FindBy(xpath="//button[@data-testid='header-member-menu-button']")
	private WebElement Signoutoption;
	@FindBy(xpath="//button[@data-testid='account-menu-logout']")
	private WebElement Singoutbutton;
	
	
	public WebElement getBoardtitledropdown() {
		return Boardtitledropdown;
	}

	public WebElement getCreateboardbutton() {
		return Createboardbutton;
	}
	
	public WebElement getSignoutoption() {
		return Signoutoption;
	}
	public WebElement getSingoutbutton() {
		return Singoutbutton;
	}
}
