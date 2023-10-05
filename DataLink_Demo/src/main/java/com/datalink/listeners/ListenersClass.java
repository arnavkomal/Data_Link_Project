package com.datalink.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.datalink.baseclass.BaseClass;


public class ListenersClass extends BaseClass implements ITestListener 
{
	
public void onTestSuccess(ITestResult result)
{
testcasePass(result.getMethod().getMethodName());
System.out.println("Test Case Pass");
}
		
@Override
public void onTestFailure(ITestResult result)
{
testcaseFail(result.getMethod().getMethodName());
System.out.println("Test Case Fail");
}

@Override
public void onTestSkipped(ITestResult result)
{
testcaseSkip(result.getMethod().getMethodName());
System.out.println("Test Case Skipped");
}


}
