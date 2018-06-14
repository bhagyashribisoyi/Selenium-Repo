package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class Contactspage extends TestBase
{

	/*@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactslabel;*/
	
	public boolean verify_contactslabel_Contactpage() throws InterruptedException
	{
		Thread.sleep(3000);
	   return driver.findElement(By.xpath("//td[contains(text(),'Contacts')]")).isDisplayed();
	}
	
	public void verify_selection_checkbox(String name)
	{
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	
	
}
