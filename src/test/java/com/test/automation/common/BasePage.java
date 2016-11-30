package com.test.automation.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public abstract class BasePage {

	public WebDriver driver;
	private int timeout = 10;

	public BasePage() {

	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public abstract String getUrl();

	public void open() {
		open(getUrl());
	}

	public void open(String url) {
		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			driver.get(url);
			verifyPageLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForPageLoad() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
	}

	public void waitForElement(ExpectedCondition<?> expectedCondition) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			wait.until(expectedCondition);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void verifyPage(By locator) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected Object executeJavaScript(String script) {
		return ((JavascriptExecutor) getDriver()).executeScript(script);
	}

	public abstract By getPageCheckLocator();

	public void verifyPageLoad() {
		verifyPage(getPageCheckLocator());
	}

	public void waitForFiveSeconds() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}
	
	public void waitFor(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {

		}
	}

	public WebElement findElement(By locator) {
		WebElement element = null;
		try {
			element = getDriver().findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return element;
	}
	
	public List<WebElement> findActiveElements(By locator){
		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> temp = driver.findElements(locator);
		for(WebElement we: temp){
			if(we.isEnabled() && we.isDisplayed()){
				elements.add(we);
			}
		}
		
		return elements;
		
	}
	
	protected void selectDropDownItemByText(String text){
		String dropdownLocator = "//li[text()='" + text + "']";
		findElement(By.xpath(dropdownLocator)).click();
	}

	protected void fillValue(By locator, String value) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement element = findElement(locator);
		element.sendKeys(value);
	}

	protected void clickOnElement(By locator) {
		waitForElement(ExpectedConditions.elementToBeClickable(locator));
		new Actions(getDriver()).moveToElement(findElement(locator)).click().perform();
	}

}
