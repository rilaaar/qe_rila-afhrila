Feature: Get all account features
  As a user
  I want to login my account
  So I can access my account

  Scenario: Get account user
    Given I set a name and password
    When I request get new account
    Then I will get code 201
    And Get new account
