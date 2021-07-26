package com.autofw.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.autofw.qa.util.LoadTime;

public class TestBase {	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream ipStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\autofw\\qa\\config\\config.properties");
			prop.load(ipStream);
		}catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}		
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\JP\\JAVA WORKSPACE\\browser_Drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\JP\\JAVA WORKSPACE\\browser_Drivers\\geckodriver.exe");
			driver = new ChromeDriver();			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(LoadTime.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(LoadTime.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
