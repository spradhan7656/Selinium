package com.anvsystem;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formbot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		for(int i=0;i<10;i++)//use for 10 time to enter the random user 
		{
			//driver.findElement(By.name("firstname")).sendKeys("Santosh");
			driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring(0, 8));//this use for random field
			//driver.findElement(By.name("lastname")).sendKeys("Pradhan");
			driver.findElement(By.name("lastname")).sendKeys(UUID.randomUUID().toString().substring(0, 8));
			//driver.findElement(By.name("email")).sendKeys("sprdhan7656@gmail.com");
			driver.findElement(By.name("email")).sendKeys(UUID.randomUUID().toString().substring(0, 8)+"@test.com");
			driver.findElement(By.xpath("//input[@value='female']")).click();//click operation //absloute x path   /html/body/div/div/form/label[4]/label[2]// reletive //input[@value='female'] 
			//driver.findElement(By.name("phone")).sendKeys("7656932074");//send operation
			driver.findElement(By.name("phone")).sendKeys(UUID.randomUUID().toString().substring(0, 10));
			Select s=new Select(driver.findElement(By.name("country")));//using this select class to select the group element
			s.selectByVisibleText("India");//choose the select iteam
			driver.findElement(By.name("programming")).click();
			
			driver.findElement(By.tagName("button")).click();//only one button use tagName another case other property
			
		}
		
		
		Thread.sleep(16000);
		driver.quit();
		
		
	}
}
