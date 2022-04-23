Feature: Google search
  As a user I want to search the word automation in the google browser

  Scenario Outline: Successful search
    Given user is in the google search
    When user tries to search a word
      | word   |
      | <word> |
    Then user find the word

    Examples:
      | word       |
      | automation |