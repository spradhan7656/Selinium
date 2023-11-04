package com.anvsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uiinteractions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("html");
		Thread.sleep(10000);
		Actions actions =new Actions(driver);//this class use to some operation mouse releted perfomed
		actions.moveToElement(driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")))
		.build()
		.perform();
		
		Thread.sleep(11000);
		
		JavascriptExecutor js=((JavascriptExecutor )driver);//using this class for javasript work this is analog interaction
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//h5[text()='Get Certified']")));//sceoll
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
