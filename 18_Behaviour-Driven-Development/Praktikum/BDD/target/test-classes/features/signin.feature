Feature: Sign in
  As a user
  I want to sign in with my email and my password
  So I can access all of the features

  Scenario: Sign in with null email and null password
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in

  Scenario: Sign in with email valid and password valid
    Given I want to sign in page
    When I click sign in button
    Then I will success sign in
    And I get my account

  Scenario: Sign in with number phone and password valid
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in


  Scenario: Sign in with one character email and password
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in

  Scenario: Sign in with symbol in email and password
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in

  Scenario: Sign in with null email and null password
    Given I want to sign in page
    When I don't click sign in button
    Then I will not response
    And I can't sign in

  Scenario: Sign in with email valid and password valid
    Given I want to sign in page
    When I don't click sign in button
    Then I will not response
    And I can't sign in

  Scenario: Sign in with email valid and password invalid
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in

  Scenario: Sign in with email invalid and password valid
    Given I want to sign in page
    When I click sign in button
    Then I will get error message
    And I can't sign in

  Scenario: Sign in with google account
    Given I want to sign in page
    When I click google button
    Then I will success sign in
    And I get my account

  Scenario: Sign in with Looking to create a page for a business?
    Given I want to sign in page
    When I click get help button
    Then I will success sign in
    And I get my account

  Scenario: Sign in with email valid and password valid, show password
    Given I want to sign in page
    When I click sign in button, click show password
    Then I will success sign in
    And I get my account

  Scenario: Sign in with email valid and password valid, not show password
    Given I want to sign in page
    When I click sign in button, don't click show password
    Then I will success sign in
    And I get my account