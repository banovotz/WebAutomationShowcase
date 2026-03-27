# language: en

Feature: calculator

Scenario: calculating a sum
    Given I am on the calculator
    When I add 1 and 2
    Then the result is 3