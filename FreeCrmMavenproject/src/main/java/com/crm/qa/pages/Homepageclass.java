package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.Utilityclass;

public class Homepageclass extends TestBase
{
	
	
	@FindBy(xpath="//td[contains(text(),'User: bhagyashri bisoyi')]")
	WebElement username_in_HomePage;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	//To intialize all the Webelement object create constructor
	
		 public Homepageclass() 
		{
			PageFactory.initElements(driver, this);
		}
	
	
	//create method on homepageObject
	
	public String Verify_HomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean Verify_Username_InHomepage()
	{
		
		return username_in_HomePage.isDisplayed();		
	}
    
	public Contactspage Verify_Contacts_link()
	{
		
		contactsLink.click();
		return new Contactspage();
	}
	
	public Dealspage Verify_Deals_link() 
	{
		DealsLink.click();
		return new Dealspage();
	}
	
	public Taskspage verify_Tasks_link() 
	{
	   
		TasksLink.click();
		return new Taskspage();
	}
     
	

}
