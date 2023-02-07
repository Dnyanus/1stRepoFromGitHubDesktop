package com.dalalStreet.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.dalalStreet.testBase.TestBase;

public class ListernerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test case execution started - "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case execution completed - "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case execution failed - "+result.getName());
		UtilClass.takeSS(result.getName());
		System.out.println("Screenshot is taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case skipped - "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{		
		
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Test suite execution started - "+context.getAllTestMethods());	
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("\nTotal test cases Result :\n");
		System.out.println("Test suite execution completed - "+context.getPassedTests());
	}
}
