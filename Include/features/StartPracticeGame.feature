@tag
Feature: StartPracticeGame
  As a player, 
	I want to start a practice game, 
	So that I can play a single game against the bot.
  

  @tag1
  Scenario: Start a practice game
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I enter as an annonymous user
    When I start a practice game
    And I choose for a bisca9
    Then I see the bot nine cards
    And I see my nine cards
    And I see the face down deck
    And I see the face up trump