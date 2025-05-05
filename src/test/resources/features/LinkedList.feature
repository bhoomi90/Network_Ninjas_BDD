@overall
Feature: Navigation and Functionality for Linked List in dsAlgo Portal

 
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Linked List Panel or The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  
  Scenario: Navigate to "Introduction" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Introduction in Linked List page
    Then The user should be redirected to Introduction page

  Scenario: Navigate to "try Editor" page for "Introduction" page
    Given The user is on the Introduction in Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  
  Scenario Outline: TryEditor functionality for "Introduction" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

 
  Scenario: Navigate to "Practice Questions" Page for "Introduction" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  
  Scenario: Navigate to "Creating Linked LIst" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Creating Linked List button
    Then The user should be redirected to Creating Linked List page

  
  Scenario: Navigate to "try Editor" page for "Creating Linked LIst" page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

 
  Scenario Outline: TryEditor functionality for "Creating Linked LIst" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Creating Linked LIst" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

 
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

 
  Scenario: Navigate to "Types of Linked List" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Types of Linked List in Linked List Page
    Then The user should be redirected to Types of Linked List in Linked List page

  
  Scenario: Navigate to "try Editor" page for "Types of Linked List" page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

 
  Scenario Outline: TryEditor functionality for "Types of Linked List" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  
  Scenario: Navigate to "Practice Questions" Page for "Types of Linked List" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

 
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

 
  Scenario: Navigate to "Implement Linked List in Python" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Implement Linked List in Python in Linked List Page
    Then The user should be redirected to Implement Linked List in Python in Linked List page

 
  Scenario: Navigate to "try Editor" page for "Implement Linked List in Python" page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: TryEditor functionality for "Implement Linked List in Python" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |


  Scenario: Navigate to "Practice Questions" Page for "Implement Linked List in Python" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

 
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  Scenario: Navigate to "Traversal" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Traversal in Linked List Page
    Then The user should be redirected to Traversal in Linked List page

 
  Scenario: Navigate to "try Editor" page for "Traversal" page
    Given The user is on the Traversal page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  
  Scenario Outline: TryEditor functionality for "Traversal" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |


  Scenario: Navigate to "Practice Questions" Page for "Traversal" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  
  Scenario: Navigate to "Insertion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Insertion in Linked List Page
    Then The user should be redirected to Insertion in Linked List page


  Scenario: Navigate to "try Editor" page for "Insertion" page
    Given The user is on the Insertion page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test


  Scenario Outline: TryEditor functionality for "Insertion" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

 
  Scenario: Navigate to "Practice Questions" Page for "Insertion" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

 
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

 
  Scenario: Navigate to "Deletion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Deletion in Linked List Page
    Then The user should be redirected to Deletion in Linked List page

  
  Scenario: Navigate to "try Editor" page for "Deletion" page
    Given The user is on the Deletion page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: TryEditor functionality for "Deletion" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  
  Scenario: Navigate to "Practice Questions" Page for "Deletion" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

 
  Scenario: Signout from Linked List page and navigated to Home page
    Given The user is in the Linked List page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
