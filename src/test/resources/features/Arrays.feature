@tag
Feature: Navigation and Functionality for Array Data Structures in dsAlgo Portal

  @tag1
  Scenario: Navigate to "Arrays in Python" page
    Given the user is signed in to dsAlgo Portal and is on the "Array" page
    When the user clicks the "Arrays in Python" button
    Then the user should be redirected to the "Arrays in Python" page

  @tag2
  Scenario: Access "Try Editor" page for "Arrays in Python"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays in Python" page
    When the user clicks the "Try Here" button in the Arrays in Python page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code

  @tag3
  Scenario Outline: "Arrays in Python" TryEditor Functionality
    Given The user is on the Try Editor Array page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <message> should be displayed

    Examples: 
      | code         | Message                         |
      | Empty        | Error message in the window     |
      | valid code   | Output displayed in the console |
      | Invalid code | nameerror pop up alert message  |

  @tag4
  Scenario: Navigate to "Practice Questions" page for Arrays in Python
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page

  @tag5
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Arrays in Python page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag6
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is on the practice question editor page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <message> should be displayed

    Examples: 
      | code         | message                         |
      | valid code   | Output displayed in the console |
      | Invalid code | error message pop in the window |

  @tag7
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Arrays in Python" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag8
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is on the practice question editor page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <message> should be displayed

    Examples: 
      | code         | message                         |
      | valid code   | Output displayed in the console |
      | Invalid code | error message pop in the window |

  @tag9
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag10
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag11
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag12
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag13
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag14
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag15
  Scenario: Navigate to "Arrays Using List" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Arrays Using List" button
    Then the user should be redirected to the "Arrays Using List" page

  @tag16
  Scenario: Access "Try Editor" page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page containing a Try Editor with a Run button

    #Examples:
  #| code        | Message |
  #| Empty       | Error message in the window|
  #|valid code   | Output displayed in the console |
  #|Invalid code | nameerror pop up alert message  |
  
  @tag17
  Scenario: Navigate to "Practice Questions" page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Array" page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page

  @tag18
  Scenario: Navigate to "Search the Array" question page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag19
  Scenario: Handle invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window

  @tag20
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console

  @tag21
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag22
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag23
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag24
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag25
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag26
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag27
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag28
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag29
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag30
  Scenario: Navigate to "Basic Operations in Lists" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Basic Operations in Lists" button
    Then the user should be redirected to the "Basic Operations in Lists" page

  @tag31
  Scenario: Access "Try Editor" page for "Basic Operations in Lists"
    Given the user is signed in to dsAlgo Portal and is on the "Basic Operations in Lists" page
    When the user clicks the "Try Here" button in the Basic Operations in Lists page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code

  #Examples:
  #| code        | Message |
  #| Empty       | Error message in the window|
  #|valid code   | Output displayed in the console |
  #|Invalid code | nameerror pop up alert message  |
  @tag32
  Scenario: Navigate to "Practice Questions" page for Basic Operations in Lists
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page

  @tag33
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Basic Operations in Lists page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag34
  Scenario: Error for invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window

  @ta35
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console

  @tag36
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Basic Operations in Lists" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag37
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag38
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag39
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag40
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag41
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag42
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag43
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag44
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag45
  Scenario: Navigate to "Applications of Array" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Applications of Array" button
    Then the user should be redirected to the "Applications of Array" page

  @tag46
  Scenario: Access "Try Editor" page for "Applications of Array"
    Given the user is signed in to dsAlgo Portal and is on the "Applications of Array" page
    When the user clicks the "Try Here" button in the Applications of Array page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code

  @tag47
  Scenario Outline: "Arrays in Python" TryEditor Functionality
    Given The user is on the Try Editor Array page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <message> should be displayed

    Examples: 
      | code         | Message                         |
      | Empty        | Error message in the window     |
      | valid code   | Output displayed in the console |
      | Invalid code | nameerror pop up alert message  |

  @tag49
  Scenario: Handle error for running without entering code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user clicks the Run button without entering any code in the Editor
    Then the user should see an error message in an alert window

  @tag50
  Scenario: Handle error for running invalid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window

  @tag51
  Scenario: Output for valid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console

  @tag52
  Scenario: Navigate to "Practice Questions" page for Applications of Array
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page

  @tag53
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Applications of Array page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag54
  Scenario: Error for invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window

  @tag55
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console

  @tag56
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Applications of Array" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag57
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag58
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag59
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag60
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag61
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag62
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag63
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag64
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag65
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Queue page
    When The user clicks "Sign out"
    Then The user should be redirected to home page with message "Logged out successfully"
