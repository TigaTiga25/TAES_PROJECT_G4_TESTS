# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: Confirm Email
  As a new player, 
  I want to confirm my email, 
  So that I can fully access the game.


  @tag1
  Scenario: User cannot login without confirming email (Unverified Account)
    Given I have registered a new account
    When I try to login with my credentials
    Then I should see an error message saying "Email não verificado."
    
  @tag2
  Scenario: User can login AFTER confirming email (Manual Confirmation)
    Given I have registered a new account
    And I pause the test to manually confirm the email link
    When I try to login with my credentials
    Then I should be redirected to the Game Menu