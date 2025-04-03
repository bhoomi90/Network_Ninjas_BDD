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
Feature: Navigation and Functionality for Stacks Data Structures in dsAlgo Portal
 
 @tag1
 Scenario: Navigate to "Stack" data structure page
   Given The user is in the Home page after Sign in
   When The user clicks the Get Started button in Stack Panel / The user select Stack item from the drop down menu
   Then The user be directed to Stack Data Structure Page
   
   
   
   @tag2
 Scenario: Navigate to "Operations in Stack" page
   Given The user is in the Stack page after Sign in
   When The user clicks Operations in Stack button
   Then The user should be redirected to Operations in Stack page
 @tag3
  Scenario: Navigate to "try Editor" page for "Operations in Stack" page
   Given The user is on the Operations in Stack page
   When The user clicks Try Here>>> button in Operations in Stack page
   Then Navigate to try Editor window with a Run button to test
  
  @tag4
  Scenario Outline: TryEditor functionality for "Operations in Stack" page
   Given The user is on the tryEditor Operations in Stack page
   When The user enters the <code> in text editor and clicks RUN Button
   Then The <alert> should be displayed
   
   Examples: 
      | code         | alert                             | 
      | Empty        |     Error message in alert window | 
      | Valid code   |   displayed in the console        |
      | Invalid code | nameerror pop up alert message    | 
   
 
     #@tag5
  #Scenario: Verify that user receives error for invalid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the invalid code in Editor and click the Run Button
   #Then The user should able to see an error message in alert window
  #
      #@tag6
  #Scenario: Verify that user is able to see output for valid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the valid code in Editor and click the Run Button
   #Then The user should able to see output in the console
  #
     
      @tag5
  Scenario: Navigate to "Practice Questions" Page for "Operations in Stack" page
   Given The user is on the tryEditor Operations for Operations in Stack page 
   When The user clicks Practice Questions button following browser back arrow
   Then The user is navigated to Practice Questions page
  
      @tag6
  Scenario: Navigate to "Stack" data structure page
   Given The user is in the blank Practice page
   When The user select Stack item from the drop down menu
   Then The user is redirected to Stack Data Structure Page
   
   
   
   
   
 @tag7
 Scenario: Navigate to "Implementation" page
   Given The user is in the Stack page after Sign in
   When The user clicks Implementation button
   Then The user should be redirected to Implementation page
 @tag8
  Scenario: Navigate to "try Editor" page for "Implementation" page
   Given The user is on the Implementation page
   When The user clicks Try Here>>> button in Implemention page
   Then Navigate to try Editor window with a Run button to test
  
  @tag9
  Scenario Outline: TryEditor functionality for "Implementation" page
   Given The user is on the tryEditor Implemention page
   When The user enters the <code> in text editor and clicks RUN Button
   Then The <alert> should be displayed
   
   Examples: 
      | code         | alert                             | 
      | Empty        |     Error message in alert window | 
      | Valid code   |   displayed in the console        |
      | Invalid code | nameerror pop up alert message    | 
   
 
     #@tag5
  #Scenario: Verify that user receives error for invalid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the invalid code in Editor and click the Run Button
   #Then The user should able to see an error message in alert window
  #
      #@tag6
  #Scenario: Verify that user is able to see output for valid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the valid code in Editor and click the Run Button
   #Then The user should able to see output in the console
  #
     
      @tag10
  Scenario: Navigate to "Practice Questions" Page for "Implementation" page
   Given The user is on the tryEditor Implemention page 
   When The user clicks Practice Questions button following browser back arrow
   Then The user is navigated to Practice Questions page
  
      @tag11
  Scenario: Navigate to "Stack" data structure page
   Given The user is in the blank Practice page
   When The user select Stack item from the drop down menu
   Then The user is redirected to Stack Data Structure Page

 
 
 
  @tag12
 Scenario: Navigate to "Applications" page
   Given The user is in the Stack page after Sign in
   When The user clicks Operations in Stack button
   Then The user should be redirected to Applications in Stack page
 @tag13
  Scenario: Navigate to "try Editor" page for "Applications" page
   Given The user is on the Applications page
   When The user clicks Try Here>>> button in Applications page
   Then Navigate to try Editor window with a Run button to test
  
  @tag14
  Scenario Outline: TryEditor functionality for "Applications" page
   Given The user is on the tryEditor Applications page
   When The user enters the <code> in text editor and clicks RUN Button
   Then The <alert> should be displayed
   
   Examples: 
      | code         | alert                             | 
      | Empty        |     Error message in alert window | 
      | Valid code   |   displayed in the console        |
      | Invalid code | nameerror pop up alert message    | 
   
 
     #@tag5
  #Scenario: Verify that user receives error for invalid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the invalid code in Editor and click the Run Button
   #Then The user should able to see an error message in alert window
  #
      #@tag6
  #Scenario: Verify that user is able to see output for valid python code for "Implementation" page
   #Given The user is in the tryEditor page
   #When The user write the valid code in Editor and click the Run Button
   #Then The user should able to see output in the console
  #
     
      @tag15
  Scenario: Navigate to "Practice Questions" Page for "Applications" page
   Given The user is on the tryEditor Operations for Applications page 
   When The user clicks Practice Questions button following browser back arrow
   Then The user is navigated to Practice Questions page
  
      @tag16
  Scenario: Navigate to "Stack" data structure page
   Given The user is in the blank Practice page
   When The user select Stack item from the drop down menu
   Then The user is redirected to Stack Data Structure Page
 
 
 
 
 
   @tag17
   Scenario: Signout from Stacks page and navigated to Home page
   Given The user is in the Stack page 
   When The user clicks Sign out 
   Then The user should be redirected to home page with message Logged out successfully
   