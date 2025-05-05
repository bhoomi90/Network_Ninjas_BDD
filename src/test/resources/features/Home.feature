@overall
Feature: Home page features
  I want to use this template for my feature file

  @home1
  Scenario: Verify that user is able to open the dsAlgo Portal
    Given The user has browser open
    When The user enter correct dsAlgo portal URL
    Then The user should be able to land on dsAlgo portal with Get Started button

  @home2
  Scenario: Verify the Home page for an user without Sign in
    Given The user is on the DS Algo Portal
    When The user clicks the Get Started button
    Then The user should be navigated to the Home page which displays the Register and Sign in links.

  @home3
  Scenario: Verify that user is able to view options for Data Structures dropdown on home page without Sign in
    Given The user is on the Home page
    When The user clicks the Data Structures dropdown
    Then The user should able to see 6 options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu

  @home3
  Scenario: Verify that user able to see warning message while selecting Arrays from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Arrays from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home4
  Scenario: Verify that user able to see warning message while selecting Linked List from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Linked List from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home5
  Scenario: Verify that user able to see warning message while selecting Stack from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Stack from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home6
  Scenario: Verify that user able to see warning message while selecting Queue from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Queue from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home7
  Scenario: Verify that user able to see warning message while selecting Tree from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Tree from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home8
  Scenario: Verify that user able to see warning message while selecting Graph from the drop down without Sign in.
    Given The user is on the Home page
    When The user selects Graph from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @home9
  Scenario: Verify that user able to land on Array page  while selecting Array from the drop down after Log in
    Given The user is on the Home page
    When The user selects Array from the drop down after Log in.
    Then The user should be redirected to Array page

  @home10
  Scenario: Verify that user able to land on Linked List page  while selecting Linked List from the drop down after Log in
    Given The user is on the Home page
    When The user selects Linked List from the drop down after Log in.
    Then The user should be redirected to Linked List page

  @home11
  Scenario: Verify that user able to land on Stack page  while selecting Stack from the drop down after Log in
    Given The user is on the Home page
    When The user selects Stack from the drop down after Log in.
    Then The user should be redirected to Stack page

  @home12
  Scenario: Verify that user able to land on Queue page  while selecting Queue from the drop down after Log in
    Given The user is on the Home page
    When The user selects Queue from the drop down after Log in.
    Then The user should be redirected to Queue page

  @home13
  Scenario: Verify that user able to land on Tree page  while selecting Tree from the drop down after Log in
    Given The user is on the Home page
    When The user selects Tree from the drop down after Log in.
    Then The user should be redirected to Tree page

  @home14
  Scenario: Verify that user able to land on Graph page  while selecting Graph from the drop down after Log in
    Given The user is on the Home page
    When The user selects Graph from the drop down after Log in.
    Then The user should be redirected to Graph page

  @home15
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Data Structures-Introduction on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home16
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Array on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Array on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home17
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Linked List on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Linked List on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home18
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Stack on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Stack on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home19
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Queue on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Queue on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home20
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Tree on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Tree on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home21
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Graph on the home page without Sign in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Graph on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"

  @home22
  Scenario: Verify that user able to land on Data Structures-Introduction page while clicking Get Started buttons of Data Structures-Introduction on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Data Structures-Introduction on the homepage while Log in
    Then The user should be redirected to Data Structures page

  @home23
  Scenario: Verify that user able to land on Array page while clickingGet Started buttons of Array on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Array on the homepage while Log in
    Then The user should be redirected to Array page

  @home24
  Scenario: Verify that user able to land on Linked List page while clickingGet Started buttons of Linked List on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Linked List on the homepage while Log in
    Then The user should be redirected to Linked List page

  @home25
  Scenario: Verify that user able to land on Stack page while clickingGet Started buttons of Stack on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Stack on the homepage while Log in
    Then The user should be redirected to Stack page

  @home26
  Scenario: Verify that user able to land on Queue page while clickingGet Started buttons of Queue on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Queue on the homepage while Log in
    Then The user should be redirected to Queue page

  @home27
  Scenario: Verify that user able to land on Tree page while clickingGet Started buttons of Tree on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Tree on the homepage while Log in
    Then The user should be redirected to Tree page

  @home28
  Scenario: Verify that user able to land on Graph page while clickingGet Started buttons of Graph on the home page during Log in
    Given The user is on the Home page
    When The user clicks Get Started buttons of Graph on the homepage while Log in
    Then The user should be redirected to Graph page

  @home29
  Scenario: Navigate to graph page after Sign out
    Given The user is on the Home page
    When The user clicks Sign out
    Then The user should be redirected to home page with message Logged out successfully
		#Examples:
      #| menu_item   											 | expected_result before Login | expected_result after Login
      #| Data Structures-Introduction      | You are not logged in        |	The user should be redirected to Data Structures-Introduction page
      #| Array     												 | You are not logged in      	|	The user should be redirected to Array page
      #| Linked List    									 | You are not logged in      	|	The user should be redirected to Linked List page
      #| Stack     												 | You are not logged in     		|	The user should be redirected to Stack page
      #| Queue     												 | You are not logged in      	|	The user should be redirected to Queue page
      #| Tree     											   | You are not logged in      	|	The user should be redirected to Tree page
      #| Graph     												 | You are not logged in      	|	The user should be redirected to Graph page
