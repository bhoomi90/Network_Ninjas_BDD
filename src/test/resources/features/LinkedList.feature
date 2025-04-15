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
#@tag
#Feature: Navigation and Functionality for Linked List Data Structures in dsAlgo Portal
#
 #@tag1
 #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the Home page after Sign in
   #When The user clicks the Get Started button in Linked List Panel or The user select Linked List item from the drop down menu
   #Then The user be directed to Linked List Data Structure Page
   #
   #
   #
   #@tag2
 #Scenario: Navigate to "Introduction" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Introduction in Linked List page
   #Then The user should be redirected to Introduction page
 #@tag3
  #Scenario: Navigate to "try Editor" page for "Introduction" page
   #Given The user is on the Introduction in Linked List page
   #When The user clicks Try Here>>> button in Introduction in Linked List page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag4
  #Scenario Outline: TryEditor functionality for "Introduction" page
   #Given The user is on the tryEditor Introduction page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag5
  #Scenario: Navigate to "Practice Questions" Page for "Introduction" page
   #Given The user is on the tryEditor Operations for Introduction page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag6
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
   #
   #
   #
   #
   #
 #@tag7
 #Scenario: Navigate to "Creating Linked LIst" page
   #Given The user is in the Linked LIst page after Sign in
   #When The user clicks Creating Linked LIst button
   #Then The user should be redirected to Creating Linked LIst page
 #@tag8
  #Scenario: Navigate to "try Editor" page for "Creating Linked LIst" page
   #Given The user is on the Creating Linked LIst page
   #When The user clicks Try Here>>> button in Creating Linked LIst page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag9
  #Scenario Outline: TryEditor functionality for "Creating Linked LIst" page
   #Given The user is on the tryEditor Creating Linked LIst page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag10
  #Scenario: Navigate to "Practice Questions" Page for "Creating Linked LIst" page
   #Given The user is on the tryEditor Creating Linked LIst page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag11
  #Scenario: Navigate to "Linked LIst" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked LIst item from the drop down menu
   #Then The user is redirected to Linked LIst Data Structure Page
#
 #
 #
 #
  #@tag12
 #Scenario: Navigate to "Types of Linked List" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Types of Linked List in Linked List Page
   #Then The user should be redirected to Types of Linked List in Linked List page
 #@tag13
  #Scenario: Navigate to "try Editor" page for "Types of Linked List" page
   #Given The user is on the Types of Linked List page
   #When The user clicks Try Here>>> button in Types of Linked List page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag14
  #Scenario Outline: TryEditor functionality for "Types of Linked List" page
   #Given The user is on the tryEditor Types of Linked List page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag15
  #Scenario: Navigate to "Practice Questions" Page for "Types of Linked List" page
   #Given The user is on the tryEditor Operations for Types of Linked List page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag16
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
 #
 #
 #
 #
 #
   #@tag17
 #Scenario: Navigate to "Implement Linked List in Python" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Implement Linked List in Python in Linked List Page
   #Then The user should be redirected to Implement Linked List in Python in Linked List page
 #@tag18
  #Scenario: Navigate to "try Editor" page for "Implement Linked List in Python" page
   #Given The user is on the Implement Linked List in Python page
   #When The user clicks Try Here>>> button in Implement Linked List in Python page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag19
  #Scenario Outline: TryEditor functionality for "Implement Linked List in Python" page
   #Given The user is on the tryEditor Implement Linked List in Python page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag20
  #Scenario: Navigate to "Practice Questions" Page for "Implement Linked List in Python" page
   #Given The user is on the tryEditor Operations for Types of Linked List page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag21
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
   #
   #
   #
   #
     #@tag22
 #Scenario: Navigate to "Traversal" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Traversal in Linked List Page
   #Then The user should be redirected to Traversal in Linked List page
 #@tag23
  #Scenario: Navigate to "try Editor" page for "Traversal" page
   #Given The user is on the Traversal page
   #When The user clicks Try Here>>> button in Traversal page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag24
  #Scenario Outline: TryEditor functionality for "Traversal" page
   #Given The user is on the tryEditor Traversal page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag25
  #Scenario: Navigate to "Practice Questions" Page for "Traversal" page
   #Given The user is on the tryEditor Operations for Traversal page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag26
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
   #
   #
   #
   #
        #@tag27
 #Scenario: Navigate to "Insertion" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Insertion in Linked List Page
   #Then The user should be redirected to Insertion in Linked List page
 #@tag28
  #Scenario: Navigate to "try Editor" page for "Insertion" page
   #Given The user is on the Insertion page
   #When The user clicks Try Here>>> button in Insertion page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag29
  #Scenario Outline: TryEditor functionality for "Insertion" page
   #Given The user is on the tryEditor Insertion page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag30
  #Scenario: Navigate to "Practice Questions" Page for "Insertion" page
   #Given The user is on the tryEditor Operations for Insertion page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag31
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
   #
   #
   #
        #@tag32
 #Scenario: Navigate to "Deletion" page
   #Given The user is in the Linked List page after Sign in
   #When The user clicks Deletion in Linked List Page
   #Then The user should be redirected to Deletion in Linked List page
 #@tag33
  #Scenario: Navigate to "try Editor" page for "Deletion" page
   #Given The user is on the Deletion page
   #When The user clicks Try Here>>> button in Deletion page
   #Then Navigate to try Editor window with a Run button to test
  #
  #@tag34
  #Scenario Outline: TryEditor functionality for "Deletion" page
   #Given The user is on the tryEditor Deletion page
   #When The user enters the <code> in text editor and clicks RUN Button
   #Then The <alert> should be displayed
   #
   #Examples: 
      #| code         | alert                             | 
      #| Empty        |     Error message in alert window | 
      #| Valid code   |   displayed in the console        |
      #| Invalid code | nameerror pop up alert message    | 
   #
 #
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
     #
      #@tag35
  #Scenario: Navigate to "Practice Questions" Page for "Deletion" page
   #Given The user is on the tryEditor Operations for Deletion page 
   #When The user clicks Practice Questions button following browser back arrow
   #Then The user is navigated to Practice Questions page
  #
      #@tag36
  #Scenario: Navigate to "Linked List" data structure page
   #Given The user is in the blank Practice page
   #When The user select Linked List item from the drop down menu
   #Then The user is redirected to Linked List Data Structure Page
   #
   #
   #
   #
   #
   #
   #
   #@tag37
   #Scenario: Signout from Linked List page and navigated to Home page
   #Given The user is in the Linked List page 
   #When The user clicks Sign out 
   #Then The user should be redirected to home page with message Logged out successfully
