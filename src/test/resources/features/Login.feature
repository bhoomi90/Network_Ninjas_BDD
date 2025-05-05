@overall
Feature: Navigation and Functionality for Login in DSPortal app

  @Login1
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page

  @Login2
  Scenario Outline: Login with multiple credentials
    Given The user is on the DS Algo Sign in Page
    When The user enter <user_name> username  and <password> password
    Then The user should get <expected_message> below username field

    Examples: 
      | user_name | password       | expected_message              |
      | Empty     | Empty          | Please fill out this field    |
      | Empty     | Valid Password | Please fill out this field    |
      | Invalid   | Valid          | Invalid username and password |
      | Valid     | Invalid        | Invalid username and password |
      | Invalid   | Invalid        | Invalid username and password |

  @Login3
  Scenario: Login with empty password field
    Given The user is on the DS Algo Sign in Page
    When The user enter valid username and empty password
    Then The user should get expected_msg below password field

  @Login4
  Scenario: Login with valid password field
    Given The user is on the DS Algo Sign in Page
    When The user enter Valid username and Valid password
    Then The user should get expected_msg "You are logged in"

  @Login5
  Scenario: Navigate to home page after Sign out
    Given The user is in the Home page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully