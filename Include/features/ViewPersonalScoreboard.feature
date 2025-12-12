# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user with matches (Profiles/default - defaultUser)
# Have a registered user with no matches (Profiles/default - userWithoutMatches)

@tag
Feature: View Personal Scoreboard
  As a logged user
  I want to access my scoreboard page
  So that I can see my personal stats

  @tag1
  Scenario: View Personal Stats (Account WITH games)
  	Given I navigate to the bisca platform
    And I login as a player
    When I click on the Scoreboards link
    Then I should see all stats filled correctly

  @tag2
  Scenario: View Personal Stats (Account with NO games - Zero State)
  	Given I navigate to the bisca platform
    And I login as an user with no matches
    When I click on the Scoreboards link	
    Then I should see all stats initialized to zero
