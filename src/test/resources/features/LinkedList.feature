@overall
Feature: Navigation and Functionality for Linked List in dsAlgo Portal

  @ls1
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Linked List Panel or The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls2
  Scenario: Navigate to "Introduction" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Introduction in Linked List page
    Then The user should be redirected to Introduction page

  @ls3
  Scenario: Navigate to "try Editor" page for "Introduction" page
    Given The user is on the Introduction in Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls4
  Scenario Outline: TryEditor functionality for "Introduction" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls5
  Scenario: Navigate to "Practice Questions" Page for "Introduction" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls6
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls7
  Scenario: Navigate to "Creating Linked LIst" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Creating Linked List button
    Then The user should be redirected to Creating Linked List page

  @ls8
  Scenario: Navigate to "try Editor" page for "Creating Linked LIst" page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls9
  Scenario Outline: TryEditor functionality for "Creating Linked LIst" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls10
  Scenario: Navigate to "Practice Questions" Page for "Creating Linked LIst" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls11
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls12
  Scenario: Navigate to "Types of Linked List" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Types of Linked List in Linked List Page
    Then The user should be redirected to Types of Linked List in Linked List page

  @ls13
  Scenario: Navigate to "try Editor" page for "Types of Linked List" page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls14
  Scenario Outline: TryEditor functionality for "Types of Linked List" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls15
  Scenario: Navigate to "Practice Questions" Page for "Types of Linked List" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls16
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls17
  Scenario: Navigate to "Implement Linked List in Python" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Implement Linked List in Python in Linked List Page
    Then The user should be redirected to Implement Linked List in Python in Linked List page

  @ls18
  Scenario: Navigate to "try Editor" page for "Implement Linked List in Python" page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls19
  Scenario Outline: TryEditor functionality for "Implement Linked List in Python" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls20
  Scenario: Navigate to "Practice Questions" Page for "Implement Linked List in Python" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls21
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls22
  Scenario: Navigate to "Traversal" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Traversal in Linked List Page
    Then The user should be redirected to Traversal in Linked List page

  @ls23
  Scenario: Navigate to "try Editor" page for "Traversal" page
    Given The user is on the Traversal page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls24
  Scenario Outline: TryEditor functionality for "Traversal" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls25
  Scenario: Navigate to "Practice Questions" Page for "Traversal" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls26
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls27
  Scenario: Navigate to "Insertion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Insertion in Linked List Page
    Then The user should be redirected to Insertion in Linked List page

  @ls28
  Scenario: Navigate to "try Editor" page for "Insertion" page
    Given The user is on the Insertion page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls29
  Scenario Outline: TryEditor functionality for "Insertion" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls30
  Scenario: Navigate to "Practice Questions" Page for "Insertion" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls31
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls32
  Scenario: Navigate to "Deletion" page
    Given The user is in the Linked List page after Sign in
    When The user clicks Deletion in Linked List Page
    Then The user should be redirected to Deletion in Linked List page

  @ls33
  Scenario: Navigate to "try Editor" page for "Deletion" page
    Given The user is on the Deletion page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @ls34
  Scenario Outline: TryEditor functionality for "Deletion" page
    Given The user is on the tryEditor window in Linked List page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @ls35
  Scenario: Navigate to "Practice Questions" Page for "Deletion" page
    Given The user is on the tryEditor window in Linked List page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @ls36
  Scenario: Navigate to "Linked List" data structure page
    Given The user is in the blank Practice page
    When The user select Linked List item from the drop down menu
    Then The user is directed to Linked List Data Structure Page

  @ls37
  Scenario: Signout from Linked List page and navigated to Home page
    Given The user is in the Linked List page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
