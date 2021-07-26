package com.autofw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autofw.qa.base.TestBase;

public class BasePage extends TestBase{
	@FindBy(css = "a#nav-link-accountList")
	WebElement signinLink;
	
	public BasePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnSignInLink()
	{
		signinLink.click();
		return new LoginPage();
	}
}
