package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.Utilityclass;

public class TestBase {
	
	public static WebDriver driver;
	public static String browsername;
    public  static Properties prop;
    
	public TestBase() {
		
		prop=new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\selenium framework\\FreeCrmMavenproject\\src\\main\\java\\com\\crm\\qa\\configEnvironment\\config.properties");
			System.out.println(prop);
		
			prop.load(file);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		 browsername=prop.getProperty("browser");
	}
	
	public static void intialization()
	{
	 if(browsername.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
		 driver=new ChromeDriver();
	 }else if(browsername.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver","D:\\bhagyashree\\geckodriver.exe"); 
		 driver=new FirefoxDriver();
	 } 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(Utilityclass.Pageload_timeout,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(Utilityclass.Implicitily_wait, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
		
	}
}
