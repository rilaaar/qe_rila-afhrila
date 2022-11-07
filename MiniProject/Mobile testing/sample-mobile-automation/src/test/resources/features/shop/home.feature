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

