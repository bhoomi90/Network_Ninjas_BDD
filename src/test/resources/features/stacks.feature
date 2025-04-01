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
Feature: Testing Stack feature in DSPortal app
 User will be able to understand different topics and try python code
 @tag1
 Scenario: Verify that user is able to navigate to "Stack" data structure page
   Given The user is in the Home page after Sign in
   When The user clicks the Get Started button in Stack Panel / The user select Stack item from the drop down menu
   Then The user be directed to "Stack" Data Structure Page
 @tag2
 Scenario: Verify that user is able to navigate to "Implementation" page
   Given The user is in the "Stack" page after Sign in
   When The user clicks "Implementation" button
   Then The user should be redirected to "Implementation" page
 @tag3
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
   Given The user is on the "Implementation" page
   When The user clicks "Try Here" button in Introduction page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag4
  Scenario: Verify that user receives error when click on Run button without entering code for "Introduction" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag5
  Scenario: Verify that user receives error for invalid python code for "Implementation" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag6
  Scenario: Verify that user is able to see output for valid python code for "Implementation" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag7
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation" page
   Given The user is in the "Implementation" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag8
  Scenario: Verify that user is able to navigate to "Stack" data structure page
   Given The user is in the blank "Practice" page
   When The user select Stack item from the drop down menu
   Then The user be directed to "Stack" Data Structure Page



 @tag9
 Scenario: Verify that user is able to navigate to "Operations in Stack" page
   Given The user is in the "Stack" page after Sign in
   When The user clicks "Operations in Stack" button
   Then The user should be redirected to "Operations in Stack" page
 @tag10
  Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page
   Given The user is on the "Operations in Stack" page
   When The user clicks "Try Here" button in Operations in Stack page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag11
  Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag12
  Scenario: Verify that user receives error for invalid python code for "Operations in Stack" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag13
  Scenario: Verify that user is able to see output for valid python code for "Operations in Stack" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag14
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Operations in Stack" page
   Given The user is in the "Operations in Stack" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag15
  Scenario: Verify that user is able to navigate to "Stack" data structure page
   Given The user is in the blank "Practice" page
   When The user select Stack item from the drop down menu
   Then The user be directed to "Stack" Data Structure Page
   
   
   
    @tag16
 Scenario: Verify that user is able to navigate to "Applications" page
   Given The user is in the "Stack" page after Sign in
   When The user clicks "Applications" button
   Then The user should be redirected to "Applications" page
 @tag17
  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications" page
   Given The user is on the "Applications" page
   When The user clicks "Try Here" button in Operations in Stack page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag18
  Scenario: Verify that user receives error when click on Run button without entering code for "Applications" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag19
  Scenario: Verify that user receives error for invalid python code for "Applications" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag20
  Scenario: Verify that user is able to see output for valid python code for "Applications" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag21
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications" page
   Given The user is in the "Applications" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag22
  Scenario: Verify that user is able to navigate to "Stack" data structure page
   Given The user is in the blank "Practice" page
   When The user select Stack item from the drop down menu
   Then The user be directed to "Stack" Data Structure Page
   
   
   @tag23
   Scenario: Verify that user able to sign out successfully
   Given The user is in the Stack page 
   When The user clicks "Sign out" 
   Then The user should be redirected to home page with message "Logged out successfully"
   