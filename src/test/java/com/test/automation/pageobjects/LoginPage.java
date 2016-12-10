package com.test.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.common.BasePage;
import com.test.automation.common.EnvironmentProperties;

public class LoginPage extends BasePage {

	private static final By USERNAME_TXT_FIELD = By.id("_58_login");
	private static final By PASSWORD_TXT_FIELD = By.id("_58_password");
	private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

	private By pageLocator = By.xpath("//button[@class='btn btn-primary']");

	public By getPageLocator() {
		return pageLocator;
	}

	public void setPageLocator(By pageLocator) {
		this.pageLocator = pageLocator;
	}

	public LoginPage(WebDriver webdriver) {
		super(webdriver);
	}

	public HomePage login(String username, String password) {
		fillValue(USERNAME_TXT_FIELD, username);
		fillValue(PASSWORD_TXT_FIELD, password);
		
		findElement(LOGIN_BUTTON).click();
		return new HomePage(driver);
	}

	@Override
	public String getUrl() {
		return EnvironmentProperties.getProperty("application.base.url");
	}

	@Override
	public By getPageCheckLocator() {
		return LOGIN_BUTTON;
	}

}
