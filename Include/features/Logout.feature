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
Feature: Logout
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Logout
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert input_Email_loginId in the email field
    And I insert input_Password_password in the password field
    Then I click on the button_Password_inline-flex items-center ju_b44d9a button to login
    And I see the dashboard
   	And I click on the button_Customizaes (Decks e Avatares)_bg-re_3fd3bd button to logout
   

   