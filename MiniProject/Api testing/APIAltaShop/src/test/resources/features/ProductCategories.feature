@Categories
Feature: Categories
  As a user
  I want to get product categories
  So I can manage the product categories

  Scenario: Get all categories with valid token
    Given I set an url api for get all categories
    When I request to get all categories with valid token
    Then I will get code 200

  Scenario: Get all categories with invalid token
    Given I set an url api for get all categories
    When I request to get all categories with invalid token
    Then I will get code 200

  Scenario Outline: Create a category
    Given I set an url api for Create a category
    When I set "<namecategory>" name category and "<descriptioncategory>" description category
    Then I request to create a category
    And I will get "<result>" category
    Examples:
      | namecategory | descriptioncategory | result |
      |    gaming    | for gaming purposes  |  Success |
      |              |                     |  Failed |
      |   gaming    |                     | Success |
      |              | for gaming purposes  |  Failed |

  Scenario: Get categories by ID with valid token
    Given I set an url api for get categories  by ID
    When I request to get categories by ID with valid token
    Then I will get code 404

  Scenario: Get categories by ID with invalid token
    Given I set an url api for get categories  by ID
    When I request to get categories by ID with invalid token
    Then I will get code 404

#  mvn clean verify -Dtags='Categories'