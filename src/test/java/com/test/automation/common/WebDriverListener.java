package com.test.automation.common;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class WebDriverListener implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		DriverService.setDriver();
		//System.out.println("BEFORE TESTNG");
		
	}

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		DriverService.cleanUpDriver();
		//System.out.println("AFTER TESTNG");
		
	}

}


