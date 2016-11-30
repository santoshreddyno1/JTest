package com.test.automation.common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DriverService {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		if(driver == null){
			driver = DriverFactory.getDriver();
			//System.out.println("Got driver");
		}
		System.out.println(" driver>>");
		return driver;
	}
	
	public static void setDriver(){
		driver = DriverFactory.getDriver();
	}
	
	public static void cleanUpDriver(){
		if(driver!=null){
			driver.switchTo().parentFrame();
			driver.quit();
			driver = null;
		}
	}
	
	public static byte[] takescreenShot(){
		final WebDriver driver = DriverService.getDriver();
		byte[] screenshot = new byte[0];
		if(driver!=null){
			screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		}
		
		return screenshot;
	}

}
