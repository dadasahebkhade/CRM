package com.qa.CRM.CRM.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.CRM.CRM.ContactPage;
import com.qa.CRM.CRM.HomePage;
import com.qa.CRM.CRM.LoginPage;
import com.qa.CRM.Util.TestUtil;
import com.qa.CRM.testbases.BaseTest;

public class ContactTest extends BaseTest {
	LoginPage loginpage;
	TestUtil testutil;
	HomePage homepage;
	ContactPage contactpage;
	
	
	@BeforeMethod
	public void setup() {
		init("Chrome");
		loginpage=new LoginPage();
		contactpage =new ContactPage();
		homepage=loginpage.loginTest();
		homepage=new HomePage();
		testutil=new TestUtil();
		testutil.switcToFrame("mainpanel");
		contactpage=homepage.clickOnContactlink();
		
		
	}
	
	@Test
	public void verifyContactLbl() {
	Assert.assertTrue(contactpage.verifyLblDisplay());
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
