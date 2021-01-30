# Westwing_Task2

This is for the Task to Generate the Automation script for the given requirements

```bash
----------------------------------------------------------------------------

Given I am on the WestwingNow home page 

When I search for "möbel"  

Then I should see product listing page with a list of products 

When I click on wishlist icon of the first found product  

Then I should see the login/registration overlay  

When I switch to login form of the overlay  

And I log in with your_test_account_data credentials  

Then the product should be added to the wishlist   

And I go to the wishlist page  

And I delete the product from my wishlist

-----------------------------------------------------------------------------

1 - Test Script Design 
      
        - Designed based on the BDD framework.
        - Structured the project in a way to help reusability and scalabilty of the code.
        - Maintaining the step definitions / pages seperately.
        - Maintain the locators , credentials in a properties file.
        - No hard coding in the Class files.
        - Capture test results as screenshots 
     
Project/Code Structure : 
        Project file consists of Feature files,step definition classes and Page classes
        
testAutomation.Pages-->  package consists of class files which has methods for each webelement and its action for each page.its for scalablity,
                         when new features/test cases needs to interact with elements from speific page , we can add and call that function anywhere.

testAutomation.StepDefinitions --> In future when the functionalities are added,In order to reduct repetitive step definitions and to improve maintainance
                                   in longer run, step definitions are divided into small groups of step defintions.
                                    
testAutomation.Features--> It has Feature files for each functionality. it gives the flexibility to run single/set of functionalities for progressive 
                           and regression automation matching the acceptance criteria . it improves the readability and reliabilty of test coverage.
                              
Runtimetest.properties-->  All the webelement identifiers are moved in common properties file, if in case any change in the locator values , we can 
                           change in the properties. not in each and every places in the code. it will improve code maintainence and reliabilty.
  
In this project structures , Test data are provided in the feature file.if user wish to test with different data ,it can be done from the feature file.no 
                               changes need in the existing code file.
                                                        
                               
  
|WestWing
|---|src/main/java
|   |---testAutomation.Features
|   |           |---adding_to_wishlist.feature
|   |           |---Product_Search.feature
|   |---testAutomation.Pages
|   |           |---HomePage.java
|   |           |---MobelPage.java
|   |           |---WishListPage.java
|   |---testAutomation.Runner
|   |           |---TestRunner.java   -------------> *TO EXECUTE TEST CASE , PLEASE GO TO THIS FILE , RIGHT CLICK & RUN AS Junit TEST*
|   |---testAutomation.StepDefinitions
|   |           |---Abstract_Step_Definition.java
|   |           |---Common_Step_Definitions.java
|   |           |---Product_Search_StepDefinitions.java
|   |           |---Wishlist_and_Login_StepDefinitions.java
|   |           |---Utils.java
|---|src/main/resources
|              |---chromdriver.exe
|              |---Runtimetest.properties
|---|target
    >***Contains the Screenshot after test execution***<
  
             
          
  
  ```
