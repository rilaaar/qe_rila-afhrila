Feature: Search job
  As a user
  I want to search a job in menu
  So I can access all of the features

  Scenario: Search job with name company
    Given I want to search a job
    When I click search in button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with specification job
    Given I want to search a job
    When I click search in button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with one character
    Given I want to search a job
    When I click search in button
    Then I get the result random
    And I will get a information of job

  Scenario: Search job with number
    Given I want to search a job
    When I click search in button
    Then I get the result random
    And I will get a information of job

  Scenario: Search job with null
    Given I want to search a job
    When I click search in button
    Then I don't get the result
    And I not will get a information of job

  Scenario: Search job with symbol
    Given I want to search a job
    When I click search in button
    Then I don't get the result
    And I not will get a information of job

  Scenario: Search job with initial skill
    Given I want to search a job
    When I click search in button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with Suggested job searches
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with salary
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with skill assigment
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with my job
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with alerts
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with interview prep
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with alerts
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with resume builder
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job

  Scenario: Search job with job seeker guidance
    Given I want to search a job
    When I click button
    Then I get the result
    And I will get a information of job