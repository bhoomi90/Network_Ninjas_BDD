@overall
Feature: Navigation and Functionality for Graph in dsAlgo Portal

  @Graph1
  Scenario: Verify that user is able to navigate to "Graph" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Graph Panel or The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @Graph2
  Scenario: Navigate to Graph page
    Given The user is in the Graph Introduction Page after Sign in
    When The user clicks the Graph link in Graph Introduction page
    Then The user be directed to Graph Page

  @Graph3
  Scenario: Verify that user is able to navigate to try Editor page for Graph page
    Given The user is in the Graph page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Graph4
  Scenario Outline: Graph tryEditor Functionality
    Given The user is on the tryEditor window in Graph page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Graph5
  Scenario: Navigate to "Practice Questions" Page for "Graph" page
    Given The user is on the tryEditor window in Graph page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Graph6
  Scenario: Navigate to "Graph" data structure page
    Given The user is in the blank Practice page
    When The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @Graph7
  Scenario: Navigate to Graph Representations page
    Given The user is in the Graph Introduction Page after Sign in
    When The user clicks the Graph Representations link in Graph Introduction page
    Then The user be directed to Graph Representations Page

  @Graph8
  Scenario: Navigate to Graph Representations tryEditor window
    Given The user is in the Graph Representations page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Graph9
  Scenario Outline: Graph Representations tryEditor Functionality
    Given The user is on the tryEditor window in Graph page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Graph10
  Scenario: Navigate to "Practice Questions" Page for "Graph Representations" page
    Given The user is on the tryEditor window in Graph page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Graph11
  Scenario: Navigate to Graph data structure page
    Given The user is in the blank Practice page
    When The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @Graph12
  Scenario: signout from Graph page and navigated to Home page
    Given The user is in the Graph page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
