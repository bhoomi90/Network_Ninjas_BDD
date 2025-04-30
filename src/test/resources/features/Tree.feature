@overall
Feature: Navigation and Functionality for Tree in dsAlgo Portal

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Tree Panel or The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Overview of Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Overview of Trees link in Tree Introduction page
    Then The user be directed to Overview of Trees Page

  Scenario: Navigate to Overview of Trees tryEditor window
    Given The user is in Overview of Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Overview of Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Overview of Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Terminologies" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Terminologies link in Tree Introduction page
    Then The user be directed to Terminologies Page

  Scenario: Navigate to Terminologies tryEditor window
    Given The user is in the Terminologies page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Terminologies tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Terminologies" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Types of Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Types of Trees link in Tree Introduction page
    Then The user be directed to Types of Trees Page

  Scenario: Navigate to Types of Trees tryEditor window
    Given The user is in the Types of Trees pag
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Types of Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Types of Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Tree Traversals" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Tree Traversals link in Tree Introduction page
    Then The user be directed to Tree Traversals Page

  Scenario: Navigate to Tree Traversals tryEditor window
    Given The user is in the Tree Traversals page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Tree Traversals tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Traversals Illustration" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Traversals Illustration link in Tree Introduction page
    Then The user be directed to Traversals Illustration Page

  Scenario: Navigate to Traversals Illustration tryEditor window
    Given The user is in the Traversals Illustration page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Traversals Illustration tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Traversals-Illustration" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Trees link in Tree Introduction page
    Then The user be directed to Binary Trees Page

  Scenario: Navigate to Binary Trees tryEditor window
    Given The user is in the Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Types of Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Types of Binary Trees link in Tree Introduction page
    Then The user be directed to Types of Binary Trees Page

  Scenario: Navigate to Types of Binary Trees tryEditor window
    Given The user is in the Types of Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Types of Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Types of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Implementation in Python" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation in Python link in Tree Introduction page
    Then The user be directed to Implementation in Python Page

  Scenario: Navigate to Implementation in Python tryEditor window
    Given The user is in the Implementation in Python page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Implementation in Python tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Implementation in Python" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Binary Tree Traversals" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Tree Traversals link in Tree Introduction page
    Then The user be directed to Binary Tree Traversals Page

  Scenario: Navigate to Binary Tree Traversals tryEditor window
    Given The user is in the Binary Tree Traversals page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Binary Tree Traversals tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Binary Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Implementation of Binary Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation of Binary Trees link in Tree Introduction page
    Then The user be directed to Implementation of Binary Trees Page

  Scenario: Navigate to Implementation of Binary Trees tryEditor window
    Given The user is in the Implementation of Binary Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Implementation of Binary Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Implementation of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Applications of Binary trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Applications of Binary trees link in Tree Introduction page
    Then The user be directed to Applications of Binary trees Page

  Scenario: Navigate to Applications of Binary trees tryEditor window
    Given The user is in the Applications of Binary trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Applications of Binary trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Binary Tree Traversals" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Binary Search Trees" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Binary Search Trees link in Tree Introduction page
    Then The user be directed to Binary Search Trees Page

  Scenario: Navigate to Binary Search Trees tryEditor window
    Given The user is in the Binary Search Trees page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Binary Search Trees tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Implementation of Binary Trees" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Navigate to "Implementation Of BST" page
    Given The user is in the Tree Introduction Page after Sign in
    When The user clicks the Implementation Of BST link in Tree Introduction page
    Then The user be directed to Implementation Of BST Page

  Scenario: Navigate to Implementation Of BST tryEditor window
    Given The user is in the Implementation Of BST page
    When The user clicks Try Here>>> button
    Then Navigate to try Editor window with a Run button to test

  Scenario Outline: Implementation Of BST tryEditor Functionality
    Given The user is on the tryEditor window in Tree page
    When The user enters the <code> in text editor and clicks RUN Button
    Then The <alert> should be displayed

    Examples: 
      | code         | alert                          |
      | Empty        | Error message in alert window  |
      | Valid code   | displayed in the console       |
      | Invalid code | nameerror pop up alert message |

  Scenario: Navigate to "Practice Questions" Page for "Implementation Of BST" page
    Given The user is on the tryEditor window in Tree page
    When The user clicks Practice Questions button following browser back arrow
    Then The user is navigated to Practice Questions page

  Scenario: Navigate to "Tree" data structure page
    Given The user is in the blank Practice page
    When The user select Tree item from the drop down menu
    Then The user is directed to Tree Data Structure Page

  Scenario: Signout from Tree page and navigated to Home page
    Given The user is in the Tree page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
