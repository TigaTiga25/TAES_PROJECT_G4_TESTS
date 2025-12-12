# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Logout
  As a logged user 
	I want to logout 
	So that I can end my session securely 

  @tag1
  Scenario: Logout
    Given I navigate to the bisca platform
    And I login as a player
    When I click on my avatar to open the dropdown menu
    And I click on the Logout option
    Then I should be redirected to the login page