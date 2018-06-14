package com.Basiccode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clour_FontSiize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		//location of webelement
		System.out.println(driver.findElement(By.linkText("Sign in")).getLocation());
		
		 //height & width
	Dimension size=driver.findElement(By.linkText("Sign in")).getSize();
	System.out.println(size);
		
	 String color=driver.findElement(By.linkText("Sign in")).getCssValue("colour");
	 System.out.println(color);
	 //font size
	 String fontsize=driver.findElement(By.linkText("Sign in")).getCssValue("font-size");
	 System.out.println(fontsize);
	 driver.close();

	}

}
