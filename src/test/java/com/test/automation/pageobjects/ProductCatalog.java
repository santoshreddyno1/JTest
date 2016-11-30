package com.test.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.common.BasePage;

public class ProductCatalog extends BasePage {
	private static final By NEW_PRODUCT_BUTTON = By.cssSelector(".new-product-btn.base-btn.purple-btn");
	private static final By ADD_PRODUCT_BUTTON = By.linkText("Add Product");
	private static final By ADD_COLLATERAL_BUTTON = By.linkText("Add Collateral");
	
	  

	public ProductCatalog(WebDriver webdriver) {
		super(webdriver);
	}

	public NewProductPage clickOnNewProductButton() {
        driver.findElement(NEW_PRODUCT_BUTTON).click();
		driver.findElement(ADD_PRODUCT_BUTTON).click();
		return new NewProductPage(driver);
	}
	
	public CollateralCreationPage clickOnNewCollateralButton() {
        driver.findElement(NEW_PRODUCT_BUTTON).click();
		driver.findElement(ADD_COLLATERAL_BUTTON).click();
		return new CollateralCreationPage(driver);
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public By getPageCheckLocator() {
		// TODO Auto-generated method stub
		return NEW_PRODUCT_BUTTON;
	}

}
