package com.testthing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orderid 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		//driver.findElement(By.xpath("//nav[@id='nav']/a[2]")).click();
	
		Thread.sleep(4000);
		
		Select quntity =new Select(driver.findElement(By.name("quantity")));
		quntity.selectByVisibleText("5");
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("card_nmuber")).sendKeys("4262613990873546");
		Select month=new Select(driver.findElement(By.name("month")));
		month.selectByVisibleText("09");
		Select year=new Select(driver.findElement(By.name("year")));
		year.selectByVisibleText("2028");
		driver.findElement(By.name("cvv_code")).sendKeys("032");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(7000);
		
		
	driver.quit();	
	}
}
