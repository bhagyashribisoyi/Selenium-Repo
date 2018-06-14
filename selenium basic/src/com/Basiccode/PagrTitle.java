package com.Basiccode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class PagrTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	    String title=driver.getTitle();
	    
	   if(title.equals("Google"))
	   {
		   System.out.println("title is present:"+title);
	   }
	   else {
		
		   System.out.println("title is not present");
	}
	 WebElement btrn= driver.findElement(By.xpath("//input[contains(@value,'Google Search')]"));
	 if(btrn.isDisplayed())
	 {
		 System.out.println("google search is present");
	 }
	 else{
		 System.out.println("search btn is not present");
	 }
	}

}
