# Requirements [Feature file won't run correctly if not met]
# ----------------------------------------------------------
# Correct bisca platform page URL (Profiles/default - url)

@tag
Feature: Register
  As a new player,  
	I want to submit a form,  
	So that an account is made. 

  @tag1
  Scenario: Register
    Given I navigate to the bisca platform
    When I click on the button_Entrar_inline-flex items-center just_5a503c button to register
    And I insert teste@mail.pt in the mail field
    And I insert input_Nickname_filetext-foreground placehol_cc48e9 in the nickname field
    And I insert input_Password_filetext-foreground placehol_5a2319 in the password field
    Then I click on the button_Password_inline-flex items-center ju_b44d9a button to create account
    

    

  