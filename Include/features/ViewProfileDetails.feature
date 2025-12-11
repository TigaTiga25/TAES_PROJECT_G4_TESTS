@tag
Feature: View profile details
  As a logged user 
	I want to click on my avatar or username and after on “profile” 
	So that I can see my account details 

  @tag1
  Scenario: View profile details
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	Then I click on the img_Orus_aspect-square size-full object-cover buttonImage
   	And I click on the div_Give up_focusbg-accent focustext-accent_c27150 buttonProfile to see details



   