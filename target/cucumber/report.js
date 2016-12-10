$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/NewProdData.feature");
formatter.feature({
  "line": 1,
  "name": "Create New Product",
  "description": "",
  "id": "create-new-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3221765777,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log in to Honeycomb Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Selected the \"980 Sauce\" Retailer",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Clicked on Product catalog",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicked on Add Product",
  "keyword": "And "
});
formatter.match({
  "location": "NewProductStepDefs.i_log_in_to_Honeycomb_Portal()"
});
formatter.result({
  "duration": 15730647042,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "980 Sauce",
      "offset": 14
    }
  ],
  "location": "NewProductStepDefs.selected_the_Retailer(String)"
});
formatter.result({
  "duration": 796524921,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Product_catalog()"
});
formatter.result({
  "duration": 2204126893,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Add_Product()"
});
formatter.result({
  "duration": 2683688763,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to create a product with the Battery type",
  "description": "",
  "id": "create-new-product;user-should-be-able-to-create-a-product-with-the-battery-type",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User fills all the details using data in \"prodCreation.csv\" with record \"PC1\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Product should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prodCreation.csv",
      "offset": 42
    },
    {
      "val": "PC1",
      "offset": 73
    }
  ],
  "location": "NewProductStepDefs.user_fills_all_the_details_using_data_in_with_record(String,String)"
});
formatter.result({
  "duration": 18018940932,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.product_should_be_created_successfully()"
});
formatter.result({
  "duration": 5021052810,
  "status": "passed"
});
formatter.after({
  "duration": 413201649,
  "status": "passed"
});
formatter.before({
  "duration": 3690285518,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log in to Honeycomb Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Selected the \"980 Sauce\" Retailer",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Clicked on Product catalog",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicked on Add Product",
  "keyword": "And "
});
formatter.match({
  "location": "NewProductStepDefs.i_log_in_to_Honeycomb_Portal()"
});
formatter.result({
  "duration": 15580299566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "980 Sauce",
      "offset": 14
    }
  ],
  "location": "NewProductStepDefs.selected_the_Retailer(String)"
});
formatter.result({
  "duration": 705851237,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Product_catalog()"
});
formatter.result({
  "duration": 2235555401,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Add_Product()"
});
formatter.result({
  "duration": 2651546420,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should be able to create a product if the product is Hazardous",
  "description": "",
  "id": "create-new-product;user-should-be-able-to-create-a-product-if-the-product-is-hazardous",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User fills all the details using data in \"prodCreation.csv\" with record \"PC2\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Product should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prodCreation.csv",
      "offset": 42
    },
    {
      "val": "PC2",
      "offset": 73
    }
  ],
  "location": "NewProductStepDefs.user_fills_all_the_details_using_data_in_with_record(String,String)"
});
formatter.result({
  "duration": 17671007223,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.product_should_be_created_successfully()"
});
formatter.result({
  "duration": 5019072085,
  "status": "passed"
});
formatter.after({
  "duration": 404521853,
  "status": "passed"
});
formatter.before({
  "duration": 2497403014,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log in to Honeycomb Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Selected the \"980 Sauce\" Retailer",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Clicked on Product catalog",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicked on Add Product",
  "keyword": "And "
});
formatter.match({
  "location": "NewProductStepDefs.i_log_in_to_Honeycomb_Portal()"
});
formatter.result({
  "duration": 15088715475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "980 Sauce",
      "offset": 14
    }
  ],
  "location": "NewProductStepDefs.selected_the_Retailer(String)"
});
formatter.result({
  "duration": 729371462,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Product_catalog()"
});
formatter.result({
  "duration": 2037256912,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.clicked_on_Add_Product()"
});
formatter.result({
  "duration": 2706296447,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should be able to create a product if the product is Marked with Barcode",
  "description": "",
  "id": "create-new-product;user-should-be-able-to-create-a-product-if-the-product-is-marked-with-barcode",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User fills all the details using data in \"prodCreation.csv\" with record \"PC3\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Product should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prodCreation.csv",
      "offset": 42
    },
    {
      "val": "PC3",
      "offset": 73
    }
  ],
  "location": "NewProductStepDefs.user_fills_all_the_details_using_data_in_with_record(String,String)"
});
formatter.result({
  "duration": 16879868658,
  "status": "passed"
});
formatter.match({
  "location": "NewProductStepDefs.product_should_be_created_successfully()"
});
formatter.result({
  "duration": 5020194786,
  "status": "passed"
});
formatter.after({
  "duration": 338876651,
  "status": "passed"
});
});