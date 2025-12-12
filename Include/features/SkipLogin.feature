# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: SkipLogin
  As an unregistered player, 
	I want to skip login,  
	So that I can play practice games. 

  @tag1
  Scenario: SkipLogin
    Given I navigate to the bisca platform
    When I enter as an anonymous user
    Then I should be redirected to the home page