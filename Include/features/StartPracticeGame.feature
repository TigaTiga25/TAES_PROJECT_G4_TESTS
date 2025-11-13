@tag
Feature: StartPracticeGame
  As a player, 
	I want to start a practice game, 
	So that I can play a single game against the bot.
  

  @tag1
  Scenario: Start a practice game
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I click on the button_Entrar_inline-flex items-center just_5a503c button to enter as a annonymous user
    When I click on the button_Jogo de Bisca (TAES)_inline-flex ite_b960dc button to start a game
    Then I see the bot nine cards
    And I see my nine cards
    And I see the face down deck
    And I see the face up trump
    #And I close the browser