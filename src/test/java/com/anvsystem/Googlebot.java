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
				"G:\\Data stuacture java\\Selinium\\binary\\chromedriver.exe");//this is driver chrome use to open the chrome 
		
		
		WebDriver driver =new ChromeDriver();//class of chrome of driver
		driver.get("https://www.google.com");//enter the link to open the web page
		driver.findElement(By.name("q")).sendKeys("Automation");//search box unique id to search and what search
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//operaton is performed which and target
		Thread.sleep(22000);
		driver.quit();//need to quit browser because consume RAM
		
	}
}
