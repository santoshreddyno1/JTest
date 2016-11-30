Feature: Create New Collateral

  Background: 
    Given User log in to Honeycomb Portal
    And Selected the "Fancy T-Shirt" Retailer
    And Clicked on Product catalog
    And Clicked on Add Collateral

  Scenario: Createing a new Collateral without any rule
    When user fill all the details in Collateral Information
      | collateralSKU | collateralDesc | collateralLongDesc | collateralType | isbarcoded | barcode | collateralLength | collateralWidth | collateralHeight | collateralWeight | notIncludeWithPrepackagedProducts |
      | ATAC          | My Collateral  | My Collateral Long | Sample         | true       | U3456   |                1 |               1 |                1 |                1 | true                              |
    And click next without selecting any rule in Collateral rules tab
    And submit the created collateral
    Then user should be able to create Collateral
    
    Scenario: Createing a new Collateral without any rule
    When user fill all the details in Collateral Information
      | collateralSKU | collateralDesc | collateralLongDesc | collateralType | isbarcoded | barcode | collateralLength | collateralWidth | collateralHeight | collateralWeight | notIncludeWithPrepackagedProducts |
      | ATAC          |                | My Collateral Long | Sample         | true       | U3456   |                1 |               1 |                1 |                1 | true                              |
    And click next without selecting any rule in Collateral rules tab
    And submit the created collateral
    Then user should be able to create Collateral