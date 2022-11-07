Feature: Register
  As a user
  I want to login
  So I can access my dashboard

  @Register
  Scenario Outline: Register account
    Given I am on the home page
    And I click login icon
    And I click register text
    When I input "<fullnamae>" fullname
    And I input "<newemail>" new email
    And I input "<newpassword>" new password
    And I click register button
    Then I will get the "<result>" result
    Examples:
      | fullnamae | newemail | newpassword | result |
      | Alex Under | alex@email.com | 123123123 | Succes |
      |            |                |           | Error password |
      |   Alex     |           | 123123123 | Succes |
      |            |  alex@email.com   | 123123123 | Error name |
      | Alex Under | alex@email.com |        | Error password |

#  mvn clean verify -Dtags='Register'