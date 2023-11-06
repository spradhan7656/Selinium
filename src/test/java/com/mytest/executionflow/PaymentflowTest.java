package com.mytest.executionflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaymentflowTest 
{
	
	public WebDriver driver;
	//@BeforeTest means this setup the browser property
	@BeforeTest
	public void testSetupStep()
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
	}
	//@BeforeMethod are use to after setup browser which browser are lunch
	@BeforeMethod
	public void createNewBrowser()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void addIteamToCartTest() throws InterruptedException
	{
		//./ are the root node path present the file
		
		
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		Select quantity=new Select(driver.findElement(By.name("quantity")));
		quantity.selectByVisibleText("3");
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		
		Thread.sleep(7000);
		driver.quit();
	}
	@Test 
	public void checkoutTest()
	{
		System.out.println("checkout pass");
	}
	//@AfterMethod are use to in every method are end that run 
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit(); 
	}

}
