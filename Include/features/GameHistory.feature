# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user with matches (Profiles/default - defaultUser)
# Have a registered user with no matches (Profiles/default - userWithoutMatches)

@tag
Feature: GameHistory
  As a logged user
	I want to access my dashboard
	So that I can access and see my game history

  @tag1
  
  Scenario: Anonymous User
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    When I try to check my game history
    Then I shouldn't be able to check my history
  
  Scenario: User with no matches
    Given I navigate to the bisca platform
    And I login as an user with no matches
    When I check my game history
    Then I shouldn't see any matches
  
  Scenario: User with matches
    Given I navigate to the bisca platform
    And I login as a player
    When I check my game history
    Then I should see all my matches
    
	Scenario: See match details
		Given I navigate to the bisca platform
    And I login as a player
    When I check my game history
    And I select a match
    Then I should see all games from that match
    
  Scenario: New game history entry
		Given I navigate to the bisca platform
    And I login as a player
    And I start a new match
    And I choose for a bisca9
    And I win the match
    And I return to home page
    When I check my game history
    Then I should see a new match in my history