Feature:User
  As a user
  I want to manage my user
  So I can get my user

  Scenario: I want to get all users
    Given I set url api to get all users
    When I request get all users
    Then I will get code 200

  Scenario: I want to Add new user
    Given I set url api Add new user
    And I set email, username, address, phone
    When I request Get Add new user
    Then I will get code 200

  Scenario: I want to delete a user
    Given I set url api delete user
    When I request Get delete user
    Then I will get code 200