# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: ReceiveNotificationNewGlobalLeader
  As a logged user
	I want to receive a notification when there are a new leader of the global scoreboard
	So that I can see who is he
	

  @tag1
  Scenario: A new Global Leader is announced
  	Given I open the browser
  	And I login as a player
    When the system triggers a "LEADERBOARD" event via Debug API
    And I wait for the notification polling
    Then I should see the red badge on the bell icon
    When I click on the notification bell
    And I click on the Leaderboard notification
    Then I should see the "Global Rankings" title
    
   @tag2
  Scenario: Notification count clears after reading
    Given I open the browser
    And I login as a player
    When the system triggers a "LEADERBOARD" event via Debug API
    And I wait for the notification polling
    Then I should see the red badge on the bell icon
    When I click on the notification bell
    And I click on the Leaderboard notification
    Then the red badge should disappear