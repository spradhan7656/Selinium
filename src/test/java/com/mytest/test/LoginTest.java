package com.mytest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest 
{	
	//this next line for the Test NG insert
	@Test
	public void comapare()
	{
		String name="Santosh";
		Assert.assertEquals("Santosh",name);// This method is insert is check actual and expected check
	}
	
}
