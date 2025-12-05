@tag
Feature: Title of your feature
  As a logged user 
	I want to filter my game history list 
	So that I can search for a specific game 

  @tag1
  Scenario: Filter by Wins
    Given I navigate to the bisca platform
    And I login as an user with matches
    When I check my game history
    And I filter matches by wins
    Then I should be able to see my wins
  
  Scenario: Filter by Losses
    Given I navigate to the bisca platform
    And I login as an user with matches
    When I check my game history
    And I filter matches by losses
    Then I should be able to see my losses