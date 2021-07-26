package com.autofw.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autofw.qa.base.TestBase;
import com.autofw.qa.pages.BasePage;
import com.autofw.qa.pages.LoginPage;

public class LoginPageTestSuite extends TestBase{
	LoginPage loginPage;
	BasePage basePage;
	public LoginPageTestSuite()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();		
		loginPage = new LoginPage();
		basePage = new BasePage();
	}
	
	@Test
	public void verifyLoginPageLoaded()
	{		
		Assert.assertEquals(basePage.clickOnSignInLink().verifySignInPage(),"Amazon Sign In");		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
