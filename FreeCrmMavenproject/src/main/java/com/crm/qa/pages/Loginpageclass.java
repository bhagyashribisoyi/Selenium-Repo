package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpageclass extends TestBase
{
 //creating PageFactory for login page
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@type,'submit')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupbtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement freecrmlogo;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contactlink;
	
	@FindBy(xpath="//small[contains(text(),'Forgot Password?')]")
	WebElement forgotpasswordlink;
	
	
	//To intialize all the Webelement object create constructor
	
	public Loginpageclass() {
		
		PageFactory.initElements(driver, this);
	}
	
// create method to perform on loginpage
	
	public String freecrm_Loginpage_Titlevalidation()
	{
	return driver.getTitle();
	}
	
	public boolean Freecrm_logo_validation()
	{
	return freecrmlogo.isDisplayed();
	}
	
	public Homepageclass Freecrm_loginpage_loginvalidation(String un,String pwd) throws InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		loginbtn.click();
		return new Homepageclass();
	}
	
	
	}



