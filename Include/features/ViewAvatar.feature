# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: View Avatar
  As a logged user 
	I want to access my dashboard 
	So that I can see my avatar 

  @tag1
  Scenario: View Avatar
    Given I navigate to the bisca platform
    And I login as a player
   	When I check my customizations
		Then I should be able to see my avatar