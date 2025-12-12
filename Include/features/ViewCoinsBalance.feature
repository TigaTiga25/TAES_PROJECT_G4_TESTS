# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: View coins balance
  As a logged user 
	I want to access my dashboard 
	So that I can see my coins balance 

  @tag1
  Scenario: View coins balance
    Given I navigate to the bisca platform
    And I login as a player
   	When I click on my coins balance
   	Then I should be redirected to the transactions page
		And I should be able to see my coins balance