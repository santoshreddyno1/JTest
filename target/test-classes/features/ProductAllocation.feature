Feature: Assign created item to empty location in WMS

  Background: 
    Given User log in to Honeycomb Portal
    And Selected the "Fancy T-Shirt" Retailer
    And Clicked on Product catalog
    And Clicked on Add Product

  Scenario: User should be able to assign item to empty location successfully in WMS
    When User fills all the details section
      | prodName | prodDesc  | prodLongDesc     | barcode | prodCategory | retailPrice | retailCost | length | width | height | weight |
      | ATA      | MyProduct | Product LongDesc | U3456   | Books        |          12 |          6 |      1 |     2 |      4 |      1 |
    And User fills all the characterstics
      | isContainsBattery | batteryType    | isHazadrous | isMarkedWithBarcode | isPerishable | perishableDays | isSerialization | isRequireBatch | isContainsLiquid | isFragile | isShipAlone | canBeShippedInPolyBag |
      | true              | Nickel Cadmium | false       | false               | true         |              2 | true            | true           | true             | true      | true        | true                  |
    And User fills the fulfillment details
      | lowStockThreshold | isproductComeInMultipleVariations | attribute1Type | attribute1Value | attribute2Type | attribute2Value | attribute3Type | attribute3Value | isProductHasMultipleCaseLevels | innerCaseCheck | innerUnits | innerBarcode | innerLength | innerWidth | innerHeight | innerWeight | masterCaseCheck | masterCaseUnits | masterCaseBarcode | masterCaseLength | masterCaseWidth | masterCaseHeight | masterCaseWeight | palletCheck | palletUnits | palletBarcode | palletLength | palletWidth | palletHeight | palletWeight |
      |                10 | true                              | Size           | Large           | Color          | Blue            | Style          | Slim            | true                           | false          |          2 | I56545       |           1 |          1 |           1 |           1 | true            |               4 | M5678             |                1 |               1 |                1 |                1 | false       |           8 | P45678        |            1 |           1 |            1 |            1 |
    And User fills Return details
      | isReturnable | eligibleDays | returnDestination  | shippingService | requestForSerialNumber | requireAuthorization | countryOfOrigin |
      | true         |           30 | 1 - Return Test 10 | Express         | true                   | true                 | true            |
    And User fills International Shipping details
      | internationalShipping | countryOfOrigin |
      | false                 | United States   |
    And Click on Submit Product
    And Product should be created successfully
    And User access WMS
    And pick any empty Item location and allocate it in the location
    Then the user should be able to assign item to location successfully