package com.guru99.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Login_validation_framework extends BaseClass
{
	@Test(priority=1,groups="functional")
	public void Login() throws InterruptedException
	{
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		 Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		      Thread.sleep(1000);
			System.out.println("Login Succesfully");
		      Thread.sleep(1000);
		      String actualTitle = driver.getTitle();
		      String expectedTitle = "Guru99 Bank Manager HomePage";
		      
		     try {
		    	 if(actualTitle.equals(expectedTitle))
			      {
			    	  Assert.assertTrue(true);
			    	  System.out.println("Title matched");
			      }
			      else
			      {
			    	  Assert.assertTrue(false);
			    	  System.out.println("Title not matched");
			      }
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
						}
		      
		      Thread.sleep(1000);
		      System.out.println(driver.getTitle());
		      System.out.println("Tittle of the page verified succesfully");
		      driver.findElement(By.linkText("Log out")).click();
		      String popup_text1=driver.switchTo().alert().getText();
				 System.out.println(popup_text1);
				 driver.switchTo().alert().accept();
		/* driver.close(); */
				 
				 
				 
				 
		      
		/*
		 * WebElement ele=driver.findElement(By.xpath("//tr[@class='heading']")); try {
		 * if(ele.isEnabled()==true) { System.out.println("is enablle"); } else { throw
		 * new Exception(); }
		 * 
		 * 
		 * 
		 * } catch (Exception e) { System.out.println("is");
		 * 
		 * }
		 */
	}
	
	@Test(priority=2,groups="functional")
	public void Login1() throws InterruptedException
	{ 
		driver.findElement(By.name("uid")).sendKeys(invalid_username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(1000);
		 String popup_text2=driver.switchTo().alert().getText();
		 System.out.println(popup_text2);
		 driver.switchTo().alert().accept();
		 System.out.println("Login  not Succesfully2");
		 //driver.close();
		
	}
	@Test(priority=3,groups="regression")
	public void Login3() throws InterruptedException
	{ 
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(invalid_password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(1000);
		 String popup_text2=driver.switchTo().alert().getText();
		 System.out.println(popup_text2);
		 driver.switchTo().alert().accept();
		 System.out.println("Login  not Succesfully3");
		 //driver.close();
		
	}
	@Test(priority=4,groups="regression")
	public void Login4() throws InterruptedException
	{ 
		driver.findElement(By.name("uid")).sendKeys(invalid_username);
		driver.findElement(By.name("password")).sendKeys(invalid_password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(1000);
		 String popup_text3=driver.switchTo().alert().getText();
		 System.out.println(popup_text3);
		 driver.switchTo().alert().accept();
		 System.out.println("Login  not Succesfully4");
		 driver.close();
		
	}
}


