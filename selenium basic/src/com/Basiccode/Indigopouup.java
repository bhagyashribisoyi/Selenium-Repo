package com.Basiccode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indigopouup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\bhagyashree\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.goindigo.in/");
		  driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/div/div/ul/li[3]/div/div[1]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='globalModal']/div/div/div[3]/button")).click();

	}

}
