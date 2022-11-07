@Hello
Feature: Index
  As a user
  I want to create index
  So I can access the index

  Scenario: Index with valid token
    Given I set an url api for index
    When I request to index with valid token
    Then I will get code 200

  Scenario: Index with invalid token
    Given I set an url api for index
    When I request to index with invalid token
    Then I will get code 200

#  mvn clean verify -Dtags='Hello'