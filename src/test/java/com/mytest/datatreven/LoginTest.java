package com.mytest.datatreven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest 
{
	public WebDriver driver;
	public void setupBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
			driver=new ChromeDriver();
		}
			//for other browser used else if().....		
	}
	public void navigate(String url)
	{
		driver.get(url);
	}
	public void type(By LocaterType,String typeText)
	{
		driver.findElement(LocaterType).sendKeys(typeText);
	}
	public void clickElements(By LocaterType)
	{
		driver.findElement(LocaterType).click();
	}
	
	@Test(dataProvider="loginData")//dataProvider is use to searching who is provide the data and very importnt concept is both dataprovider and name attribute will same the fatch the data
	public void loginWithCredentials(String userId,String password) throws InterruptedException// if the data provider method
	{
		setupBrowser("chrome");
		navigate("https://demo.guru99.com/v4/index.php");
		type(By.name("uid"),userId);
		type(By.name("password"), password);
		clickElements(By.name("btnLogin"));
		

//		System.setProperty("webdriver.chrome.driver", "./binary/chromedriver.exe");//./ are the root node path present the file
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/v4/index.php");
//		driver.findElement(By.name("uid")).sendKeys(userId);
//		driver.findElement(By.xpath("password")).sendKeys(password);
//		driver.findElement(By.xpath("btnLogin")).click();
		
		//this is comment are not used because code reuse
		
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle()," Guru99 Bank Manager HomePage ");
		
		driver.quit();
		
	}
//dependency injection means=which declare the data is dependency to test
	//name= is use to map the data to testng name data should be same the @Test
//	Object[][] or Iterator<Object[]>, where each Object[] is assignedto the parameter list of the test method. 
//	•Object[] or Iterator<Object>, where each Object is assigned to thesingle parameter of the test method. 
//
//	The @Test method that wants to receive data from this DataProvider needsto use a Test.dataProvider() name equal to the name of this annotation.
	@DataProvider(name ="loginData")
	public Object[][]  loginDataProvider() throws IOException//all parent class Object return String object
	{

		
			FileInputStream fis =new FileInputStream(new File("./data/Testdata.xlsx"));//file object for filereader
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);//pass the file object in the xssf is class that help to open excel
			
			XSSFSheet sheet=wb.getSheet("LoginData");//initilization the sheet
			int lastrow=sheet.getLastRowNum();//This return as the last data present row number
			int lastcell=sheet.getRow(0).getLastCellNum();
			String[][] loginData=new String[lastrow][lastcell];
			for(int i=1;i<=lastrow;i++)
			{
				XSSFRow row=sheet.getRow(i);
											//This is return as the last data present 
 				for(int j=0;j<lastcell;j++)
				{
					XSSFCell cell=row.getCell(j);
					loginData[i-1][j]=cell.getStringCellValue();
					
				}
			}
			
			
		return loginData;
					 
			
	}
	
	
}
