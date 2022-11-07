@Auth
Feature: Authentication
  As a user
  I want to get account
  So I can access my dashboard

#  mvn clean verify -Dtags='Auth'


  Scenario Outline: Login with email and password
    Given I set an url api for login
    And I set "<email>" email and "<password>" password
    When I request to login
    Then I get a "<result>"
    Examples:
      | email | password | result |
      |          |          | i can't login |
      | someone@mail.com | 123123 | i can login |
      | someone@mail.com| aaaaaaaa | i can't login |
      | aaaaaaaa | 123123 | i can't login |
      | aaaaaaaa | aaaaaaaa | i can't login |


  Scenario Outline: Register new a account
    Given I set an url api for regist
    When I set  "<newemail>" new email "<newpassword>" new password "<fullname>" fullname
    And I request to register
    Then I will get the "<result>" result
    Examples:
      | fullname | newemail | newpassword | result |
      | Aku siapa   | someone@mail.com | 123123 | Success  |
      |   aa   |   aa    |     aa     | Success |
      | aaaaaa |       | 123123123 | Success |
      | a   |       |          | Fail register |
      |      |       |    a    | Fail register |
      |      |  2    |    x    | Fail register |

  Scenario: Get user information
    Given I set an url api for get user information
    When I request to get user information
    Then I will get code verification
