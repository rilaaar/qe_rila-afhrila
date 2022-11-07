@Home
Feature: Home
  As a user
  I want to accsess my home
  So I can buy a product

  Scenario: I want add one product to trolley
    Given I am on the home page
    When I click buy button
    Then The product success added to cart

  Scenario: I want add two product to trolley
    Given I am on the home page
    When I click buy button
    And I click buy button in other product
    Then The product success added to cart

  Scenario: I want to see the detail product of PS5
    Given I am on the home page
    When I click detail button in PS5
    Then The detail page is showed

  Scenario: I want to select category
    Given I am on the home page
    When I click select category
    And I click gaming
    Then Data gaming success showed
  Scenario: I want to select category
    Given I am on the home page
    When I click select category
    And I click dolanan
    Then Data dolanan success showed

  Scenario: I want to see the detail product of PS2
    Given I am on the home page
    When I click detail button in PS2
    Then The detail page is showed

#  mvn clean verify -Dtags='Home'

