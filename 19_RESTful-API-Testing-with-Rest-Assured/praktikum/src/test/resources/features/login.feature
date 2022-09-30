Feature: Get access account
  As a user
  I want to login my account
  So I can access my account

  Scenario: I want to login with valid username and valid password
    Given I set valid username and valid password
    When I request to login
    Then I will get code 201
    And Get manage my account

  Scenario: I want to login with valid username and invalid password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 400
    And Get error message

  Scenario: I want to login with invalid username and valid password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 400
    And Get error message

  Scenario: I want to login with invalid username and invalid password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 400
    And Get error message

  Scenario: I want to login with null username and null password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 404
    And Get error message

  Scenario: I want to login with symbol username and symbol password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 404
    And Get error message

  Scenario: I want to login with one character username and character password
    Given I set valid username and invalid password
    When I request to login
    Then I will get code 404
    And Get error message