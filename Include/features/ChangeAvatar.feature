# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Change Avatar
  As a logged user 
  I want to click on a available avatar 
	So that I can swap my avatar 

  @tag1
  Scenario: Change Avatar
    Given I navigate to the bisca platform
    And I login as a player
    When I check my customizations
    And I equip an avatar
    Then I should be able to see that my avatar was equipped

   