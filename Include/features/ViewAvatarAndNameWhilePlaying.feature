# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Show avatar and username while playing
  As a player, 
	I want to play a game, 
	So that I can view my avatar and username while playing.


  @tag1
  Scenario: View avatar and username while playing
    Given I navigate to the bisca platform
    And I login as a player
    When I start a practice game
    And I choose for a bisca9
    Then I should see my avatar
    And I should see my username

  @tag1
  Scenario: View the username as an annonymous user
    Given I navigate to the bisca platform
    And I enter as an anonymous user
    When I start a practice game
    And I choose for a bisca9
    Then I should see that my username is GUEST