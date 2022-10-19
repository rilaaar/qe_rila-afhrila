Feature: delete my history
  As a user
  I want to manage my history
  So I can delete my history

  Scenario: delete my history
    Given I am on the history page
    When I click delete button
    Then the history can deleted