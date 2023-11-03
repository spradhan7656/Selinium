package com.mytest.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assingment_2_Implictwait 
{
	@Test
	public void testWait() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.id("populate-text")).click();
		
		WebElement element=driver.findElement(By.id("h2"));//the is for webelement 
		String check=element.getText();//this method to extract text the webelement

		
		Assert.assertEquals("Selenium Webdriver",check);
		
		driver.quit();
	}
}
