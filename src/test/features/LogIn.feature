Feature: LogIn
@regression @login
  Scenario: Successful log-in
    Given I have chosen to login
    When I provide valid details
    Then I should see logout button
    And Take a screenshot


  Scenario: Invalid password
    Given I have chosen to login
    When I provide invalid password
    Then I should see forgot password link