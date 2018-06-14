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
import com.crm.qa.pages.Taskspage;
import com.crm.qa.util.Utilityclass;

public class HomepageTest extends TestBase
{
 Homepageclass homepageRef;
 Loginpageclass loginpageRef;
 Contactspage contactpageRef;
 Dealspage dealspageRef;
 Taskspage taskspageref;
 Utilityclass utilref;
 
  public HomepageTest()
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
	dealspageRef=new Dealspage();
	taskspageref=new Taskspage();
	utilref=new Utilityclass();
	homepageRef=loginpageRef.Freecrm_loginpage_loginvalidation(prop.getProperty("username"),prop.getProperty("password"));
}

@AfterMethod
public void TearDown()
{
	driver.quit();
}
@Test(priority=1)
public void Verify_HomePageTitle_Test()
{
  String HomePageTitle=homepageRef.Verify_HomePageTitle();
  Assert.assertEquals(HomePageTitle, "CRMPRO","Home page Title is not matched");
}
@Test(priority=2)
public void Verify_UsernameInHomaPage_Test()
{
	 utilref.Switch_To_Frame();
	boolean user=homepageRef.Verify_Username_InHomepage();
	Assert.assertTrue(user, "user name is not present in homepage");
}
	
 @Test(priority=3)
 public void Verify_ContactsLinkTest() 
 {
	 utilref.Switch_To_Frame();
    contactpageRef=homepageRef.Verify_Contacts_link();
 }
 
 @Test(priority=4)
 public void Verify_DealsLinkTest() 
 {
	 utilref.Switch_To_Frame();
   dealspageRef=homepageRef.Verify_Deals_link();
 }
 
 
 @Test(priority=5)
 public void Verify_tasksLinkTest() 
 {
	 utilref.Switch_To_Frame();
   taskspageref=homepageRef.verify_Tasks_link();
 }
}
