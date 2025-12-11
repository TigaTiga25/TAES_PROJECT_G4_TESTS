@tag
Feature: Change Avatar
  As a logged user 
  I want to click on a available avatar 
	So that I can swap my avatar 

  @tag1
  Scenario: Change Avatar
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	Then I click on the a_Single Player_nav-link customizationsButton
    And I click on the avatarFromUserCollection chosen avatar
    And I click on the buttonEquipAvatar to equip avatar

   