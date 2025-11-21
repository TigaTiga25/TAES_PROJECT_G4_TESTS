#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register
  I want to register a user

  @tag1
  Scenario Outline: Register
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I click on the button_Entrar_inline-flex items-center just_5a503c button to register
    And I insert input_Email_filetext-foreground placeholder_5402ca in the email field
    And I insert input_Nickname_filetext-foreground placehol_cc48e9 in the nickname field
    And I insert input_Password_filetext-foreground placehol_5a2319 in the password field
    Then I click on the button_Password_inline-flex items-center ju_b44d9a button to create account
    

    

  