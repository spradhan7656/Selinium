package com.mytest.executionflow;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener
{
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("On  start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On finish");
	}
	
}
