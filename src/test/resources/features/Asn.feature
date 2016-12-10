Feature: Create ASN for the product
Background: 
    Given User log in to Honeycomb Portal
    And Selected the "980 Sauce" Retailer
    And Clicked on Inbound Shipments
    And Clicked on New Shipment
@demo
Scenario: User should be able to create ASN for the product when Handle inbound shipping is selected as Yes
When User fills all the details on the location tab
And On the contents tab parcel is selected 
And filled with details
And Services are selected on services tab
And On the shipping tab handle inbound shipping is selected as Yes
Then User should be able to create ASN

@demo
Scenario: User should be able to create ASN for the product when Handle inbound shipping is selected as No
When User fills all the details on the location tab
And On the contents tab parcel is selected 
And filled with details
And Services are selected on services tab
And On the shipping tab handle inbound shipping is selected as No
Then User should be able to create ASN

Scenario: User should be able to create ASN for the product
When User fills all the details on the location tab
And On the contents tab pallet is selected 
And filled with details
And Services are selected on services tab
And On the shipping tab handle inbound shipping is selected as Yes
Then User should be able to create ASN

@demo
Scenario: User should be able to create ASN for the product
When User fills all the details on the location tab
And On the contents tab pallet is selected 
And filled with details
And Services are selected on services tab
And On the shipping tab handle inbound shipping is selected as No
Then User should be able to create ASN