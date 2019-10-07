package com.guru99.testcases;


import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.guru99.utilities.Readconfig;
import com.mongodb.MapReduceCommand.OutputType;

public class BaseClass {
	Readconfig readconfig=new Readconfig();
	
	public static WebDriver driver;
	public static String timestamp;
	public String url=readconfig.getApplicationUrl();
	public String username=readconfig.username();
	public String password=readconfig.password();
	public String invalid_password=readconfig.invalid_password();
	public String invalid_username=readconfig.invalid_username();
	
	@BeforeSuite
	public void setUp()
	{
		System.getProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
	}
	
	@AfterSuite(enabled=false)
	public void tearDown()
	{
		driver.close();
	}
	
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		timestamp=tname;
		TakesScreenshot ts=(TakesScreenshot)driver;
		java.io.File source=ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		java.io.File target=new java.io.File(System.getProperty("user.dir"+ "/Screenshots/"+ timestamp + ".png"));
		org.openqa.selenium.io.FileHandler.copy(source, target);
		System.out.println("screenshot taken");
		
		
	}
	
	
	

}
