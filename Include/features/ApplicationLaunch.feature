# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: ApplicationLaunch
  As a player opening the app,  
	I want to choose between logging in or continuing as an anonymous user,  
	So that I can either access my full account or play practice games. 

  @tag1
  Scenario: ApplicationLaunch
    Given I want to play bisca games
    When I navigate to the bisca platform
    Then I should see the login page
    And I should be able to login or continue as an anonymous user