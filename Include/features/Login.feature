# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)
# Have a registered user (Profiles/default - defaultUser)

@tag
Feature: Login
  As a registered player,  
	I want to log in,  
	so that I can access all my personal features 

  @tag1
  Scenario: Login
    Given I navigate to the bisca platform
    When I insert my credentials
    And I click on the button to login
    Then I should be redirected to the home page
  	