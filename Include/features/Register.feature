# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: Register
  As a new player,  
	I want to submit a form,  
	So that an account is made. 

  @tag1
  Scenario: Register Successful
    Given I navigate to the bisca platform
    And I try to register as a new user
    When I place in brand new credentials
    And I press the register button
		Then I should see that my account was successfully created
	
	Scenario: Register With Blank Credentials
		Given I navigate to the bisca platform
    And I try to register as a new user
    When I press the register button
		Then I should see an email required error
		
	Scenario: Register With Taken Email
		Given I navigate to the bisca platform
    And I try to register as a new user
    When I place in existing credentials
    And I press the register button
		Then I should see an email taken error