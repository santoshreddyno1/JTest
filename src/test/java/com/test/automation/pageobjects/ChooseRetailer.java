package com.test.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.common.BasePage;

public class ChooseRetailer extends BasePage {

	public static final By MANAGE_RETAIL_BUTTON = By.xpath("//button[@id='manageRetailerBtn']");
	public static final By SUBMIT_MANAGE_RETAIL_BUTTON = By.xpath("//button[@id='manage-retailer']");

	public ChooseRetailer(WebDriver driver) {
		super(driver);
	}

	public void selectReatailer(String retailer) {
		clickOnElement(MANAGE_RETAIL_BUTTON);
		List<WebElement> elements = driver.findElements(By.cssSelector(".radio-primary"));
		for (WebElement we : elements) {
			String label = we.findElement(By.xpath("./label")).getText().trim();
			if (label.equalsIgnoreCase(retailer)) {
				we.findElement(By.xpath("./input")).click();
				break;
			}
		}
		clickOnElement(SUBMIT_MANAGE_RETAIL_BUTTON);
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public By getPageCheckLocator() {
		// TODO Auto-generated method stub
		return SUBMIT_MANAGE_RETAIL_BUTTON;
	}

}
