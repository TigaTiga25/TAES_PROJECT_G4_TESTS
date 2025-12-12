# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: StartPracticeGame
  As a player, 
	I want to start a practice game, 
	So that I can play a single game against the bot.
  

  @tag1
  Scenario: Start a practice game
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    When I start a practice game
    And I choose for a bisca9
    Then I see the bot nine cards
    And I see my nine cards
    And I see the face down deck
    And I see the face up trump