package com.test.automation.wms.pageobjects;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.automation.common.BasePage;

public class WmsLoginPage extends BasePage{
	private static final By USERNAME_TXT_FIELD = By.id("textfield-1019-inputEl");
	private static final By PASSWORD_TXT_FIELD = By.id("textfield-1020-inputEl");
	private static final By LOGIN_BUTTON = By.xpath("//span[@id='button-1022-btnInnerEl']");
	
	
	
	public WmsLoginPage(WebDriver driver){
		super(driver);
	}

	public WmsHomepage Wlogin() throws InterruptedException
	{
		driver.findElement(USERNAME_TXT_FIELD).sendKeys("icc");
		driver.findElement(PASSWORD_TXT_FIELD).sendKeys("icc");
		clickOnElement(LOGIN_BUTTON);
		Thread.sleep(4000);
		return new WmsHomepage(getDriver());
	}
	public void ItemInfoWms() throws InterruptedException
	{
		
		clickOnElement(By.xpath("//div[@id='topbar-1012-targetEl']//a[@id='button-1013']"));
		driver.findElement(By.xpath(".//*[@id='mps_menusearch-1125-inputEl']")).sendKeys("items");
		waitForFiveSeconds();
		((JavascriptExecutor) driver).executeScript("document.querySelector('#boundlist-1126-listEl li:nth-child(1)').click();");
		driver.switchTo().frame(driver.findElement(By.id("uxiframe-1132-iframeEl")));
		driver.findElement(By.xpath(".//*[@id='dataForm:ItemList_lv:ItemList_filterId:itemLookUpId']")).sendKeys("T3100");
		clickOnElement(By.xpath(".//*[@id='dataForm:ItemList_lv:ItemList_filterId:ItemList_filterIdapply']"));
		waitForFiveSeconds();
		 String Sku = driver.findElement(By.xpath(".//*[@id='dataForm:ItemList_lv:dataTable:0:itemList_Link_NameText']")).getText();
		 System.out.println(Sku);
		 waitForFiveSeconds();
		 
	}
	
	public void Picklocations() {
		
		clickOnElement(By.xpath("//div[@id='topbar-1012-targetEl']//a[@id='button-1013']"));
		driver.findElement(By.xpath(".//*[@id='mps_menusearch-1125-inputEl']")).sendKeys("Pick Locations");
		waitForFiveSeconds();
		((JavascriptExecutor) driver).executeScript("document.querySelector('#boundlist-1126-listEl li:nth-child(1)').click();");
		waitForFiveSeconds();
		driver.switchTo().frame(driver.findElement(By.id("uxiframe-1132-iframeEl")));
		waitForFiveSeconds();
		System.out.println(driver.findElement(By.xpath(".//*[@id='dataForm:listView:dataTable:10:ItemBOMDetailsListEV_item_popup_button']")).getText());
		findEmptySlot(driver);
		 waitForFiveSeconds();
		 clickOnElement(By.id("rmButton_1AssignItemToLocation1_8314"));
		 driver.findElement(By.id("dataForm:skuEditCtrl")).sendKeys("ATA3830532");
		 driver.findElement(By.id("dataForm:c44_1")).sendKeys("5000");
		 driver.findElement(By.id("dataForm:minLPN")).sendKeys("3000");
		 driver.findElement(By.id("dataForm:c43_1")).sendKeys("0");
		 driver.findElement(By.id("dataForm:maxLPN")).sendKeys("0");
		 waitForFiveSeconds();
		 driver.findElement(By.id("rmButton_1Save1_8402")).click();
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
	
	public void asn()
	{
		clickOnElement(By.xpath("//div[@id='topbar-1012-targetEl']//a[@id='button-1013']"));
		driver.findElement(By.xpath(".//*[@id='mps_menusearch-1125-inputEl']")).sendKeys("ASNs");
		waitForFiveSeconds();
		((JavascriptExecutor) driver).executeScript("document.querySelector('#boundlist-1126-listEl li:nth-child(1)').click();");
		waitForFiveSeconds();
		waitForFiveSeconds();
		//i could't find the frame to switch
		driver.findElement(By.xpath(".//*[@id='combobox-1915-inputEl']")).sendKeys("ASN");
		//clickOnElement(By.xpath(".//*[@id='combobox-1506-trigger-picker']")); // Asn drop down click
		//executeJavaScript("document.querySelector('#combobox-1506-trigger-picker').click();");
		//clickOnElement(By.id("boundlist-2735-listEl']/li[1]/div"));
		
		driver.findElement(By.id("mpslookupfield-3182-inputEl")).sendKeys("0001-110816-004");
		driver.findElement(By.id("button-3100-btnInnerEl")).click();
		driver.findElement(By.cssSelector(".x-grid-row-checker")).click();//checkbox
		driver.findElement(By.id("button-2951-btnInnerEl")).click();// more button
		clickOnElement(By.id("menuitem-2959-textEl"));
		driver.switchTo().frame(driver.findElement(By.id("uxiframe-3238-iframeEl")));//not switching to frame
		clickOnElement(By.id("dataForm:nextAsnCmd1"));//next
		clickOnElement(By.id("dataForm:nextCmd"));
		clickOnElement(By.id("dataForm:nextCmd"));
		driver.findElement(By.id("dataForm:manifacturedDateOutputCalendar")).sendKeys("11/13/16 15:05");
		driver.findElement(By.id("dataForm:expirationDateWmDate")).sendKeys("11/13/19 15:05");
		driver.findElement(By.id("dataForm:skuEditCtrl")).sendKeys("SKU");
		driver.findElement(By.id("dataForm:RequiredQuantity")).sendKeys("quantity");
		clickOnElement(By.id("dataForm:receiveLPNCmd"));
		waitForFiveSeconds();
		driver.findElement(By.id("button-2951-btnInnerEl")).click();// more button
		clickOnElement(By.id("menuitem-1307-textEl"));//verify ASN
		clickOnElement(By.id("button-1279-btnIconEl"));//refresh button
		clickOnElement(By.id("tool-1142-toolEl"));//close(x) button
		
		waitForFiveSeconds();
	}
	
	
	@Override
	public String getUrl() {
		return "crppod01wmtestapp1.genco.com:12000/manh/index.html";
	}

	@Override
	public By getPageCheckLocator() {
		return By.id("textfield-1019-inputEl");
	}

}
