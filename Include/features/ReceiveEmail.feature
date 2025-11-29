@tag
Feature: Receive Email
  As a new player, 
	I want to receive an email after my registration, 
	So that I can confirm that I own that email.

  @tag1
  Scenario: Register a new account successfully
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I click on the button to register
    And I insert input_Email_filetext-foreground placeholder_5402ca in the email field
    And I insert input_Nickname_filetext-foreground placehol_cc48e9 in the nickname field
    And I insert input_Password_filetext-foreground placehol_5a2319 in the password field
    Then I click on the button_Password_inline-flex items-center ju_b44d9a button to create account
