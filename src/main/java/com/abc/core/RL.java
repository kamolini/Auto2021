package com.abc.core;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RL implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {

	  }

	@Override
	public void onTestSuccess(ITestResult result) {
			System.out.println("Pass in ---------->ITestListener");
	  }

	@Override
	public void onTestFailure(ITestResult result) {
		PDriver.takesScreenshot();
		System.out.println("Fail in ---------->ITestListener");

	  }
	@Override
	public void onTestSkipped(ITestResult result) {

	  }
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	  }

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	 public void onFinish(ITestContext context) {

	  }

}
