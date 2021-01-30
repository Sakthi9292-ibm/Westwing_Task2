#Author: sakthivel.ts.9292@gmail.com
Feature: WestWing wishlist Userstory

  Background: 
    Given I am on the WestWing page
      | page     |
      | HomePage |

 @Login @Wishlist @All
  Scenario Outline: deleting from wishlist after login
    When I search for <product> in home page
    And I click on the wishlist icon of the <product_number>st/nd/rd found product
    Then I should see the login form of overlay
    And I log in with First Name Last Name and Email
      | field      | value        |
      | First Name | UserFname    |
      | Password   | UserPassword |
      | Email      | UserEmail    |
    When I go to the worklist
    Then I should be able to delete product from wishlist
    
    Examples: 
      | product | product_number |
      | "Mobel" |              1 |

  @Login @Wishlist @All
  Scenario Outline: add to wishlist after login
    When I search for <product> in home page
    And I click on the wishlist icon of the <product_number>st/nd/rd found product
    Then I should see the login form of overlay
    And I log in with First Name Last Name and Email
      | field      | value        |
      | First Name | UserFname    |
      | Password   | UserPassword |
      | Email      | UserEmail    |
    Then product should be visible on the wishlist
    

    Examples: 
      | product | product_number |
      | "Mobel" |              1 |

 