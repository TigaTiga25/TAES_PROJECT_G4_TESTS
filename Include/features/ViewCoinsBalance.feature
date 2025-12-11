@tag
Feature: View coins balance
  As a logged user 
	I want to access my dashboard 
	So that I can see my coins balance 

  @tag1
  Scenario: View coins balance
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
   	Then I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	And I click on the div_About_inline-flex items-center justify-_4ac8e6 button to see coins balance
   

    