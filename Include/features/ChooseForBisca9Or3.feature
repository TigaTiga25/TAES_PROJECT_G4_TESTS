# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: Choose for bisca3 or bisca9
  As a user
	I want to choose for the bisca type
	So that I can play the type of game I want


  @tag1
  Scenario: Choose for bisca3
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    When I start a practice game
    And I choose for a bisca3
    Then I see only three cards per player