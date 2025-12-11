@tag
Feature: Logout
  As a logged user 
	I want to logout 
	So that I can end my session securely 

  @tag1
  Scenario: Logout
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    And I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
    And I click on the button_Password_inline-flex items-center ju_559f66 button to login
    When I click on the img_Orus_aspect-square size-full button to login
    Then I click on the div_View Avatar_focusbg-accent data-variantdestructivetext-destructive data-variantdestructivefocusbg button to login
  

   