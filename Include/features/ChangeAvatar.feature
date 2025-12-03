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
Feature: Change Avatar
  I want to use this template for change avatar

  @tag1
  Scenario: Change Avatar
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert teste@mail.pt on the email field
   	And I insert 12345678 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	Then I click on the a_Single Player_nav-link customizationsButton
    And I click on the img_Avatar Shop (7)_w-full aspect-square ro_6331c4 chosen avatar
    And I click on the button_Felix_inline-flex items-center justi_093709 equipAvatarButton to equip avatar

   