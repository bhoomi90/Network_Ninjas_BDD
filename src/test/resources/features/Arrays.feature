@tag
Feature: Navigation and Functionality for Array Data Structures in dsAlgo Portal

  @arraytag1
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

  @tag5
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @tag6
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag5
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @tag6
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag9
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @tag10
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag12
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @tag13
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag15
  Scenario: Navigate to "Arrays Using List" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Arrays Using List button
    Then the user should be redirected to the Arrays Using List page

  Scenario: Access "Try Editor" page for "Arrays Using List"
    Given the user is on the Arrays Using List page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @tag3
  Scenario Outline: Verify TryEditor functionality for Arrays Using List page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @tag17
  Scenario: Navigate to "Practice Questions" page for "Arrays Using List"
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @tag5
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @tag6
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag5
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @tag6
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag9
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @tag10
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @Array
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @tag10
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag30
  Scenario: Navigate to "Basic Operations in Lists" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Basic Operations in Lists button
    Then the user should be redirected to the Basic Operations in Lists page

  @tag
  Scenario: Access "Try Editor" page for "Basic Operations in Lists"
    Given the user is on the Basic Operations in Lists page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @tag3
  Scenario Outline: Verify TryEditor functionality for Basic Operations in Lists page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @tag32
  Scenario: Navigate to "Practice Questions" page for Basic Operations in Lists
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @tag5
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @tag6
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag5
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @tag6
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag9
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @tag10
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @arra
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @tag10
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag45
  Scenario: Navigate to "Applications of Array" page
    Given the user is on the Squares of a Sorted Array page
    And the user should be redirected to Array home page
    When the user clicks the Applications of Array button
    Then the user should be redirected to the Applications of Array page

  @tag
  Scenario: Access "Try Editor" page for "Applications of Array"
    Given the user is on the Applications of Array page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @tag3
  Scenario Outline: Verify TryEditor functionality for Applications of Array page
    Given The user is on the tryEditor window in Arrays page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @tag52
  Scenario: Navigate to "Practice Questions" page for Applications of Array
    Given The user is on the tryEditor window in Arrays page
    When The user clicks Practice Questions button following browser back arrow
    Then The user should be directed to Array practice question page

  @tag5
  Scenario: Navigate to "Search the Array" question from Practice Questions page
    Given The user is in the Practice Questions of array page
    When The user clicks Search the Array link
    Then The user should be redirected to Search the Array Question page

  @tag6
  Scenario Outline: Validating "Search the Array"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag5
  Scenario: Navigate to "Max Consecutive Ones" question from Practice Questions page
    Given The user is on the Search the array page
    And The user will be redirected to Array question page
    When The user clicks Max Consecutive Ones link
    Then The user should be directed to Max Consecutive Ones Question page

  @tag6
  Scenario Outline: Validating "Max Consecutive Ones"  practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag9
  Scenario: Navigate to "Find Numbers with Even Number of Digits" question page
    Given the user is on the Max Consecutive Ones page
    And the user will be redirected to Array page
    When the user clicks the Find Numbers with Even Number of Digits link
    Then the user should be directed to Find Numbers with Even Number of Digits Question page

  @tag10
  Scenario Outline: Validating "Find Numbers with Even Number of Digits" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @taga
  Scenario: Navigate to "Squares of a Sorted Array" question page
    Given the user is on the Find Numbers with Even Number of Digits page
    And the user will be redirected to Array page
    When the user clicks the Squares of a Sorted Array link
    Then the user should be redirected to Squares of a Sorted Array Question page

  @tag10
  Scenario Outline: Validating "Squares of a Sorted Array" practice question editor Functionality
    Given The user is in the Practice page with run and submit buttons
    When The user enters the <code> in practice question and clicks Submit Button and RUN Button
    Then The <alert> should be displayed in Practice

    Examples: 
      | code         | alert                           |
      | Valid code   | Output displayed in the console |
      | Invalid code | Bad Input error msg             |

  @tag65
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Array page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
