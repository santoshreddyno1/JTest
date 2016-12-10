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
	public static final By CONFIRM_SUBMIT_BUTTON=By.id("createASNConfirmButton");
	public static final By NEXT_BUTTON = By.linkText("Next");
	public static final By SAVE_LOCATION =By.id("asn-save-location");
	public static final By CANCEL_BUTTON = By.cssSelector(".qw-cancel.base-btn.purple-btn.stretch-mobile");
	public static final By USE_THIS_ADDRESS_BUTTON = By.linkText("Use This Address");
	public static final By PARCEL_BUTTON = By.cssSelector(".q-btn.parcel-btn");
	public static final By PALLET_BUTTON = By.cssSelector(".contents-tab-inner .quick-btn-group a:nth-of-type(2)");
	public static final By ADD_CASE_BUTTON = By.cssSelector(".parcel-prompt-add-a-case.base-btn.purple-btn.block-btn.large-btn.prompt-btn");
	public static final By ADD_PALLET_BUTTON = By.cssSelector(".pallet-prompt-add-single-sku.base-btn.purple-btn.block-btn.large-btn.prompt-btn");

	//Services
	public static final By SHIPMENT_LEVEL_SERVICES_DROPDOWN = By.cssSelector(".shipment-services-entry-point span[title='Add a Service']");
	public static final By PRODUCT_LEVEL_SERVICES_DROPDOWN = By.cssSelector(".product-services-entry-point span[title='Add a Service']");

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

	//No, I will handle inbound shipping
	public static final By EXPECTED_ARRRIVAL_DATE_FIElD= By.id("carrier-expected-arrival-date-input");
	public static final By BOL_PRO_TXT_FIELD=By.id("carrier-bol-pro-number-input");
	public static final By TRACKING_NUMBER_TXT_FIElD= By.xpath("");

	//inbound carrier = other
	public static final By OTHER_CARRIER_TXT_FIElD =By.id("other-carrier-input");
	public static final By CARRIER_CONTACT_NAME_TXT_FIElD = By.id("carrier-contact-name-input");
	public static final By CARRIER_CONTACT_PHONE_TXT_FIElD =By.id("carrier-contact-phone-input");

	public static final By INSIDE_PICKUP_CHECKBOX=By.xpath("//label[@for='inside-pickup-checkbox' and not(@class='qw-label')]");
	public static final By LAST_GATE_AT_PICKUP=By.xpath("//label[@for='lift-gate-pickup-checkbox' and not(@class='qw-label')]");
	public static final By LIMITED_ACCESS =By.xpath("//label[@for='limited-access-checkbox' and not(@class='qw-label')]");
	
	public static final By CLOSE_BUTTON =By.cssSelector(".create-asn-success-anchor.btn.btn-primary");

	public InboundShipments(WebDriver webdriver) {
		super(webdriver);
	}

	public void clickOnNewShipment()
	{
		clickOnElement(NEW_SHIPMENT_BUTTON);
	}


	public void locations()
	{

		/*	Chooseing Saved Location
       clickOnElement(SAVED_LOCATION_DROPDOWN);
       selectDropDownItemByText("Genco-Warehouse1"); */

		fillValue(LOCATION_NAME_TXT_FIElD, "Pittsburgh");
		fillValue(CONTACT_NAME_TXT_FIElD, "Santosh");
		clickOnElement(CONTACT_PHONE_TXT_FIElD);
		fillValue(CONTACT_PHONE_TXT_FIElD, "9493446765");
		clickOnElement(COUNTRY_DROPDOWN);
		selectDropDownItemByText("United States");
		fillValue(ADDRESS1_TXT_FIElD, "5700 bunker Hill St");
		fillValue(ADDRESS2_TXT_FIElD, "");
		fillValue(CITY_TXT_FIElD, "Pittsburgh");
		clickOnElement(STATE_DROPDOWN);
		selectDropDownItemByText("Pennsylvania");
		fillValue(ZIPCODE_TXT_FIElD, "15206");
		clickOnElement(FULFILLMENT_CENTER_DROPDOWN);
		selectDropDownItemByText("Indianapolis Fulfillment Center");
		clickOnElement(NEXT_BUTTON);
		clickOnElement(USE_THIS_ADDRESS_BUTTON);
		waitForFiveSeconds();
		
		
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
	}

	public void contents(String Ship)
	{	
		
		if(Ship=="parcel")
		{
		addNewCase("T3200");
		}
		
		if(Ship=="pallet")
		{
			addNewPallet("T3200");
		}
		
		clickOnElement(NEXT_BUTTON);
	}	

	private void addNewCase(String SKUInput) {
		List<WebElement> likeCases = findActiveElements(By.xpath("//input[contains(@class,'number-of-cases')]"));
		if(likeCases.size()>0){
			likeCases.get(0).clear();
			likeCases.get(0).sendKeys("1");
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
				untisPerCase.sendKeys("1");
				break;
			}
		}
		waitFor(2000);
		List<WebElement> expDateLocators = we.findElements(By.xpath("//input[contains(@class,'exp-date-input')]"));

		for(WebElement expDate : expDateLocators){
			if(expDate.isEnabled()){
				expDate.clear();
				waitFor(3000);
				expDate.sendKeys("12/30/2017");
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
			likePallet.get(0).sendKeys("1");
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
				untisPerPallet.sendKeys("1");
				break;
			}
		}
		waitFor(2000);
		List<WebElement> expDateLocators = we.findElements(By.xpath("//input[contains(@class,'exp-date-input')]"));

		for(WebElement expDate : expDateLocators){
			if(expDate.isEnabled()){
				expDate.clear();
				waitFor(3000);
				expDate.sendKeys("12/30/2017");
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
		
		clickOnElement(SHIPMENT_LEVEL_SERVICES_DROPDOWN);
		selectDropDownItemByText("25 % Quality Audit (FREE)");
		clickOnElement(PRODUCT_LEVEL_SERVICES_DROPDOWN);
		selectDropDownItemByText("Polybag - Medium ($0.10)"); 
		clickOnElement(NEXT_BUTTON);
	}

	public void shipping(boolean handleInboundShipping, String shippingMethod, String inboundCarrier)
	{
		
		if(shippingMethod.equalsIgnoreCase("parcel") && handleInboundShipping){
			findElement(SHIPPING_VIA_FEDX_GROUND_RADIO).click();
			fillValue(CASE_INFO_LENGTH_TXT_FIElD, "1");
			fillValue(CASE_INFO_WIDTH_TXT_FIElD, "2");
			fillValue(CASE_INFO_HEIGHT_TXT_FIElD, "3");
			fillValue(CASE_INFO_WEIGHT_TXT_FIElD, "4");
		}else if(shippingMethod.equalsIgnoreCase("parcel") && (!handleInboundShipping)){
			findElement(HANDLE_INBOUND_SHIPMENT_RADIO).click();
			
			findElement(By.xpath("//div[@class='shipping-select-outer']//span[@class='select2-selection select2-selection--single']")).click();
			findElement(By.xpath("//li[contains(text(),'"+inboundCarrier+"')]")).click();
			if(inboundCarrier!=null && inboundCarrier.equalsIgnoreCase("other")){
				fillValue(OTHER_CARRIER_TXT_FIElD, "XYZ");
				fillValue(CARRIER_CONTACT_NAME_TXT_FIElD, "santosh");
				findElement(CARRIER_CONTACT_NAME_TXT_FIElD).sendKeys(Keys.TAB);
				fillValue(CARRIER_CONTACT_PHONE_TXT_FIElD, "9493446765");
			}
			
			fillValue(By.xpath("//input[contains(@class,'case-expected-arrival-date-input') and @aria-required='true']"), "12/25/2016");
			findElement(By.xpath("//input[contains(@class,'case-expected-arrival-date-input') and @aria-required='true']")).sendKeys(Keys.ESCAPE);
			fillValue(By.xpath("//input[@placeholder='Tracking Number' and not(@disabled='')]"),"34567");
		}else if(shippingMethod.equalsIgnoreCase("pallet") && handleInboundShipping){
			findElement(SHIPPING_VIA_FEDX_GROUND_RADIO).click();
			fillValue(CASE_INFO_LENGTH_TXT_FIElD, "1");
			fillValue(CASE_INFO_WIDTH_TXT_FIElD, "2");
			fillValue(CASE_INFO_HEIGHT_TXT_FIElD, "3");
			fillValue(CASE_INFO_WEIGHT_TXT_FIElD, "4");
			
			//To DO pickupdate
			clickOnElement(PICKUP_DATE1);
			fillValue(PICKUP_DATE1, "11/29/2016");
			clickOnElement(INSIDE_PICKUP_CHECKBOX);
			clickOnElement(LAST_GATE_AT_PICKUP);
			clickOnElement(LIMITED_ACCESS);	
		
		}else{
			findElement(HANDLE_INBOUND_SHIPMENT_RADIO).click();
			waitFor(2000);
			findElement(By.xpath("//div[@class='shipping-select-outer']//span[@class='select2-selection select2-selection--single']")).click();
			System.out.println(">>>"+inboundCarrier);
			findElement(By.xpath("//li[contains(text(),'"+inboundCarrier+"')]")).click();
			if(inboundCarrier!=null  && inboundCarrier.equalsIgnoreCase("other")){
				fillValue(OTHER_CARRIER_TXT_FIElD, "XYZ");
				fillValue(CARRIER_CONTACT_NAME_TXT_FIElD, "santosh");
				findElement(CARRIER_CONTACT_NAME_TXT_FIElD).sendKeys(Keys.TAB);
				fillValue(CARRIER_CONTACT_PHONE_TXT_FIElD, "9493446765");
			}
			
			fillValue(BOL_PRO_TXT_FIELD, "45");
			fillValue(EXPECTED_ARRRIVAL_DATE_FIElD, "12/25/2016");
			findElement(EXPECTED_ARRRIVAL_DATE_FIElD).sendKeys(Keys.ESCAPE);
			//TO DO
		}
		
		
		
		
/*
		if(handleInboundShipping)
		{
		clickOnElement(SHIPPING_VIA_FEDX_GROUND_RADIO);
		fillValue(CASE_INFO_LENGTH_TXT_FIElD, "1");
		fillValue(CASE_INFO_WIDTH_TXT_FIElD, "2");
		fillValue(CASE_INFO_HEIGHT_TXT_FIElD, "3");
		fillValue(CASE_INFO_WEIGHT_TXT_FIElD, "4");
		
		
		}
		else {
			
		findElement(HANDLE_INBOUND_SHIPMENT_RADIO).click();
		
		clickOnElement(By.xpath("//div[@class='shipping-select-outer']//span[@class='select2-selection select2-selection--single']"));
		findElement(By.xpath("//li[contains(text(),'Other')]")).click();
		
		fillValue(OTHER_CARRIER_TXT_FIElD, "XYZ");
		fillValue(CARRIER_CONTACT_NAME_TXT_FIElD, "santosh");
		waitFor(2000);
		//clickOnElement(CARRIER_CONTACT_PHONE_TXT_FIElD);
		waitFor(2000);
		findElement(CARRIER_CONTACT_NAME_TXT_FIElD).sendKeys(Keys.TAB);
		
		fillValue(CARRIER_CONTACT_PHONE_TXT_FIElD, "9493446765");
		
		waitForFiveSeconds();
		//clickOnElement(EXPECTED_ARRRIVAL_DATE_FIElD);
		fillValue(By.xpath("//input[contains(@class,'case-expected-arrival-date-input') and @aria-required='true']"), "12/25/2016");
		findElement(By.xpath("//input[contains(@class,'case-expected-arrival-date-input') and @aria-required='true']")).sendKeys(Keys.ESCAPE);
		//fillValue(EXPECTED_ARRRIVAL_DATE_FIElD,"12/25/2016");
		//fillValue(TRACKING_NUMBER_TXT_FIElD, "34567");
		fillValue(By.xpath("//input[@placeholder='Tracking Number' and not(@disabled='')]"),"34567");
		waitForFiveSeconds();
		
		}
		
		*/
		/*
		//case -No, I will handle inbound shipping ,Inbound carrier = Other
		
		fillValue(OTHER_CARRIER_TXT_FIElD, "XYZ");
		fillValue(CARRIER_CONTACT_NAME_TXT_FIElD, "santosh");
		clickOnElement(CARRIER_CONTACT_PHONE_TXT_FIElD);
		fillValue(CARRIER_CONTACT_PHONE_TXT_FIElD, "9493446765");
		
	
		//for pallet
		
		waitForFiveSeconds();
		clickOnElement(PICKUP_DATE1);
		fillValue(PICKUP_DATE1, "11/29/2016");
		clickOnElement(INSIDE_PICKUP_CHECKBOX);
		clickOnElement(LAST_GATE_AT_PICKUP);
		clickOnElement(LIMITED_ACCESS);	
		*/
		
		
		clickOnElement(NEXT_BUTTON);
	}

	public void review()
	{
		clickOnElement(SUBMIT_BUTTON);
		clickOnElement(CONFIRM_SUBMIT_BUTTON);
		clickOnElement(CLOSE_BUTTON);
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
