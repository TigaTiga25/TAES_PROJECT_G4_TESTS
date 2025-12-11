# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Purchase Coins
  As a logged user 
	I want to purchase coins 
	So that I can increase my coins balance 

  @tag1
  Scenario: Purchase Coins
    Given I navigate to the bisca platform
    When I login as a player
   	Then I click on the div_About_inline-flex items-center justify-_4ac8e6 button coins
   	And I click on the button__bg-slate-900 hoverbg-slate-800 text_77c431 button to buy coins
  	And I click on the div__border-2 border-slate-100 rounded-xl p_4e19f2 button to select a package