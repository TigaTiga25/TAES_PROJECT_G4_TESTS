# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Logout
  As a logged user 
	I want to logout 
	So that I can end my session securely 

  @tag1
  Scenario: Logout
    Given I navigate to the bisca platform
    And I login as a player
    When I click on the img_Orus_aspect-square size-full button to login
    Then I click on the div_View Avatar_focusbg-accent data-variantdestructivetext-destructive data-variantdestructivefocusbg button to login
  

   