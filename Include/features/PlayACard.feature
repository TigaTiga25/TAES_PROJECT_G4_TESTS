# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: PlayACard
  As a player,  
	I want to play a card from my hand,  
	So that I can participate in the current trick. 

  @tag1
  Scenario: PlayACard
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    And I start a practice game
    And I choose for a bisca9
    When I play a card on my turn
    Then I should see it in the board