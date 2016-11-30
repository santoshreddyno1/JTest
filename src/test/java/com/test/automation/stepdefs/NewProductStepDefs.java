package com.test.automation.stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.automation.common.DriverService;
import com.test.automation.common.EnvironmentProperties;
import com.test.automation.common.PageUnderTest;
import com.test.automation.model.CharacteristicsDetails;
import com.test.automation.model.FulfillmentDetails;
import com.test.automation.model.InternationalDetails;
import com.test.automation.model.ProductDetails;
import com.test.automation.model.ReturnDetails;
import com.test.automation.pageobjects.ChooseRetailer;
import com.test.automation.pageobjects.HomePage;
import com.test.automation.pageobjects.LoginPage;
import com.test.automation.pageobjects.NewProductPage;
import com.test.automation.pageobjects.ProductCatalog;
import com.test.automation.wms.pageobjects.WmsHomepage;
import com.test.automation.wms.pageobjects.WmsItemsWindow;
import com.test.automation.wms.pageobjects.WmsLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewProductStepDefs {

	@Autowired
	private PageUnderTest pageUnderTest;
	
	private String sku;

	@Given("^User log in to Honeycomb Portal$")
	public void i_log_in_to_Honeycomb_Portal() throws Throwable {
		WebDriver driver = DriverService.getDriver();
		// HomePage page = new HomePage(driver);
		// page.open();
		// pageUnderTest.setHomePage(null);
		LoginPage loginewProductPageage = new LoginPage(driver);
		loginewProductPageage.open();
		loginewProductPageage.waitForPageLoad();
		String username = EnvironmentProperties.getProperty("username");
		String password = EnvironmentProperties.getProperty("password");
		HomePage homePage = loginewProductPageage.login(username, password);
		loginewProductPageage.waitForPageLoad();
		pageUnderTest.setHomePage(homePage);
	}

	@Given("^Selected the \"([^\"]*)\" Retailer$")
	public void selected_the_Retailer(String retailer)  {
		HomePage homepage = pageUnderTest.getHomePage();
		ChooseRetailer chooseRetailer = new ChooseRetailer(homepage.getDriver());
		chooseRetailer.selectReatailer(retailer);
	}
//	retailer
	@Given("^Clicked on Product catalog$")
	public void clicked_on_Product_catalog() throws Throwable {

		HomePage homepage = pageUnderTest.getHomePage();
		ProductCatalog productCatalog = homepage.clickOnProductCatalog();
		pageUnderTest.setProductCatalog(productCatalog);

	}

	@Given("^Clicked on Add Product$")
	public void clicked_on_Add_Product() throws Throwable {
		ProductCatalog productCatalog = pageUnderTest.getProductCatalog();
		NewProductPage newProductPage = productCatalog.clickOnNewProductButton();
		pageUnderTest.setNewProductpage(newProductPage);
	}

	// Scenario 1
	@When("^User fills all the details$")
	public void user_fills_all_the_details() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		sku = newProductPage.detailsFill();
		newProductPage.characteristicsFill(true);
		newProductPage.fullfillmentFill(true);
		newProductPage.returnFill();
		newProductPage.internationalFill();
	}
	
	@When("^User fills all the details section$")
	public void user_fills_all_the_details_section(List<ProductDetails> prodDetailsList) throws Throwable {
	    System.out.println(prodDetailsList.size());
	    ProductDetails productDetails = prodDetailsList.get(0);
	    System.out.println(productDetails.getProdName());
	    NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		sku = newProductPage.detailsFill(productDetails);
	}
	
	@When("^User fills all the characterstics$")
	public void user_fills_all_the_characterstics(List<CharacteristicsDetails> characteristicsList) throws Throwable {
		 NewProductPage newProductPage = pageUnderTest.getNewProductpage();
			newProductPage.characteristicsFill(characteristicsList.get(0));
	}
	@When("^User fills the fulfillment details$")
	public void user_fills_the_fulfillment_details(List<FulfillmentDetails> fulfillmentList) throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.fullfillmentFill(fulfillmentList.get(0));
		
	}
	@When("^User fills Return details$")
	public void user_fills_Return_details(List<ReturnDetails> returnDetailsList) throws InterruptedException  {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.returnFill(returnDetailsList.get(0));

	}
	@When("^User fills International Shipping details$")
	public void user_fills_International_Shipping_details(List<InternationalDetails> internationalDetailsList)  {
		
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.internationalFill(internationalDetailsList.get(0));
		
	}
	
	
	
	@When("^Click on Submit Product$")
	public void click_on_Submit_Product() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.review();
		pageUnderTest.setNewProductpage(newProductPage);

	}

	@When("^Product should be created successfully$")
	public void product_should_be_created_successfully() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		String skuOnProdDetailsPage = newProductPage.getSKUFromProdDetailsPage();
		Assert.assertEquals("Mismatch in SKU values",sku, skuOnProdDetailsPage );
			Thread.sleep(5000);

		
	}

	// scenario 2
	@When("^User fill details Tab with default values$")
	public void user_fill_details_Tab_with_default_values() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		sku = newProductPage.detailsFill();

	}

	@When("^User fill all the details and in charecters tab contains battery is selected$")
	public void user_fill_all_the_details_and_in_charecters_tab_contains_battery_is_selected() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.characteristicsFill(true);
		newProductPage.fullfillmentFill(false);
		newProductPage.returnFill();
		newProductPage.internationalFill();
	}

	/*@When("^Battery Type is selected$")
	public void battery_Type_is_selected() throws Throwable {
	}

	@Then("^should be able to create a new product\\.$")
	public void should_be_able_to_create_a_new_product() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.review();*/
		
//		String skuOnProdDetailsPage = newProductPage.review();
//		Thread.sleep(8000);
//		System.out.println("hello");
//		Assert.assertEquals("Mismatch in SKU values", EnvironmentProperties.getProperty("SKU"), skuOnProdDetailsPage+"hello" );
////\	}

	// Scenario 3

	@When("^User fill details Characteristics Tab with default values$")
	public void user_fill_details_Characteristics_Tab_with_default_values() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		sku = newProductPage.detailsFill();
		newProductPage.characteristicsFill(false);

	}

	@When("^User choose caselevels is yes$")
	public void user_choose_caselevels_is_yes() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.fullfillmentFill(true);
		

	}

	@When("^Fill all the details$")
	public void fill_all_the_details() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.returnFill();
		newProductPage.internationalFill();
	}

	/*@Then("^new product should be created successfully$")
	public void new_product_should_be_created_successfully() throws Throwable {
		NewProductPage newProductPage = pageUnderTest.getNewProductpage();
		newProductPage.review();
		Thread.sleep(8000);
	}*/
	
	@When("^User access WMS$")
	public void user_access_WMS() throws Throwable {
		
	    WebDriver driver = DriverService.getDriver();
	    WmsLoginPage wmsLoginPage = new WmsLoginPage(driver);
	    wmsLoginPage.open();
	    wmsLoginPage.waitForPageLoad();
	    WmsHomepage wmsHomePage = wmsLoginPage.Wlogin();//working in login page 
	    
	   pageUnderTest.setWmsHomepage(wmsHomePage);
	      
	}
	
	@When("^Search for the Created product$")
	public void i_search_for_the_Created_product()  {
		WmsHomepage wmsHomePage = pageUnderTest.getWmsHomepage();
		wmsHomePage.ItemInfo(pageUnderTest.getNewProductpage().getSku());
		pageUnderTest.setWmsHomepage(wmsHomePage);
	}

	@Then("^User should be able to see the product$")
	public void i_should_be_able_to_see_the_product()  {
		WmsHomepage wmsHomePage = pageUnderTest.getWmsHomepage();
		String skuFromWMS = wmsHomePage.getSKUFromSearchResults();
		String createdSKU = pageUnderTest.getNewProductpage().getSku();
		System.out.println(skuFromWMS +"-"+createdSKU);
		Assert.assertEquals("Mismatch in SKU values",createdSKU,skuFromWMS);
		
	}
	
	//*************
	
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