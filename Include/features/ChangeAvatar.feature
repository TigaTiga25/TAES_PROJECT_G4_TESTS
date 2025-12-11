# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Change Avatar
  As a logged user 
  I want to click on a available avatar 
	So that I can swap my avatar 

  @tag1
  Scenario: Change Avatar
    Given I navigate to the bisca platform
    When I login as a player
   	Then I click on the a_Single Player_nav-link customizationsButton
    And I click on the avatarFromUserCollection chosen avatar
    And I click on the buttonEquipAvatar to equip avatar

   