Feature: Cart
  As a user
  I want to manage my cart
  So I can get my cart list

  Scenario: I want to get all cart
    Given I set url api to get all cart
    When I request get all cart
    Then I will get code 200

  Scenario: I want to Get a single cart
    Given I set url api to Get a single cart
    When I request Get a single product
    Then I will get code 200

  Scenario: I want to Get Limit results Cart
    Given I set url api to Get Limit results cart
    When I request Get Limit results cart
    Then I will get code 200

  Scenario: I want to Get Sort results cart
    Given I set url api to Get Sort results cart
    When I request Get Sort results cart
    Then I will get code 200

  Scenario: I want to Add new cart
    Given I set url api Add new cart
    And I set userId, date, products
    When I request Get Add new cart
    Then I will get code 200