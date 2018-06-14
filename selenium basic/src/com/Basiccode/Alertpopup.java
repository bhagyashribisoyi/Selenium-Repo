package com.Basiccode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("userId")).sendKeys("abc1234");
		driver.findElement(By.id("ImageButton1")).click();
		
	  String popupmsg=driver.switchTo().alert().getText();
	  System.out.println(popupmsg);
	  driver.switchTo().alert().accept();

	}

}
