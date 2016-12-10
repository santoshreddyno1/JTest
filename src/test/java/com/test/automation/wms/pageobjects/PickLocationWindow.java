package com.test.automation.wms.pageobjects;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.common.BasePage;

public class PickLocationWindow extends BasePage {
	private static final By MENU = By.xpath("//div[@id='topbar-1012-targetEl']//a[@id='button-1013']");
	private static final By SEARCH_TXT_FIELD =By.xpath(".//*[@id='mps_menusearch-1125-inputEl']");
	private static final By PICK_lOCATIONS_FRAME = By.id("uxiframe-1132-iframeEl");
	private static final By ITEM_TXT_FIELD = By.id("dataForm:skuEditCtrl");
    private static final By MIN_UNITS = By.id("dataForm:c44_1");
    private static final By MAX_UNITS = By.id("dataForm:c43_1");
    private static final By MIN_LPNS = By.id("dataForm:minLPN");
    private static final By MAX_LPNS = By.id("dataForm:maxLPN");
    private static final By SAVE_BUTTON= By.id("rmButton_1Save1_8402");
    
	public void ProductAllocation(String sku)
	{
		clickOnElement(MENU);
		driver.findElement(SEARCH_TXT_FIELD).sendKeys("Pick Locations");
		waitForFiveSeconds();
		((JavascriptExecutor) driver).executeScript("document.querySelector('#boundlist-1126-listEl li:nth-child(1)').click();");
		waitForFiveSeconds();
		driver.switchTo().frame(driver.findElement(PICK_lOCATIONS_FRAME));
		waitForFiveSeconds();
		findEmptySlot(driver);
		waitForFiveSeconds();
		clickOnElement(By.id("rmButton_1AssignItemToLocation1_8314"));
		driver.findElement(ITEM_TXT_FIELD).sendKeys(sku);
		driver.findElement(MIN_UNITS).sendKeys("0");
		driver.findElement(MAX_UNITS).sendKeys("5000");
		driver.findElement(MAX_LPNS).sendKeys("3000");
		driver.findElement(MIN_LPNS).sendKeys("0");
		waitForFiveSeconds();
		driver.findElement(SAVE_BUTTON).click();

	}


	public void findEmptySlot(WebDriver driver){
		boolean stayinLoop = true;
		while(stayinLoop){
			List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='dataForm:listView:dataTable_body']/tbody/tr"));
			System.out.println(elements.size());
			for(int index=0; index < 15; index++){
				WebElement we = elements.get(index);
				//new Actions(driver).moveToElement(we);
				String item = we.findElement(By.xpath("./td[5]")).getText();
				System.out.println(item);
				if(StringUtils.isBlank(item)){

					we.findElement(By.xpath("./td[1]/input[1]")).click();
					stayinLoop = false;
					break;
				}
			}
			if(stayinLoop){
				System.out.println("trying to click next...");
				driver.findElement(By.xpath(".//*[@id='dataForm:listView:dataTable:pager:next']")).click();
				waitForFiveSeconds();
			}
		}

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
