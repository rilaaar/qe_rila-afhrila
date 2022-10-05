Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  Scenario: Login with valid username and valid password
    Given I am on the books page
    And I click Login button
    And I will go to login page
    When I input valid username
    And I input valid password
    And I click Login button
    Then I will go to dashboard

  Scenario: Login with invalid username and valid password
    Given I am on the books page
    And I click Login button
    And I will go to login page
    When I input invalid username
    And I input valid password
    And I click Login button
    Then I will get error message

  Scenario: Login with valid username and invalid password
    Given I am on the books page
    And I click Login button
    And I will go to login page
    When I input valid username
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Login with invalid username and invalid password
    Given I am on the books page
    And I click Login button
    And I will go to login page
    When I input invalid username
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Register account
    Given I am on the books page
    And I click Login button
    And I will go to login page
    And I click Login button
    When I click new user button
    Then I will go to register page