# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: Receive Email
  As a new player, 
	I want to receive an email after my registration, 
	So that I can confirm that I own that email.

@tag1
  Scenario: Register a new account successfully
    Given I navigate to the bisca platform
    When I click on the button to Sign Up
    And I fill the registration form with a unique email
    And I click on the button to create account
    Then I should see an alert asking to verify my email
