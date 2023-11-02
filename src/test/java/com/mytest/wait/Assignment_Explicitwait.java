package com.mytest.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_Explicitwait 
{
	@Test
	public void explicitwaitdemo()
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.id("checkbox")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ch"))));
		driver.findElement(By.id("ch")).click();
		
		
		driver.quit();
	}
}
