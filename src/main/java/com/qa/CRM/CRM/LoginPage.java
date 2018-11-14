package com.qa.CRM.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.CRM.testbases.BaseTest;

public class LoginPage extends BaseTest {
	//WebDriver driver;
	/*@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement loginsubmit;
	*/
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@alt,'free crm logo')]")
	WebElement logo;
	
	
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginTest() {
		username.sendKeys("dadasaheb");
		password.sendKeys("DhruvRaj@2014");
		//loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
    	
		/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dadasaheb");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("DhruvRaj@2014");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		*/
		return new HomePage(); 
				
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		return 	logo.isDisplayed();
	}
}
