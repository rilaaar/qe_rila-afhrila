Feature: Invitation People
  As a user
  I want to search a someone name in menu
  So I can access all of the features

  Scenario: Search people name with null character
    Given I want to search a name
    When I click invitation in button
    Then I don't get the result
    And I not will get a name of people

  Scenario: Search people name with one character
    Given I want to search a name
    When I click invitation in button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with a name
    Given I want to search a name
    When I click invitation in button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with symbol
    Given I want to search a name
    When I click invitation in button
    Then I don't get the result
    And I not will get a name of people

  Scenario: Search people name with a full name
    Given I want to search a name
    When I click invitation in button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with my contact
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with event
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with conections
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with people i follow
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with pages
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people

  Scenario: Search people name with hastag
    Given I want to search a name
    When I click button
    Then I get the result
    And I will get a name of people