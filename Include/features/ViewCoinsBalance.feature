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
    When I login as a player
   	And I click on the div_About_inline-flex items-center justify-_4ac8e6 button to see coins balance
   	Then I should be redirected to the transactions page

    