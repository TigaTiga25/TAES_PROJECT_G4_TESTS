
@tag
Feature: Login
  As a registered player,  
	I want to log in,  
	so that I can access all my personal features 

  @tag1
  Scenario: Login
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert teste@mail.pt in the email field
    Then I click on the button_Password_inline-flex items-center ju_b44d9a button to login
    
  	

    