@overall
Feature: Navigation and Functionality for Tree in dsAlgo Portal

  @Tree1
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Tree Panel or The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree2
  Scenario: Navigate to "Overview of Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Overview of Trees link in Tree Introduction page
    Then The user be directed to Overview of Trees Page

  @Tree3
  Scenario: Navigate to Overview of Trees tryEditor window
    Given The user is in Overview of Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree4
  Scenario Outline: Overview of Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree5
  Scenario: Navigate to "Practice Questions" Page for "Overview of Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree6
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree7
  Scenario: Navigate to "Terminologies" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Terminologies link in Tree Introduction page
    Then The user be directed to Terminologies Page

  @Tree8
  Scenario: Navigate to Terminologies tryEditor window
    Given The user is in the Terminologies page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree9
  Scenario Outline: Terminologies tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree10
  Scenario: Navigate to "Practice Questions" Page for "Terminologies" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree11
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree12
  Scenario: Navigate to "Types of Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Types of Trees link in Tree Introduction page
    Then The user be directed to Types of Trees Page

  @Tree13
  Scenario: Navigate to Types of Trees tryEditor window
    Given The user is in the Types of Trees pag
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree14
  Scenario Outline: Types of Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree15
  Scenario: Navigate to "Practice Questions" Page for "Types of Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree16
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree17
  Scenario: Navigate to "Tree Traversals" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Tree Traversals link in Tree Introduction page
    Then The user be directed to Tree Traversals Page

  @Tree18
  Scenario: Navigate to Tree Traversals tryEditor window
    Given The user is in the Tree Traversals page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree19
  Scenario Outline: Tree Traversals tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree20
  Scenario: Navigate to "Practice Questions" Page for "Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree21
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree22
  Scenario: Navigate to "Traversals Illustration" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Traversals Illustration link in Tree Introduction page
    Then The user be directed to Traversals Illustration Page

  @Tree23
  Scenario: Navigate to Traversals Illustration tryEditor window
    Given The user is in the Traversals Illustration page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree24
  Scenario Outline: Traversals Illustration tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree25
  Scenario: Navigate to "Practice Questions" Page for "Traversals-Illustration" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree26
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree27
  Scenario: Navigate to "Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Trees link in Tree Introduction page
    Then The user be directed to Binary Trees Page

  @Tree28
  Scenario: Navigate to Binary Trees tryEditor window
    Given The user is in the Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree29
  Scenario Outline: Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree30
  Scenario: Navigate to "Practice Questions" Page for "Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree31
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree32
  Scenario: Navigate to "Types of Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Types of Binary Trees link in Tree Introduction page
    Then The user be directed to Types of Binary Trees Page

  @Tree33
  Scenario: Navigate to Types of Binary Trees tryEditor window
    Given The user is in the Types of Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree34
  Scenario Outline: Types of Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree35
  Scenario: Navigate to "Practice Questions" Page for "Types of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree36
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree37
  Scenario: Navigate to "Implementation in Python" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation in Python link in Tree Introduction page
    Then The user be directed to Implementation in Python Page

  @Tree38
  Scenario: Navigate to Implementation in Python tryEditor window
    Given The user is in the Implementation in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree39
  Scenario Outline: Implementation in Python tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree40
  Scenario: Navigate to "Practice Questions" Page for "Implementation in Python" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree41
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree42
  Scenario: Navigate to "Binary Tree Traversals" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Tree Traversals link in Tree Introduction page
    Then The user be directed to Binary Tree Traversals Page

  @Tree43
  Scenario: Navigate to Binary Tree Traversals tryEditor window
    Given The user is in the Binary Tree Traversals page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree44
  Scenario Outline: Binary Tree Traversals tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree45
  Scenario: Navigate to "Practice Questions" Page for "Binary Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree46
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree47
  Scenario: Navigate to "Implementation of Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation of Binary Trees link in Tree Introduction page
    Then The user be directed to Implementation of Binary Trees Page

  @Tree48
  Scenario: Navigate to Implementation of Binary Trees tryEditor window
    Given The user is in the Implementation of Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree49
  Scenario Outline: Implementation of Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree50
  Scenario: Navigate to "Practice Questions" Page for "Implementation of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree51
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree52
  Scenario: Navigate to "Applications of Binary trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Applications of Binary trees link in Tree Introduction page
    Then The user be directed to Applications of Binary trees Page

  @Tree53
  Scenario: Navigate to Applications of Binary trees tryEditor window
    Given The user is in the Applications of Binary trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree54
  Scenario Outline: Applications of Binary trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree55
  Scenario: Navigate to "Practice Questions" Page for "Binary Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree56
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree57
  Scenario: Navigate to "Binary Search Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Search Trees link in Tree Introduction page
    Then The user be directed to Binary Search Trees Page

  @Tree58
  Scenario: Navigate to Binary Search Trees tryEditor window
    Given The user is in the Binary Search Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree59
  Scenario Outline: Binary Search Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree60
  Scenario: Navigate to "Practice Questions" Page for "Implementation of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree61
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree62
  Scenario: Navigate to "Implementation Of BST" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation Of BST link in Tree Introduction page
    Then The user be directed to Implementation Of BST Page

  @Tree63
  Scenario: Navigate to Implementation Of BST tryEditor window
    Given The user is in the Implementation Of BST page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  @Tree64
  Scenario Outline: Implementation Of BST tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  @Tree65
  Scenario: Navigate to "Practice Questions" Page for "Implementation Of BST" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  @Tree66
  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  @Tree67
  Scenario: Signout from Tree page and navigated to Home page
    Given The user is in the Tree page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
