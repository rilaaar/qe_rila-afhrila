@Product
Feature: Product
  As a user
  I want to get product
  So I can manage the product

  Scenario: Get all product with valid token
    Given I set an url api for get all product
    When I request to get all product with valid token
    Then I will get code 200

  Scenario: Get all product with invalid token
    Given I set an url api for get all product
    When I request to get all product with invalid token
    Then I will get code 200

  Scenario Outline: Create a new product
    Given I set an url api for Create a new product
    When I set "<nameproduct>" name product "<descriptionproduct>" description product <priceproduct> price product <categoriesproduct> categories product
    Then I request to create a new product
    And I will get "<result>" result
    Examples:
      | nameproduct | descriptionproduct | priceproduct | categoriesproduct | result |
      |  Sony PS5    | play has no limits  |    299        |        2       | Success |
      |              |                     |      0        |        0       | Failed |
      |   Sony PS5   |                     |    299        |        2       | Success |
      |              |  play has no limits |      0        |        0       | Failed |

  Scenario: Delete a product with valid token
    Given I set an url api for Delete a product
    When I request to Delete a product with valid token
    Then I will get code 404

  Scenario: Delete a product with invalid token
    Given I set an url api for Delete a product
    When I request to Delete a product with invalid token
    Then I will get code 404

#  mvn clean verify -Dtags='Product'