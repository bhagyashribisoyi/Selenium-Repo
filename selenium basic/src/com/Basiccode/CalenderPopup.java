package com.Basiccode;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//top citi dro-down
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		
		Thread.sleep(3000);
	
		List<WebElement>citilist=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		citilist.size();
		for(int i=0;i<=citilist.size(); i++)
		{
			if(citilist.get(i).getText().contains("Kolkatta"))
			{
				citilist.get(i).click();
			}
			break;
		}
		
		
	}
	

}
