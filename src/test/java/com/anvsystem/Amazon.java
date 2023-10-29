package com.anvsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"G:\\Data stuacture java\\Selinium\\binary\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=5696833477237057646&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007828&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		driver.findElement(By.name("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.name("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(11000);
		driver.quit();
	}
}
