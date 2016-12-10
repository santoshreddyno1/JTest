package com.test.automation.wms.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.test.automation.common.BasePage;

public class WmsItemsWindow extends BasePage{

	private static final By MENU = By.xpath("//div[@id='topbar-1012-targetEl']//a[@id='button-1013']");
	private static final By SEARCH_TXT_FIELD =By.xpath(".//*[@id='mps_menusearch-1125-inputEl']");
	private static final By ITEM_FRAME = By.id("uxiframe-1132-iframeEl");
	private static final By ITEM_TXT_FILED =By.xpath(".//*[@id='dataForm:ItemList_lv:ItemList_filterId:itemLookUpId']");
	private static final By APPLY_BUTTON = By.xpath(".//*[@id='dataForm:ItemList_lv:ItemList_filterId:ItemList_filterIdapply']");
	private static final By ITEM_NAME = By.xpath(".//*[@id='dataForm:ItemList_lv:dataTable:0:itemList_Link_NameText']");

	


	public String ItemInfo(String sku)
	{
		clickOnElement(MENU);
		driver.findElement((SEARCH_TXT_FIELD)).sendKeys("items");
		waitForFiveSeconds();
		((JavascriptExecutor) driver).executeScript("document.querySelector('#boundlist-1126-listEl li:nth-child(1)').click();");
		driver.switchTo().frame(driver.findElement(ITEM_FRAME));
		driver.findElement(ITEM_TXT_FILED).sendKeys(sku);
		clickOnElement(APPLY_BUTTON);
		waitForFiveSeconds();
		String wsku = driver.findElement(ITEM_NAME).getText();
		System.out.println(wsku);
		waitForFiveSeconds();
		return wsku;

	}



	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public By getPageCheckLocator() {
		// TODO Auto-generated method stub
		return null;
	}

}
