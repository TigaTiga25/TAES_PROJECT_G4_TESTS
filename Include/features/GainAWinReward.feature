# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Gain a win reward
  As a logged user
	I want to finish a match
	So that I win a coins reward

  @tag1
  Scenario: Gain a reward by capote
    Given I navigate to the bisca platform
    And I login as a player
    And I start a new match
    And I choose for a bisca9
    When I win the match
    And I verify that the game is over
    And I return to home page
    Then I see my new coins balance