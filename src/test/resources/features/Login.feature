@tag
Feature: User Login
  As a registered user
  I want to log in to the system
  So that I can access my account

  @tag_signin
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
    
   @tag_multiple_credensitals
  Scenario Outline: Login with multiple credentials
    Given The user is on the DS Algo Sign in Page
    When The user enter <user_name> username  and <password> password 
    Then The user should get <expected_message> below username field
  
   Examples: 
      | user_name        | password         	| expected_message															|
      | Empty        		 |	Empty						 	| Please fill out this field  									|
      | Empty						 |	Valid Password		|	Please fill out this field										|
      | Invalid          |	Valid  	         	| Invalid username and password									|
      | Valid            |	Invalid          	|	Invalid username and password									|
      | Invalid          |	Invalid           | Invalid username and password									|

	Scenario: Login with empty password field
	   Given The user is on the DS Algo Sign in Page
    When The user enter valid username and empty password 
    Then The user should get expected_msg below password field
        
   Scenario: Login with valid password field
	   Given The user is on the DS Algo Sign in Page
    When The user enter Valid username and Valid password 
    Then The user should get expected_msg "You are logged in"
    
  