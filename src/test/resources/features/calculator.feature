# language: en

Feature: calculator

    Scenario Outline: Calculating multiple sums
        Given I am on the calculator to <operate>
        When I add <number1> and <number2>
        Then the sum is <expected>

        Examples:
            | number1 | number2 | expected | operate |
            | 1       | 2       | 3        |  sum    |
            | 12      | 33      | 45       |  sum    |

    Scenario Outline: Calculating multiple differences
        Given I am on the calculator to <operate>
        When I substract <number1> and <number2>
        Then the difference is <expected>

        Examples:
            | number1 | number2 | expected | operate |
            | 3       | 2       | 1        | minus   |
            | 45      | 33      | 12       | minus   |


    Scenario Outline: Calculating multiple multiplications
        Given I am on the calculator to <operate>
        When I multiply <number1> and <number2>
        Then the multiplication result is <expected>

        Examples:
            | number1 | number2 | expected | operate    |
            | 3       | 2       | 6        | multiply   |
            | 45      | 33      | 1485     | multiply   |