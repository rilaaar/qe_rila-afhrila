@Register
Feature: Register
  As a user
  I want to register account
  So I can create new a account

  Scenario Outline: Register new a account
    Given I am on the home page
    And I click login icon
    And I click register text
    When I input "<name>" name
    And I input new "<email>" email
    And I input new "<password>" password
    And I click Register button
    Then I will get the "<result>" result
    Examples:
      | name | email | password | result |
      | rila | rilaaarn@gmail.com | rilaaar | Success register |
      |      |       |          | Fail register |
      | rila |       | rilaaar | Success register |
      | r    |       |          | Fail register |
      |      |       |    r    | Fail register |
      |      |  2    |    3    | Fail register |

