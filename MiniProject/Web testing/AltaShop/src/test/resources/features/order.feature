@Order
Feature: Order
  As a user
  I want to accsess my order
  So I can process my order

  Scenario: Showed total price paid for 1 product
    Given I am on the home page
    When I click buy button
    And I click trolley icon
    Then Total price can showed

  Scenario: Showed total price paid for 2 product
    Given I am on the home page
    When I click buy button to two product
    And I click trolley icon
    Then Total price can showed

  Scenario: Showed one quantity product
    Given I am on the home page
    When I click buy button
    And I click trolley icon
    Then Quantity product can showed

  Scenario: Showed two quantity product
    Given I am on the home page
    When I click buy button to two product
    And I click trolley icon
    Then Quantity product can showed

  Scenario: Pay the product
    Given I am on the home page
    When I click buy button
    And I click trolley icon
    And I click pay button
    Then Redirected to login page
