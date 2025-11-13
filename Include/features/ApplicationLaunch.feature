@tag
Feature: ApplicationLaunch
  As a player opening the app,  
	I want to choose between logging in or continuing as an anonymous user,  
	So that I can either access my full account or play practice games. 

  @tag1
  Scenario: ApplicationLaunch
    Given I have the browser open
    When I navigate to the URL http://localhost:5173/
    Then I should see the login page
		And I close the browser