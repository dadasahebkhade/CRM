package com.qa.CRM.testbases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	public static  WebDriver driver;
	
	
	public void init(String bType)  {
		try
		{
		if (bType.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\SeleniumProject\\FirefoxDriver\\geckodriver-v0.21.0-arm7hf\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (bType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProject\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (bType.equals("IE")){
			System.setProperty("webdriver.IE.driver", "E:\\SeleniumProject\\ChromeDriver\\chromedriver_win32\\IE.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get("https://www.freecrm.com/index.html?e=2");
		//Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
