package com.mytest.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitdemo 
{
	@Test
	public void explicitwaitdemo()
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//This is of WebDrivre class for wait Driver how many second 
		driver.findElement(By.id("enable-button")).click();//This click button
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("disable"))));//This is wait until by enable the button for wait or clickble for wait
		driver.findElement(By.id("disable")).click();// in this case the button is now ready for click
		
		driver.quit();//after the is now ended
		
	}

}
