package com.test.automation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.common.BasePage;

public class InboundShipments extends BasePage{
	public static final By NEW_SHIPMENT_BUTTON =By.linkText("New Shipment");
	public static final By SAVED_LOCATION_DROPDOWN =By.xpath("//span[@title='Select from your saved locations']");
	public static final By LOCATION_NAME_TXT_FIElD = By.id("_asn_WAR_hcportlet_cadLocationName");
	public static final By CONTACT_NAME_TXT_FIElD = By.id("_asn_WAR_hcportlet_cadContactName");
	public static final By CONTACT_PHONE_TXT_FIElD= By.id("_asn_WAR_hcportlet_cadContactPhone");
	public static final By COUNTRY_DROPDOWN = By.id("select2-_asn_WAR_hcportlet_cadCountry-container");
	public static final By ADDRESS1_TXT_FIElD=By.id("_asn_WAR_hcportlet_cadAddress1");
	public static final By ADDRESS2_TXT_FIElD= By.id("_asn_WAR_hcportlet_cadAddress2");
	public static final By CITY_TXT_FIElD=By.id("_asn_WAR_hcportlet_cadCity");
	public static final By STATE_DROPDOWN=By.id("select2-_asn_WAR_hcportlet_states-container");
	public static final By ZIPCODE_TXT_FIElD=By.id("_asn_WAR_hcportlet_cadZipcode");
	public static final By FULFILLMENT_CENTER_DROPDOWN=By.id("select2-_asn_WAR_hcportlet_facilities-container");
	public static final By SUBMIT_BUTTON=By.id("submit-asn");
	public static final By NEXT_BUTTON = By.linkText("Next");
	public static final By SAVE_LOCATION =By.id("asn-save-location");
	public static final By CANCEL_BUTTON = By.cssSelector(".qw-cancel.base-btn.purple-btn.stretch-mobile");
	public static final By USE_THIS_ADDRESS_BUTTON = By.linkText("Use This Address");
	public static final By PARCEL_BUTTON = By.cssSelector(".q-btn.parcel-btn");
	public static final By PALLET_BUTTON = By.cssSelector(".contents-tab-inner .quick-btn-group a:nth-of-type(2)");
	public static final By ADD_CASE_BUTTON = By.cssSelector(".parcel-prompt-add-a-case.base-btn.purple-btn.block-btn.large-btn.prompt-btn");
	public static final By ADD_PALLET_BUTTON = By.cssSelector(".pallet-prompt-add-single-sku.base-btn.purple-btn.block-btn.large-btn.prompt-btn");
	
	
	//contents
	
	public static final By SKU=By.xpath("");
	public static final By NUMBER_OF_LIKE_CASES = By.xpath("");
	public static final By UNITS_PER_CASE=By.xpath("");
	

//Services
	
	public static final By SHIPMENT_LEVEL_SERVICES_DROPDOWN = By.xpath("//span[@title='Add a Service']");//By.id("select2--n0-container");
	public static final By PRODUCT_LEVEL_SERVICES_DROPDOWN = By.id("select2--r6-container");
	
//Shipping
	
	
	public static final By SHIPPING_VIA_FEDX_GROUND_RADIO = By.id("shippingPartner1");
	public static final By HANDLE_INBOUND_SHIPMENT_RADIO =By.id("shippingPartner2");

	
	public static final By CASE_INFO_LENGTH_TXT_FIElD =By.xpath("//input[@placeholder='Length']");
	public static final By CASE_INFO_WIDTH_TXT_FIElD =By.xpath("//input[@placeholder='Width']");
	public static final By CASE_INFO_HEIGHT_TXT_FIElD =By.xpath("//input[@placeholder='Height']");
	public static final By CASE_INFO_WEIGHT_TXT_FIElD =By.xpath("//input[@placeholder='Weight']");
	
	//for pallet
	
	public static final By PICKUP_DATE1=By.id("pickup-date-input");
	public static final By PICKUP_TIME1_HR=By.id("select2-miwz-container");
	public static final By PICKUP_TIME1_MIN=By.id("select2-j6g7-container");
	public static final By PICKUP_TIME1_PERIOD=By.id("select2-ljgj-container");
	
	
	public static final By PICKUP_TIME2_HR=By.id("select2-p2in-container");
	public static final By PICKUP_TIME2_MIN=By.id("select2-upvw-container");
	public static final By PICKUP_TIME2_PERIOD=By.id("select2-i478-container");
	
	public static final By INSIDE_PICKUP_CHECK_BOX=By.id("");
	public static final By LIFT_GATE_PICKUP_CHECK_BOX=By.id("");
	public static final By LIMITED_CHECK_BOX=By.id("");
	//common
	public static final By INBOUND_CARRIER_DROPDOWN=By.xpath("");
	
	public static final By EXPECTED_ARRRIVAL_TXT_FIElD= By.xpath("");
	public static final By TRACKING_NUMBER_TXT_FIElD= By.xpath("");
	
	////inbound carrier = other
	
	public static final By OTHER_CARRIER_TXT_FIElD =By.id("other-carrier-input");
	public static final By CARRIER_CONTACT_NAME_TXT_FIElD = By.id("carrier-contact-name-input");
	public static final By CARRIER_CONTACT_PHONE_TXT_FIElD =By.id("carrier-contact-phone-input");
	
	
	public InboundShipments(WebDriver webdriver) {
		super(webdriver);
	}

	public void clickOnNewShipment()
	{
		clickOnElement(NEW_SHIPMENT_BUTTON);
	}
	
	
	public void locations()
	{
		
		//driver.findElement(SAVED_LOCATION_DROPDOWN).click();
	//	driver.findElement(By.xpath("//li[text()='enter the saved location']")).click();
		driver.findElement(LOCATION_NAME_TXT_FIElD).sendKeys("Location Name");
		driver.findElement(CONTACT_NAME_TXT_FIElD).sendKeys("contactName");
		driver.findElement(CONTACT_PHONE_TXT_FIElD).click();
		driver.findElement(CONTACT_PHONE_TXT_FIElD).sendKeys("9493446765");
		driver.findElement(COUNTRY_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='United States']")).click();
		driver.findElement(ADDRESS1_TXT_FIElD).sendKeys("16 Dayton Dr Apt 94B");
		driver.findElement(ADDRESS2_TXT_FIElD).sendKeys("");
		driver.findElement(CITY_TXT_FIElD).sendKeys("Edison");
		driver.findElement(STATE_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='New Jersey']")).click();
		driver.findElement(ZIPCODE_TXT_FIElD).sendKeys("08820");
		driver.findElement(FULFILLMENT_CENTER_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='Indianapolis Fulfillment Center']")).click();
		clickOnElement(NEXT_BUTTON);
		clickOnElement(USE_THIS_ADDRESS_BUTTON);
		waitFor(2000);
	//	driver.findElement(By.cssSelector(".contents-tab-inner .quick-btn-group a:nth-of-type(2)")).click();
		waitFor(2000);
	}

	public void selectParcel()
	{
		clickOnElement(PARCEL_BUTTON);
		clickOnElement(ADD_CASE_BUTTON);
	}
	public void selectPallet()
	{
		clickOnElement(PALLET_BUTTON);
		clickOnElement(ADD_PALLET_BUTTON);
		
		//add case logic not working for pallet
	}

	public void contents()
	{	
		//addNewCase("T3100");
		addNewPallet("T3100");
		clickOnElement(NEXT_BUTTON);
		
		waitFor(3000);
	}	
	
	private void addNewCase(String SKUInput) {
		List<WebElement> likeCases = findActiveElements(By.xpath("//input[contains(@class,'number-of-cases')]"));
		if(likeCases.size()>0){
			likeCases.get(0).clear();
			likeCases.get(0).sendKeys("2");
		}
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'case-product case-row')]/div/div/div"));
		WebElement we = elements.get(0);
		WebElement skuInput = we.findElement(By.xpath("//input[contains(@class,'sku-typeahead') and contains(@class,'tt-input')]"));
		skuInput.clear();
		skuInput.sendKeys(SKUInput);
		waitFor(2000);
		skuInput.sendKeys(Keys.ARROW_DOWN);
		skuInput.sendKeys(Keys.ENTER);
		waitFor(2000);
		
		List<WebElement> unitsPerCaseList = we.findElements(By.xpath("//input[contains(@class,'units-per-case')]"));
		
		for(WebElement untisPerCase : unitsPerCaseList){
			if(untisPerCase.isEnabled()){
				untisPerCase.clear();
				untisPerCase.sendKeys("4");
				break;
			}
		}
		waitFor(2000);
		List<WebElement> expDateLocators = we.findElements(By.xpath("//input[contains(@class,'exp-date-input')]"));
		
		for(WebElement expDate : expDateLocators){
			if(expDate.isEnabled()){
				expDate.clear();
				expDate.sendKeys("12/31/2016");
				expDate.sendKeys(Keys.ESCAPE);
				break;
			}
		}
		
		waitForFiveSeconds();
		/*List<WebElement> inputs = we.findElements(By.xpath(".//input"));
		//SKU
		waitFor(2000);
		WebElement skuElement = inputs.get(1);
		skuElement.clear();
		skuElement.sendKeys(SKUInput);
		waitFor(2000);
		skuElement.sendKeys(Keys.ARROW_DOWN);
		skuElement.sendKeys(Keys.ENTER);
		waitFor(4000);
		
		//units per case
		fillText(inputs.get(4),"4");
		waitFor(2000);
		//Expiration date
		fillText(inputs.get(2),"12/31/2016");
		inputs.get(2).sendKeys(Keys.ESCAPE);	*/
		
	}
	
	//New Pallet
	
	private void addNewPallet(String SKUInput) {
		List<WebElement> likePallet = findActiveElements(By.xpath("//input[contains(@class,'number-of-pallets')]"));
		if(likePallet.size()>0){
			likePallet.get(0).clear();
			likePallet.get(0).sendKeys("3");
		}
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'case-product case-row')]/div/div/div"));
		WebElement we = elements.get(0);
		WebElement skuInput = we.findElement(By.xpath("//input[contains(@class,'sku-typeahead') and contains(@class,'tt-input')]"));
		skuInput.clear();
		skuInput.sendKeys(SKUInput);
		waitFor(2000);
		skuInput.sendKeys(Keys.ARROW_DOWN);
		skuInput.sendKeys(Keys.ENTER);
		waitFor(2000);
		
		List<WebElement> unitsPerPalletList = we.findElements(By.xpath("//input[contains(@class,'case-product-unit-input-2')]"));
		
		for(WebElement untisPerPallet : unitsPerPalletList){
			if(untisPerPallet.isEnabled()){
				untisPerPallet.clear();
				untisPerPallet.sendKeys("4");
				break;
			}
		}
		waitFor(2000);
		List<WebElement> expDateLocators = we.findElements(By.xpath("//input[contains(@class,'exp-date-input')]"));
		
		for(WebElement expDate : expDateLocators){
			if(expDate.isEnabled()){
				expDate.clear();
				expDate.sendKeys("12/31/2016");
				expDate.sendKeys(Keys.ESCAPE);
				break;
			}
		}
		
		waitForFiveSeconds();
		/*List<WebElement> inputs = we.findElements(By.xpath(".//input"));
		//SKU
		waitFor(2000);
		WebElement skuElement = inputs.get(1);
		skuElement.clear();
		skuElement.sendKeys(SKUInput);
		waitFor(2000);
		skuElement.sendKeys(Keys.ARROW_DOWN);
		skuElement.sendKeys(Keys.ENTER);
		waitFor(4000);
		
		//units per case
		fillText(inputs.get(4),"4");
		waitFor(2000);
		//Expiration date
		fillText(inputs.get(2),"12/31/2016");
		inputs.get(2).sendKeys(Keys.ESCAPE);	*/
		
	}
	
	
	
	private void addCase(String SKUInput) {
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'case-product case-row')]/div/div/div"));
		WebElement we = elements.get(0);
		List<WebElement> inputs = we.findElements(By.xpath(".//input"));
		//SKU
		waitFor(2000);
		WebElement skuElement = inputs.get(1);
		skuElement.clear();
		skuElement.sendKeys(SKUInput);
		waitFor(2000);
		skuElement.sendKeys(Keys.ARROW_DOWN);
		skuElement.sendKeys(Keys.ENTER);
		waitFor(4000);
		
		//units per case
		fillText(inputs.get(4),"4");
		waitFor(2000);
		//Expiration date
		fillText(inputs.get(2),"12/31/2016");
		inputs.get(2).sendKeys(Keys.ESCAPE);	
		
	}
	
	private void fillText(WebElement element, String value){
		try{
			element.clear();
			element.sendKeys(value);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void services()
	{
		
		driver.findElements(SHIPMENT_LEVEL_SERVICES_DROPDOWN).get(0).click(); //shipment level services
		driver.findElement(By.xpath("//li[text()='25 % Quality Audit (FREE)']")).click();
		
		//Product Level Services 
		
	//	driver.findElement(PRODUCT_LEVEL_SERVICES_DROPDOWN).click();
	//	driver.findElement(By.xpath("//li[text()='Polybag - Medium ($0.10)']"));
		
		waitFor(2000);
		
		driver.findElement(NEXT_BUTTON).click();
		
	}

	public void shipping()
	{
		
		//if this is yes  
		//{
		driver.findElement(SHIPPING_VIA_FEDX_GROUND_RADIO).click(); //- radio button_ yes
		
		driver.findElement(CASE_INFO_LENGTH_TXT_FIElD).sendKeys("1");
		driver.findElement(CASE_INFO_WIDTH_TXT_FIElD).sendKeys("2");
		driver.findElement(CASE_INFO_HEIGHT_TXT_FIElD).sendKeys("4");
		driver.findElement(CASE_INFO_WEIGHT_TXT_FIElD).sendKeys("4");
		driver.findElement(PICKUP_DATE1).click();
		driver.findElement(PICKUP_DATE1).sendKeys("11/29/2016");
		driver.findElement(By.xpath("//label[@for='inside-pickup-checkbox' and not(@class='qw-label')]")).click();
		driver.findElement(By.xpath("//label[@for='lift-gate-pickup-checkbox' and not(@class='qw-label')]")).click();
		driver.findElement(By.xpath("//label[@for='limited-access-checkbox' and not(@class='qw-label')]")).click();
		
		
		
		//}
		
	/*	
		// if No  
		//{	
		driver.findElement(HANDLE_INBOUND_SHIPMENT_RADIO).click(); //- radio button_NO
		
		driver.findElement(INBOUND_CARRIER_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='']"));
		
	//	 if(1==1) //inbound carrier = other	
	//	 {
		driver.findElement(OTHER_CARRIER_TXT_FIElD).sendKeys("");
		driver.findElement(CARRIER_CONTACT_NAME_TXT_FIElD).sendKeys("");
		driver.findElement(CARRIER_CONTACT_PHONE_TXT_FIElD).sendKeys("");
		// }
		 
		 driver.findElement(EXPECTED_ARRRIVAL_TXT_FIElD);
		 driver.findElement(TRACKING_NUMBER_TXT_FIElD);
	*/	
		 driver.findElement(NEXT_BUTTON).click();
		
	}

	public void review()
	{
		
		driver.findElement(SUBMIT_BUTTON).click();
		waitForFiveSeconds();
		driver.findElement(By.id("createASNConfirmButton")).click();
		
		waitForFiveSeconds();
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
