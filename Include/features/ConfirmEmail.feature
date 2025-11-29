@tag
Feature: Confirm Email
  As a new player, 
  I want to confirm my email, 
  So that I can fully access the game.


  @tag1
  Scenario: User cannot login without confirming email (Unverified Account)
    Given I have registered a new account but have NOT verified the email
    When I try to login with my unverified credentials
    Then I should see an error message saying "Email Unverified."