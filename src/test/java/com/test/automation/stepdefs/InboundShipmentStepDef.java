package com.test.automation.stepdefs;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.automation.common.PageUnderTest;
import com.test.automation.pageobjects.HomePage;
import com.test.automation.pageobjects.InboundShipments;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InboundShipmentStepDef {
	
	@Autowired
	private PageUnderTest pageUnderTest;
	
	
@Given("^Clicked on Inbound Shipments$")
public void clicked_on_Inbound_Shipments()  {
	HomePage homepage = pageUnderTest.getHomePage();
	InboundShipments inboundShipment = homepage.selectInboundShipments();
	pageUnderTest.setInboundShipment(inboundShipment);
}

@Given("^Clicked on New Shipment$")
public void clicked_on_New_Shipment()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.clickOnNewShipment();
}

@When("^User fills all the details on the location tab$")
public void user_fills_all_the_details_on_the_location_tab()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.locations(); 
}

@When("^On the contents tab parcel is selected$")
public void on_the_contents_tab_parcel_is_selected()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	//inboundShipment.selectParcel();
	inboundShipment.selectPallet();
   
}

@When("^filled with details$")
public void filled_with_details()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.contents();
    
}

@When("^Services are selected on services tab$")
public void services_are_selected_on_services_tab()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.services();
}

@When("^On the shipping tab Ship via FedEx Ground is selected$")
public void on_the_shipping_tab_Ship_via_FedEx_Ground_is_selected()  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.shipping();
}

@Then("^User should be able to create ASN$")
public void user_should_be_able_to_create_ASN() throws InterruptedException  {
	InboundShipments inboundShipment = pageUnderTest.getInboundShipment();
	inboundShipment.review();
	Thread.sleep(3000);
    
}


	
	

}
