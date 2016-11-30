package com.test.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.automation.common.BasePage;
import com.test.automation.common.RandomDataUtil;
import com.test.automation.model.CollateralDetails;

public class CollateralCreationPage extends BasePage{

	public CollateralCreationPage(WebDriver driver){
		super(driver);
	}

	private static final By COLLATERAL_SKU_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralName");
	private static final By COLLATERAL_DESC_TXT_FIELD=By.id("_productnew_WAR_productportlet_collateralDescription");
	private static final By COLLATERAL_LDESC_TXT_FIELD=By.id("_productnew_WAR_productportlet_collateralLongDescription");
	private static final By COLLATERAL_TYPE_DROPDOWN =By.id("select2-_productnew_WAR_productportlet_collateralType-container");
	private static final By COLLATERAL_IS_BARCODED_YES =By.xpath("//a[contains(.,' Yes ')]");
	private static final By COLLATERAL_IS_BARCODED_NO =By.xpath("//a[contains(.,' No ')]");
	private static final By COLLATERAL_UPC_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralUPC");
	private static final By COLLATERAL_LENGTH_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralLength");
	private static final By COLLATERAL_WIDTH_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralWidth");
	private static final By COLLATERAL_HEIGHT_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralHeight");
	private static final By COLLATERAL_WEIGHT_TXT_FIELD =By.id("_productnew_WAR_productportlet_collateralWeight");
	private static final By INCLUDE_INSERT_CHECK_BOX =By.id("excludePrepackagedProducts");
	private static final By NEXT_BUTTON =By.linkText("Next");
	private static final By CANCEL_BUTTON =By.linkText("Cancel");
	private static final By PREVIOUS_BUTTON =By.linkText("Previous");
	private static final By SUBMIT_BUTTON =By.linkText("Submit Collateral");
	private static final By SAVE_CONFIRMATION_BUTTON =By.id("collateralSaveConfirmButton");
	private static final By SKU_LABLE=By.xpath("//div[@id='collateral-details-page']//div[@class='qw-section'][1]//div[@class='qw-valuable collateral-name-val']");

	private String colSKu;


	public String getColSKu() {
		return colSKu;
	}

	public void setColSKu(String colSKu) {
		this.colSKu = colSKu;
	}

	public void collateralDetailsFill(CollateralDetails collateralDetails)
	{

		String collateralSKU = collateralDetails.getCollateralSKU() + RandomDataUtil.getRandomNumber(7);
		setColSKu(collateralSKU);

		driver.findElement(COLLATERAL_SKU_TXT_FIELD).sendKeys(collateralSKU);
		driver.findElement(COLLATERAL_DESC_TXT_FIELD).sendKeys(collateralDetails.getCollateralDesc());
		driver.findElement(COLLATERAL_LDESC_TXT_FIELD).sendKeys(collateralDetails.getCollateralLongDesc());
		driver.findElement(COLLATERAL_TYPE_DROPDOWN).click();
		selectDropDownItemByText(collateralDetails.getCollateralType());
		//driver.findElement(By.xpath("//li[text()='Gifts With Purchase']")).click();

		if(collateralDetails.isIsbarcoded())
		{

			driver.findElement(COLLATERAL_IS_BARCODED_YES).click();
		}else{
			driver.findElement(COLLATERAL_IS_BARCODED_NO).click();
		}

		driver.findElement(COLLATERAL_UPC_TXT_FIELD).sendKeys(collateralDetails.getBarcode());
		driver.findElement(COLLATERAL_LENGTH_TXT_FIELD).sendKeys(String.valueOf(collateralDetails.getCollateralLength()));
		driver.findElement(COLLATERAL_WIDTH_TXT_FIELD).sendKeys(String.valueOf(collateralDetails.getCollateralWidth()));
		driver.findElement(COLLATERAL_HEIGHT_TXT_FIELD).sendKeys(String.valueOf(collateralDetails.getCollateralHeight()));
		driver.findElement(COLLATERAL_WEIGHT_TXT_FIELD).sendKeys(String.valueOf(collateralDetails.getCollateralWeight()));

		if(collateralDetails.isNotIncludeWithPrepackagedProducts())
		{
			driver.findElement(INCLUDE_INSERT_CHECK_BOX).click();
		}
		//Next Button
		driver.findElement(NEXT_BUTTON).click();	

	}

	public void configureCollateralRules()
	{
		driver.findElement(NEXT_BUTTON).click();
	}

	public void submitCollateralInfo()
	{
		driver.findElement(SUBMIT_BUTTON).click();
		waitForFiveSeconds();
		driver.findElement(SAVE_CONFIRMATION_BUTTON).click();
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

	public String getCollateralSKUInfo(){
		waitForElement(ExpectedConditions.visibilityOfElementLocated(SKU_LABLE));
		return findElement(SKU_LABLE).getText();
	}





	public void collateralDetailsFill()
	{

		String collateralSKU = "ATAC" + RandomDataUtil.getRandomNumber(7);
		setColSKu(collateralSKU);

		driver.findElement(COLLATERAL_SKU_TXT_FIELD).sendKeys(collateralSKU);
		driver.findElement(COLLATERAL_DESC_TXT_FIELD).sendKeys("description");
		driver.findElement(COLLATERAL_LDESC_TXT_FIELD).sendKeys("lONG description");
		driver.findElement(COLLATERAL_TYPE_DROPDOWN).click();
		driver.findElement(By.xpath("//li[text()='Gifts With Purchase']")).click();
		driver.findElement(COLLATERAL_IS_BARCODED_YES).click();
		driver.findElement(COLLATERAL_IS_BARCODED_NO).click();
		driver.findElement(COLLATERAL_UPC_TXT_FIELD).sendKeys("45678");
		driver.findElement(COLLATERAL_LENGTH_TXT_FIELD).sendKeys("10");
		driver.findElement(COLLATERAL_WIDTH_TXT_FIELD).sendKeys("12");
		driver.findElement(COLLATERAL_HEIGHT_TXT_FIELD).sendKeys("2");
		driver.findElement(COLLATERAL_WEIGHT_TXT_FIELD).sendKeys("14");
		driver.findElement(INCLUDE_INSERT_CHECK_BOX).click();
		//Next Button
		driver.findElement(NEXT_BUTTON).click();
		// //submit button
		//driver.findElement(CANCEL_BUTTON).click(); // cancel button
		//	 driver.findElement(PREVIOUS_BUTTON).click();
		// driver.findElement(SAVE_CONFIRMATION_BUTTON).click(); // save collateral on popup

	}



}
