Feature: Tree Module

Background: The user logged in to dsAlgo Portal
    Given The user is in the Home Page

@overview  @tree1
Scenario: Navigate to Overview of Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Overview of Trees link in Tree Introduction page
Then The user be directed to Overview of Trees Page

@viewtryhere
Scenario: Navigate to Overview of Trees tryEditor window
Given The user is in Overview of Trees pag
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@viewtxteditor
Scenario Outline: Overview of Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtoview
Scenario: Redirected to Overview of Trees page
Given The user is on the Try Editor of Overview of Trees page
When The user clicks browser back arrow
Then The user is navigated to Overview of Trees page 

@terminologies @tree2
Scenario: Navigate to Terminologies page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Terminologies link in Tree Introduction page
Then The user be directed to Terminologies Page

@terminotryhere
Scenario: Navigate to Terminologies tryEditor window
Given The user is in the Terminologies page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@terminotxteditor
Scenario Outline: Terminologies tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
    
@backtotermino
Scenario: Redirected to Terminologies page
Given The user is on the Try Editor of Terminologies page
When The user clicks browser back arrow
Then The user is navigated to Terminologies page 
  
@typetrees @tree3
Scenario: Navigate to Types of Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Types of Trees link in Tree Introduction page
Then The user be directed to Types of Trees Page

@typtreestryhere
Scenario: Navigate to Types of Trees tryEditor window
Given The user is in the Types of Trees pag
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window
 
@typtreestxteditor
Scenario Outline: Types of Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
       
@backtotyptrees
Scenario: Redirected to Types of Trees page
Given The user is on the Try Editor of Types of Trees page
When The user clicks browser back arrow
Then The user is navigated to Types of Trees page 
   
@traversals   @tree4
Scenario: Navigate to Tree Traversals page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Tree Traversals link in Tree Introduction page
Then The user be directed to Tree Traversals Page

@traverstryhere
Scenario: Navigate to Tree Traversals tryEditor window
Given The user is in the Tree Traversals page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window
 
@traverstxteditor
Scenario Outline: Tree Traversals tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      
@backtotravers
Scenario: Redirected to Tree Traversals page
Given The user is on the Try Editor of Tree Traversals page
When the user clicks browser back arrow
Then the user is navigated to Tree Traversals page 
 
@illustrations   @tree5
Scenario: Navigate to Traversals Illustration page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Traversals Illustration link in Tree Introduction page
Then The user be directed to Traversals Illustration Page

@illustryhere
Scenario: Navigate to Traversals Illustration tryEditor window
Given The user is in the Traversals Illustration page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@illustxteditor
Scenario Outline: Traversals Illustration tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
       
@backtoillus 
Scenario: Redirected to Traversals Illustration page
Given The user is on the Try Editor of Traversals Illustration page
When The user clicks browser back arrow
Then The user is navigated to Traversals Illustration page 

@binarytrees   @tree6
Scenario: Navigate to Binary Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Binary Trees link in Tree Introduction page
Then The user be directed to Binary Trees Page
 
@binarytryhere
Scenario: Navigate to Binary Trees tryEditor window
Given The user is in the Binary Trees page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window
 
@binarytxteditor
Scenario Outline: Binary Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
    
@backtobinary
Scenario: Redirected to Binary Trees page
Given The user is on the Try Editor of Binary Trees page
When the user clicks browser back arrow
Then the user is navigated to Binary Trees page 
 
@typebintree   @tree7
Scenario: Navigate to Types of Binary Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Types of Binary Trees link in Tree Introduction page
Then The user be directed to Types of Binary Trees Page
 
@typbintryhere
Scenario: Navigate to Types of Binary Trees tryEditor window
Given The user is in the Types of Binary Trees page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window
 
@typbintxteditor
Scenario Outline: Types of Binary Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
     
@backtotypbin
Scenario: Redirected to Types of Binary Trees page
Given The user is on the Try Editor of Types of Binary Trees page
When the user clicks browser back arrow
Then the user is navigated to Types of Binary Trees page 
 
@implepython @tree8
Scenario: Navigate to Implementation in Python page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Implementation in Python link in Tree Introduction page
Then The user be directed to Implementation in Python Page
@pythontryhere
Scenario: Navigate to Implementation in Python tryEditor window
Given The user is in the Implementation in Python page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@pythontxteditor
Scenario Outline: Implementation in Python tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
    
@backtopython
Scenario: Redirected to Implementation in Python page
Given The user is on the Try Editor of Implementation in Python page
When The user clicks browser back arrow
Then The user is navigated to Implementation in Python page 
 
@bintraversals @tree9
Scenario: Navigate to Binary Tree Traversals page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Binary Tree Traversals link in Tree Introduction page
Then The user be directed to Binary Tree Traversals Page

@bintravtryhere
Scenario: Navigate to Binary Tree Traversals tryEditor window
Given The user is in the Binary Tree Traversals page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@bintravtxteditor
Scenario Outline: Binary Tree Traversals tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtobintra
Scenario: Redirected to Binary Tree Traversals page
Given The user is on the Try Editor of Binary Tree Traversals page
When The user clicks browser back arrow
Then The user is navigated to Binary Tree Traversals page 

@impbintree  @tree10
Scenario: Navigate to Implementation of Binary Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Implementation of Binary Trees link in Tree Introduction page
Then The user be directed to Implementation of Binary Trees Page

@impbintryhere
Scenario: Navigate to Implementation of Binary Trees tryEditor window
Given The user is in the Implementation of Binary Trees page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@impbintxteditor
Scenario Outline: Implementation of Binary Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtoimpbin
Scenario: Redirected to Implementation of Binary Trees page
Given The user is on the Try Editor of Implementation of Binary Trees page
When The user clicks browser back arrow
Then The user is navigated to Implementation of Binary Trees page 
 
@appbinary @tree11
Scenario: Navigate to Applications of Binary trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Applications of Binary trees link in Tree Introduction page
Then The user be directed to Applications of Binary trees Page

@appbintryhere
Scenario: Navigate to Applications of Binary trees tryEditor window
Given The user is in the Applications of Binary trees page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window
    
@appbintxteditor
Scenario Outline: Applications of Binary trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtoappbin
Scenario: Redirected to Applications of Binary trees page
Given The user is on the Try Editor of Applications of Binary trees page
When The user clicks browser back arrow
Then The user is navigated to Applications of Binary trees page

@binsearch @tree12
Scenario: Navigate to Binary Search Trees page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Binary Search Trees link in Tree Introduction page
Then The user be directed to Binary Search Trees Page

@binseatryhere
Scenario: Navigate to Binary Search Trees tryEditor window
Given The user is in the Binary Search Trees page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@binseatxteditor
Scenario Outline: Binary Search Trees tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
 Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtobinsea
Scenario: Redirected to Binary Search Trees page
Given The user is on the Try Editor of Binary Search Trees page
When The user clicks browser back arrow
Then the user is navigated to Binary Search Trees page

@implebst @tree13
Scenario: Navigate to Implementation Of BST page
Given The user is in the Tree Introduction Page after Sign in
When The user clicks the Implementation Of BST link in Tree Introduction page
Then The user be directed to Implementation Of BST Page

@bsttryhere
Scenario: Navigate to Implementation Of BST tryEditor window
Given The user is in the Implementation Of BST page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@bsttxteditor
Scenario Outline: Implementation Of BST tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
 Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |

@backtobst
Scenario: Redirected to Implementation Of BST page
Given The user is on the Try Editor of Implementation Of BST page
When The user clicks browser back arrow
Then The user is navigated to Implementation Of BST page
    
@practques
Scenario: Navigate to "Practice Questions" page for  Trees
Given The user is signed in to dsAlgo Portal and is on the Tree page
When The user clicks the "Practice Questions" button
Then The user should be redirected to the "Practice" page

Scenario: Navigate to Tree page
Given The user is in the blank Practice page
When The user clicks browser back arrow
Then The user is redirected to Tree Page
  
@signout
Scenario: Signout from Tree page and navigated to Home page
Given The user is in Tree Introduction page
When The user clicks Sign out
Then The user is directed to Home page with message Logged out successfully
	


 