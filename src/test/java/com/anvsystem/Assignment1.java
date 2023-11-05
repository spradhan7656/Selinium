package com.anvsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr535530");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pEsEraq");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(5000);
		String s=driver.getTitle();
		System.out.println(s);
		
		Thread.sleep(4000);
		driver.quit();
	}
}
//User ID :	mngr535530
//Password :	pEsEraq