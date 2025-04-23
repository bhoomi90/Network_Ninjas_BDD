@tag
Feature: User Login
  As a registered user
  I want to log in to the system
  So that I can access my account

  @tag_signin
  Scenario: Verify that user is able to land on Login Page
    Given The user is in the Home page after Sign in
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
    
   @tag_multiple_credensitals
  Scenario Outline: Login with multiple credentials
    Given The user is on the DS Algo Sign in Page
    When The user enter username <user_name> and password <password>
    Then The user should get <expected_message>
  
   Examples: 
      | user_name        | password         	| expected_message															|
      | Empty        		 |	Empty						 	| Please fill out this field  									|
      | Empty						 |	Valid Password		|	Please fill out this field										|
      | Valid Username	 |	Empty							|	Please fill out this field										|
      | Invalid Username |	Valid Password 		| Invalid username and password									|
      | Valid Username   |	Invalid Password	|	Invalid username and password									|
      | Invalid Username |	Invalid Password  | Invalid username and password									|
      | Valid Username   |	Valid Password  	|	You are logged in and directing to Home page	|

   @tag8
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Home page after Sign out
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully