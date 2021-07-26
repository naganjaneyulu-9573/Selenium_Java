package com.autofw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autofw.qa.base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory - OB
	@FindBy(css = "label[for='ap_email']")
	WebElement loginPageMailidField;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifySignInPage()
	{		
		return driver.getTitle();
	}
}
