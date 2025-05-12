@overall
Feature: Navigation and Functionality for Array Data Structures in dsAlgo Portal

  @Arraytag1
  Scenario: Verify that user is able to navigate to "Arrays" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Array Panel or The user select Array item from the drop down menu
    Then The user is directed to Array Data Structure Page

  @Arraytag2
  Scenario: Verify that user is able to navigate to Arrays in Python page
    Given The user is signed in to dsAlgo Portal and is on the Array page
    When The user clicks the Arrays in Python button
    Then The user should be redirected to the Arrays in Python page

  @Arraytag3
  Scenario: Navigate to "try Editor" page for "Arrays in Python" page
    Given the user is on the Arrays in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag4
  Scenario Outline: Verify TryEditor functionality for Arrays in Python page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag5
  Scenario: Navigate to "Practice Questions" page for Arrays in Python
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag6
  Scenario Outline: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks on "<linktext>" link
    Then The user should be redirected to "<questionPage>" for "<linktext>" page

    Examples: 
      | linktext                                | questionPage |
      | search the array                        | question/1   |
      | max consecutive ones                    | question/2   |
      | find numbers with even number of digits | question/3   |
      | squares of a sorted array               | question/4   |

  @Arraytag7
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is on "<PracticeQue>" the Practice page after clicks on arraysubpage link
    When The user enters the <code> in "<PracticeQue>" practice page
    Then The <message> for "<code>" should be displayed for "<PracticeQue>" page after click on RUN and Submit button

    Examples: 
      | PracticeQue                             | code         | message               |
      | search the array                        | Valid code   | Output in the console |
      | search the array                        | Invalid code | Bad Input error msg   |
      | max consecutive ones                    | Valid code   | Output in the console |
      | max consecutive ones                    | Invalid code | Bad Input error msg   |
      | find numbers with even number of digits | Valid code   | Output in the console |
      | find numbers with even number of digits | Invalid code | Bad Input error msg   |
      | squares of a sorted array               | Valid code   | Output in the console |
      | squares of a sorted array               | Invalid code | Bad Input error msg   |

  @Arraytag8
  Scenario: Navigate to "Array" Page
    Given The user is on question4 page of Array assessment
    When The user click browser back arrow and select Array from dropdown button
    Then The user is redirected to Array page

  @Arraytag9
  Scenario: Navigate to "Arrays Using List" page
    Given the user is on Array page
    When the user clicks the Arrays Using List button
    Then the user should be redirected to the Arrays Using List page

  @Arraytag10
  Scenario: Access "Try Editor" page for "Arrays Using List"
    Given the user is on the Arrays Using List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag11
  Scenario Outline: Verify TryEditor functionality for Arrays Using List page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag12
  Scenario: Navigate to "Practice Questions" page for "Arrays Using List"
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag13
  Scenario: Navigate to "Array" data structure page
    Given The user is in the Practice Questions of array page
    When The user select Array item from the drop down menu
    Then The user is redirected to Array page

  @Arraytag14
  Scenario: Navigate to "Basic Operations in Lists" page
    Given the user is on Array page
    When the user clicks Basic Operations in Lists option
    Then the user should be redirected to the Basic Operations in Lists page

  @Arraytag15
  Scenario: Access "Try Editor" page for "Basic Operations in Lists"
    Given the user is on the Basic Operations in Lists page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag16
  Scenario Outline: Verify TryEditor functionality for Basic Operations in Lists page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag17
  Scenario: Navigate to "Practice Questions" page for Basic Operations in Lists
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag18
  Scenario: Navigate to "Array" data structure page
    Given The user is in the Practice Questions of array page
    When The user select Array item from the drop down menu
    Then The user is redirected to Array page

  @Arraytag19
  Scenario: Navigate to "Applications of Array" page
    Given the user is on Array page
    When the user clicks Applications of Array button
    Then the user should be redirected to the Applications of Array page

  @Arraytag20
  Scenario: Access "Try Editor" page for "Applications of Array"
    Given the user is on the Applications of Array page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag21
  Scenario Outline: Verify TryEditor functionality for Applications of Array page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag22
  Scenario: Navigate to "Practice Questions" page for Applications of Array
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag23
  Scenario: Navigate to "Array" data structure page
    Given The user is in the Practice Questions of array page
    When The user select Array item from the drop down menu
    Then The user is redirected to Array page

  @Arraytag24
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Array page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
# -----------------------
  #@tag5
  #Scenario: Navigate to "Search the Array" question from Practice Questions page
    #Given The user is in the Practice Questions of array page
    #When The user clicks Search the Array link
    #Then The user should be redirected to Search the Array Question page
#
  #@tag6
  #Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    #Given The user is in the Practice page with run and submit buttons
    #When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    #Then The <alert> should be displayed in Practice
#
    #Examples: 
      #| code         | alert                           |
      #| Valid code   | Output displayed in the console |
      #| Invalid code | Bad Input error msg             |
#
  #@tag5
  #Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    #Given The user is on the Search the array page
    #And The user will be redirected to Array question page
    #When The user clicks Max Consecutive Ones link
    #Then The user should be directed to Max Consecutive Ones Question page
#
  #@tag6
  #Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    #Given The user is in the Practice page with run and submit buttons
    #When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    #Then The <alert> should be displayed in Practice
#
    #Examples: 
      #| code         | alert                           |
      #| Valid code   | Output displayed in the console |
      #| Invalid code | Bad Input error msg             |
#
  #@tag9
  #Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    #Given the user is on the Max Consecutive Ones page
    #And the user will be redirected to Array page
    #When the user clicks the Find Numbers with Even Number of Digits link
    #Then the user should be directed to Find Numbers with Even Number of Digits Question page
#
  #@tag10
  #Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    #Given The user is in the Practice page with run and submit buttons
    #When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    #Then The <alert> should be displayed in Practice
#
    #Examples: 
      #| code         | alert                           |
      #| Valid code   | Output displayed in the console |
      #| Invalid code | Bad Input error msg             |
#
  #@taga
  #Scenario: Navigate to "Squares of a Sorted Array" question page
    #Given the user is on the Find Numbers with Even Number of Digits page
    #And the user will be redirected to Array page
    #When the user clicks the Squares of a Sorted Array link
    #Then the user should be redirected to Squares of a Sorted Array Question page
#
  #@tag10
  #Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    #Given The user is in the Practice page with run and submit buttons
    #When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    #Then The <alert> should be displayed in Practice
#
    #Examples: 
      #| code         | alert                           |
      #| Valid code   | Output displayed in the console |
      #| Invalid code | Bad Input error msg             |
#
