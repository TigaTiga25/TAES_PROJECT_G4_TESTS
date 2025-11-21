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
  Scenario: Logout
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
    And I click on the button_Password_inline-flex items-center ju_559f66 button to login
    When I click on the img_Player A_aspect-square size-full button to login
    Then I click on the div_Perfil_focusbg-accent data-variantdestr_03e255 button to login
  

   