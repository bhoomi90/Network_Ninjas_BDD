@tag
Feature: Testing Queue feature in DSPortal app
  User will be able to understand different topics and try python code

  @tag1
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Queue Panel / The user select Queue item from the drop down menu
    Then The user be directed to "Queue" Data Structure Page

  @tag2
  Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
    Given The user is in the "Queue" page after Sign in
    When The user clicks "Implementation of Queue in Python" button
    Then The user should be redirected to "Implementation of Queue in Python" page

  @tag3
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of Queue in Python" page
    Given The user is on the "Implementation of Queue in Python" page
    When The user clicks "Try Here" button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @tag4
  Scenario: Verify that user receives error when click on Run button without entering code for "Introduction" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @tag5
  Scenario: Verify that user receives error for invalid python code for "Implementation of Queue in Python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  @tag6
  Scenario: Verify that user is able to see output for valid python code for "Implementation of Queue in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @tag7
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of Queue in Python" page
    Given The user is in the "Implementation of Queue in Python" page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice Questions" page

  @tag8
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank "Practice" page
    When The user select Queue item from the drop down menu
    Then The user be directed to "Queue" Data Structure Page

  @tag9
  Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
    Given The user is in the "Queue" page after Sign in
    When The user clicks "Implementation using collections.deque" button
    Then The user should be redirected to "Implementation using collections.deque" page

  @tag10
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page
    Given The user is on the "Implementation using collections.deque" page
    When The user clicks "Try Here" button in Implementation using collections.deque page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @tag11
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation using collections.deque" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @tag12
  Scenario: Verify that user receives error for invalid python code for "Implementation using collections.deque" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  @tag13
  Scenario: Verify that user is able to see output for valid python code for "Implementation using collections.deque" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @tag14
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using collections.deque" page
    Given The user is in the "Implementation using collections.deque" page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice Questions" page

  @tag15
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank "Practice" page
    When The user select Queue item from the drop down menu
    Then The user be directed to "Queue" Data Structure Page

  @tag16
  Scenario: Verify that user is able to navigate to "Implementation using array" page
    Given The user is in the "Queue" page after Sign in
    When The user clicks "Implementation using array" button
    Then The user should be redirected to "Implementation using array" page

  @tag17
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using array" page
    Given The user is on the "Implementation using array" page
    When The user clicks "Try Here" button in Implementation using collections.deque page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @tag18
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation using array" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @tag19
  Scenario: Verify that user receives error for invalid python code for "Implementation using array" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  @tag20
  Scenario: Verify that user is able to see output for valid python code for "Implementation using array" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @tag21
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using array" page
    Given The user is in the "Implementation using array" page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice Questions" page

  @tag22
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank "Practice" page
    When The user select Queue item from the drop down menu
    Then The user be directed to "Queue" Data Structure Page

  @tag23
  Scenario: Verify that user is able to navigate to "Queue Operations" page
    Given The user is in the "Queue" page after Sign in
    When The user clicks "Queue Operations" button
    Then The user should be redirected to "Queue Operations" page

  @tag24
  Scenario: Verify that user is able to navigate to "try Editor" page for "Queue Operations" page
    Given The user is on the "Queue Operations" page
    When The user clicks "Try Here" button in Queue Operations page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @tag25
  Scenario: Verify that user receives error when click on Run button without entering code for "Queue Operations" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @tag26
  Scenario: Verify that user receives error for invalid python code for "Queue Operations" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  @tag27
  Scenario: Verify that user is able to see output for valid python code for "Queue Operations" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @tag28
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Queue Operations" page
    Given The user is in the "Queue Operations" page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice Questions" page

  @tag29
  Scenario: Verify that user is able to navigate to "Queue" data structure page
    Given The user is in the blank "Practice" page
    When The user select Queue item from the drop down menu
    Then The user be directed to "Queue" Data Structure Page

  @tag30
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Queue page
    When The user clicks "Sign out"
    Then The user should be redirected to home page with message "Logged out successfully"
