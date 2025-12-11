# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: View Avatar
  As a logged user 
	I want to access my dashboard 
	So that I can see my avatar 

  @tag1
  Scenario: View Avatar
    Given I navigate to the bisca platform
    When I login as a player
   	And I click on the img_Orus_aspect-square size-full button avatar
   	Then I click on the div_Profile_focusbg-accent focustext-accent_7e3aa4 avatarButton 
   	And I click on the button_Your Avatar_text-slate-400 hovertext_0615ae closeButtonAvatar 
   	

