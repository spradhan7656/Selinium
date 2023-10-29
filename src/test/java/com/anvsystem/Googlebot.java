package com.anvsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googlebot
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"G:\\Data stuacture java\\Selinium\\binary\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		driver.quit();
		
	}
}
