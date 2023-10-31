package com.anvsystem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsInteraction 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		List <WebElement> elements=driver.findElements(By.xpath("//form/label[7]/label"));//this list store the more data fatching form the label form the webtext
		
		for(int i=0;i<elements.size();i++)
		{
			String elementText=elements.get(i).getText();//this time extract data form list to store a string
			if(elementText.contains("JavaScript"))
			{
				System.out.println("PASSED");
				break;
			}
		}
		
		driver.quit();
		
	}
}
