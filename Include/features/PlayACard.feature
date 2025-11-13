@tag
Feature: PlayACard
  As a player,  
	I want to play a card from my hand,  
	So that I can participate in the current trick. 

  @tag1
  Scenario: PlayACard
    Given I have the browser open
    And I navigate to the URL http://localhost:5173/
    And I enter as an annonymous user
    And I start a practice game
    When I play a card on my turn
    Then I should see it in the board