@tag
Feature: Testing Graph feature in DSPortal app
  User will be able to understand different topics and try python code

  @tag1
  Scenario: Verify that user is able to navigate to "Graph" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Graph Panel or The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @graph
  Scenario: Navigate to Graph page
    Given The user is in the Graph Introduction Page after Sign in
    When The user clicks the Graph link in Graph Introduction page
    Then The user be directed to Graph Page

  @graphtryhere
  Scenario: Verify that user is able to navigate to try Editor page for Graph page
    Given The user is in the Graph page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @graphtxteditor
  Scenario Outline: Graph tryEditor Functionality
    Given The user is on the tryEditor window in Graph page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @backtobinsea
  Scenario: Navigate to "Practice Questions" Page for "Graph" page
    Given The user is on the tryEditor window in Graph page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @tag7
  Scenario: Navigate to "Graph" data structure page
    Given The user is in the blank Practice page
    When The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @grarep
  Scenario: Navigate to Graph Representations page
    Given The user is in the Graph Introduction Page after Sign in
    When The user clicks the Graph Representations link in Graph Introduction page
    Then The user be directed to Graph Representations Page

  @greptryhere
  Scenario: Navigate to Graph Representations tryEditor window
    Given The user is in the Graph Representations page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @greptxteditor
  Scenario Outline: Graph Representations tryEditor Functionality
    Given The user is on the tryEditor window in Graph page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @practquesGraRep
  Scenario: Navigate to "Practice Questions" Page for "Graph Representations" page
    Given The user is on the tryEditor window in Graph page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @backtogra
  Scenario: Navigate to Graph data structure page
    Given The user is in the blank Practice page
    When The user select Graph item from the drop down menu
    Then The user is directed to Graph Data Structure Page

  @signout
  Scenario: signout from Graph page and navigated to Home page
    Given The user is in the Graph page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully