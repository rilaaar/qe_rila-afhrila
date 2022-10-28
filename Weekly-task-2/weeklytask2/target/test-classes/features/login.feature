Feature:Login
  As a user
  I want to login my account
  So I can access my account

  Scenario: I want to login with valid username and valid password
    Given I set an url api for login
    And I set valid username and valid password
    When I request to login
    Then I will get code 200

  Scenario: I want to login with valid username and invalid password
    Given I set an url api for login
    And I set valid username and invalid password
    When I request to login
    Then I will get code 401

  Scenario: I want to login with invalid username and valid password
    Given I set an url api for login
    And I set invalid username and valid password
    When I request to login
    Then I will get code 401

  Scenario: I want to login with null username and null password
    Given I set an url api for login
    And I set null username and null password
    When I request to login
    Then I will get code 401