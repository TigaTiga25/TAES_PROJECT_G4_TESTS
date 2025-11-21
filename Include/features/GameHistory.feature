@tag
Feature: GameHistory
  As a logged user
	I want to access my dashboard
	So that I can access and see my game history

  @tag1
  Scenario: Anonymous User
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I enter as an annonymous user
    When I check my game history
    Then I shouldn't see any history while logged out
  
  Scenario: User with no matches
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I enter as an user with no matches
    When I check my game history
    Then I shouldn't see any games
  
  Scenario: User with matches
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I enter as an user with matches
    When I check my game history
    Then I should see all my games