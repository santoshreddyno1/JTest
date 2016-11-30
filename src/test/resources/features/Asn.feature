Feature: Create ASN for the product
Background: 
    Given User log in to Honeycomb Portal
    And Selected the "Fancy T-Shirt" Retailer
    And Clicked on Inbound Shipments
    And Clicked on New Shipment


Scenario: User should be able to create ASN for the product
When User fills all the details on the location tab
And On the contents tab parcel is selected 
And filled with details
And Services are selected on services tab
And On the shipping tab Ship via FedEx Ground is selected
Then User should be able to create ASN
