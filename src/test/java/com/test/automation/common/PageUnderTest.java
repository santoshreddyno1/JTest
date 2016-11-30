package com.test.automation.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.automation.pageobjects.CollateralCreationPage;
import com.test.automation.pageobjects.HomePage;
import com.test.automation.pageobjects.InboundShipments;
import com.test.automation.pageobjects.LoginPage;
import com.test.automation.pageobjects.NewProductPage;
import com.test.automation.pageobjects.ProductCatalog;
import com.test.automation.wms.pageobjects.WmsHomepage;
import com.test.automation.wms.pageobjects.WmsLoginPage;


@Component
@Scope("cucumber-glue")
public class PageUnderTest {
	
	private HomePage homePage;
	private LoginPage loginPage;
	private ProductCatalog productCatalog;
	private NewProductPage newProductpage;
	private WmsLoginPage wmsLoginPage;
	private WmsHomepage wmsHomepage;
	private CollateralCreationPage collateralCreationPage;
	private InboundShipments inboundShipment;
	
	
	
	
	public InboundShipments getInboundShipment() {
		return inboundShipment;
	}

	public void setInboundShipment(InboundShipments inboundShipment) {
		this.inboundShipment = inboundShipment;
	}

	public CollateralCreationPage getCollateralCreationPage() {
		return collateralCreationPage;
	}

	public void setCollateralCreationPage(CollateralCreationPage collateralCreationPage) {
		this.collateralCreationPage = collateralCreationPage;
	}

	public WmsHomepage getWmsHomepage() {
		return wmsHomepage;
	}

	public void setWmsHomepage(WmsHomepage wmsHomepage) {
		this.wmsHomepage = wmsHomepage;
	}

	public WmsLoginPage getWmsLoginPage() {
		return wmsLoginPage;
	}

	public void setWmsLoginPage(WmsLoginPage wmsLoginPage) {
		this.wmsLoginPage = wmsLoginPage;
	}

	public ProductCatalog getProductCatalog() {
		return productCatalog;
	}

	public void setProductCatalog(ProductCatalog productCatalog) {
		this.productCatalog = productCatalog;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(LoginPage loginPage) {
		this.loginPage = loginPage;
	}

	public HomePage getHomePage() {
		return homePage;
	}

	public void setHomePage(HomePage homePage) {
		this.homePage = homePage;
	}

	public NewProductPage getNewProductpage() {
		return newProductpage;
	}

	public void setNewProductpage(NewProductPage newProductpage) {
		this.newProductpage = newProductpage;
	}
	
	
}
