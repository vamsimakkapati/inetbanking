package com.inetbanking.testcases;




import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	
	public String baseURL="http://demo.guru99.com/V4/";
	public String username="mngr161530";
	public String password="vEmAzYv";
	public static WebDriver Driver;
	
	
	
	public static Logger logger;//add log4j 
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\maven\\netbankingmaven\\Drivers\\chromedriver.exe");
		 Driver=new ChromeDriver();
		 Driver.manage().window().maximize();
		 
		  logger=Logger.getLogger("inetbanking");//Output Method
			PropertyConfigurator.configure("Log4j.properties");//Property file of Log4J
	}
	
	@AfterClass
	public void teardown() {
		Driver.quit();
	}

}
