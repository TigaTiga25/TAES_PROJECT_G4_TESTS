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
   	When I click on the img_Orus_aspect-square size-full object-cover buttonImage
   	And I click on the div_Give up_focusbg-accent focustext-accent_c27150 buttonProfile to see details
   	Then I should be redirected to the profile page
