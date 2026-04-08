# language: en

Feature: calculator

    Scenario: Calculating multiple sums
        Given I am on the calculator
        When I add one and two
        Then the result is three

