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

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
  @tag
  Feature: Navigation and Functionality for Array Data Structures in dsAlgo Portal
  @tag1
  Scenario: Navigate to "Array" Data Structure page
    Given the user is signed in to dsAlgo Portal and is on the Home page
    When the user clicks the "Getting Started" button in Array Panel or selects Array item from the drop-down menu
    Then the user should be directed to the "ARRAY" Data Structure Page

  @tag2
  Scenario: Navigate to "Arrays in Python" page
    Given the user is signed in to dsAlgo Portal and is on the "Array" page
    When the user clicks the "Arrays in Python" button
    Then the user should be redirected to the "Arrays in Python" page

  @tag3
  Scenario: Access "Try Editor" page for "Arrays in Python"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays in Python" page
    When the user clicks the "Try Here" button in the Arrays in Python page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code
    
   @tag4
   Scenario Outline: "Arrays in Python" TryEditor Functionality
     Given The user is on the Try Editor Array page
     When The user enters the <code> in Text Editor and clicks RUN button
     Then The <message> should be displayed
   Examples: 
      | code        | Message | 
      | Empty       | Error message in the window| 
      |valid code   | Output displayed in the console | 
      |Invalid code | nameerror pop up alert message  |
    
  #@tag4
  #Scenario: Handle error for running without entering code in Try Editor
    #Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    #When the user clicks the Run button without entering any code in the Editor
    #Then the user should see an error message in an alert window
#
  #@tag5
  #Scenario: Handle error for running invalid Python code in Try Editor
    #Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    #When the user enters invalid Python code in the Editor and clicks the Run button
    #Then the user should see an error message in an alert window
    #
  #@tag6
  #Scenario: Output for valid Python code in Try Editor
    #Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    #When the user enters valid Python code in the Editor and clicks the Run button
    #Then the user should see the output in the console
    
  @tag7
  Scenario: Navigate to "Practice Questions" page for Arrays in Python
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page
    
  @tag8
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Arrays in Python page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons
  
  #@tag9
  #Scenario: Error for invalid Python code on "Search the Array" question
    #Given the user is signed in to dsAlgo Portal and is on the practice question editor
    #When the user enters invalid Python code in the Editor and clicks the Run button
    #Then the user should see an error message in an alert window
  #
  #@tag10
  #Scenario: Output for valid Python code on "Search the Array" question
    #Given the user is signed in to dsAlgo Portal and is on the practice question editor
    #When the user enters valid Python code in the Editor and clicks the Run button
    #Then the user should see the output in the console
    @tag3
     Scenario Outline: Validating "Search the Array"  practice question editor Functionality
     Given The user is on the practice question editor page
     When The user enters the <code> in Text Editor and clicks RUN button
     Then The <message> should be displayed
   Examples: 
      | code        | message |  
      |valid code   | Output displayed in the console | 
      |Invalid code | error message pop in the window |  
    
  @tag11
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Arrays in Python" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag12
   Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
     Given The user is on the practice question editor page
     When The user enters the <code> in Text Editor and clicks RUN button
     Then The <message> should be displayed
   Examples: 
      | code        | message |  
      |valid code   | Output displayed in the console | 
      |Invalid code | error message pop in the window | 

  @tag14
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag15
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window
  
  @tag16
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag17
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag18
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag19
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag20
  Scenario: Navigate to "Arrays Using List" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Arrays Using List" button
    Then the user should be redirected to the "Arrays Using List" page
 
  @tag21
  Scenario: Access "Try Editor" page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page containing a Try Editor with a Run button

  @tag22
  Scenario: Handle missing code in Try Editor for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user clicks the Run button without entering any code in the Editor
    Then an error message should be displayed in an alert window
 
  @tag23
  Scenario: Handle invalid Python code for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag24
  Scenario: Display output for valid Python code for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag25
  Scenario: Navigate to "Practice Questions" page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Array" page after signing in
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page
 
  @tag26
  Scenario: Navigate to "Search the Array" question page for "Arrays Using List"
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons
    
  @tag27
  Scenario: Handle invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window
  
  @tag28
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console
    
  @tag29
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Arrays Using List" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag30
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag31
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag32
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag33
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window
  
  @tag34
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag35
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag36
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag37
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag38
  Scenario: Navigate to "Basic Operations in Lists" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Basic Operations in Lists" button
    Then the user should be redirected to the "Basic Operations in Lists" page
    
  @tag39
  Scenario: Access "Try Editor" page for "Basic Operations in Lists"
    Given the user is signed in to dsAlgo Portal and is on the "Basic Operations in Lists" page
    When the user clicks the "Try Here" button in the Basic Operations in Lists page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code
    
  @tag40
  Scenario: Handle error for running without entering code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user clicks the Run button without entering any code in the Editor
    Then the user should see an error message in an alert window

  @tag41
  Scenario: Handle error for running invalid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window
    
  @tag42
  Scenario: Output for valid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console
    
  @tag43
  Scenario: Navigate to "Practice Questions" page for Basic Operations in Lists
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page
    
  @tag44
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Basic Operations in Lists page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons
  
  @tag45
  Scenario: Error for invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window
  
  @ta46
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console
    
  @tag47
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Basic Operations in Lists" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag48
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag49
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag50
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag51
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window
  
  @tag52
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag53
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag54
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag55
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
   @tag56
  Scenario: Navigate to "Applications of Array" page
    Given the user is signed in to dsAlgo Portal and is on the "Squares of a Sorted Array" page
    And the user should be redirected to "Array" home page
    When the user clicks the "Applications of Array" button
    Then the user should be redirected to the "Applications of Array" page
    
  @tag57
  Scenario: Access "Try Editor" page for "Applications of Array"
    Given the user is signed in to dsAlgo Portal and is on the "Applications of Array" page
    When the user clicks the "Try Here" button in the Applications of Array page
    Then the user should be redirected to a page having a Try Editor with a Run button to test code
    
  @tag58
  Scenario: Handle error for running without entering code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user clicks the Run button without entering any code in the Editor
    Then the user should see an error message in an alert window

  @tag59
  Scenario: Handle error for running invalid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window
    
  @tag60
  Scenario: Output for valid Python code in Try Editor
    Given the user is signed in to dsAlgo Portal and is on the Try Editor page
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console
    
  @tag61
  Scenario: Navigate to "Practice Questions" page for Applications of Array
    Given the user is signed in to dsAlgo Portal and is on the Array page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page
    
  @tag62
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given the user is signed in to dsAlgo Portal and is on the Applications of Array page
    When the user clicks the "Search the Array" link
    Then the user should be redirected to a "Question" page containing a question and a Try Editor with Run and Submit buttons
  
  @tag63
  Scenario: Error for invalid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code in the Editor and clicks the Run button
    Then the user should see an error message in an alert window
  
  @tag64
  Scenario: Output for valid Python code on "Search the Array" question
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code in the Editor and clicks the Run button
    Then the user should see the output in the console
    
  @tag65
  Scenario: Navigate to "Max Consecutive Ones" question page
    Given the user is signed in to dsAlgo Portal and is on the "Applications of Array" page
    When the user clicks the "Max Consecutive Ones" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag66
  Scenario: Handle invalid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag67
  Scenario: Display output for valid Python code for "Max Consecutive Ones"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console

  @tag68
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is signed in to dsAlgo Portal and is on the "Max Consecutive Ones" page
    And the user will be redirected to "Array" page
    When the user clicks the "Find Numbers with Even Number of Digits" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag69
  Scenario: Handle invalid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window
  
  @tag70
  Scenario: Display output for valid Python code for "Find Numbers with Even Number of Digits"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
  
  @tag71
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is signed in to dsAlgo Portal and is on the "Find Numbers with Even Number of Digits" page
    And the user will be redirected to "Array" page
    When the user clicks the "Squares of a Sorted Array" link
    Then the user should be redirected to the "Question" page containing a question and a Try Editor with Run and Submit buttons

  @tag72
  Scenario: Handle invalid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters invalid Python code and clicks the Run button
    Then an error message should be displayed in an alert window

  @tag73
  Scenario: Display output for valid Python code for "Squares of a Sorted Array"
    Given the user is signed in to dsAlgo Portal and is on the practice question editor
    When the user enters valid Python code and clicks the Run button
    Then the output should be displayed in the console
 
 @tag74
  Scenario: Verify that the user can sign out successfully
    Given the user is signed in to dsAlgo Portal and is on the "Array" page
    When the user clicks the "Sign out" button
    Then the user should be redirected to the Home page
    And the user should see a message "Logged out successfully"
   