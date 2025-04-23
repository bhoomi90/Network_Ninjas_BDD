
@tag
Feature: Home page features
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that user is able to open the dsAlgo Portal
    Given The user has browser open
    When The user enter correct dsAlgo portal URL
    Then The user should be able to land on dsAlgo portal with Get Started button
    
  @tag2
  Scenario: Verify the Home page for an user without Sign in
    Given The user is on the DS Algo Portal
    When The user clicks the Get Started button
    Then The user should be navigated to the Data Structure Introduction page, which displays the Register and Sign in links.
	
	@tag3
	Scenario: Verify that user is able to view options for Data Structures dropdown on home page without Sign in
		Given The user is on the Home page
		When The user clicks the Data Structures dropdown
		Then The user should able to see 6 options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu
		
	@tag4
	Scenario: Verify that user able to see warning message while selecting Data Structures from the drop down without Sign in
		Given The user is on the Home page
		When The user selects Data Structures from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag5
	Scenario: Verify that user able to see warning message while selecting Arrays from the drop down without Sign in.
		Given The user is on the Home page
		When The user selects Arrays from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag6
	Scenario: Verify that user able to see warning message while selecting Linked List from the drop down without Sign in. 
		Given The user is on the Home page
		When The user selects Linked List from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag7
	Scenario: Verify that user able to see warning message while selecting Stack from the drop down without Sign in.
		Given The user is on the Home page
		When The user selects Stack from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag8
	Scenario: Verify that user able to see warning message while selecting Queue from the drop down without Sign in.
		Given The user is on the Home page
		When The user selects Queue from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag9
	Scenario: Verify that user able to see warning message while selecting Tree from the drop down without Sign in.
		Given The user is on the Home page
		When The user selects Tree from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag10
	Scenario: Verify that user able to see warning message while selecting Graph from the drop down without Sign in.
		Given The user is on the Home page
		When The user selects Graph from the drop down without Sign in.
		Then The user should able to see an warning message You are not logged in
		
	@tag11
	Scenario: Verify that user able to land on Data Structures page  while selecting Data Structures from the drop down after Log in
		Given The user is on the Home page
		When The user selects Data Structures from the drop down after Log in.
		Then The user should be redirected to Data Structures page
		
	@tag12
	Scenario: Verify that user able to land on Array page  while selecting Array from the drop down after Log in
		Given The user is on the Home page
		When The user selects Array from the drop down after Log in.
		Then The user should be redirected to Array page
		
	@tag13
	Scenario: Verify that user able to land on Linked List page  while selecting Linked List from the drop down after Log in
		Given The user is on the Home page
		When The user selects Linked List from the drop down after Log in.
		Then The user should be redirected to Linked List page
		
	@tag14
	Scenario: Verify that user able to land on Stack page  while selecting Stack from the drop down after Log in
		Given The user is on the Home page
		When The user selects Stack from the drop down after Log in.
		Then The user should be redirected to Stack page
		
	@tag15
	Scenario: Verify that user able to land on Queue page  while selecting Queue from the drop down after Log in
		Given The user is on the Home page
		When The user selects Queue from the drop down after Log in.
		Then The user should be redirected to Queue page
		
	@tag16
	Scenario: Verify that user able to land on Tree page  while selecting Tree from the drop down after Log in
		Given The user is on the Home page
		When The user selects Tree from the drop down after Log in.
		Then The user should be redirected to Tree page
		
	@tag17
	Scenario: Verify that user able to land on Graph page  while selecting Graph from the drop down after Log in
		Given The user is on the Home page
		When The user selects Graph from the drop down after Log in.
		Then The user should be redirected to Graph page
		
	@tag18
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Data Structures-Introduction on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag19
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Array on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Array on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag20
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Linked List on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Linked List on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag21
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Stack on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Stack on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag22
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Queue on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Queue on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag23
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Tree on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Tree on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag24
	Scenario: Verify that user able to see warning message on clicking Get Started buttons of Graph on the home page without Sign in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Graph on the homepage without Sign in
		Then The user should able to see an warning message You are not logged in
		
	@tag25
	0Scenario: Verify that user able to land on Data Structures-Introduction page while clickingGet Started buttons of Data Structures-Introduction on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Data Structures-Introduction on the homepage while Log in
		Then The user should be redirected to Data Structures page
		
	@tag26
	Scenario: Verify that user able to land on Array page while clickingGet Started buttons of Array on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Array on the homepage while Log in
		Then The user should be redirected to Array page
		
	@tag27
	Scenario: Verify that user able to land on Linked List page while clickingGet Started buttons of Linked List on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Linked List on the homepage while Log in
		Then The user should be redirected to Linked List page
		
	@tag28
	Scenario: Verify that user able to land on Stack page while clickingGet Started buttons of Stack on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Stack on the homepage while Log in
		Then The user should be redirected to Stack page
		
	@tag29
	Scenario: Verify that user able to land on Queue page while clickingGet Started buttons of Queue on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Queue on the homepage while Log in
		Then The user should be redirected to Queue page
		
	@tag30
	Scenario: Verify that user able to land on Tree page while clickingGet Started buttons of Tree on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Tree on the homepage while Log in
		Then The user should be redirected to Tree page
		
	@tag31
	Scenario: Verify that user able to land on Graph page while clickingGet Started buttons of Graph on the home page during Log in
		Given The user is on the Home page
		When The user clicks Get Started buttons of Graph on the homepage while Log in
		Then The user should be redirected to Graph page
		
		
		#@tag33
	#Scenario Outline: Verify menu access before and after login  
		#Given The user is on the Home page
		#When The user click Get Started on the <menu_item> menu
		#Then The user should see <expected_result>
		
		#Examples:
      #| menu_item   											 | expected_result before Login | expected_result after Login
      #| Data Structures-Introduction      | You are not logged in        |	The user should be redirected to Data Structures-Introduction page
      #| Array     												 | You are not logged in      	|	The user should be redirected to Array page
      #| Linked List    									 | You are not logged in      	|	The user should be redirected to Linked List page
      #| Stack     												 | You are not logged in     		|	The user should be redirected to Stack page
      #| Queue     												 | You are not logged in      	|	The user should be redirected to Queue page
      #| Tree     											   | You are not logged in      	|	The user should be redirected to Tree page
      #| Graph     												 | You are not logged in      	|	The user should be redirected to Graph page