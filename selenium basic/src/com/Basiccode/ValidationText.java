package com.Basiccode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	if(driver.getPageSource().contains("Google offered in:"))
	{
		System.out.println("text is present");
	}
	else{
		System.out.println("text is not present");
	}
	//how to het text
	WebElement ele=driver.findElement(By.linkText("Sign in"));
	System.out.println(ele.getText());
	if (ele.getText().contains("Sign in"))
	{
		System.out.println("sign in is present");
		
	}
	else
	{
		System.out.println("sign in is not present");
	}
	driver.close();
		
	}
	

}
