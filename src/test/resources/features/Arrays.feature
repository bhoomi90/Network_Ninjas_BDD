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
    When The user clicks Practice Questions of array button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag6
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @Arraytag7
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag8
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @Arraytag9
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag10
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @Arraytag11
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag12
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @Arraytag13
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag14
  Scenario: Navigate to "Arrays Using List" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Arrays Using List button
    Then the user should be redirected to the Arrays Using List page

  @Arraytag15
  Scenario: Access "Try Editor" page for "Arrays Using List"
    Given the user is on the Arrays Using List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag16
  Scenario Outline: Verify TryEditor functionality for Arrays Using List page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag17
  Scenario: Navigate to "Practice Questions" page for "Arrays Using List"
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions of array button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag18
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @Arraytag19
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag20
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @Arraytag21
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag22
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @Arraytag23
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag24
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @Arraytag25
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag26
  Scenario: Navigate to "Basic Operations in Lists" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Basic Operations in Lists button
    Then the user should be redirected to the Basic Operations in Lists page

  @Arraytag27
  Scenario: Access "Try Editor" page for "Basic Operations in Lists"
    Given the user is on the Basic Operations in Lists page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag28
  Scenario Outline: Verify TryEditor functionality for Basic Operations in Lists page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag29
  Scenario: Navigate to "Practice Questions" page for Basic Operations in Lists
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions of array button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag30
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @Arraytag31
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag32
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @Arraytag33
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag34
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @Arraytag35
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag36
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @Arraytag37
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag38
  Scenario: Navigate to "Applications of Array" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Applications of Array button
    Then the user should be redirected to the Applications of Array page

  @Arraytag39
  Scenario: Access "Try Editor" page for "Applications of Array"
    Given the user is on the Applications of Array page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Arraytag40
  Scenario Outline: Verify TryEditor functionality for Applications of Array page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Arraytag41
  Scenario: Navigate to "Practice Questions" page for Applications of Array
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions of array button following browser back arrow
    Then The user should be directed to Array practice question page

  @Arraytag42
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @Arraytag43
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag44
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @Arraytag45
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag46
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @Arraytag47
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag48
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @Arraytag49
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Arraytag50
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Array page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
