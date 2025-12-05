@tag
Feature: Gain a win reward
  As a logged user
	I want to finish a match
	So that I win a coins reward

  @tag1
  Scenario: Gain a reward by capote
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I login as a player
    And I start a new match
    And I choose for a bisca9
    When I win the match
    And I verify that the game is over
    And I return to home page
    Then I see my new coins balance