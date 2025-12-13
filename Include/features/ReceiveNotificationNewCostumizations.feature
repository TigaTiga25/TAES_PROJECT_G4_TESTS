# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)
# For the test to run, you need to change the request token to a token that corresponds to an admin

@tag
Feature: Received notification by new available customizations
  As a logged user
	I want to receive a notification when there are new available customizations
	So that I can see those customizations

  @deck
  Scenario: Admin announces a new Deck
    Given I open the browser
    And I login as a player
    When the Admin announces a new "DECK" named "Matrix" via API
    And I wait for the notification polling
    Then I should see the red badge on the bell icon
    When I click on the notification bell
    And I click on the New Item notification
    Then I should be redirected to the customizations?tab=shop&category=decks page
    
  @avatar
  Scenario: Admin announces a new Avatar
    Given I open the browser
    And I login as a player
    When the Admin announces a new "AVATAR" named "Sonic" via API
    And I wait for the notification polling
    Then I should see the red badge on the bell icon
    When I click on the notification bell
    And I click on the New Item notification
    Then I should be redirected to the customizations?tab=shop&category=avatars page
    
  @clear
  Scenario: Notification count clears after reading
    Given I open the browser
    And I login as a player
    When the Admin announces a new "AVATAR" named "Sonic" via API
    And I wait for the notification polling
    Then I should see the red badge on the bell icon
    When I click on the notification bell
    And I click on the New Item notification
    Then the red badge should disappear
