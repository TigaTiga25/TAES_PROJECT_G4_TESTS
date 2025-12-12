# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)
# User can't own the second avatar (Queen) on customizations -> avatars -> shop page
# User should have at least 100 coins balance

@tag
Feature: Buy Avatar
  As a logged user
	I want to buy a avatar
	So that I can swap my avatar

  @tag1
  Scenario: Buy Avatar
    Given I navigate to the bisca platform
    And I login as a player
   	And I check my customizations
   	And I check the avatars on the shop
   	Then I buy the second item on the shop
   	Then I should see that I now own the avatar
    