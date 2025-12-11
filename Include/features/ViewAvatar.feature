@tag
Feature: View Avatar
  As a logged user 
	I want to access my dashboard 
	So that I can see my avatar 

  @tag1
  Scenario: View Avatar
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	And I click on the img_Orus_aspect-square size-full button avatar
   	Then I click on the div_Profile_focusbg-accent focustext-accent_7e3aa4 avatarButton 
   	And I click on the button_Your Avatar_text-slate-400 hovertext_0615ae closeButtonAvatar 
   	

