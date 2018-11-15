package com.qa.CRM.CRM.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.CRM.CRM.HomePage;
import com.qa.CRM.CRM.LoginPage;
import com.qa.CRM.testbases.BaseTest;

public class LoginTest extends BaseTest  {
	LoginPage loginpage;
	HomePage homepage;
	
	

	@BeforeMethod
	public void setup()  {
		init("Chrome");
		loginpage=new LoginPage();
	}
	
	
	@Test(priority=3)
	public void  Logintest() {
		homepage=loginpage.loginTest();
		
	}
	
	@Test(priority=4)
	public void  test() {
		System.out.println("This is test methode added");
		
	}
	
	@Test(priority=2,enabled=true)
	public void verifyTitleTest() {
		String str=loginpage.validateTitle();
		Assert.assertEquals(str, "#1 Free CRM software in the cloud for sales and service");
	}
	
	
	@Test(priority=1)
	   public void verifyLogoTest() {
		boolean flag= loginpage.validateImage();
		Assert.assertEquals(true, flag);
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
