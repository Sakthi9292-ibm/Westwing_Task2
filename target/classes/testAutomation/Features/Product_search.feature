#Author: sakthivel.ts.9292@gmail.com
Feature: WestWing product search Userstory

  Background: 
    Given I am on the WestWing page
      | page      |
      | HomePage |

  @SmokeTest @ProductSearch @All
  Scenario Outline: Search product
    When I search for <product> in home page
    Then I should see product listing page showing <number of items>

    Examples: 
      | product | number of items|
      | "Mobel"   |2308|

  @SmokeTest @productSearch @All
  Scenario Outline: Search product and login to add
    When I search for <product> in home page
    When I click on the wishlist icon of the <product_number>st/nd/rd found product
    Then I should see the login form of overlay

    Examples: 
      | product | product_number |
      | "Mobel"   |              1 |
