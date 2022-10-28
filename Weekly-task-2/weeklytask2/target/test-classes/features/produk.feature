Feature: Products
  As a user
  I want to manage my product
  So I can get my product

  Scenario: I want to get all products
    Given I set url api to get all product
    When I request get all product
    Then I will get code 200

  Scenario: I want to Get a single product
    Given I set url api to Get a single product
    When I request Get a single product
    Then I will get code 200

  Scenario: I want to Get Limit results
    Given I set url api to Get Limit results
    When I request Get Limit results
    Then I will get code 200

  Scenario: I want to Get Sort results
    Given I set url api to Get Sort results
    When I request Get Sort results
    Then I will get code 200

  Scenario: I want to Add new product
    Given I set url api Add new product
    And I set title, price, desc, image and category
    When I request Get Add new product
    Then I will get code 200