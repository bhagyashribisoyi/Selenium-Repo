package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class Utilityclass extends TestBase
{

	public static long Pageload_timeout=30;
	public static long Implicitily_wait=40;
	
	public void Switch_To_Frame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
}
