@tag
Feature: Show avatar and username while playing
  As a player, 
	I want to play a game, 
	So that I can view my avatar and username while playing.


  @tag1
  Scenario: View avatar and username while playing
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I login as a player
    When I start a practice game
    And I choose for a bisca9
    Then I should see my avatar
    And I should see my username

  @tag1
  Scenario: View the username as an annonymous user
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I enter as an annonymous user
    When I start a practice game
    And I choose for a bisca9
    Then I should see that my username is GUEST