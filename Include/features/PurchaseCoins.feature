# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Purchase Coins
  As a logged user 
	I want to purchase coins 
	So that I can increase my coins balance 

  @tag1
  Scenario: Purchase Coins
    Given I navigate to the bisca platform
    And I login as a player
   	And I click on my coins balance
   	When I click on the button to add funds
  	And I select one of the coins package
  	Then I should see that my purchase was successful