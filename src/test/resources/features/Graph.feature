Feature: Graph Module
 
   Background: The user logged in to dsAlgo Portal
   Given The user is in the Home Page

@graph 
Scenario: Navigate to Graph page
Given The user is in the Graph Introduction Page after Sign in
When The user clicks the  Graph link in Graph Introduction page
Then The user be directed to Graph Page

@graphtryhere
Scenario: Navigate to Graph tryEditor window
Given The user is in the Graph page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@graphtxteditor
Scenario Outline: Graph tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code  | nameerror pop up alert message   |
    
@backtograph
Scenario: Redirected to Graph page
Given The user is on the Try Editor of Graph page
When The user clicks browser back arrow
Then The user is navigated to Graph page 

@grarep 
Scenario: Navigate to Graph Representations page
Given The user is in the Graph Introduction Page after Sign in
When The user clicks the Graph Representations link in Graph Introduction page
Then The user be directed to Graph Representations Page

@greptryhere
Scenario: Navigate to Graph Representations tryEditor window
Given The user is in the Graph Representations page
When The user clicks Try here>>> button  
Then The user is navigated to tryEditor window

@greptxteditor
Scenario Outline: Graph Representations tryEditor Functionality  
Given The user is on the tryEditor page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code  | nameerror pop up alert message   |
    
@backtogrep
Scenario: Redirected to Graph Representations page
Given The user is on the Try Editor of Graph Representations page
When The user clicks browser back arrow
Then The user is navigated to Graph Representations page 

@practques
Scenario: Navigate to Practice Questions page for Graph
Given the user is signed in to dsAlgo Portal and is on the Graph page
When the user clicks the Practice Questions button
Then the user should be redirected to the Practice page

Scenario: Navigate to Graph page
Given The user is in the blank Practice page
When The user clicks browser back arrow
Then The user is redirected to Graph Page
 
@signout
Scenario: signout from Graph page and navigated to Home page
Given The user is in the Graph page
When The user clicks Sign out
Then The user is directed to Home page with message Logged out successfully
	

