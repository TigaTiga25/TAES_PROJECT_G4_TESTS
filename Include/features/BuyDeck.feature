# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)
# User can't own the second deck (Minimalist) on customizations -> decks -> shop page
# User should have at least 100 coins balance

@tag
Feature: Buy Deck
  As a logged user 
	I want to buy a deck 
	So that I can swap my deck 

  @tag1
  Scenario: Buy deck
    Given I navigate to the bisca platform
    And I login as a player
   	And I check my customizations
   	And I check the decks on the shop
   	When I buy the second item on the shop
   	Then I should see that I now own the deck
