@tag
Feature: GameHistory
  As a logged user
	I want to access my dashboard
	So that I can access and see my game history

  @tag1
  
  Scenario: Anonymous User
    Given I navigate to the bisca platform
    And I enter as an annonymous user
    When I check my game history
    Then I shouldn't see any history while logged out
  
  Scenario: User with no matches
    Given I navigate to the bisca platform
    And I login as an user with no matches
    When I check my game history
    Then I shouldn't see any matches
  
  Scenario: User with matches
    Given I navigate to the bisca platform
    And I login as an user with matches
    When I check my game history
    Then I should see all my matches
    
	Scenario: See match details
		Given I navigate to the bisca platform
    And I login as an user with matches
    When I check my game history
    And I select a match
    Then I should see all games from that match
    
  Scenario: New game history entry
		Given I navigate to the bisca platform
    And I login as an user with matches
    And I start a new match
    And I win the match
    And I return to home page
    When I check my game history
    Then I should see a new match in my history