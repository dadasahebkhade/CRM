package com.qa.CRM.CRM.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.CRM.CRM.ContactPage;
import com.qa.CRM.CRM.HomePage;
import com.qa.CRM.CRM.LoginPage;
import com.qa.CRM.Util.TestUtil;
import com.qa.CRM.testbases.BaseTest;

public class HomePageTest extends BaseTest{

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactPage contactpage;
	SoftAssert assertion  =new SoftAssert();
	@BeforeMethod
	public void setUp() {
		init("Chrome");
		loginpage=new LoginPage();
		contactpage=new ContactPage();
		
		testutil=new TestUtil();
		homepage=loginpage.loginTest();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		String str=homepage.HomePageTitle();
		Assert.assertEquals(str, "CRMPRO");
		
		assertion.assertEquals(str, "Expected titile");
	}
	
	@Test(priority=2)
	public void verifyDisplayName() throws InterruptedException {
		testutil.switcToFrame("mainpanel");
		boolean flag=homepage.displayUsername();
		Assert.assertEquals(flag, true);
		
	}
	
	@Test(priority=3)
	public void verifyContactLink() {
		testutil.switcToFrame("mainpanel");
		contactpage=homepage.clickOnContactlink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
