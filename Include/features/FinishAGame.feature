# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: FinishAGame
  As a player, 
	I want to finish a practice game, 
	So that I can see the information about the game.
  

  @tag1
  Scenario: Finish a practice game
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    And I navigate to the gameBoard/9/-1 page
    When I click to play my final card
    Then I see the relevant information about the game