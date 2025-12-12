# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: View profile details
  As a logged user 
	I want to click on my avatar or username and after on “profile” 
	So that I can see my account details 

  @tag1
  Scenario: View profile details
    Given I navigate to the bisca platform
    And I login as a player
    When I click on my avatar to open the dropdown menu
   	And I click on the Profile option
		Then I should be redirected to the profile page
