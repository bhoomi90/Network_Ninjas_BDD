@tag
Feature: Data Structure-Introduction  page features
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Data Structures - Introduction
    Then The user be directed to Data Structures- Introduction Page 
    
   @tag2
  Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures - Introduction page
    When The user clicks Time Complexity button
    Then The user should be redirected to Time Complexity of Data structures-Introduction
    
   @tag3
  Scenario: Verify that user is able to navigate to try Editor page
    Given The user is in the Time Complexity page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test
    
    
    @tag4
  Scenario Outline: TryEditor functionality for "Time Complexity" page
   Given The user is on the tryEditor Operations in Data structures-Introduction page
   When The user enters the <code> in text editor and clicks RUN Button
   Then The <alert> should be displayed
    Examples:
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |
    
   @tag7
  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the tryEditor Operations in Data structures-Introduction page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page
    
   @tag8
  Scenario: Verify that user is able to navigate to Data Structures - Introduction  page
    Given The user is in the blank Practice page
    When The user clicks browser back arrow to go to Data Structures - Introduction  page
    Then The user be directed to Data Structures- Introduction Page
    
   @tag9
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Data Structures - Introduction page 
    When The user clicks Sign out 
    Then The user should be redirected to home page with message Logged out successfully