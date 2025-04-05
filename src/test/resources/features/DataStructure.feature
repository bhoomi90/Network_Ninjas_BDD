#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Data Structure-Introduction  page features
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in
    When The user clicks the Getting Started button in Data Structures - Introduction OR The user select Data Structures - Introduction item from the drop down menu
    Then The user be directed to Data Structures- Introduction Page 
    
   @tag2
  Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures - Introduction page
    When The user clicks Time Complexity button
    Then The user should be redirected to Time Complexity of Data structures-Introduction
    
   @tag3
  Scenario: Verify that user is able to navigate to try Editor page
    Given The user is in the Time Complexity page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
   @tag4
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window
    
   @tag5
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
    
   @tag6
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console
    
   @tag7
  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Time Complexity page
    When The user clicks the Practice Questions button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
    
   @tag8
  Scenario: Verify that user is able to navigate to Data Structures - Introduction  page
    Given The user is in the blank Practice page
    When The user selected item from the drop down menu
    Then The user be directed to selected item Page
    
   @tag9
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Graph page 
    When The user clicks Sign out 
    Then The user should be redirected to home page with message Logged out successfully
    
    #@tag34
  #Scenario Outline: TryEditor functionality for "Time Complexity" page
   #Given The user is on the tryEditor Time Complexity page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | name_error pop up alert message   | 
    
    