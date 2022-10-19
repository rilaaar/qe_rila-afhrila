Feature: manage my history
  As a user
  I want to access my history
  So I can manage my history

  Scenario: accses my history
    Given I am on the calculator page
    When I click one number
    And I click plus
    And I click one number again
    Then I click equel
    And I can manage my history page