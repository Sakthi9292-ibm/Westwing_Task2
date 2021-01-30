$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Product_search.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: sakthivel.ts.9292@gmail.com"
    }
  ],
  "line": 2,
  "name": "WestWing product search Userstory",
  "description": "",
  "id": "westwing-product-search-userstory",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Search product",
  "description": "",
  "id": "westwing-product-search-userstory;search-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    },
    {
      "line": 9,
      "name": "@ProductSearch"
    },
    {
      "line": 9,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I search for \u003cproduct\u003e in home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see product listing page showing \u003cnumber of items\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "westwing-product-search-userstory;search-product;",
  "rows": [
    {
      "cells": [
        "product",
        "number of items"
      ],
      "line": 15,
      "id": "westwing-product-search-userstory;search-product;;1"
    },
    {
      "cells": [
        "\"Mobel\"",
        "2308"
      ],
      "line": 16,
      "id": "westwing-product-search-userstory;search-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6539012400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the WestWing page",
  "rows": [
    {
      "cells": [
        "page"
      ],
      "line": 6
    },
    {
      "cells": [
        "HomePage"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Common_Step_Definitions.i_am_on_the_WestWing_page(DataTable)"
});
formatter.result({
  "duration": 25163414700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search product",
  "description": "",
  "id": "westwing-product-search-userstory;search-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@ProductSearch"
    },
    {
      "line": 9,
      "name": "@SmokeTest"
    },
    {
      "line": 9,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I search for \"Mobel\" in home page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see product listing page showing 2308",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mobel",
      "offset": 14
    }
  ],
  "location": "Product_Search_Stepdefinitions.i_search_for_in_home_page(String)"
});
formatter.result({
  "duration": 16802616200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2308",
      "offset": 42
    }
  ],
  "location": "Product_Search_Stepdefinitions.i_should_see_product_listing_page_showing(int)"
});
formatter.result({
  "duration": 30140544900,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c2308\u003e but was:\u003c2310\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:234)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:241)\r\n\tat testAutomation.StepDefinitions.Product_Search_Stepdefinitions.i_should_see_product_listing_page_showing(Product_Search_Stepdefinitions.java:51)\r\n\tat ✽.Then I should see product listing page showing 2308(Product_search.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 859987900,
  "status": "passed"
});
});