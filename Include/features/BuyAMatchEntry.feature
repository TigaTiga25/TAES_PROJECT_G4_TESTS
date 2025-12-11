#Requirements
#Have a user with sufficient coins (pa@mail.pt)
#Have a user without coins (pb@mail.pt)

@tag
Feature: Buy a match entry
  As a logged user
	I want to spend 5 coins from my wallet
	So that I can play a new match


  @tag1
  Scenario: Buy a match entry
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I login as a player
    And I see that I have a sufficient coins balance
    And I start a new match
    And I choose for a bisca9
    When I navigate to the URL http://localhost:5173/home
    Then I see my balance updated
    
    
	@tag2
  Scenario: Insufficient balance
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I login as player with unsufficient coins
    When I start a new match
    And I choose for a bisca9
    Then I see the error message