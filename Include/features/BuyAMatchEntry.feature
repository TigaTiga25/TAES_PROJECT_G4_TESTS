# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user with sufficient coins (Profiles/default - defaultUser)
# Have a registered user without any coins (Profiles/default - userWithoutCoins)

@tag
Feature: Buy a match entry
  As a logged user
	I want to spend 5 coins from my wallet
	So that I can play a new match


  @tag1
  Scenario: Buy a match entry
    Given I navigate to the bisca platform
    And I login as a player
    And I see that I have a sufficient coins balance
    And I start a new match
    And I choose for a bisca9
    When I navigate to the home page
    Then I see my balance updated
    
    
	@tag2
  Scenario: Insufficient balance
    Given I navigate to the bisca platform
    And I login as player with unsufficient coins
    When I start a new match
    And I choose for a bisca9
    Then I see the error message