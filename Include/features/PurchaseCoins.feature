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
Feature: Purchase Coins
  I want to use this template for my feature file

  @tag1
  Scenario: Purchase Coins
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert teste@mail.pt on the email field
   	And I insert 12345678 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	Then I click on the div_About_inline-flex items-center justify-_4ac8e6 button coins
   	And I click on the button__bg-slate-900 hoverbg-slate-800 text_77c431 button to buy coins
  	And I click on the div__border-2 border-slate-100 rounded-xl p_4e19f2 button to select a package
  	
  

   