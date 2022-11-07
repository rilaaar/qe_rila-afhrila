@Order
Feature: Order
  As a user
  I want to get order
  So I can manage the order

  Scenario Outline: Create a order
    Given I set an url api for Create a order
    When I set <product_id> product_id and <quantity> quantity
    Then I request to create a order
    And I will get "<result>" order
    Examples:
      | product_id | quantity | result |
      |    2       |     1    |  Success |
      |      0     |     0    |  Success |
      |     2      |     0    | Success |
      |     0      |     1    |  Success |

  Scenario: Get all order with valid token
    Given I set an url api for get all order
    When I request to get all order with valid token
    Then I will get code 200

  Scenario: Get all order with invalid token
    Given I set an url api for get all order
    When I request to get all order with invalid token
    Then I will get code 401

  Scenario: Get order by ID with valid token
    Given I set an url api for get order  by ID
    When I request to get order by ID with valid token
    Then I will get code 200

  Scenario: Get order by ID with invalid token
    Given I set an url api for get order  by ID
    When I request to get order by ID with invalid token
    Then I will get code 401

#  mvn clean verify -Dtags='Order'