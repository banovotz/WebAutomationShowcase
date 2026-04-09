# language: en

Feature: calculator

    Scenario Outline: Calculating multiple sums
        Given I am on the calculator
        When I add <number1> and <number2>
        Then the result is <expected>

        Examples:
            | number1 | number2 | expected |
            | 1    | 2    | 3        |

