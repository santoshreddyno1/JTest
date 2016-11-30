package com.test.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.test.automation.common.BasePage;

public class HomePage extends BasePage {

	private static final By PRODUCT_CATALOG_ICON = By.xpath("//span[text()='Product Catalog']");
	private static final By ORDERS_ICON = By.xpath("//span[contains(.,'Orders')]");
	private static final By INBOUND_SHIPMENT_ICON = By.xpath("//span[contains(.,'Inbound Shipments')]");
	private static final By INVENTORY_ICON = By.xpath("//span[contains(.,'Inventory')]");
	private static final By RETURN_MANAGEMENT_ICON = By.xpath("//span[contains(.,'Returns Management')]");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ProductCatalog clickOnProductCatalog() {
		driver.findElement(PRODUCT_CATALOG_ICON).click();
		return new ProductCatalog(driver);

	}
	
	
	public InboundShipments selectInboundShipments()
	{
		clickOnElement(INBOUND_SHIPMENT_ICON);
		return new InboundShipments(driver);
			
	}
	

	@Override
	public By getPageCheckLocator() {
		return PRODUCT_CATALOG_ICON;
	}

	@Override
	public String getUrl() {
		return null;
		
			//	"http://www.google.com";
		
		
	}

}
