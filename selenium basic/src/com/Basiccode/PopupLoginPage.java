package com.Basiccode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupLoginPage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\bhagyashree\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get("http://flipkart.com");
		  WebDriverWait wt=new WebDriverWait(driver, 30);
		  wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div._39M2dM:nth-child(1) > input:nth-child(1)")));
		  driver.findElement(By.cssSelector("div._39M2dM:nth-child(1) > input:nth-child(1)")).sendKeys("abc123");
		  
		  
		  
		  
		  /*Wait<WebDriver> wt=new WebDriverWait(driver, 30);
		  wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")));
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("bhagyashri");
		  */
		  
	}

}
