package com.qsp1.trello.pomrepo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qsp.Trello.genericutility.BaseClass;

public class CreattheBoard extends BaseClass{
	@Test
	public void EnduserBoardCreation(WebElement Boardtitledropdown) throws IOException {
		
		Trellohomepage homepage=new Trellohomepage(driver);
		TrelloLoginpage Loginpage =new TrelloLoginpage(driver);
		Boardpage createBoard=new Boardpage(driver);
		homepage.getLoginLink().click();
		Loginpage.getUsernameTextField().sendKeys(fileutils.readdatafromProperty("email"));
		Loginpage.getcontinuebutton().submit();
		Loginpage.getPasswordTextField().sendKeys(fileutils.readdatafromProperty("password"));
		Loginpage.getLoginButton().submit();
		createBoard.getCreateboardbutton().sendKeys(fileutils.readdatafromProperty("createboard"));
		createBoard.action.click(Boardtitledropdown);
		createBoard.getCreateboardbutton().click();
		createBoard.getSignoutoption().click();
		createBoard.getSingoutbutton().submit();
	}
}