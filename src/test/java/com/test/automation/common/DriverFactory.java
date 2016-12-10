package com.test.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	static String driverPath = "\\HC-Automation\\Automation\\";

	public static WebDriver getDriver() {
		String browser = System.getProperty("browser");
		WebDriver driver;
		if (browser != null) {
			if (browser.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			} else {
				driver = new FirefoxDriver();
			}
		}

		else {
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
