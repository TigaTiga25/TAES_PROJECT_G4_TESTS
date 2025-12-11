@tag
Feature: Purchase Coins
  As a logged user 
	I want to purchase coins 
	So that I can increase my coins balance 

  @tag1
  Scenario: Purchase Coins
    Given I open the browser
    And I navigate to the URL http://localhost:5173/
    When I insert pa@mail.pt on the email field
   	And I insert 123 in the pass field
   	And I click on the button_Password_inline-flex items-center ju_559f66 button to login
   	Then I click on the div_About_inline-flex items-center justify-_4ac8e6 button coins
   	And I click on the button__bg-slate-900 hoverbg-slate-800 text_77c431 button to buy coins
  	And I click on the div__border-2 border-slate-100 rounded-xl p_4e19f2 button to select a package