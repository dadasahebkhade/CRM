package com.qa.CRM.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.CRM.testbases.BaseTest;

public class ContactPage extends BaseTest  {

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement lblcontact;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLblDisplay() {
		return lblcontact.isDisplayed();
	}
	
	
	
	
}
