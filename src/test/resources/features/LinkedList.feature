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
Feature: Testing Linked List feature in DSPortal app
 User will be able to understand different topics and try python code
 @tag1
 Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the Home page after Sign in
   When The user clicks the Get Started button in Linked List Panel / The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page
 @tag2
 Scenario: Verify that user is able to navigate to "Introduction" page
   Given The user is in the Linked List page after Sign in
   When The user clicks "Introduction" button
   Then The user should be redirected to "Introduction" page
 @tag3
  Scenario: Verify that user is able to navigate to "try Editor" page for "Introduction" page
   Given The user is on the Introduction page
   When The user clicks Try Here button in Introduction page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag4
  Scenario: Verify that user receives error when click on Run button without entering code for "Introduction" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag5
  Scenario: Verify that user receives error for invalid python code for Introduction page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag6
  Scenario: Verify that user is able to see output for valid python code for Introduction page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag7
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for Introduction page
   Given The user is in the Introduction page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag8
  Scenario: Verify that user is able to navigate to Linked List data structure page
   Given The user is in the blank "Practice" page
   When The user select Stack item from the drop down menu
   Then The user be directed to Linked List Data Structure Page



 @tag9
 Scenario: Verify that user is able to navigate to Creating Linked List page
   Given The user is in the Linked List page after Sign in
   When The user clicks Creating Linked List button
   Then The user should be redirected to Creating Linked List page
 @tag10
  Scenario: Verify that user is able to navigate to "try Editor" page for Creating Linked List page
   Given The user is on the Creating Linked List page
   When The user clicks "Try Here" button in Operations in Stack page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag11
  Scenario: Verify that user receives error when click on Run button without entering code for Creating Linked List page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag12
  Scenario: Verify that user receives error for invalid python code for Creating Linked List page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag13
  Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag14
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for Creating Linked List page
   Given The user is in the Creating Linked List page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag15
  Scenario: Verify that user is able to navigate to Linked List data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to Linked List Data Structure Page
   
   
   
    @tag16
 Scenario: Verify that user is able to navigate to "Types of Linked List" page
   Given The user is in the "Linked List" page after Sign in
   When The user clicks "Types of Linked List" button
   Then The user should be redirected to "Types of Linked List" page
 @tag17
  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Linked List" page
   Given The user is on the "Types of Linked List" page
   When The user clicks "Try Here" button in Operations in Linked List page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag18
  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Linked List" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag19
  Scenario: Verify that user receives error for invalid python code for "Types of Linked List" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag20
  Scenario: Verify that user is able to see output for valid python code for "Types of Linked List" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag21
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Linked List" page
   Given The user is in the "Types of Linked List" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag22
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page
   
   
   
      @tag23
 Scenario: Verify that user is able to navigate to "Implement Linked List in Python" page
   Given The user is in the Linked List page after Sign in
   When The user clicks "Implement Linked List in Python" button
   Then The user should be redirected to "Implement Linked List in Python" page
 @tag24
  Scenario: Verify that user is able to navigate to try Editor page for "Implement Linked List in Python" page
   Given The user is on the "Implement Linked List in Python" page
   When The user clicks "Try Here" button in Operations in Linked List page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag25
  Scenario: Verify that user receives error when click on Run button without entering code for "Implement Linked List in Python" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag26
  Scenario: Verify that user receives error for invalid python code for "Implement Linked List in Python" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag27
  Scenario: Verify that user is able to see output for valid python code for "Implement Linked List in Python" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag28
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implement Linked List in Python" page
   Given The user is in the "Implement Linked List in Python" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag29
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page
   
   
         @tag30
 Scenario: Verify that user is able to navigate to "Traversal" page
   Given The user is in the "Linked List" page after Sign in
   When The user clicks "Traversal" button
   Then The user should be redirected to "Traversal" page
 @tag31
  Scenario: Verify that user is able to navigate to try Editor page for "Traversal" page
   Given The user is on the "Traversal" page
   When The user clicks "Try Here" button in Operations in Linked List page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag32
  Scenario: Verify that user receives error when click on Run button without entering code for "Traversal" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag33
  Scenario: Verify that user receives error for invalid python code for "Traversal" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag34
  Scenario: Verify that user is able to see output for valid python code for "Traversal" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag35
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Traversal" page
   Given The user is in the "Traversal" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag36
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page
   
   
           @tag37
 Scenario: Verify that user is able to navigate to "Insertion" page
   Given The user is in the "Linked List" page after Sign in
   When The user clicks "Insertion" button
   Then The user should be redirected to "Insertion" page
 @tag38
  Scenario: Verify that user is able to navigate to try Editor page for "Insertion" page
   Given The user is on the "Insertion" page
   When The user clicks "Try Here" button in Operations in Linked List page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag39
  Scenario: Verify that user receives error when click on Run button without entering code for "Insertion" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag40
  Scenario: Verify that user receives error for invalid python code for "Insertion" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag41
  Scenario: Verify that user is able to see output for valid python code for "Insertion" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag42
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Insertion" page
   Given The user is in the "Insertion" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag43
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page 
   
   
   
      @tag44
 Scenario: Verify that user is able to navigate to "Deletion" page
   Given The user is in the "Linked List" page after Sign in
   When The user clicks "Deletion" button
   Then The user should be redirected to "Deletion" page
 @tag45
  Scenario: Verify that user is able to navigate to try Editor page for "Deletion" page
   Given The user is on the "Deletion" page
   When The user clicks "Try Here" button in Operations in Linked List page
   Then The user should be redirected to a page having an try Editor with a Run button to test
  
  @tag46
  Scenario: Verify that user receives error when click on Run button without entering code for "Deletion" page
   Given The user is in the tryEditor page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
 
     @tag47
  Scenario: Verify that user receives error for invalid python code for "Deletion" page
   Given The user is in the tryEditor page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
  
      @tag48
  Scenario: Verify that user is able to see output for valid python code for "Deletion" page
   Given The user is in the tryEditor page
   When The user write the valid code in Editor and click the Run Button
   Then The user should able to see output in the console
  
      @tag49
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Deletion" page
   Given The user is in the "Deletion" page after Sign in
   When The user clicks "Practice Questions" button
   Then The user should be redirected to "Practice Questions" page
  
      @tag50
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
   Given The user is in the blank "Practice" page
   When The user select Linked List item from the drop down menu
   Then The user be directed to "Linked List" Data Structure Page 
   
   
   @tag51
   Scenario: Verify that user able to sign out successfully
   Given The user is in the Stack page 
   When The user clicks Sign out 
   Then The user should be redirected to home page with message Logged out successfully
