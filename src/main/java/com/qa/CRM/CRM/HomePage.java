package com.qa.CRM.CRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.CRM.testbases.BaseTest;



public class HomePage extends BaseTest  {

	@FindBy(xpath="//td[contains(text(),'User: Dadasaheb Khade')]")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactlinks;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement Dealslinks;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement Taskslinks;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String  HomePageTitle() {
		return driver.getTitle();
	}
		 
	public  boolean  displayUsername() {
	   return username.isDisplayed();
	}
	
	
	public ContactPage clickOnContactlink() {
		
		contactlinks.click();
		return new ContactPage();
	}
		
	public DealsPage clickOnDeals() {
		Dealslinks.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasks() {
		Taskslinks.click();
		return new TasksPage();
	}
	
}
