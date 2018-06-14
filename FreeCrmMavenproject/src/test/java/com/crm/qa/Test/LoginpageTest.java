package com.crm.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepageclass;
import com.crm.qa.pages.Loginpageclass;

public class LoginpageTest extends TestBase
{
	 Loginpageclass loginpageRef;
	 Homepageclass homepage;
	 
	public LoginpageTest() {
		super();    //it will call Testbase class constructor
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization(); //it will call intialize mathod in test base class
	  loginpageRef=new Loginpageclass();
	}
	@Test(priority=2)
	public void Verify_Loginpage_titleTest()
	{
		String LoginpageTitle=loginpageRef.freecrm_Loginpage_Titlevalidation();
		Assert.assertEquals(LoginpageTitle, "Free CRM software in the cloud powers sales and customer service","Login page Title is not matched");
	}
	@Test(priority=3)
	public void verify_Loginpage_LogoTest()
	{
		boolean logo=loginpageRef.Freecrm_logo_validation();
		Assert.assertTrue(logo);
	}
	@Test(priority=1)
	public void Verify_loginTest() throws InterruptedException{
	homepage=loginpageRef.Freecrm_loginpage_loginvalidation(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
