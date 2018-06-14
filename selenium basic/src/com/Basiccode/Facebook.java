package com.Basiccode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
	    
		Select daydropdown=new Select(driver.findElement(By.id("day")));
		
		List<WebElement>day=daydropdown.getOptions();
		
		for (WebElement daylist:day)
		{
			System.out.println("==========");
			System.out.println(daylist.getSize());
			System.out.println(daylist.getText());
		}
		

	}

}
