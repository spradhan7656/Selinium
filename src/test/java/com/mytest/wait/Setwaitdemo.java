package com.mytest.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Setwaitdemo 
{
	@Test
	public void implictWaitTest()
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));//This wait is use to fetching data form the server because some time our connection will be slow so in this case it will be wait some time
		//in this senirio we will learn how to wait to fatch the server form data // this above line is use to implicit wait command
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("display-other-button")).click();
		driver.findElement(By.id("hidden")).click();
		
		
		driver.quit();
		
	}
}
