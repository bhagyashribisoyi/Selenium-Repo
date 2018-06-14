package com.crm.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Dealspage;
import com.crm.qa.pages.Homepageclass;
import com.crm.qa.pages.Loginpageclass;
import com.crm.qa.util.Utilityclass;

public class ContactpageTest extends TestBase 
{
	Homepageclass homepageRef;
	 Loginpageclass loginpageRef;
	 Contactspage contactpageRef;
	 Utilityclass utilref;
	 public ContactpageTest()
	  {
		  super();
	  }
	
	 
	 @BeforeMethod(alwaysRun=true)
	 public void setUp() throws InterruptedException
	 {
	 	intialization();
	 	homepageRef=new Homepageclass();
	 	loginpageRef=new Loginpageclass();
	 	contactpageRef=new Contactspage();
	 	utilref=new Utilityclass();
	 	homepageRef=loginpageRef.Freecrm_loginpage_loginvalidation(prop.getProperty("username"),prop.getProperty("password"));
	 	utilref.Switch_To_Frame();
	 	contactpageRef=homepageRef.Verify_Contacts_link();
	 }
	 
	 @AfterMethod
	 public void TearDown()
	 {
	 	//driver.quit();
	 }
	 @Test(priority=1)
	 public void verify_Contactslabel_contactpageTest() throws InterruptedException
	 {
		Assert.assertTrue(contactpageRef.verify_contactslabel_Contactpage()); 
	 }
	 @Test(priority=2)
	 public void verify_singleckeckbox_InContactPage()
	 {
		 contactpageRef.verify_selection_checkbox("ajit swain");
		 contactpageRef.verify_selection_checkbox("bhagyashri swain");
	 }
}
