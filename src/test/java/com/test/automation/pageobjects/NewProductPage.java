package com.test.automation.pageobjects;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.test.automation.common.BasePage;
import com.test.automation.common.RandomDataUtil;
import com.test.automation.model.CharacteristicsDetails;
import com.test.automation.model.FulfillmentDetails;
import com.test.automation.model.InternationalDetails;
import com.test.automation.model.NewProduct;
import com.test.automation.model.ProductDetails;
import com.test.automation.model.ReturnDetails;

public class NewProductPage extends BasePage {
	// Product Details-General Information
	private static final By SKU_TXT_FIELD = By.id("item-sku");
	private static final By DESC_TXT_FIELD = By.id("item-description");
	private static final By LDESC_TXT_FIELD = By.id("long-description");
	private static final By UPC_TXT_FIELD = By.id("item-upc");
	private static final By PRODUCT_CATEGORY_DROPDOWN = By.id("select2-item-category-container");
	private static final By RETAIL_PRICE_TXT_FIELD = By.id("item-ret-price");
	private static final By COST_TXT_FIELD = By.id("item-cost");
	private static final By LENGTH_TXT_FIELD = By.id("item-length");
	private static final By WIDTH_TXT_FIELD = By.id("item-width");
	private static final By HEIGHT_TXT_FIELD = By.id("item-height");
	private static final By WEIGHT_TXT_FIELD = By.id("item-pounds");
	// Hazardous Characteristics
	private static final By BATTERY_RADIO_BUTTON_NO = By.id("product.prdBattery1");
	private static final By BATTERY_RADIO_BUTTON_YES = By.id("product.prdBattery2");
	private static final By BATTERY_DROPDOWN = By.id("select2-item-battery-container");
	private static final By HAZARDOUS_RADIO_BUTTON_NO = By.id("product.prdHazardMaterial1");
	private static final By HAZARDOUS_RADIO_BUTTON_YES = By.id("product.prdHazardMaterial2");
	// Additional Characteristics
	private static final By MARKED_WITH_BARCODE_RADIO_BUTTON_NO = By.id("product.prdBarcodeMarked1");
	private static final By MARKED_WITH_BARCODE_RADIO_BUTTON_YES = By.id("product.prdBarcodeMarked2");
	private static final By PERISHABLE_RADIO_BUTTON_NO = By.id("product.prdPerishable1");
	private static final By PERISHABLE_RADIO_BUTTON_YES = By.id("product.prdPerishable2");
	private static final By ELIG_SELF_DAYS_TXT_FIELD = By.id("item-elig-shelf_days");
	private static final By SERIALIZATION_RADIO_BUTTON_NO = By.id("product.prdSerializationRequired1");
	private static final By SERIALIZATION_RADIO_BUTTON_YES = By.id("product.prdSerializationRequired2");
	private static final By LOT_RADIO_BUTTON_NO = By.id("product.prdBatchLotRequired1");
	private static final By LOT_RADIO_BUTTON_YES = By.id("product.prdBatchLotRequired2");
	private static final By CONTAINS_LIQUID_RADIO_BUTTON_NO = By.id("product.prdLiquid1");
	private static final By CONTAINS_LIQUID_RADIO_BUTTON_YES = By.id("product.prdLiquid2");
	private static final By FRAGILE_RADIO_BUTTON_NO = By.id("product.prdFragile1");
	private static final By FRAGILE_RADIO_BUTTON_YES = By.id("product.prdFragile2");
	private static final By SHIP_ALONE_RADIO_BUTTON_NO = By.id("product.prdShipAlone1");
	private static final By SHIP_ALONE_RADIO_BUTTON_YES = By.id("product.prdShipAlone2");
	private static final By POLYBAG_RADIO_BUTTON_NO = By.id("product.prdPolyBagRequired1");
	private static final By POLYBAG_RADIO_BUTTON_YES = By.id("product.prdPolyBagRequired2");
	// Inventory Status
	private static final By LOW_STOCK_THRESHOLD_DROPDOWN = By.id("select2-low-stock-threshold-container");
	// Variant Attributes
	private static final By VARIANT_ATTRIBUTES_SWITCH = By.xpath("//span[@id='item-variations']");
	private static final By ATTR1_TYPE_TXT_FIELD = By.id("attr1-type");
	private static final By ATTR1_VALUE_TXT_FIELD = By.id("attr1-value");
	private static final By ATTR2_TYPE_TXT_FIELD = By.id("attr2-type");
	private static final By ATTR2_VALUE_TXT_FIELD = By.id("attr2-value");
	private static final By ATTR3_TYPE_TXT_FIELD = By.id("attr3-type");
	private static final By ATTR3_VALUE_TXT_FIELD = By.id("attr3-value");
	// Case level
	private static final By CASE_LEVEL_SWITCH = By.xpath("//span[@id='item-case-levels']");
	// Case Levels-Inner Case
	private static final By INNER_CASE_CHECKBOX = By.id("inner-case-level");
	private static final By NUM_UNITS_INNER_TXT_FIELD = By.id("num-units-inner");
	private static final By UPC_INNER_TXT_FIELD = By.id("upc-inner");
	private static final By LENGTH_INNER_TXT_FIELD = By.id("length-inner");
	private static final By WIDTH_INNER_TXT_FIELD = By.id("width-inner");
	private static final By HEIGHT_INNER_TXT_FIELD = By.id("height-inner");
	private static final By WEIGHT_INNER_TXT_FIELD = By.id("weight-inner");
	// Case Levels-Master Case
	private static final By MASTER_CASE_CHECKBOX = By.id("master-case-level");
	private static final By NUM_UNITS_MASTER_TXT_FIELD = By.id("num-units-master");
	private static final By UPC_MASTER_TXT_FIELD = By.id("upc-master");
	private static final By LENGTH_MASTER_TXT_FIELD = By.id("length-master");
	private static final By WIDTH_MASTER_TXT_FIELD = By.id("width-master");
	private static final By HEIGHT_MASTER_TXT_FIELD = By.id("height-master");
	private static final By WEIGHT_MASTER_TXT_FIELD = By.id("weight-master");
	// Case Levels-Pallet
	private static final By PALLET_CHECKBOX = By.id("pallet-case-level");
	private static final By NUM_UNITS_PALLET_TXT_FIELD = By.id("num-units-pallet");
	private static final By UPC_PALLET_TXT_FIELD = By.id("upc-pallet");
	private static final By LENGTH_PALLET_TXT_FIELD = By.id("length-pallet");
	private static final By WIDTH_PALLET_TXT_FIELD = By.id("width-pallet");
	private static final By HEIGHT_PALLET_TXT_FIELD = By.id("height-pallet");
	private static final By WEIGHT_PALLET_TXT_FIELD = By.id("weight-pallet");
	// Return-Eligibilty
	private static final By PRODUCT_IS_RETURNABLE_SWITCH = By.xpath("//span[@id='item-eligibilty']");
	private static final By ELIGIBLE_INITIAL_RECEIPT = By.id("item-elig-from-receipt");
	private static final By RETURN_DESTINATION_DROPDOWN = By.id("select2-item-return-destination-container");
	private static final By SHIPPING_SERVICE_DROPDOWN = By.id("select2-item-shipping-service-container");
	private static final By SERIAL_NUMBER_SWITCH = By.xpath("//span[@id='item-serial-number']");
	private static final By AUTHORIZATION_SWITCH = By.xpath("//span[@id='item-req-authorization']");
	private static final By COUNTRY_OF_ORIGIN_SWITCH = By.xpath("//span[@id='item-country-origin']");
	// International Shipping
	private static final By INTERNATIONAL_SHIPPING_SWITCH = By.xpath("//span[@id='item-international-shipping']");
	private static final By COUNTRY_OF_ORIGIN_DROPDOWN = By.id("select2-item-international-origin-container");
	// Review
	private static final By SUBMIT_PRODUCT_BUTTON = By.id("submit-item-btn");
	private static final By SAVE_PRODUCT_BUTTON_CONFIRMATION = By.xpath("//button[contains(text(),'Save Product')]");
	// Common-Buttons
	private static final By NEXT_BUTTON = By.xpath("//a[@class='qw-next base-btn purple-btn']");
	private static final By PREVIOUS_BUTTON = By.xpath("//a[@class='qw-prev base-btn purple-btn']");
	private static final By CANCEL_BUTTON = By.xpath("//a[@class='qw-cancel base-btn purple-btn stretch-mobile']");
	private static final By CLOSE_CONFIRMATION_ICON = By.xpath("//button[@onclick='viewItem();']");
	private static final By SKU_ON_DETAILS_PAGE = By.cssSelector(".top-title h3>p");

	private String sku = null;
	

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public NewProductPage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}

	public NewProductPage() {
		// TODO Auto-generated constructor stub
	}



	/*public String detailsFill(ProductDetails prodDetails) throws InterruptedException {

		String SKU = prodDetails.getProdName() + RandomDataUtil.getRandomNumber(7);
		setSku(SKU);
		waitForElement(ExpectedConditions.visibilityOfElementLocated(SKU_TXT_FIELD));
		fillValue(SKU_TXT_FIELD, SKU);
		fillValue(DESC_TXT_FIELD, prodDetails.getProdDesc());
		fillValue(LDESC_TXT_FIELD, prodDetails.getProdLongDesc());
		fillValue(UPC_TXT_FIELD, prodDetails.getBarcode());
		clickOnElement(PRODUCT_CATEGORY_DROPDOWN);
		selectDropDownItemByText(prodDetails.getProdCategory());
		fillValue(RETAIL_PRICE_TXT_FIELD, String.valueOf(prodDetails.getRetailPrice()));
		fillValue(COST_TXT_FIELD, String.valueOf(prodDetails.getRetailCost()));
		fillValue(LENGTH_TXT_FIELD, String.valueOf(prodDetails.getLength()));
		fillValue(WIDTH_TXT_FIELD, String.valueOf(prodDetails.getWidth()));
		fillValue(HEIGHT_TXT_FIELD, String.valueOf(prodDetails.getHeight()));
		fillValue(WEIGHT_TXT_FIELD, String.valueOf(prodDetails.getWeight()));


		clickOnElement(NEXT_BUTTON);
		return SKU;
	}*/

	public String detailsFill(NewProduct newProductData) throws InterruptedException {

		//String SKU = newProductData.getProdName() + RandomDataUtil.getRandomNumber(7);
		String SKU = newProductData.getProdName() + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		setSku(SKU);
		waitForElement(ExpectedConditions.visibilityOfElementLocated(SKU_TXT_FIELD));
		fillValue(SKU_TXT_FIELD, SKU);
		fillValue(DESC_TXT_FIELD, newProductData.getProdDesc());
		fillValue(LDESC_TXT_FIELD, newProductData.getProdLongDesc());
		fillValue(UPC_TXT_FIELD, newProductData.getBarcode());
		clickOnElement(PRODUCT_CATEGORY_DROPDOWN);
		selectDropDownItemByText(newProductData.getProdCategory());
		fillValue(RETAIL_PRICE_TXT_FIELD, String.valueOf(newProductData.getRetailPrice()));
		fillValue(COST_TXT_FIELD, String.valueOf(newProductData.getRetailCost()));
		fillValue(LENGTH_TXT_FIELD, String.valueOf(newProductData.getLength()));
		fillValue(WIDTH_TXT_FIELD, String.valueOf(newProductData.getWidth()));
		fillValue(HEIGHT_TXT_FIELD, String.valueOf(newProductData.getHeight()));
		fillValue(WEIGHT_TXT_FIELD, String.valueOf(newProductData.getWeight()));


		clickOnElement(NEXT_BUTTON);
		return SKU;
	}

	public void characteristicsFill(NewProduct newProductData) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(BATTERY_RADIO_BUTTON_YES));

		if (newProductData.isContainsBattery()) {

			clickOnElement(BATTERY_RADIO_BUTTON_YES);
			clickOnElement(BATTERY_DROPDOWN);
			selectDropDownItemByText(newProductData.getBatteryType());

		} else {
			clickOnElement(BATTERY_RADIO_BUTTON_NO);
		}

		if(newProductData.isHazadrous()){
			clickOnElement(HAZARDOUS_RADIO_BUTTON_YES);

		}else{

			clickOnElement(HAZARDOUS_RADIO_BUTTON_NO);

		}

		// Additional Characteristics
		if(newProductData.isMarkedWithBarcode())
		{
			clickOnElement(MARKED_WITH_BARCODE_RADIO_BUTTON_YES);

		}else{
			clickOnElement(MARKED_WITH_BARCODE_RADIO_BUTTON_NO);

		}
		if(newProductData.isPerishable())
		{
			clickOnElement(PERISHABLE_RADIO_BUTTON_YES);
			fillValue(ELIG_SELF_DAYS_TXT_FIELD, String.valueOf(newProductData.getPerishableDays()));

		}else{
			clickOnElement(PERISHABLE_RADIO_BUTTON_NO);

		}
		if(newProductData.isSerialization())
		{
			clickOnElement(SERIALIZATION_RADIO_BUTTON_YES);

		}
		else{
			clickOnElement(SERIALIZATION_RADIO_BUTTON_NO);

		}
		if(newProductData.isRequireBatch())
		{
			clickOnElement(LOT_RADIO_BUTTON_YES);
		}
		else{
			clickOnElement(LOT_RADIO_BUTTON_NO);

		}
		if(newProductData.isContainsLiquid())
		{
			clickOnElement(CONTAINS_LIQUID_RADIO_BUTTON_YES);

		}
		else{
			clickOnElement(CONTAINS_LIQUID_RADIO_BUTTON_NO);

		}
		if(newProductData.isFragile())
		{
			clickOnElement(FRAGILE_RADIO_BUTTON_YES);

		}
		else{
			clickOnElement(FRAGILE_RADIO_BUTTON_NO);
		}
		if(newProductData.isShipAlone())
		{
			clickOnElement(SHIP_ALONE_RADIO_BUTTON_YES);
		}
		else{
			clickOnElement(SHIP_ALONE_RADIO_BUTTON_NO);
		}

		if(newProductData.isCanBeShippedInPolyBag())
		{
			clickOnElement(POLYBAG_RADIO_BUTTON_YES);
		}
		else{
			clickOnElement(POLYBAG_RADIO_BUTTON_NO);
		}		

		clickOnElement(NEXT_BUTTON);

	}

	public void fullfillmentFill(NewProduct newProductData) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(LOW_STOCK_THRESHOLD_DROPDOWN));

		driver.findElement(LOW_STOCK_THRESHOLD_DROPDOWN).click();
		selectDropDownItemByText(String.valueOf(newProductData.getLowStockThreshold()));
		if(newProductData.isIsproductComeInMultipleVariations())
		{
			// Varient Attribute
			driver.findElement(VARIANT_ATTRIBUTES_SWITCH).click();
			driver.findElement(ATTR1_TYPE_TXT_FIELD).sendKeys(newProductData.getAttribute1Type());
			driver.findElement(ATTR1_VALUE_TXT_FIELD).sendKeys(newProductData.getAttribute1Value());
			driver.findElement(ATTR2_TYPE_TXT_FIELD).sendKeys(newProductData.getAttribute2Type());
			driver.findElement(ATTR2_VALUE_TXT_FIELD).sendKeys(newProductData.getAttribute2Value());
			driver.findElement(ATTR3_TYPE_TXT_FIELD).sendKeys(newProductData.getAttribute3Type());
			driver.findElement(ATTR3_VALUE_TXT_FIELD).sendKeys(newProductData.getAttribute3Value());

		}

		if(newProductData.isProductHasMultipleCaseLevels())
		{
			waitFor(2000);
			// Case levels
			clickOnElement(CASE_LEVEL_SWITCH);
			{
				if(newProductData.isInnerCaseCheck())
				{	
					driver.findElement(INNER_CASE_CHECKBOX).click();
					driver.findElement(NUM_UNITS_INNER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getInnerUnits()));
					driver.findElement(UPC_INNER_TXT_FIELD).sendKeys(newProductData.getInnerBarcode());
					driver.findElement(LENGTH_INNER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getInnerLength()));
					driver.findElement(WIDTH_INNER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getInnerWidth()));
					driver.findElement(HEIGHT_INNER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getInnerHeight()));
					driver.findElement(WEIGHT_INNER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getInnerWeight()));
				}
				if(newProductData.isMasterCaseCheck())
				{
					// Master Case
					driver.findElement(MASTER_CASE_CHECKBOX).click();
					driver.findElement(NUM_UNITS_MASTER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getMasterCaseUnits()));
					driver.findElement(UPC_MASTER_TXT_FIELD).sendKeys(newProductData.getMasterCaseBarcode());
					driver.findElement(LENGTH_MASTER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getMasterCaseLength()));
					driver.findElement(WIDTH_MASTER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getMasterCaseWidth()));
					driver.findElement(HEIGHT_MASTER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getMasterCaseHeight()));
					driver.findElement(WEIGHT_MASTER_TXT_FIELD).sendKeys(String.valueOf(newProductData.getMasterCaseWeight()));
				}
				if(newProductData.isPalletCheck())
				{
					// Pallet Case
					driver.findElement(PALLET_CHECKBOX).click();
					driver.findElement(NUM_UNITS_PALLET_TXT_FIELD).sendKeys(String.valueOf(newProductData.getPalletUnits()));
					driver.findElement(UPC_PALLET_TXT_FIELD).sendKeys(newProductData.getPalletBarcode());
					driver.findElement(LENGTH_PALLET_TXT_FIELD).sendKeys(String.valueOf(newProductData.getPalletLength()));
					driver.findElement(WIDTH_PALLET_TXT_FIELD).sendKeys(String.valueOf(newProductData.getPalletWidth()));
					driver.findElement(HEIGHT_PALLET_TXT_FIELD).sendKeys(String.valueOf(newProductData.getPalletHeight()));
					driver.findElement(WEIGHT_PALLET_TXT_FIELD).sendKeys(String.valueOf(newProductData.getPalletWeight()));

				}	

			}
			
		}
		driver.findElement(NEXT_BUTTON).click();
	}

	public void returnFill(NewProduct newProductData) throws InterruptedException {

		if(newProductData.isReturnable())
		{

			driver.findElement(ELIGIBLE_INITIAL_RECEIPT).sendKeys(String.valueOf(newProductData.getEligibleDays()));
			driver.findElement(RETURN_DESTINATION_DROPDOWN).click();
			selectDropDownItemByText(newProductData.getReturnDestination());
			driver.findElement(SHIPPING_SERVICE_DROPDOWN).click();
			selectDropDownItemByText(newProductData.getShippingService());
			if(newProductData.isRequestForSerialNumber())
			{
				driver.findElement(SERIAL_NUMBER_SWITCH).click();
			}
			if(newProductData.isRequireAuthorization())
			{
				driver.findElement(AUTHORIZATION_SWITCH).click();
			}
			if(newProductData.isRequirecountryOfOrigin())
			{
				driver.findElement(COUNTRY_OF_ORIGIN_SWITCH).click();
			}
		}
		else{
			driver.findElement(PRODUCT_IS_RETURNABLE_SWITCH).click();
		}

		driver.findElement(NEXT_BUTTON).click();

	}

	public void internationalFill(NewProduct newProductData) {

		if(newProductData.isInternationalShipping())
		{
			driver.findElement(INTERNATIONAL_SHIPPING_SWITCH).click();
			waitForElement(ExpectedConditions.elementToBeClickable(COUNTRY_OF_ORIGIN_DROPDOWN));
			driver.findElement(COUNTRY_OF_ORIGIN_DROPDOWN).click();
			selectDropDownItemByText(newProductData.getCountryOfOrigin());
		}
		clickOnElement(NEXT_BUTTON);
	}

	public void review() throws InterruptedException {

		// Submit Product
		driver.findElement(SUBMIT_PRODUCT_BUTTON).click();
		driver.findElement(SAVE_PRODUCT_BUTTON_CONFIRMATION).click();
		driver.findElement(CLOSE_CONFIRMATION_ICON).click();
		waitForFiveSeconds();
	}

	public String getSKUFromProdDetailsPage() {
		return driver.findElement(SKU_ON_DETAILS_PAGE).getText();
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public By getPageCheckLocator() {
		return SKU_TXT_FIELD;
	}


	//****************************************************************************************************************


	public String detailsFill() {

		String SKU = "ATA" + RandomDataUtil.getRandomNumber(7);
		// EnvironmentProperties.setProperty("SKU", SKU);
		setSku(SKU);
		waitForElement(ExpectedConditions.visibilityOfElementLocated(SKU_TXT_FIELD));
		driver.findElement(SKU_TXT_FIELD).sendKeys(SKU);
		driver.findElement(DESC_TXT_FIELD).sendKeys("Mobile");
		driver.findElement(LDESC_TXT_FIELD).sendKeys("This is a long description for mobile");
		driver.findElement(UPC_TXT_FIELD).sendKeys("1234567");
		driver.findElement(PRODUCT_CATEGORY_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='Books']")).click();
		driver.findElement(RETAIL_PRICE_TXT_FIELD).sendKeys("12");
		driver.findElement(COST_TXT_FIELD).sendKeys("6");
		driver.findElement(LENGTH_TXT_FIELD).sendKeys("1");
		driver.findElement(WIDTH_TXT_FIELD).sendKeys("2");
		driver.findElement(HEIGHT_TXT_FIELD).sendKeys("3");
		driver.findElement(WEIGHT_TXT_FIELD).sendKeys("1");
		driver.findElement(NEXT_BUTTON).click();

		return SKU;
	}


	public void characteristicsFill(boolean isContainsBattery) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(BATTERY_RADIO_BUTTON_YES));
		if (isContainsBattery == true) {
			driver.findElement(BATTERY_RADIO_BUTTON_YES).click();

			driver.findElement(BATTERY_DROPDOWN).click();
			driver.findElement(By.xpath("//li[text()='Nickel Cadmium']")).click();
		} else {
			driver.findElement(BATTERY_RADIO_BUTTON_NO).click();
		}
		driver.findElement(HAZARDOUS_RADIO_BUTTON_NO).click();
		driver.findElement(HAZARDOUS_RADIO_BUTTON_YES).click();

		// Additional Characteristics
		driver.findElement(MARKED_WITH_BARCODE_RADIO_BUTTON_NO).click();
		driver.findElement(MARKED_WITH_BARCODE_RADIO_BUTTON_YES).click();

		driver.findElement(PERISHABLE_RADIO_BUTTON_NO).click();
		driver.findElement(PERISHABLE_RADIO_BUTTON_YES).click();
		driver.findElement(ELIG_SELF_DAYS_TXT_FIELD).sendKeys("5");

		driver.findElement(SERIALIZATION_RADIO_BUTTON_NO).click();
		driver.findElement(SERIALIZATION_RADIO_BUTTON_YES).click();

		driver.findElement(LOT_RADIO_BUTTON_NO).click();
		driver.findElement(LOT_RADIO_BUTTON_YES).click();

		driver.findElement(CONTAINS_LIQUID_RADIO_BUTTON_NO).click();
		driver.findElement(CONTAINS_LIQUID_RADIO_BUTTON_YES).click();

		driver.findElement(FRAGILE_RADIO_BUTTON_NO).click();
		driver.findElement(FRAGILE_RADIO_BUTTON_YES).click();

		driver.findElement(SHIP_ALONE_RADIO_BUTTON_NO).click();
		driver.findElement(SHIP_ALONE_RADIO_BUTTON_YES).click();

		driver.findElement(POLYBAG_RADIO_BUTTON_NO).click();
		driver.findElement(POLYBAG_RADIO_BUTTON_YES).click();

		driver.findElement(NEXT_BUTTON).click();

	}

	public void fillBatteryOptions(boolean isContainsBattery, String batteryType) {
		if (isContainsBattery) {
			driver.findElement(BATTERY_RADIO_BUTTON_YES).click();
			driver.findElement(BATTERY_DROPDOWN).click();
			String dropdownLocator = "//li[text()='" + batteryType + "']";
			driver.findElement(By.xpath(dropdownLocator)).click();
		} else {
			driver.findElement(BATTERY_RADIO_BUTTON_NO).click();
		}
	}


	public void fullfillmentFill(boolean isCaseLevels) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(LOW_STOCK_THRESHOLD_DROPDOWN));
		driver.findElement(LOW_STOCK_THRESHOLD_DROPDOWN).click();
		clickOnElement(By.xpath("//li[text()='10']"));

		// Varient Attribute
		driver.findElement(VARIANT_ATTRIBUTES_SWITCH).click();
		driver.findElement(ATTR1_TYPE_TXT_FIELD).sendKeys("Size");
		driver.findElement(ATTR1_VALUE_TXT_FIELD).sendKeys("Large");
		driver.findElement(ATTR2_TYPE_TXT_FIELD).sendKeys("Color");
		driver.findElement(ATTR2_VALUE_TXT_FIELD).sendKeys("Blue");
		driver.findElement(ATTR3_TYPE_TXT_FIELD).sendKeys("Style");
		driver.findElement(ATTR3_VALUE_TXT_FIELD).sendKeys("Slim");

		// Case levels
		if (isCaseLevels == true) {
			driver.findElement(CASE_LEVEL_SWITCH).click();
			driver.findElement(INNER_CASE_CHECKBOX).click();
			driver.findElement(NUM_UNITS_INNER_TXT_FIELD).sendKeys("1");
			driver.findElement(UPC_INNER_TXT_FIELD).sendKeys("2");
			driver.findElement(LENGTH_INNER_TXT_FIELD).sendKeys("3");
			driver.findElement(WIDTH_INNER_TXT_FIELD).sendKeys("4");
			driver.findElement(HEIGHT_INNER_TXT_FIELD).sendKeys("5");
			driver.findElement(WEIGHT_INNER_TXT_FIELD).sendKeys("6");

			// Master Case
			driver.findElement(MASTER_CASE_CHECKBOX).click();
			driver.findElement(NUM_UNITS_MASTER_TXT_FIELD).sendKeys("2");
			driver.findElement(UPC_MASTER_TXT_FIELD).sendKeys("8");
			driver.findElement(LENGTH_MASTER_TXT_FIELD).sendKeys("7");
			driver.findElement(WIDTH_MASTER_TXT_FIELD).sendKeys("6");
			driver.findElement(HEIGHT_MASTER_TXT_FIELD).sendKeys("1");
			driver.findElement(WEIGHT_MASTER_TXT_FIELD).sendKeys("6");

			// Pallet Case
			driver.findElement(PALLET_CHECKBOX).click();
			driver.findElement(NUM_UNITS_PALLET_TXT_FIELD).sendKeys("4");
			driver.findElement(UPC_PALLET_TXT_FIELD).sendKeys("3");
			driver.findElement(LENGTH_PALLET_TXT_FIELD).sendKeys("4");
			driver.findElement(WIDTH_PALLET_TXT_FIELD).sendKeys("1");
			driver.findElement(HEIGHT_PALLET_TXT_FIELD).sendKeys("1");
			driver.findElement(WEIGHT_PALLET_TXT_FIELD).sendKeys("2");
		}

		driver.findElement(NEXT_BUTTON).click();

	}



	public void returnFill() {

		driver.findElement(ELIGIBLE_INITIAL_RECEIPT).sendKeys("10");

		driver.findElement(RETURN_DESTINATION_DROPDOWN).click();

		driver.findElement(By.xpath("//li[text()='1 - Return Test 10']")).click(); 
		driver.findElement(SHIPPING_SERVICE_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='Express']")).click();

		driver.findElement(SERIAL_NUMBER_SWITCH).click();
		driver.findElement(AUTHORIZATION_SWITCH).click();
		driver.findElement(COUNTRY_OF_ORIGIN_SWITCH).click();
		//driver.findElement(PRODUCT_IS_RETURNABLE_SWITCH).click();
		driver.findElement(NEXT_BUTTON).click();

	}

	public void internationalFill() {
		/*driver.findElement(INTERNATIONAL_SHIPPING_SWITCH).click();
		waitForElement(ExpectedConditions.elementToBeClickable(COUNTRY_OF_ORIGIN_DROPDOWN));
		driver.findElement(COUNTRY_OF_ORIGIN_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='United States']")).click();*/
		driver.findElement(NEXT_BUTTON).click();

	}


}
