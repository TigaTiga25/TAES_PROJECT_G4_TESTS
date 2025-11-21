@tag
Feature: FinishAGame
  As a player, 
	I want to finish a practice game, 
	So that I can see the information about the game.
  

  @tag1
  Scenario: Finish a practice game
    Given I open the browser
    And I navigate to the URL http://localhost:5173/gameBoard/-1
    When I click to play my final card
    Then I see the relevant information about the game