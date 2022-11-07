Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  @Login
  Scenario Outline: Login with account
    Given I am on the home page
    And I click login icon
    When I input "<email>" email
    And I input "<password>" password
    And I click Login button
    Then I will get the "<result>"
    Examples:
      | email | password | result |
      |          |          | i can't login |
      | rilaaarn@gmail.com | Rilaafhrila15! | i can login |
      | rilaaarn@gmail.com | aaaaaaaa | i can't login |
      | aaaaaaaa | Rilaafhrila15! | i can't login |
      | aaaaaaaa | aaaaaaaa | i can't login |