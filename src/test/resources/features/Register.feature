@tag
Feature: Register page features
  I want to use this template for my feature file
  @tag1
  Scenario: Verify that user is able to navigate to "home"  page
    Given The user is on the ds portal  page
    When The user clicks get started on the Home page
    Then The user should be redirected to home page
  @tag1
  Scenario: Verify that user is able to navigate to "Register"  page
    Given The user is on the ds portal home page
    When The user clicks Register link on the Home page
    Then The user should be redirected to Register page
    
   @tag2
  Scenario: Verify that user receives error message for all empty fields during registration
    Given The user is on the user registration page
    When The user clicks Register button with all fields empty
    Then The error "Please fill out this field." appears below Username textbox
    
   @tag3
  Scenario: Verify that user receives error message for empty Username field during registration
    Given The user is on the user registration page
    When The user clicks Register button without entering Username with all other fields filled
    Then The error "Please fill out this field." appears below Username textbox
    
   @tag4
  Scenario: Verify that user receives error message for empty Password field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering Username with other fields empty
    Then The error message "Please fill out this field." appears below Password textbox
    
   @tag5
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering Username and Password with Password Confirmation field empty
    Then The error message "Please fill out this field." appears below  Password Confirmation textbox
    
   #@tag6
  #Scenario: Verify that user receives error message for invalid username field during registration
    #Given The user is on the user registration page
    #When The user clicks Register button after entering a username with spacebar characters other than digits
    #Then The user is not able to see error msg after entering invalid data
    
   #@tag7
  #Scenario: Verify that user receives error message for invalid password field during registration
    #Given The user is on the user registration page
    #When The user clicks Register button after entering a password with numeric data
    #Then The user is not able to see error msg after entering invalid data
    
   @tag8
  Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields
    Then The user should able to see an pwd warning message "password_mismatch:The two password fields didn’t match."
    
   @tag9
  Scenario: Verify that user receives error message for existing Username during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering existing Username
    Then The user is not able to see error msg "username exists. Plz change username" after entering existing username
    
   @tag10
  Scenario: Verify that user receives error message for same Username and password during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering same Username and password
    Then The user is not able to see error msg "same username and password. Plz change username" after entering same Username and password
    
   @tag11
  Scenario: Verify that user is able to land on Homepage after registration with valid fields
    Given The user is on the user registration page
    When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes
    Then The user should be redirected to Home Page of DS Algo with message "New Account Created. You are logged in" 
    
    #@tagDemo
  #Scenario Outline: Successful user registration
    #Given The user is on the user registration page
    #When The user clicks Register button after entering username <username>, password <password> and password confirmation <confirme password>
    #Then The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>
  #
   #Examples: 
      #| Username         | Password         	| Password Confirmation 				| Action
      #| Empty        		|	Empty						 	| Empty													| Please fill out this field  
      #| Valid Username   |	Valid Password  	|	Matchs with Password					|	New Account Created. You are logged in as <ID>
      #| Invalid Username |	Invalid Password  | Mismatch with Password				| Warrning msg:password_mismatch:The two password fields didn’t match.