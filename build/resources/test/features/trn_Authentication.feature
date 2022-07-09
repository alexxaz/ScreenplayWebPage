Feature: Authentication SauceLab
  As a user I want to login the web SauceLab

  Scenario Outline: Successful login SauceLab
    Given user is going to SauceLab web
    When user tries to login with the next information
      | user   | password   |
      | <user> | <password> |
    Then user verifies is success login

    Examples:
      | user          | password     |
      | standard_user | secret_sauce |

