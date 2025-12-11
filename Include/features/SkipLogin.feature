@tag
Feature: SkipLogin
  As an unregistered player, 
	I want to skip login,  
	So that I can play practice games. 

  @tag1
  Scenario: SkipLogin
    Given I open the browser
    When I navigate to the URL http://localhost:5173/
    Then I click on the button_Entrar_inline-flex items-center just_5a503c button
    And I close the browser