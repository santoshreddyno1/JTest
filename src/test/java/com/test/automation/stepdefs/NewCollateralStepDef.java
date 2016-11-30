package com.test.automation.stepdefs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.test.automation.common.PageUnderTest;
import com.test.automation.model.CollateralDetails;
import com.test.automation.pageobjects.CollateralCreationPage;
import com.test.automation.pageobjects.ProductCatalog;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCollateralStepDef {
	
	@Autowired
	private PageUnderTest pageUnderTest;
	
	@Given("^Clicked on Add Collateral$")
	public void clicked_on_Add_Collateral()  {
		ProductCatalog productCatalog = pageUnderTest.getProductCatalog();
		CollateralCreationPage collateralCreationPage = productCatalog.clickOnNewCollateralButton();
		pageUnderTest.setCollateralCreationPage(collateralCreationPage);
	    
	}

/*	@When("^user fill all the details in Collateral Information$")
	public void user_fill_all_the_details_in_Collateral_Information() throws Throwable {
		CollateralCreationPage collateralCreationPage = pageUnderTest.getCollateralCreationPage();
		collateralCreationPage.collateralDetailsFill();
		pageUnderTest.setCollateralCreationPage(collateralCreationPage);
	}
*/
	
	@When("^user fill all the details in Collateral Information$")
	public void user_fill_all_the_details_in_Collateral_Information(List<CollateralDetails> collateralDetailsList)  {
		CollateralCreationPage collateralCreationPage = pageUnderTest.getCollateralCreationPage();
		CollateralDetails collateralDetails = collateralDetailsList.get(0);
		collateralCreationPage.collateralDetailsFill(collateralDetails);
	}	
	
	@When("^click next without selecting any rule in Collateral rules tab$")
	public void click_next_without_selecting_any_rule_in_Collateral_rules_tab() throws Throwable {
		CollateralCreationPage collateralCreationPage = pageUnderTest.getCollateralCreationPage();
		collateralCreationPage.configureCollateralRules();
		pageUnderTest.setCollateralCreationPage(collateralCreationPage);
	}

	@When("^submit the created collateral$")
	public void submit_the_created_collateral() throws Throwable {
		CollateralCreationPage collateralCreationPage = pageUnderTest.getCollateralCreationPage();
		collateralCreationPage.submitCollateralInfo();
		pageUnderTest.setCollateralCreationPage(collateralCreationPage);
		
	}

	@Then("^user should be able to create Collateral$")
	public void user_should_be_able_to_create_Collateral() {
		CollateralCreationPage collateralCreationPage = pageUnderTest.getCollateralCreationPage();
		String colSkuOnDetailspage = collateralCreationPage.getCollateralSKUInfo();
		Assert.assertEquals(colSkuOnDetailspage, collateralCreationPage.getColSKu(), "Mismatch in Collateral SKU names");
		
		
	}



}
