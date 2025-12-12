# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)
# User needs own the second deck (Minimalist) on customizations -> decks -> my collection page

@tag
Feature: Change deck
  As a logged user 
	I want to click on a available deck 
	So that I can swap my deck 

  @tag1
  Scenario: Change deck
    Given I navigate to the bisca platform
    And I login as a player
   	When I check my customizations
   	And I click on the button_Avatars_px-6 py-2 rounded-lg font-bo_f70d48 decksButton
   	And I click on the div_default_cursor-pointer relative rounded_cc8d79 chosen deck
   	Then I click on the button_minimalist_inline-flex items-center _8af92f to equip deck

   	

   	

   	


   