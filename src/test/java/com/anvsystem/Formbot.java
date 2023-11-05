package com.anvsystem;

import java.util.UUID;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formbot 
{
	static int i=0,j=0;
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		
		Thread.sleep(4000);
		for(int i=0;i<10;i++)//use for 10 time to enter the random user 
		{
			//driver.findElement(By.name("firstname")).sendKeys("Santosh");
			driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring(0, 8));//this use for random field
			//driver.findElement(By.name("lastname")).sendKeys("Pradhan");
			driver.findElement(By.name("lastname")).sendKeys(UUID.randomUUID().toString().substring(0, 8));
			//driver.findElement(By.name("email")).sendKeys("sprdhan7656@gmail.com");
			driver.findElement(By.name("email")).sendKeys(UUID.randomUUID().toString().substring(0, 8)+"@test.com");
			random();
			//driver.findElement(By.xpath("//input[@value='female']")).click();//click operation //absloute x path   /html/body/div/div/form/label[4]/label[2]// reletive //input[@value='female'] 
			//driver.findElement(By.name("phone")).sendKeys("7656932074");//send operation
			driver.findElement(By.name("phone")).sendKeys(UUID.randomUUID().toString().substring(0, 10));
			//choose the select iteam
			randomcountry();
			driver.findElement(By.name("programming")).click();
			
			driver.findElement(By.tagName("button")).click();//only one button use tagName another case other property
			
			Thread.sleep(2000);
			
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	public static void random()
	{
		
		String ran[]=new String[2];
		ran[0]="//input[@value='male']";
		ran[1]="//input[@value='female']";
		if(i==0)
		{
			driver.findElement(By.xpath(ran[i])).click();
			i++;
		}
		else
		{
			driver.findElement(By.xpath(ran[i])).click();
			i--;
		}
		
	}
	public static void randomcountry()
	{
		Select s=new Select(driver.findElement(By.name("country")));//using this select class to select the group element
		
		if(j==0)
		{
			s.selectByVisibleText("India");
			j++;
		}
		else if(j==1)
		{
			s.selectByVisibleText("UK");
			j++;
		}
		else if(j==2)
		{
			s.selectByVisibleText("USA");
			j++;
		}
		else if(j==3)
		{
			s.selectByVisibleText("Canada");
			j++;
		}
		else
		{
			s.selectByVisibleText("Australia");
			j=0;
		}
	}
}
