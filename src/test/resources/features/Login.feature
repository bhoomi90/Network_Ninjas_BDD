
@tag
Feature: Login page features
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
    
   @tag2
  Scenario: Verify that user receives error message for all empty fields during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the Username textbox and Password textbox empty
    Then The error message Please fill out this field. appears below Username textbox
    
   @tag3
  Scenario: Verify that user receives error message for empty Password field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the Username and leaves Password textbox empty
    Then The error message Please fill out this field. appears below Password textbox
    
   @tag4
  Scenario: Verify that user receives error message for empty Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the Password only
    Then The error message Please fill out this field. appears below Username textbox
    
   @tag5
  Scenario: Verify that user receives error message for invalid Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering invalid username
    Then The user should able to see an error message Invalid username and password.
    
   @tag6
  Scenario: Verify that user receives error message for invalid password field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid username invalid password
    Then The user should able to see an error message Invalid username and password.
    
   @tag7
  Scenario: Verify that user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message You are logged in
    
   @tag8
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Home page after Sign out
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
    
     #@tagDemo
  #Scenario Outline: Login with multiple credentials
    #Given The user is on the DS Algo Sign in Page
    #When The user enter username <username> and password <password>
    #Then The user should land in Data Structure Home Page with message You are logged in
  #
   #Examples: 
      #| Username         | Password         	| Action
      #| Empty        		|	Empty						 	| Please fill out this field  
      #| Valid Username   |	Valid Password  	|	You are logged in 
      #| Invalid Username |	Invalid Password  | Invalid username and password
    