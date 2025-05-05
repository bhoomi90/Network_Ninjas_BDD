@overall
Feature: Navigation and Functionality for Stacks in dsAlgo Portal

  @stack1
  Scenario: Navigate to "Stack" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Stack Panel or The user select Stack item from the drop down menu
    Then The user is directed to Stack Data Structure Page

  @stack2
  Scenario: Navigate to "Operations in Stack" page
    Given The user is in the Stack page after Sign in
    When The user clicks Operations in Stack button
    Then The user should be redirected to Operations in Stack page

  @stack3
  Scenario: Navigate to "try Editor" page for "Operations in Stack" page
    Given The user is on the Operations in Stack page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @stack4
  Scenario Outline: TryEditor functionality for "Operations in Stack" page
    Given The user is on the tryEditor window in Stack page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @stack5
  Scenario: Navigate to "Practice Questions" Page for "Operations in Stack" page
    Given The user is on the tryEditor window in Stack page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @stack6
  Scenario: Navigate to "Stack" data structure page
    Given The user is in the blank Practice page
    When The user select Stack item from the drop down menu
    Then The user is directed to Stack Data Structure Page

  @stack7
  Scenario: Navigate to "Implementation" page
    Given The user is in the Stack page after Sign in
    When The user clicks Implementation button
    Then The user should be redirected to Implementation page

  @stack8
  Scenario: Navigate to "try Editor" page for "Implementation" page
    Given The user is on the Implementation page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @stack9
  Scenario Outline: TryEditor functionality for "Implementation" page
    Given The user is on the tryEditor window in Stack page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @stack10
  Scenario: Navigate to "Practice Questions" Page for "Implementation" page
    Given The user is on the tryEditor window in Stack page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @stack11
  Scenario: Navigate to "Stack" data structure page
    Given The user is in the blank Practice page
    When The user select Stack item from the drop down menu
    Then The user is directed to Stack Data Structure Page

  @stack12
  Scenario: Navigate to "Applications" page
    Given The user is in the Stack page after Sign in
    When The user clicks Applications button
    Then The user should be redirected to Applications in Stack page

  @stack13
  Scenario: Navigate to "try Editor" page for "Applications" page
    Given The user is on the Applications page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @stack14
  Scenario Outline: TryEditor functionality for "Applications" page
    Given The user is on the tryEditor window in Stack page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @stack15
  Scenario: Navigate to "Practice Questions" Page for "Applications" page
    Given The user is on the tryEditor window in Stack page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @stack16
  Scenario: Navigate to "Stack" data structure page
    Given The user is in the blank Practice page
    When The user select Stack item from the drop down menu
    Then The user is directed to Stack Data Structure Page

  @stack17
  Scenario: Signout from Stacks page and navigated to Home page
    Given The user is in the Stack page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
