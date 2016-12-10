package com.test.automation.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.automation.common.PageUnderTest;
import com.test.automation.wms.pageobjects.WmsHomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductAllocationStepDefs {
	@Autowired
	private PageUnderTest pageUnderTest;
	
	
	
	@When("^pick any empty Item location and allocate it in the location$")
	public void pick_any_empty_Item_location_and_allocate_it_in_the_location()  {
		WmsHomepage wmsHomePage = pageUnderTest.getWmsHomepage();
		wmsHomePage.ProductAllocation(pageUnderTest.getNewProductpage().getSku());
	    
	}

	@Then("^the user should be able to assign item to location successfully$")
	public void the_user_should_be_able_to_assign_item_to_location_successfully()  {
		WmsHomepage wmsHomePage = pageUnderTest.getWmsHomepage();
		String sku = pageUnderTest.getNewProductpage().getSku();
		boolean status = wmsHomePage.checkSKUAllocated(sku);
		Assert.assertTrue("Allocation not successful for SKU "+sku, status);
	
	   
	}

}
