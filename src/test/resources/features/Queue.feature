@overall
Feature: Testing Queue feature in DSPortal app
  User will be able to understand different topics and try python code

  @Queue1
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Queue Panel or The user select Queue item from the drop down menu
    Then The user be directed to Queue Data Structure Page

  @Queue2
  Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation of Queue in Python button
    Then The user should be redirected to Implementation of Queue in Python page

  @Queue3
  Scenario: Verify that user is able to navigate to try Editor page for Implementation of Queue in Python page
    Given The user is on the Implementation of Queue in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Queue4
  Scenario Outline: Verify TryEditor functionality for  Implementation of Queue in Python page
    Given The user is on the tryEditor window in queue page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Queue5
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of Queue in Python" page
    Given The user is on the tryEditor window in queue page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Queue6
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank Practice page
    When The user select Queue item from the drop down menu
    Then The user is redirected to Queue Data Structure Page

  @Queue7
  Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using collections.deque button
    Then The user should be redirected to Implementation using collections.deque page

  @Queue8
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page
    Given The user is on the Implementation using collections.deque page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Queue9
  Scenario Outline: Verify TryEditor functionality for  "Implementation using collections.deque" page
    Given The user is on the tryEditor window in queue page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Queue10
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using collections.deque" page
    Given The user is on the tryEditor window in queue page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Queue11
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank Practice page
    When The user select Queue item from the drop down menu
    Then The user is redirected to Queue Data Structure Page

  @Queue12
  Scenario: Verify that user is able to navigate to "Implementation using array" page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using array button
    Then The user should be redirected to Implementation using array page

  @Queue13
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using array" page
    Given The user is on the Implementation using array page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Queue14
  Scenario Outline: Verify TryEditor functionality for  "Implementation using array" page
    Given The user is on the tryEditor window in queue page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Queue15
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using array" page
    Given The user is on the tryEditor window in queue page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Queue16
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank Practice page
    When The user select Queue item from the drop down menu
    Then The user is redirected to Queue Data Structure Page

  @Queue17
  Scenario: Verify that user is able to navigate to "Queue Operations" page
    Given The user is in the Queue page after Sign in
    When The user clicks Queue Operations button
    Then The user should be redirected to Queue Operations page

  @Queue18
  Scenario: Verify that user is able to navigate to "try Editor" page for "Queue Operations" page
    Given The user is on the Queue Operations page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Queue19
  Scenario Outline: Verify TryEditor functionality for  "Queue Operations" page
    Given The user is on the tryEditor window in queue page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Queue20
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Queue Operations" page
    Given The user is on the tryEditor window in queue page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Queue21
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank Practice page
    When The user select Queue item from the drop down menu
    Then The user is redirected to Queue Data Structure Page

  @Queue22
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Queue page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
